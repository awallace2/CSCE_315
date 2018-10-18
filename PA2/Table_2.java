import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

public class Table {
    String tableName;
    String[][] tableData;
    String[] dataType;
    int[] maxLengths;
    int primaryColumn;
    String[] columnHeads;

    //Creates a 
    Table(String name, String[] columnNames, String[] types, String primaryColumnIn, int[] maxLengthsIn) {
        tableName = name;
        maxLengths = maxLengthsIn;
        tableData = new String[1][columnNames.length];
        dataType = types;
        for (int i = 0; i < columnNames.length; i++){
            tableData[0][i] = columnNames[i];
            if(primaryColumnIn == columnNames[i]) {
                primaryColumn = i;
            }
        }
    }

    //create constructor here that just copies in a table and takes the name of table
    Table(String name, String[][] tableFromRelation){
        tableName = name;
        tableData = new String[tableFromRelation.length][tableFromRelation[0].length];
        for(int i = 0; i < tableFromRelation.length; ++i){
            for(int j = 0; j < tableFromRelation[0].length; ++j){
                tableData[i][j] = tableFromRelation[i][j];
            }
        }
    }

    Table(String name, String[][] tableFromRelation, String primaryColumnIn){
        tableName = name;
        tableData = new String[tableFromRelation.length][tableFromRelation[0].length];
        for(int i = 0; i < tableFromRelation.length; ++i){
            for(int j = 0; j < tableFromRelation[0].length; ++j){
                tableData[i][j] = tableFromRelation[i][j];
            }
        }
        for (int i = 0; i < tableFromRelation[0].length; i++){
            if(primaryColumnIn == tableFromRelation[0][i]) {
                primaryColumn = i;
            }
        }
    }

    Table(String name, String[] columnNames, String primaryColumnIn){
        tableData = new String[1][columnNames.length];
        for (int i = 0; i < columnNames.length; i++){
            tableData[0][i] = columnNames[i];
            if(primaryColumnIn == columnNames[i]) {
                primaryColumn = i;
            }
        }
        tableName = name;
    }

	
	
	
	
	
	
