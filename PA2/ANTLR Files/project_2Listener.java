// Generated from project_2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link project_2Parser}.
 */
public interface project_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link project_2Parser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(project_2Parser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(project_2Parser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(project_2Parser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(project_2Parser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#re_name}.
	 * @param ctx the parse tree
	 */
	void enterRe_name(project_2Parser.Re_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#re_name}.
	 * @param ctx the parse tree
	 */
	void exitRe_name(project_2Parser.Re_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(project_2Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(project_2Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(project_2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(project_2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(project_2Parser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(project_2Parser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(project_2Parser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(project_2Parser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(project_2Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(project_2Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(project_2Parser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(project_2Parser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(project_2Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(project_2Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(project_2Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(project_2Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(project_2Parser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(project_2Parser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#attri_name}.
	 * @param ctx the parse tree
	 */
	void enterAttri_name(project_2Parser.Attri_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#attri_name}.
	 * @param ctx the parse tree
	 */
	void exitAttri_name(project_2Parser.Attri_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(project_2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(project_2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(project_2Parser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(project_2Parser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#attri_list}.
	 * @param ctx the parse tree
	 */
	void enterAttri_list(project_2Parser.Attri_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#attri_list}.
	 * @param ctx the parse tree
	 */
	void exitAttri_list(project_2Parser.Attri_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#renaming}.
	 * @param ctx the parse tree
	 */
	void enterRenaming(project_2Parser.RenamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#renaming}.
	 * @param ctx the parse tree
	 */
	void exitRenaming(project_2Parser.RenamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#union}.
	 * @param ctx the parse tree
	 */
	void enterUnion(project_2Parser.UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#union}.
	 * @param ctx the parse tree
	 */
	void exitUnion(project_2Parser.UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#difference}.
	 * @param ctx the parse tree
	 */
	void enterDifference(project_2Parser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#difference}.
	 * @param ctx the parse tree
	 */
	void exitDifference(project_2Parser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(project_2Parser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(project_2Parser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(project_2Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(project_2Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#open_cmd}.
	 * @param ctx the parse tree
	 */
	void enterOpen_cmd(project_2Parser.Open_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#open_cmd}.
	 * @param ctx the parse tree
	 */
	void exitOpen_cmd(project_2Parser.Open_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#close_cmd}.
	 * @param ctx the parse tree
	 */
	void enterClose_cmd(project_2Parser.Close_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#close_cmd}.
	 * @param ctx the parse tree
	 */
	void exitClose_cmd(project_2Parser.Close_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#write_cmd}.
	 * @param ctx the parse tree
	 */
	void enterWrite_cmd(project_2Parser.Write_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#write_cmd}.
	 * @param ctx the parse tree
	 */
	void exitWrite_cmd(project_2Parser.Write_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#exit_cmd}.
	 * @param ctx the parse tree
	 */
	void enterExit_cmd(project_2Parser.Exit_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#exit_cmd}.
	 * @param ctx the parse tree
	 */
	void exitExit_cmd(project_2Parser.Exit_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#show_cmd}.
	 * @param ctx the parse tree
	 */
	void enterShow_cmd(project_2Parser.Show_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#show_cmd}.
	 * @param ctx the parse tree
	 */
	void exitShow_cmd(project_2Parser.Show_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#create_cmd}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cmd(project_2Parser.Create_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#create_cmd}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cmd(project_2Parser.Create_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#update_cmd}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_cmd(project_2Parser.Update_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#update_cmd}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_cmd(project_2Parser.Update_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#insert_cmd}.
	 * @param ctx the parse tree
	 */
	void enterInsert_cmd(project_2Parser.Insert_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#insert_cmd}.
	 * @param ctx the parse tree
	 */
	void exitInsert_cmd(project_2Parser.Insert_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#delete_cmd}.
	 * @param ctx the parse tree
	 */
	void enterDelete_cmd(project_2Parser.Delete_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#delete_cmd}.
	 * @param ctx the parse tree
	 */
	void exitDelete_cmd(project_2Parser.Delete_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#typed_attri_list}.
	 * @param ctx the parse tree
	 */
	void enterTyped_attri_list(project_2Parser.Typed_attri_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#typed_attri_list}.
	 * @param ctx the parse tree
	 */
	void exitTyped_attri_list(project_2Parser.Typed_attri_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(project_2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(project_2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(project_2Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(project_2Parser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link project_2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(project_2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link project_2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(project_2Parser.ProgramContext ctx);
}