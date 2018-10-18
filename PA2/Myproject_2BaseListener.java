import java.util.Vector;
import java.util.Stack;
import java.util.List;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Myproject_2BaseListener extends project_2BaseListener {
    public Myproject_2BaseListener(Vector<Table> ourTables) {
        tables = ourTables;
        listenerStack = new Stack();
        tempTable = new Table();
    }

    private Vector<Table> tables;
    private Stack listenerStack;
    private Table tempTable;

    
    void writeTable(String tableName) {
        for(int i = 0; i < tables.size(); i++) {
            if (tableName.equals(tables.get(i).tableName)) {
                try{
                tables.get(i).writeToFile();
                }
                catch (IOException e) {
                    System.out.println("ya did bad");
                }
            }
        }
    }

    void closeTable(String tableName) {
        for(int i = 0; i < tables.size(); i++) {
            if (tableName.equals(tables.get(i).tableName)) {
                try{
                tables.get(i).writeToFile();
                }
                catch (IOException e) {

                }
                tables.remove(i);
            }
        }
    }

    void readTable(String tableName) {
        for(int i = 0; i < tables.size(); i++){
            if (tableName.equals(tables.get(i).tableName)) {
                try {
                tables.get(i).readFromFile();
                }
                catch (IOException e) {
                    
                }
            }
        }
    }

    void renameWrapper(String arguments, String tableName) {
        for(int i = 0; i < tables.size(); i++) {
            try{
            if (tableName.equals(tables.get(i).tableName)){
                tables.get(i).rename(arguments);
            }
            else {
                tempTable = (Table)listenerStack.pop();
                tempTable.rename(arguments);
            }
            }
            catch(Exception e){}
        }
    }

    public void enterExit_cmd(project_2Parser.Show_cmdContext ctx) { 
        System.exit(0);
    }

    public void enterOpen_cmd(project_2Parser.Open_cmdContext ctx) { 
        //get the root node's children
        //List<ParseTree> children = ctx.children;

        //First and second child nodes (should just be 'open relationName')
        ParseTree incrementWord = ctx.getChild(0); //open
        ParseTree relationName = ctx.getChild(1); //relationName

        tables.add(new Table(relationName.getText()));
        readTable(relationName.getText());
    }

    public void exitRenaming(project_2Parser.RenamingContext ctx) { 
        //Start with the root's children
       String tableToRename = ctx.getChild(4).getText();
       String passToRename = ctx.getChild(2).getText();
       boolean lastTime = false;
       for(int i = 0; i < tables.size(); i++) {
           if (i == tables.size() - 1) {
               lastTime = true;
           }
           if(tables.get(i).tableName.equals(tableToRename)){
               tables.get(i).rename(passToRename);
               listenerStack.push(tables.get(i));
           }
           else if(lastTime) {
               Table useNow = (Table)listenerStack.pop();
               useNow.rename(passToRename);
               listenerStack.push(useNow);
           }
       }
    }

    String[][] unionWrapper(String name1, String name2) throws Exception {
        Table relation1 = new Table();
        Table relation2 = new Table();
        //Get the second relation first
        boolean lastTime = false;
        for (int i = 0; i < tables.size(); i++) {
            if(i == tables.size() - 1) {
                lastTime = true;
            }
            if (tables.get(i).tableName.equals(name2)){
                relation2 = tables.get(i);
                //System.out.println("Found a table");
                break;
            }
            else if (lastTime) {
                relation2 = (Table)listenerStack.pop();
                break;
            }
        }
        lastTime = false;
        for (int i = 0; i < tables.size(); i++) {
            if(i == tables.size() - 1) {
                lastTime = true;
            }
            if (tables.get(i).tableName.equals(name1)){
                relation1 = tables.get(i);
                break;
            }
            else if(lastTime) {
                relation1 = (Table)listenerStack.pop();
                break;
            }
        }
        return relation1.Union(relation2.tableData);
    }

    public void exitUnion(project_2Parser.UnionContext ctx) { 
        //Get the children

        //get the value and words
        ParseTree relation1 = ctx.getChild(0);
        ParseTree plusSign = ctx.getChild(1);
        ParseTree relation2 = ctx.getChild(2);

        //Call union
        try {
        Table bradSwain = new Table("union", unionWrapper(relation1.getText(), relation2.getText()));
        listenerStack.push(bradSwain);//Should be good now
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void enterWrite_cmd(project_2Parser.Write_cmdContext ctx) { 
        //Get the children
        //List<ParseTree> children = ctx.children;

        //get the value and words
        ParseTree incrementWord = ctx.getChild(0);
        ParseTree relationName = ctx.getChild(1);

        //call our write Function
        writeTable(relationName.getText());
    }

	/*public void enterInsert_cmd(project_2Parser.Insert_cmdContext ctx){
		if (ctx.getChild(2).getText().contains("RELATION")){
		    System.out.println("Butter my biscuts");
        }
		
			/*ParseTree  = ctx.getChild();
			insertRelation();
		}
		else{
			insertValuesFrom();
		}
	}*/

    String getInsertLiteral(project_2Parser.Insert_cmdContext ctx) {
        List<ParseTree> children = ctx.children;
        String valuesToInsert = "";
        for (int i = 0; i < children.size(); i++){
            if(children.get(i).getText().equals("(")){
                i++;
                while (!children.get(i).getText().equals(")")) {
                    valuesToInsert += children.get(i).getText();
                    i++;
                }
            }
        }
        return valuesToInsert;
    }
	
    public void exitInsert_cmd(project_2Parser.Insert_cmdContext ctx) { 
        if (ctx.getChild(2).getText().contains("RELATION")){
		    for(int i = 0; i < tables.size(); i++) {
                if (tables.get(i).tableName.equals(ctx.getChild(1).getText())) {
                    Table temp = (Table)listenerStack.pop();
                    tables.get(i).insertRelation(temp.tableData);
                }
            }
        }
        else {
            for(int i = 0; i < tables.size(); i++) {
                if(tables.get(i).tableName.equals(ctx.getChild(1).getText())) {
                    tables.get(i).insertValuesFrom(getInsertLiteral(ctx));
                }
            }
        }
    }

    String formattedConditional(project_2Parser.SelectionContext ctx) {
        String part1 = ctx.getChild(2).getChild(0).getChild(0).getChild(0).getText();
        String part2 = ctx.getChild(2).getChild(0).getChild(0).getChild(1).getText();
        String part3 = ctx.getChild(2).getChild(0).getChild(0).getChild(2).getText();
        Character quote = part3.charAt(0);
        if (quote.equals('\"')) {
            part3 = part3.replace("\"", "");
        }
        return part1 + " " + part2 + " " + part3;
    }

    public void exitSelection(project_2Parser.SelectionContext ctx) { 
        //getChild(2) gets relation, getChild(4) gets table name
        boolean lastTime = false;
        for (int i = 0; i < tables.size(); i++) {
            try{
            if(i == tables.size() - 1) {
                lastTime = true;
            }
            if ((ctx.getChild(4).getText()).equals(tables.get(i).tableName)){
                Table bradSwain = new Table("Select", tables.get(i).select(formattedConditional(ctx)));
               // System.out.println(bradSwain.tableName);
                listenerStack.push(bradSwain);
               // System.out.println(listenerStack.size());
                break;
            }
            else if (lastTime) {

                Table temp = (Table)listenerStack.pop();

                listenerStack.push(temp.select(formattedConditional(ctx)));


                break;
            }
            }
            catch (Exception e){
                System.out.println("Exception caught is: ");
                System.out.print(e);
            }
    }
   // System.out.println(listenerStack.size());
    }

    //Update not called by animals example


    /*String getCreateLiteral(project_2Parser.Create_cmdContext ctx) {
        List<ParseTree> children = ctx.children;
        String valuesToInsert = "";
        for (int i = 0; i < children.size(); i++){
            if(children.get(i).getText().equals("(")){
                i++;
                while (!children.get(i).getText().equals(")")) {
                    valuesToInsert += children.get(i).getText();
                    i++;
                }
                break;
            }
        }
        return valuesToInsert;
    }

    String getCreateKeyLiteral(project_2Parser.Create_cmdContext ctx) {
        List<ParseTree> children = ctx.children;
        String valuesToInsert = "";
        boolean secondLiteral = false;
        for (int i = 0; i < children.size(); i++){
            if(children.get(i).getText().equals("(")){
                i++;
                while (!children.get(i).getText().equals(")")) {
                    if (secondLiteral) {
                    valuesToInsert += children.get(i).getText();
                    }
                    i++;
                }
                secondLiteral = true;
            }
        }
        return valuesToInsert;
    }*/

    /*String[] getColumnNames(String rawLiteral) {
        String[] individualArgs = rawLiteral.split(",");
        for(int i = 0; i < individualArgs.size(); i++){
            for(int )
        }
    }*/

    String[] getColumnNames(project_2Parser.Create_cmdContext ctx) {
       Vector<String> columnNames = new Vector();
       List<ParseTree> children = ctx.children;
       for (int i = 0; i < children.size(); i++){
            if(children.get(i).getText().equals("(")){
                i++;
                while (!children.get(i).getText().equals(")")) {
                    if (!children.get(i).getText().equals(",")) {
                        columnNames.add(children.get(i).getChild(0).getText());
                    }
                    i++;
                }
                break;
            }
       }
       String[] names = new String[columnNames.size()];
       for (int i = 0; i < columnNames.size(); i++) {
           names[i] = columnNames.get(i);
       }
       return names;
    }

    public void exitCreate_cmd(project_2Parser.Create_cmdContext ctx) { 

        String tableName = ctx.getChild(1).getText();
         String[] columnNames = getColumnNames(ctx);
         Table bradSwain = new Table(tableName, columnNames);
         tables.addElement(bradSwain);
    }

    public void exitQuery(project_2Parser.QueryContext ctx) { 
        ParseTree tableName = ctx.getChild(0);
		ParseTree rightTableName = ctx.getChild(2);
       boolean lastTime = false;
       for(int i = 0; i < tables.size(); i++) {
           if (i == tables.size() - 1) {
               lastTime = true;
           }
		   if (tables.get(i).tableName.equals(rightTableName.getText())){
			   Table bradSwain = new Table(tableName.getText(), tables.get(i).tableData);
               tables.add(bradSwain);
               break;
		   }
           if (tables.get(i).tableName.equals(tableName.getText())){
               Table bradSwain = new Table(tableName.getText(), tables.get(i).tableData);
               tables.add(bradSwain);
               break;
           }
           else if(lastTime) {
               Table popped = (Table)listenerStack.pop();
			   

                Table bradSwain = new Table(tableName.getText(), popped.tableData);
                tables.add(bradSwain);
                break;
           }
       }
    }

    /*public void enterLiteral(project_2Parser.LiteralContext ctx) { 
        ParseTree literal = ctx.getChild(0);

        listenerStack.push(literal.getText());
    }*/

    public void enterClose_cmd(project_2Parser.Close_cmdContext ctx) { 
        ParseTree relationName = ctx.getChild(1);

        //Call our wrapper
        closeTable(relationName.getText());
    }

    public void enterShow_cmd(project_2Parser.Show_cmdContext ctx) { 
        String relationName = ctx.getChild(1).getText();
        for (int i = 0; i < tables.size(); i++) {
            if(tables.get(i).tableName.equals(relationName)) {
                tables.get(i).show();
            }
        }
    }

    public void exitProjection(project_2Parser.ProjectionContext ctx) { 
        String attributes = ctx.getChild(2).getText();
        String[] attributeArray = attributes.split(",");
        boolean lastTime = false;
        for (int i = 0; i < tables.size(); i++) {
            if(i == tables.size() - 1) {
                lastTime = true;
            }
            if(tables.get(i).tableName.equals(ctx.getChild(4).getText())) {
                try{
                Table bradSwain = new Table("Project", tables.get(i).project(attributeArray));
                listenerStack.push(bradSwain);
                }
                catch (Exception e) {}
                break;
            }
            else if(lastTime) {
                Table temp = (Table)listenerStack.pop();
                try{
                Table bradSwain = new Table("Project", temp.project(attributeArray));
                listenerStack.push(bradSwain);
                }
                catch(Exception e) {
					System.out.println("Exception caught in exitProjection");
				}
                break;
            }
        }
    }

    String[][] productWrapper(String name1, String name2) throws Exception {
        Table relation1 = new Table();
        Table relation2 = new Table();
        //Get the second relation first
       boolean lastTime = false;
        for (int i = 0; i < tables.size(); i++) {
            if(i == tables.size() - 1) {
                lastTime = true;
            }
            if (tables.get(i).tableName.equals(name2)){
                relation2 = tables.get(i);
                break;
            }
            else if (lastTime) {
                relation2 = (Table)listenerStack.pop();
                break;
            }
        }
        lastTime = false;
        for (int i = 0; i < tables.size(); i++) {
            if(i == tables.size() - 1) {
                lastTime = true;
            }
            if (tables.get(i).tableName.equals(name1)){
                relation1 = tables.get(i);
                break;
            }
            else if(lastTime) {
                relation1 = (Table)listenerStack.pop();
                break;
            }
        }
        return relation1.product(relation2.tableData);
    }

    public void exitProduct(project_2Parser.ProductContext ctx) { 
        ParseTree relation1 = ctx.getChild(0);
        ParseTree relation2 = ctx.getChild(2);

        //Call product
        try {
        Table bradSwain = new Table("product", productWrapper(relation1.getText(), relation2.getText()));
        listenerStack.push(bradSwain);//Should be good now
        }
        catch (Exception e) {
			System.out.println("Exception caught in exitProduct");
			System.out.println(e);
		}
    }
}