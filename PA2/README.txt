For this programming assignment we were tasked to create a database system using a parser generator to interpret queries for our system. We created our own 'grammar' for the parser generator, which creates a parse tree of our commands and using a listener and walker, traverses this parse tree and calls our DB engine backend to edit our database.

Our grammar is located in project_2.g4
The listener and walker are located in Myproject_2BaseListener.java
Backend code contained in Table_2.java

The program takes an input file containing the queries as a command line argument, then executes them line by line.

The input file for running is called input.txt. To run the program, simply execute the following commands:

"javac myproject2Main.java"
"java myproject2Main < input.txt"
