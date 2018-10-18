// Generated from project_2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class project_2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		ALPHA=39, DIGIT=40, WS=41, LITERAL=42;
	public static final int
		RULE_prule = 0, RULE_query = 1, RULE_re_name = 2, RULE_ident = 3, RULE_expr = 4, 
		RULE_atom_expr = 5, RULE_selection = 6, RULE_condition = 7, RULE_conjunction = 8, 
		RULE_comparison = 9, RULE_op = 10, RULE_operand = 11, RULE_attri_name = 12, 
		RULE_literal = 13, RULE_projection = 14, RULE_attri_list = 15, RULE_renaming = 16, 
		RULE_union = 17, RULE_difference = 18, RULE_product = 19, RULE_command = 20, 
		RULE_open_cmd = 21, RULE_close_cmd = 22, RULE_write_cmd = 23, RULE_exit_cmd = 24, 
		RULE_show_cmd = 25, RULE_create_cmd = 26, RULE_update_cmd = 27, RULE_insert_cmd = 28, 
		RULE_delete_cmd = 29, RULE_typed_attri_list = 30, RULE_type = 31, RULE_integer = 32, 
		RULE_program = 33;
	public static final String[] ruleNames = {
		"prule", "query", "re_name", "ident", "expr", "atom_expr", "selection", 
		"condition", "conjunction", "comparison", "op", "operand", "attri_name", 
		"literal", "projection", "attri_list", "renaming", "union", "difference", 
		"product", "command", "open_cmd", "close_cmd", "write_cmd", "exit_cmd", 
		"show_cmd", "create_cmd", "update_cmd", "insert_cmd", "delete_cmd", "typed_attri_list", 
		"type", "integer", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "';'", "'_'", "'('", "')'", "'select'", "'||'", "'&&'", 
		"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'\"'", "'project'", "','", 
		"'rename'", "'+'", "'-'", "'*'", "'OPEN'", "'CLOSE'", "'WRITE'", "'EXIT'", 
		"'SHOW'", "'CREATE TABLE'", "'PRIMARY KEY'", "'UPDATE'", "'SET'", "'='", 
		"'WHERE'", "'INSERT INTO'", "'VALUES FROM'", "'VALUES FROM RELATION'", 
		"'DELETE FROM'", "'VARCHAR'", "'INTEGER'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ALPHA", "DIGIT", "WS", "LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "project_2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public project_2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PruleContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitPrule(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			re_name();
			setState(71);
			match(T__0);
			setState(72);
			expr();
			setState(73);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Re_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Re_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterRe_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitRe_name(this);
		}
	}

	public final Re_nameContext re_name() throws RecognitionException {
		Re_nameContext _localctx = new Re_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_re_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(project_2Parser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(project_2Parser.ALPHA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(project_2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(project_2Parser.DIGIT, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ALPHA);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ALPHA) | (1L << DIGIT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public RenamingContext renaming() {
			return getRuleContext(RenamingContext.class,0);
		}
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public DifferenceContext difference() {
			return getRuleContext(DifferenceContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(84);
				atom_expr();
				}
				break;
			case 2:
				{
				setState(85);
				selection();
				}
				break;
			case 3:
				{
				setState(86);
				projection();
				}
				break;
			case 4:
				{
				setState(87);
				renaming();
				}
				break;
			case 5:
				{
				setState(88);
				union();
				}
				break;
			case 6:
				{
				setState(89);
				difference();
				}
				break;
			case 7:
				{
				setState(90);
				product();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_exprContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitAtom_expr(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
				{
				setState(93);
				ident();
				}
				break;
			case T__3:
				{
				setState(94);
				match(T__3);
				setState(95);
				expr();
				setState(96);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
			setState(101);
			match(T__3);
			setState(102);
			condition();
			setState(103);
			match(T__4);
			setState(104);
			atom_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(106);
				conjunction();
				}
				break;
			case 2:
				{
				setState(107);
				comparison();
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(110);
				match(T__6);
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(111);
					conjunction();
					}
					break;
				case 2:
					{
					setState(112);
					comparison();
					}
					break;
				}
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			comparison();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(121);
				match(T__7);
				setState(122);
				comparison();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			operand();
			setState(129);
			op();
			setState(130);
			operand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public Attri_nameContext attri_name() {
			return getRuleContext(Attri_nameContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA:
				{
				setState(134);
				attri_name();
				}
				break;
			case DIGIT:
				{
				setState(135);
				integer();
				}
				break;
			case T__14:
				{
				setState(136);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attri_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Attri_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attri_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterAttri_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitAttri_name(this);
		}
	}

	public final Attri_nameContext attri_name() throws RecognitionException {
		Attri_nameContext _localctx = new Attri_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attri_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__14);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHA) {
				{
				{
				setState(142);
				ident();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionContext extends ParserRuleContext {
		public Attri_listContext attri_list() {
			return getRuleContext(Attri_listContext.class,0);
		}
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_projection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__15);
			setState(151);
			match(T__3);
			setState(152);
			attri_list();
			setState(153);
			match(T__4);
			setState(154);
			atom_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attri_listContext extends ParserRuleContext {
		public List<Attri_nameContext> attri_name() {
			return getRuleContexts(Attri_nameContext.class);
		}
		public Attri_nameContext attri_name(int i) {
			return getRuleContext(Attri_nameContext.class,i);
		}
		public Attri_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attri_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterAttri_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitAttri_list(this);
		}
	}

	public final Attri_listContext attri_list() throws RecognitionException {
		Attri_listContext _localctx = new Attri_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attri_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			attri_name();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(157);
				match(T__16);
				setState(158);
				attri_name();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenamingContext extends ParserRuleContext {
		public Attri_listContext attri_list() {
			return getRuleContext(Attri_listContext.class,0);
		}
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public RenamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterRenaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitRenaming(this);
		}
	}

	public final RenamingContext renaming() throws RecognitionException {
		RenamingContext _localctx = new RenamingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__17);
			setState(165);
			match(T__3);
			setState(166);
			attri_list();
			setState(167);
			match(T__4);
			setState(168);
			atom_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitUnion(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			atom_expr();
			setState(171);
			match(T__18);
			setState(172);
			atom_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DifferenceContext extends ParserRuleContext {
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public DifferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitDifference(this);
		}
	}

	public final DifferenceContext difference() throws RecognitionException {
		DifferenceContext _localctx = new DifferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_difference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			atom_expr();
			setState(175);
			match(T__19);
			setState(176);
			atom_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			atom_expr();
			setState(179);
			match(T__20);
			setState(180);
			atom_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public Open_cmdContext open_cmd() {
			return getRuleContext(Open_cmdContext.class,0);
		}
		public Close_cmdContext close_cmd() {
			return getRuleContext(Close_cmdContext.class,0);
		}
		public Write_cmdContext write_cmd() {
			return getRuleContext(Write_cmdContext.class,0);
		}
		public Exit_cmdContext exit_cmd() {
			return getRuleContext(Exit_cmdContext.class,0);
		}
		public Show_cmdContext show_cmd() {
			return getRuleContext(Show_cmdContext.class,0);
		}
		public Create_cmdContext create_cmd() {
			return getRuleContext(Create_cmdContext.class,0);
		}
		public Update_cmdContext update_cmd() {
			return getRuleContext(Update_cmdContext.class,0);
		}
		public Insert_cmdContext insert_cmd() {
			return getRuleContext(Insert_cmdContext.class,0);
		}
		public Delete_cmdContext delete_cmd() {
			return getRuleContext(Delete_cmdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(182);
				open_cmd();
				}
				break;
			case T__22:
				{
				setState(183);
				close_cmd();
				}
				break;
			case T__23:
				{
				setState(184);
				write_cmd();
				}
				break;
			case T__24:
				{
				setState(185);
				exit_cmd();
				}
				break;
			case T__25:
				{
				setState(186);
				show_cmd();
				}
				break;
			case T__26:
				{
				setState(187);
				create_cmd();
				}
				break;
			case T__28:
				{
				setState(188);
				update_cmd();
				}
				break;
			case T__32:
				{
				setState(189);
				insert_cmd();
				}
				break;
			case T__35:
				{
				setState(190);
				delete_cmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public Open_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterOpen_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitOpen_cmd(this);
		}
	}

	public final Open_cmdContext open_cmd() throws RecognitionException {
		Open_cmdContext _localctx = new Open_cmdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_open_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__21);
			setState(196);
			re_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public Close_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterClose_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitClose_cmd(this);
		}
	}

	public final Close_cmdContext close_cmd() throws RecognitionException {
		Close_cmdContext _localctx = new Close_cmdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_close_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__22);
			setState(199);
			re_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public Write_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterWrite_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitWrite_cmd(this);
		}
	}

	public final Write_cmdContext write_cmd() throws RecognitionException {
		Write_cmdContext _localctx = new Write_cmdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__23);
			setState(202);
			re_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_cmdContext extends ParserRuleContext {
		public Exit_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterExit_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitExit_cmd(this);
		}
	}

	public final Exit_cmdContext exit_cmd() throws RecognitionException {
		Exit_cmdContext _localctx = new Exit_cmdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exit_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public Show_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterShow_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitShow_cmd(this);
		}
	}

	public final Show_cmdContext show_cmd() throws RecognitionException {
		Show_cmdContext _localctx = new Show_cmdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_show_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__25);
			setState(207);
			re_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public List<Typed_attri_listContext> typed_attri_list() {
			return getRuleContexts(Typed_attri_listContext.class);
		}
		public Typed_attri_listContext typed_attri_list(int i) {
			return getRuleContext(Typed_attri_listContext.class,i);
		}
		public Attri_listContext attri_list() {
			return getRuleContext(Attri_listContext.class,0);
		}
		public Create_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterCreate_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitCreate_cmd(this);
		}
	}

	public final Create_cmdContext create_cmd() throws RecognitionException {
		Create_cmdContext _localctx = new Create_cmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_create_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__26);
			setState(210);
			re_name();
			setState(211);
			match(T__3);
			setState(212);
			typed_attri_list();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(213);
				match(T__16);
				{
				setState(214);
				typed_attri_list();
				}
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__4);
			setState(221);
			match(T__27);
			setState(222);
			match(T__3);
			setState(223);
			attri_list();
			setState(224);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public Attri_nameContext attri_name() {
			return getRuleContext(Attri_nameContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(project_2Parser.LITERAL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Update_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterUpdate_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitUpdate_cmd(this);
		}
	}

	public final Update_cmdContext update_cmd() throws RecognitionException {
		Update_cmdContext _localctx = new Update_cmdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_update_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__28);
			setState(227);
			re_name();
			setState(228);
			match(T__29);
			setState(229);
			attri_name();
			setState(230);
			match(T__30);
			setState(231);
			match(LITERAL);
			//',' attri_name = literal
			setState(233);
			match(T__31);
			setState(234);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Insert_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterInsert_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitInsert_cmd(this);
		}
	}

	public final Insert_cmdContext insert_cmd() throws RecognitionException {
		Insert_cmdContext _localctx = new Insert_cmdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert_cmd);
		try {
			int _alt;
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__32);
				setState(237);
				re_name();
				setState(238);
				match(T__33);
				setState(239);
				match(T__3);
				setState(240);
				literal();
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(241);
						match(T__16);
						{
						setState(242);
						literal();
						}
						}
						} 
					}
					setState(247);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				{
				setState(248);
				match(T__16);
				setState(249);
				integer();
				}
				setState(251);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__32);
				setState(254);
				re_name();
				setState(255);
				match(T__34);
				setState(256);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_cmdContext extends ParserRuleContext {
		public Re_nameContext re_name() {
			return getRuleContext(Re_nameContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Delete_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterDelete_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitDelete_cmd(this);
		}
	}

	public final Delete_cmdContext delete_cmd() throws RecognitionException {
		Delete_cmdContext _localctx = new Delete_cmdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delete_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__35);
			setState(261);
			re_name();
			setState(262);
			match(T__31);
			setState(263);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_attri_listContext extends ParserRuleContext {
		public Attri_nameContext attri_name() {
			return getRuleContext(Attri_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_attri_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_attri_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterTyped_attri_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitTyped_attri_list(this);
		}
	}

	public final Typed_attri_listContext typed_attri_list() throws RecognitionException {
		Typed_attri_listContext _localctx = new Typed_attri_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typed_attri_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			attri_name();
			setState(266);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__36);
				setState(269);
				match(T__3);
				setState(270);
				integer();
				setState(271);
				match(T__4);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__37);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(project_2Parser.DIGIT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(DIGIT);
			//DIGIT
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof project_2Listener ) ((project_2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << ALPHA))) != 0)) {
				{
				setState(281);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALPHA:
					{
					setState(279);
					query();
					}
					break;
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__28:
				case T__32:
				case T__35:
					{
					setState(280);
					command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5R\n\5"+
		"\f\5\16\5U\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\to\n\t\3\t\3\t\3\t\5\tt"+
		"\n\t\7\tv\n\t\f\t\16\ty\13\t\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\17"+
		"\3\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u00c2\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00da\n\34\f\34"+
		"\16\34\u00dd\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u00f6"+
		"\n\36\f\36\16\36\u00f9\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u0105\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\5!\u0115\n!\3\"\3\"\3\"\3#\3#\7#\u011c\n#\f#\16#\u011f\13#\3#"+
		"\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BD\2\4\4\2\5\5)*\3\2\13\20\2\u011c\2F\3\2\2\2\4H\3\2\2\2\6M\3\2\2\2\b"+
		"O\3\2\2\2\n]\3\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20n\3\2\2\2\22z\3\2\2\2\24"+
		"\u0082\3\2\2\2\26\u0086\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2\2\34\u008f"+
		"\3\2\2\2\36\u0098\3\2\2\2 \u009e\3\2\2\2\"\u00a6\3\2\2\2$\u00ac\3\2\2"+
		"\2&\u00b0\3\2\2\2(\u00b4\3\2\2\2*\u00c1\3\2\2\2,\u00c5\3\2\2\2.\u00c8"+
		"\3\2\2\2\60\u00cb\3\2\2\2\62\u00ce\3\2\2\2\64\u00d0\3\2\2\2\66\u00d3\3"+
		"\2\2\28\u00e4\3\2\2\2:\u0104\3\2\2\2<\u0106\3\2\2\2>\u010b\3\2\2\2@\u0114"+
		"\3\2\2\2B\u0116\3\2\2\2D\u011d\3\2\2\2FG\5D#\2G\3\3\2\2\2HI\5\6\4\2IJ"+
		"\7\3\2\2JK\5\n\6\2KL\7\4\2\2L\5\3\2\2\2MN\5\b\5\2N\7\3\2\2\2OS\7)\2\2"+
		"PR\t\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2"+
		"\2V^\5\f\7\2W^\5\16\b\2X^\5\36\20\2Y^\5\"\22\2Z^\5$\23\2[^\5&\24\2\\^"+
		"\5(\25\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]"+
		"\\\3\2\2\2^\13\3\2\2\2_e\5\b\5\2`a\7\6\2\2ab\5\n\6\2bc\7\7\2\2ce\3\2\2"+
		"\2d_\3\2\2\2d`\3\2\2\2e\r\3\2\2\2fg\7\b\2\2gh\7\6\2\2hi\5\20\t\2ij\7\7"+
		"\2\2jk\5\f\7\2k\17\3\2\2\2lo\5\22\n\2mo\5\24\13\2nl\3\2\2\2nm\3\2\2\2"+
		"ow\3\2\2\2ps\7\t\2\2qt\5\22\n\2rt\5\24\13\2sq\3\2\2\2sr\3\2\2\2tv\3\2"+
		"\2\2up\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3\2\2\2z\177"+
		"\5\24\13\2{|\7\n\2\2|~\5\24\13\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\23\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\30"+
		"\r\2\u0083\u0084\5\26\f\2\u0084\u0085\5\30\r\2\u0085\25\3\2\2\2\u0086"+
		"\u0087\t\3\2\2\u0087\27\3\2\2\2\u0088\u008c\5\32\16\2\u0089\u008c\5B\""+
		"\2\u008a\u008c\5\34\17\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\5\b\5\2\u008e\33\3\2\2\2\u008f"+
		"\u0093\7\21\2\2\u0090\u0092\5\b\5\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7\21\2\2\u0097\35\3\2\2\2\u0098\u0099\7\22"+
		"\2\2\u0099\u009a\7\6\2\2\u009a\u009b\5 \21\2\u009b\u009c\7\7\2\2\u009c"+
		"\u009d\5\f\7\2\u009d\37\3\2\2\2\u009e\u00a3\5\32\16\2\u009f\u00a0\7\23"+
		"\2\2\u00a0\u00a2\5\32\16\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4!\3\2\2\2\u00a5\u00a3\3\2\2\2"+
		"\u00a6\u00a7\7\24\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa"+
		"\7\7\2\2\u00aa\u00ab\5\f\7\2\u00ab#\3\2\2\2\u00ac\u00ad\5\f\7\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\u00af\5\f\7\2\u00af%\3\2\2\2\u00b0\u00b1\5\f\7\2"+
		"\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5\f\7\2\u00b3\'\3\2\2\2\u00b4\u00b5"+
		"\5\f\7\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\f\7\2\u00b7)\3\2\2\2\u00b8"+
		"\u00c2\5,\27\2\u00b9\u00c2\5.\30\2\u00ba\u00c2\5\60\31\2\u00bb\u00c2\5"+
		"\62\32\2\u00bc\u00c2\5\64\33\2\u00bd\u00c2\5\66\34\2\u00be\u00c2\58\35"+
		"\2\u00bf\u00c2\5:\36\2\u00c0\u00c2\5<\37\2\u00c1\u00b8\3\2\2\2\u00c1\u00b9"+
		"\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\4\2\2\u00c4+\3\2\2\2\u00c5\u00c6"+
		"\7\30\2\2\u00c6\u00c7\5\6\4\2\u00c7-\3\2\2\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"\u00ca\5\6\4\2\u00ca/\3\2\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\5\6\4\2"+
		"\u00cd\61\3\2\2\2\u00ce\u00cf\7\33\2\2\u00cf\63\3\2\2\2\u00d0\u00d1\7"+
		"\34\2\2\u00d1\u00d2\5\6\4\2\u00d2\65\3\2\2\2\u00d3\u00d4\7\35\2\2\u00d4"+
		"\u00d5\5\6\4\2\u00d5\u00d6\7\6\2\2\u00d6\u00db\5> \2\u00d7\u00d8\7\23"+
		"\2\2\u00d8\u00da\5> \2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7\7\2\2\u00df\u00e0\7\36\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\5"+
		" \21\2\u00e2\u00e3\7\7\2\2\u00e3\67\3\2\2\2\u00e4\u00e5\7\37\2\2\u00e5"+
		"\u00e6\5\6\4\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7"+
		"!\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\b\35\1\2\u00eb\u00ec\7\"\2\2\u00ec"+
		"\u00ed\5\20\t\2\u00ed9\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\5\6\4\2"+
		"\u00f0\u00f1\7$\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f7\5\34\17\2\u00f3\u00f4"+
		"\7\23\2\2\u00f4\u00f6\5\34\17\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2"+
		"\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\5B\"\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\7\7\2\2\u00fe\u0105\3\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\5\6"+
		"\4\2\u0101\u0102\7%\2\2\u0102\u0103\5\n\6\2\u0103\u0105\3\2\2\2\u0104"+
		"\u00ee\3\2\2\2\u0104\u00ff\3\2\2\2\u0105;\3\2\2\2\u0106\u0107\7&\2\2\u0107"+
		"\u0108\5\6\4\2\u0108\u0109\7\"\2\2\u0109\u010a\5\20\t\2\u010a=\3\2\2\2"+
		"\u010b\u010c\5\32\16\2\u010c\u010d\5@!\2\u010d?\3\2\2\2\u010e\u010f\7"+
		"\'\2\2\u010f\u0110\7\6\2\2\u0110\u0111\5B\"\2\u0111\u0112\7\7\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0115\7(\2\2\u0114\u010e\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115A\3\2\2\2\u0116\u0117\7*\2\2\u0117\u0118\b\"\1\2\u0118C\3\2"+
		"\2\2\u0119\u011c\5\4\3\2\u011a\u011c\5*\26\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011eE\3\2\2\2\u011f\u011d\3\2\2\2\23S]dnsw\177\u008b\u0093\u00a3"+
		"\u00c1\u00db\u00f7\u0104\u0114\u011b\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
