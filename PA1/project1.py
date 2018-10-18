"""
Anders Wallace
925000221
CSCE 315 - 502
Due September 10, 2018
project1.py
"""

# Program that queries a list of servers and records their discrepancies, then singles out an outlier if one exists

from contextlib import closing
from socket import socket, AF_INET, SOCK_DGRAM, timeout
import sys
import struct
import time

NTP_PACKET_FORMAT = "!12I"
NTP_DELTA = 2208988800 # 1970-01-01 00:00:00
NTP_QUERY = '\x1b' + 47 * '\0'

servers = ["0.us.pool.ntp.org",
	"1.us.pool.ntp.org",
	"2.us.pool.ntp.org",
	"0.ubuntu.pool.ntp.org",
	"1.ubuntu.pool.ntp.org",
	"2.ubuntu.pool.ntp.org",
	"3.ubuntu.pool.ntp.org",
	"ntp.ubuntu.com",
	"time.apple.com",
	"time.windows.com",
	"time1.google.com",
	"time2.google.com",
	"time3.google.com",
	"time4.google.com",
	"ntp1.tamu.edu",
	"ntp2.tamu.edu",
	"ntp3.tamu.edu",
	"ops1.engr.tamu.edu",
	"ops2.engr.tamu.edu",
	"ops3.engr.tamu.edu",
	"ops4.engr.tamu.edu",
	"filer.cse.tamu.edu",
	"compute.cse.tamu.edu",
	"linux2.cse.tamu.edu",
	"dns1.cse.tamu.edu",
	"dns2.cse.tamu.edu",
	"dhcp1.cse.tamu.edu",
	"dhcp2.cse.tamu.edu"]


# List of servers that were not timed out
usedServers = servers.copy()

serverDifferences = []
serverDiscrepancies = []

differencesSum = 0
maxDiscrepancy = 0
maxTimeIndex = 0

# Query each server and return the difference between the server time and local time
def server_response_time(host="0.us.pool.ntp.org", port=123):
    with closing(socket( AF_INET, SOCK_DGRAM)) as s: # Open socket and query it
        s.settimeout(5)
        s.sendto(NTP_QUERY.encode('utf-8'), (host.encode('utf-8'), port))
        msg, address = s.recvfrom(1024)
    unpacked  = struct.unpack(NTP_PACKET_FORMAT, msg[0:struct.calcsize(NTP_PACKET_FORMAT)])
    serverTime = (unpacked[10] + float(unpacked[11]) / 2**32 - NTP_DELTA)
    localTime = time.time()
    difference = serverTime - localTime
    return difference

def call_servers():
    for server in servers:
        try:
            serverDifferences.append(server_response_time(server))
        except timeout:
            usedServers.remove(server) #If server is timed out, remove it from the usedServers list
    return None

def find_discrepancies():
    differencesSum = sum(serverDifferences)
    for difference in serverDifferences:
        serverDiscrepancies.append(abs((difference - ((differencesSum - difference)/(float(len(serverDifferences) - 1)))))) # Find the discrepancy for each server against the average, and append to list
    return None

def find_max_server():
    maxDiscrepancy = max(serverDiscrepancies)
    maxTimeIndex = serverDiscrepancies.index(maxDiscrepancy) # Use max discrepancy time to single out the outlier server
    print(usedServers[maxTimeIndex], "has the max discrepancy of:", maxDiscrepancy)
    return None
    

if __name__ == "__main__":
    if len(servers) is 0:
        print("No servers to query - exiting program...")
        exit()
    else:
        call_servers()
    if len(usedServers) is 1:
        print("Only one server: No discrepancies to find")
    else:
        find_discrepancies()
        find_max_server()
    
    

