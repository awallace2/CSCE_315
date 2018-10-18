import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

class project2Test {
public static void main(String [] args) {
	String[] goodInput = {"CREATE TABLE animals (name VARCHAR(20), kind VARCHAR(8), years INTEGER) PRIMARY KEY (name, kind);", 
	"INSERT INTO animals VALUES FROM (\"Joe\", \"cat\", 4);", "INSERT INTO animals VALUES FROM (\"Spot\", \"dog\", 10);", 
	"INSERT INTO animals VALUES FROM (\"Snoopy\", \"dog\", 3);", "INSERT INTO animals VALUES FROM (\"Tweety\", \"bird\", 1);",
	"INSERT INTO animals VALUES FROM (\"Joe\", \"bird\", 2);", "SHOW animals;", "dogs <- select (kind == \"dog\") animals;", 
	"old_dogs <- select (age > 10) dogs;", "cats_or_dogs <- dogs + (select (kind == \"cat\") animals);",
	"common_names <- project (name) (select (aname == name && akind != kind) (a * animals));", "answer <- common_names;", 
	"SHOW answer;", "WRITE animals;", "CLOSE animals;", "EXIT;"};
	String[] badInput = {"CREATE TABLE animals name VARCHAR(20), kind VARCHAR(8), years INTEGER) PRIMARY KEY (name, kind);", 
	"INSERT INTO animals VALUES FROM (\"Joe\", \"cat\", );", "INSERT animals VALUES FROM (\"Spot\", \"dog\", 10);", 
	"INTO animals VALUES FROM (\"Snoopy\", \"dog\", 3);", "INSERT INTO animals (\"Tweety\", \"bird\", 1);", 
	"INSERT INTO animals VALUES FROM (\", \"bird\", 2);", "SHOW animals", "dogs <- select (kind = \"dog\") animals;", 
	"old_dogs <- select (age 10) dogs;", "cats_or_dogs <- dogs (select (kind == \"cat\") animals);", 
	"common_names <- project (select (aname == name && akind != kind) (a * animals));", "answer < common_names;", 
	"SHOW;", "WRITE animals", "CLOSE animals", ";"};
	for (int i=0; i < goodInput.length; i++){
		CharStream charStream = CharStreams.fromString(goodInput[i]); //string value of queries?
		project_2Lexer lexer = new project_2Lexer(charStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		project_2Parser parser = new project_2Parser(commonTokenStream);
	
		//Unsure about this part
		ParseTree parseTree = parser.program();
		
		String output;
		if (parser.getNumberOfSyntaxErrors() == 0) {
			output = "Input should have been good and was good";
		}
		else {
			output = "Input should have been good and was not good :(";
		}
		
		System.out.println(output);
	}
	for (int i=0; i < badInput.length; i++){
		CharStream charStream = CharStreams.fromString(badInput[i]); //string value of queries?
		project_2Lexer lexer = new project_2Lexer(charStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		project_2Parser parser = new project_2Parser(commonTokenStream);
	
		//Unsure about this part
		ParseTree parseTree = parser.program();
		
		String output;
		if (parser.getNumberOfSyntaxErrors() != 0) {
			output = "Input should have been bad and was bad";
		}
		else {
			output = "Input should have been bad and was good :(";
		}
		
		System.out.println(output);
	}
}
}