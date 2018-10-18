import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.PrintWriter;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class project2Main {
public static void main(String [] args) throws FileNotFoundException {
	//try{
	String out = "";
	PrintWriter outPut = new PrintWriter("mainOutput.txt"); 
	int numLines = 0;
	
	List<String> lines = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	while (scanner.hasNextLine()) {
   		String line = scanner.nextLine();
   		lines.add(line);
	}
scanner.close();
Vector<Table> tables = new Vector<Table>();
	for (String line:lines){
		if(line.length() == 0){
			continue;
		}
		numLines++; 
		CharStream charStream = CharStreams.fromString(line); //string value of queries
		project_2Lexer lexer = new project_2Lexer(charStream);
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		project_2Parser parser = new project_2Parser(commonTokenStream);
		
		int numErrors = parser.getNumberOfSyntaxErrors();
		if(numErrors == 0){
			project_2Parser.ProgramContext programContext = parser.program();
			ParseTreeWalker walker = new ParseTreeWalker();
			Myproject_2BaseListener listener = new Myproject_2BaseListener(tables);
			walker.walk(listener, programContext);
		}
		else {
			System.out.println("Error - Invalid Query");
		}

	outPut.println(out);
	outPut.close();
	}
	//}
	//catch(Exception e){
		//System.out.println("Exception caught in project2Main");
		//System.out.println(e);
	//}
}
}