    void writeToFile() throws IOException {
        //This code brought to you in part by https://www.programcreek.com/2011/03/java-write-to-a-file-code-example/
        String FileName = tableName + ".db";
        File out = new File(FileName);
        if(!out.createNewFile()) {
            out.delete();
            out.createNewFile();
        }
        FileOutputStream fout = new FileOutputStream(out);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fout));

        //Write out the rows and Column
        String lengths = tableData.length + " " + tableData[0].length + " " + primaryColumn;
        bw.write(lengths);
        bw.newLine();

        //Write the Data
        String temp = "";
        for(int i = 0; i < tableData.length; i++) {
            for(int j = 0; j < tableData[0].length; j++) {
                temp += tableData[i][j] + " ";
                if(j == tableData[0].length-1) {
                    bw.write(temp);
                    bw.newLine();
                    temp = "";
                }
            }
        }
        bw.close();
    }







    // Function to print contents of data table
    void show(){
        // Print the data in the table
        for (int i = 0; i < tableData.length; i++) {
            for (int j = 0; j < tableData[0].length; j++) {
                System.out.print(tableData[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
    
    
    

    // Project Function
    String[][] project(String... columns) throws Exception{
        int columnNum = columns.length;

        /*if(columnNum > tableData[0].length){
            throw new TooManySelectedProjectionException("Too many attributes selected for projection");
        }*/

        // Stores the indexes for where we want to project from onto the new table
        int[] nameIndexes = new int[columnNum];

        // Loop through to find indexes where the projection is
        for(int i = 0; i < columnNum; i++){
            for(int j = 0; j < tableData[0].length; j++){
                if(columns[i].equals(tableData[0][j])){ // If the attribute name matches an attribute in list
                    nameIndexes[i] = j; // Add that index to the list for later
                    break;
                }
            }
        }

        // Create new table with dimensions of projection
        String[][] newData = new String[tableData.length][columnNum];

        // Copy the new tableData into the table for the "projection"
        for(int i = 0; i < newData[0].length; i++){
            for(int j = 0; j < newData.length; j++){
                newData[j][i] = tableData[j][nameIndexes[i]];
            }
        }

        return newData;
    }




    // Rename function, pass in all new names as arguments
    void rename(String... name) {
        if ((name.length)  != tableData[0].length) {
            System.out.print("Number of new names given does not match number of names in table");
            return;
        }

        // Reassign the new names in order
        for (int i = 0; i < tableData[0].length; i++){
            tableData[0][i] = name[i];
        }

        return;


    }

    // Update function
    void update(String attribute, String newVal, String conditional){

        // These variables store the columns that we are checking and/or changing
        int firstColumnIndex = -1;
        int secondColumnIndex = -1;
        int counter = 0;

        // Find index of column that contains the attribute we're changing
        for(int i = 0; i < tableData[0].length; i++){
            if((attribute).equals(tableData[0][i])){
                firstColumnIndex = i;
                break;
            }
        }

        String rawIndecies = findConditionCells(conditional);

        for(int rows = 0; rows < rawIndecies.length(); rows++){
            if(rawIndecies.charAt(rows) == ' '){
                counter++;
            }
        }

        String[] indexArray = rawIndecies.split(" ", counter);

        for(int i = 0; i < counter; i+=2){
            tableData[Integer.valueOf(indexArray[i])][firstColumnIndex] = newVal;
        }

    }




    // This function has the structure: select("name == some") for example
    String[][] select(String condStatement){
        int counter = 0;

        String rawIndexes = findConditionCells(condStatement);

        for(int rows = 0; rows < rawIndexes.length(); rows++){
            if(rawIndexes.charAt(rows) == ' '){
                counter++;
            }
        }

        String[] indexArray = rawIndexes.split(" ", counter);

        Vector<Integer> indices = new Vector();

        for(int i = 0; i < counter; i+=2){
            indices.add(Integer.valueOf(indexArray[i]));
        }

        // Create new array with selected rows dimensions
        int columns = tableData[0].length;
        int rows = indices.size() + 1;

        String[][] newData = new String[rows][columns];

        // Add first row for types
        for(int i = 0; i < columns; i++){
            newData[0][i] = tableData[0][i];
        }

        // Add selected rows
        for(int i = 1; i < rows; i++){
            for(int j = 0; j < columns; j++){
                newData[i][j] = tableData[indices.get(i - 1)][j]; // Add the full row
            }
        }

        return newData;
    }





    void readFromFile() throws IOException {
        //This code brought to you in part by https://stackoverflow.com/questions/3806062/how-to-open-a-txt-file-and-read-numbers-in-java
        //and https://stackoverflow.com/questions/7899525/how-to-split-a-String-by-space/7899558
        String FileName = tableName + ".db";
        File in = new File(FileName);

        BufferedReader reader = new BufferedReader(new FileReader(in));

        String temp = reader.readLine();
        String[] sizeAndPrimary = temp.split("\\s+");
        int x = Integer.parseInt(sizeAndPrimary[0]);
        int y = Integer.parseInt(sizeAndPrimary[1]);
        primaryColumn = Integer.parseInt(sizeAndPrimary[2]);

        tableData = new String[x][y];

        for(int i = 0; i < x; i++) {
            temp = reader.readLine();
            String[] rowToAdd = temp.split("\\s+");
            for(int j = 0; j < y; j++) {
                tableData[i][j] = rowToAdd[j];
            }
        }
        reader.close();
    }




    //A function meant to determine what cells need to be changed based on a comparison string
    //Example of appropriate input: 'dog == "lab"'
    //It will output a string of coordinates relating to where the cells are in the table
    //Example of output: '1 1 1 2 1 3 '
    String findConditionCells(String thingsToCompare)throws Exception{
        String thingsToAdd = "";
        String cellsToChange = "";
        int columnNum = 0;

        String noQuotes = thingsToCompare.replace("\"", "");
        String[] conditional = noQuotes.split(" ", 3);

        for(int columns = 0; columns < tableData[0].length; columns++){
            if(tableData[0][columns].compareTo(conditional[0]) == 0){
                columnNum = columns;
            }
        }

        String operand = conditional[1];



        switch(operand)
        {
            case "==":
                for(int rows = 0; rows < tableData.length; rows++){
                    if(tableData[rows][columnNum].compareTo(conditional[2]) == 0){
                        thingsToAdd = Integer.toString(rows) + " " + Integer.toString(columnNum) + " ";
                        cellsToChange += thingsToAdd;
                    }
                }
                break;
            case "!=":
                for(int rows = 0; rows < tableData.length; rows++){
                    if(tableData[rows][columnNum].compareTo(conditional[2]) != 0){
                        thingsToAdd = Integer.toString(rows) + " " + Integer.toString(columnNum) + " ";
                        cellsToChange += thingsToAdd;
                    }
                }
                break;
            case "<":
                for(int rows = 0; rows < tableData.length; rows++){
                    if(tableData[rows][columnNum].compareTo(conditional[2]) < 0){
                        thingsToAdd = Integer.toString(rows) + " " + Integer.toString(columnNum) + " ";
                        cellsToChange += thingsToAdd;
                    }
                }
                break;
            case ">":
                for(int rows = 0; rows < tableData.length; rows++){
                    if(tableData[rows][columnNum].compareTo(conditional[2]) > 0){
                        thingsToAdd = Integer.toString(rows) + " " + Integer.toString(columnNum) + " ";
                        cellsToChange += thingsToAdd;
                    }
                }
                break;
            case "<=":
                for(int rows = 0; rows < tableData.length; rows++){
                    if(tableData[rows][columnNum].compareTo(conditional[2]) <= 0){
                        thingsToAdd = Integer.toString(rows) + " " + Integer.toString(columnNum) + " ";
                        cellsToChange += thingsToAdd;
                    }
                }
                break;
            case ">=":
                for(int rows = 0; rows < tableData.length; rows++){
                    if(tableData[rows][columnNum].compareTo(conditional[2]) >= 0){
                        thingsToAdd = Integer.toString(rows) + " " + Integer.toString(columnNum) + " ";
                        cellsToChange += thingsToAdd;
                    }
                }
                break;
            default:
            	System.out.println("Default");
                //throw new InvalidComparatorException("Invalid comparator");
        }

        return cellsToChange;
    }






    //A function that takes in a condition string and replaces cells that meet that string with "NULL"
    //Example of an appropriate input: 'dog == "lab"'
    //Function will replace all cells in the table that meet that criteria with "NULL"
    void delete(String condition){
        int counter = 0;
        int row = 0;

        String cells = findConditionCells(condition);
        for(int rows = 0; rows < cells.length(); rows++){
            if(cells.charAt(rows) == ' '){
                counter++;
            }
        }

        String[] cellsToDelete = cells.split(" ", counter);
        for(int rows = 0; rows < cellsToDelete.length; rows++){
            if(rows % 2 == 0){
                row = Integer.valueOf(cellsToDelete[rows]);
                for(int column = 0; column < tableData[0].length; column++){
                    tableData[row][column] = "NULL";
                }
            }
        }
    }






    //A function that takes in a string of ordered arguments to add to a new row in the table and add that new row to the table
    //Example of appropriate input: "Joe, Dog, Weezy"
    //The function will add a row containing 'Joe Dog Weezy' to the table and then sort the table appropriately
    void insertValuesFrom(String requestedValues){

        //Get Requested Values into String Array
        String noSpaces = requestedValues.replace(" ", "");
        String[] valuesToInsert = noQuotes.split("," , tableData[0].length);
		
		
		for(int i = 0; i < valuesToInsert.length(); i++){
			checkVar(valuesToInsert[i], i);
			valuesToInsert[i] = valuesToInsert[i].replace("\"" , "");
		}	
		
        //Create copy array
        String[][] copyTable = new String[tableData.length+1][tableData[0].length];

        for(int rows = 0; rows < tableData.length; rows++){
            for(int column = 0; column < tableData[0].length; column++){
                copyTable[rows][column] = tableData[rows][column];
            }
        }

        for(int column = 0; column < tableData[0].length; column++){
            copyTable[tableData.length][column] = valuesToInsert[column];
        }

        tableData = copyTable; //not sure how to assign the table back
    }






    //A function designed to add an entire table to another table
    //Example of appropriate input: {Joe, Dog, Weezy}
    //								{Jim, Cat, Cough}
    //								{Larry, Turtle, Sneeze}
    //The function will then enter the values of the given table into the desired table one row at a time
    //sorting them as it goes
    void insertRelation(String[][] newArray){

        String stringOfRow = "";

        for(int rows = 0; rows < newArray.length; rows++){
            for(int column = 0; column < newArray[0].length; column++){
                stringOfRow += newArray[rows][column] + ",";
            }
            insertValuesFrom(stringOfRow);
            stringOfRow = "";
        }
    }






    //A function designed to make a union table based on two different tables
    //Example of appropriate input: {Joe, Dog, Weezy}
    //								{Jim, Cat, Cough}
    //								{Larry, Turtle, Sneeze}
    //The function will then create a union table and output that table
    String[][] Union(String[][] arrayToInsert) throws Exception {
        if(arrayToInsert[0].length != tableData[0].length){
            throw new DifferentColumnsException("You Suck!");
        }

        String stringOfRow = "";

        for(int rows = 0; rows < arrayToInsert.length; rows++) {
            for (int column = 0; column < arrayToInsert[0].length; column++) {
                stringOfRow += arrayToInsert[rows][column] + ",";
            }
        }
        //Get Requested Values into String Array
        String noSpaces = stringOfRow.replace(" ", "");
        String noQuotes = noSpaces.replace("\"" , "");
        String[] valuesToInsert = noQuotes.split("," , tableData[0].length);

        //Create copy array
        String[][] copyTable = new String[tableData.length+1][tableData[0].length];

        for(int rows = 0; rows < tableData.length; rows++){
            for(int column = 0; column < tableData[0].length; column++){
                copyTable[rows][column] = tableData[rows][column];
            }
        }

        for(int column = 0; column < tableData[0].length; column++){
            copyTable[tableData.length][column] = valuesToInsert[column];
        }
        stringOfRow = "";


        for(int rows = 0; rows < tableData.length; rows++){
            for(int futureRows = rows + 1; futureRows < tableData.length; futureRows++){
                if(copyTable[rows][primaryColumn].compareTo("NULL") == 0){
                    continue;
                }
                else if(copyTable[rows][primaryColumn].compareTo(copyTable[futureRows][primaryColumn]) == 0){
                    copyTable[futureRows][primaryColumn] = "NULL";
                }
            }
        }
        return copyTable;
    }







    String[][] difference(String[][] arrayToCompare) throws Exception {
        cleanUp();

        for(int rows = 0; rows < arrayToCompare.length; rows++){
            for(int column = rows + 1; column < arrayToCompare.length; column++){
                if(arrayToCompare[rows][0].compareTo("NULL") == 0){
                    continue;
                }
                else if(arrayToCompare[rows][0].compareTo(arrayToCompare[column][0]) == 0){
                    arrayToCompare[column][0] = "NULL";
                }
                else if(arrayToCompare[rows][0].charAt(0) == arrayToCompare[column][0].charAt(0)){
                    rows++;
                }
            }
        }

        tableData = Union(arrayToCompare);

        cleanUp();

        return tableData;
    }








    //A function designed to set any rows with duplicate primary keys as "NULL" and then sort the table alphabetically
    void cleanUp(){
        for(int rows = 0; rows < tableData.length; rows++){
            for(int futureRows = rows + 1; futureRows < tableData.length; futureRows++){
                if(tableData[rows][primaryColumn].compareTo("NULL") == 0){
                    continue;
                }
                else if(tableData[rows][primaryColumn].compareTo(tableData[futureRows][primaryColumn]) == 0){
                    tableData[futureRows][primaryColumn] = "NULL";
                }
            }
        }
    }






    //A function designed to create a product table of two different tables
    //Example of appropriate input: {Joe, Dog, Weezy}
    //								{Jim, Cat, Cough}
    //								{Larry, Turtle, Sneeze}
    //The function will then output the product table of the table in the class and the table provided
    String[][] product(String[][] arrayToMultiply){
        int numRowsFirst = 0;
        int numRowsSecond = 0;

        String[][] copyArray = new String[tableData.length*arrayToMultiply.length][tableData[0].length+arrayToMultiply[0].length];


        for(int numFirstRows = 0; numFirstRows < tableData.length; numFirstRows++){
            numRowsSecond = 0;
            for(int numColumns = 0; numColumns < copyArray[0].length; numColumns++){
                if(numColumns < tableData[0].length){
                    copyArray[numFirstRows][numColumns] = tableData[numRowsFirst][numColumns];
                }
                else{
                    copyArray[numFirstRows][numColumns] = arrayToMultiply[numRowsSecond][numColumns - tableData[0].length];
                    numRowsSecond++;
                }
            }
            numRowsFirst++;
        }

        tableData = copyArray; // not sure how to assign the table back

        return tableData;
    }







    String[][] intersection(String[][] firstConditionalTable, String[][] secondConditionalTable)throws Exception{
    	if(firstConditionalTable[0].length != secondConditionalTable[0].length){
    		throw new DifferentColumnsException("You Suck!");
    	}
        Vector<Integer> rowsToRemember = new Vector();
        for(int i = 0; i < firstConditionalTable.length; i++){
            for(int j = 0; j < secondConditionalTable.length; j++){
                if(firstConditionalTable[i][primaryColumn].compareTo(secondConditionalTable[j][primaryColumn]) == 0){
                    rowsToRemember.add(i);
                    continue; //or break?
                }
            }
        }

        String[][] newData = new String[rowsToRemember.size()][firstConditionalTable[0].length];

        for(int i = 0; i < firstConditionalTable[0].length; i++){
            newData[0][i] = firstConditionalTable[0][i];
        }

        for(int i = 1; i < rowsToRemember.size(); i++){
            for(int j = 0; j < firstConditionalTable[0].length; j++){
                newData[i][j] = firstConditionalTable[rowsToRemember.get(i - 1)][j];
            }
        }

        return newData;
    }

	void checkVar(String inputToCheck, int indexForTypeAndMaxlength){
		if(dataType[indexForTypeAndMaxlength].equals("VARCHAR") && !(inputToCheck.contains("\""))){
			System.out.println("Relation name is the wrong type");
			System.exit(1);
		}
		else if(dataType[indexForTypeAndMaxlength].equals("INTEGER") && inputToCheck.contains("\"")){
			System.out.println("Relation name is the wrong type");
			System.exit(1);
		}
		else if(inputToCheck.length() > maxLengths[indexForTypeAndMaxlength]){
			System.out.println("Relation name has too many characters");
			System.exit(1);
		}
	}



    //----------------------------------------------------------- MAIN STARTS HERE -----------------------------------------------------
    public static void main(String[] args){

        try{

            // ArrayS with some data
            String[] columnNames = {"Name", "Kind", "Year", "Age"};
            String[] types = {"Varchar", "Varchar", "Integer", "Integer"};
            int[] maxLengths = {10, 10, 10, 10};

            // Create a new table
            Table data1 = new Table("data1", columnNames, types, "Name", maxLengths);

            // Insert some values
            data1.insertValuesFrom("Anders, Man, 2019, 21");
            data1.insertValuesFrom("Aaron, Man, 2019, 21");
            data1.insertValuesFrom("David, Man, 2018, 21");
            System.out.println(" ");

            System.out.println("Display Table as originally is");
            //show(data1.tableData);
            data1.show();
            System.out.println(" ");

            System.out.println("Print a projection of just the names and years");
            //show(project(data1.tableData, "Name", "Year"));
            Table data1_proj = new Table("data1_proj", data1.project("Name", "Year"));
            data1_proj.show();
            System.out.println(" ");

            System.out.println("Rename Name to Person and Year to GradDate");
            data1.rename("Person", "GradDate", "Name", "Year");
            //show(data1.tableData);
            data1.show();
            System.out.println(" ");

            System.out.println("Changing Kind to Old where GradDate is equal to 2018");
            data1.update("Kind", "Old", "GradDate == 2018");
            //System.out.println(" ");
            //show(data1.tableData);
            data1.show();
            System.out.println(" ");

            System.out.println("Print a selection");
            //show(data1.select("GradDate == 2019"));
            Table data1_sel = new Table("data1_sel", data1.select("GradDate == 2019"));
            data1_sel.show();
            //System.out.println(" ");
        }

        catch(DifferentColumnsException e){
            System.out.println("Can not Union two tables with different number of columns");
        }
        /*catch(UnevenNamesException ex){
        	System.out.println("Uneven number of names");
        }
        catch(InvalidComparatorException exc){
        	System.out.println("Invalid comparator");
        }
        catch(TooManySelectedProjectionException exce){
        	System.out.println("Too many attributes selected for projection");
        }*/
    }
}
