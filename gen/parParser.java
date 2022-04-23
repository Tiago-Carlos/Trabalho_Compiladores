// Generated from /home/tiago/IdeaProjects/Trabalho_Compiladores/par.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class parParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DECLARACAO=12, ALGORITMO=13, ATRIBUIR=14, A=15, TIPO_INT=16, 
		TIPO_STRING=17, TIPO_BOOL=18, TIPO_FLOAT=19, ID=20, COMMENT=21, WS=22, 
		NUM=23, STRING=24, BOOL=25, FLOAT=26;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_expr = 2, RULE_comp = 3, RULE_oper = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "expr", "comp", "oper"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "':DECLARACAO'", "':ALGORITMO'", "'ATRIBUIR'", "'A'", "'int'", 
			"'string'", "'bool'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DECLARACAO", "ALGORITMO", "ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", 
			"TIPO_BOOL", "TIPO_FLOAT", "ID", "COMMENT", "WS", "NUM", "STRING", "BOOL", 
			"FLOAT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "par.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode DECLARACAO() { return getToken(parParser.DECLARACAO, 0); }
		public TerminalNode ALGORITMO() { return getToken(parParser.ALGORITMO, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(DECLARACAO);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_INT) | (1L << TIPO_STRING) | (1L << TIPO_BOOL) | (1L << TIPO_FLOAT))) != 0)) {
				{
				{
				setState(11);
				decl();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(ALGORITMO);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATRIBUIR) {
				{
				{
				setState(18);
				expr();
				}
				}
				setState(23);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode TIPO_INT() { return getToken(parParser.TIPO_INT, 0); }
		public TerminalNode ID() { return getToken(parParser.ID, 0); }
		public TerminalNode TIPO_FLOAT() { return getToken(parParser.TIPO_FLOAT, 0); }
		public TerminalNode TIPO_STRING() { return getToken(parParser.TIPO_STRING, 0); }
		public TerminalNode TIPO_BOOL() { return getToken(parParser.TIPO_BOOL, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(TIPO_INT);
				setState(25);
				match(ID);
				}
				break;
			case TIPO_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(TIPO_FLOAT);
				setState(27);
				match(ID);
				}
				break;
			case TIPO_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(TIPO_STRING);
				setState(29);
				match(ID);
				}
				break;
			case TIPO_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(TIPO_BOOL);
				setState(31);
				match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ATRIBUIR() { return getToken(parParser.ATRIBUIR, 0); }
		public TerminalNode NUM() { return getToken(parParser.NUM, 0); }
		public TerminalNode A() { return getToken(parParser.A, 0); }
		public TerminalNode ID() { return getToken(parParser.ID, 0); }
		public TerminalNode STRING() { return getToken(parParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(parParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(parParser.FLOAT, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(ATRIBUIR);
				setState(35);
				match(NUM);
				setState(36);
				match(A);
				setState(37);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(ATRIBUIR);
				setState(39);
				match(STRING);
				setState(40);
				match(A);
				setState(41);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(ATRIBUIR);
				setState(43);
				match(BOOL);
				setState(44);
				match(A);
				setState(45);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(ATRIBUIR);
				setState(47);
				match(FLOAT);
				setState(48);
				match(A);
				setState(49);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(ATRIBUIR);
				setState(51);
				comp();
				setState(52);
				match(A);
				setState(53);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(ATRIBUIR);
				setState(56);
				oper(0);
				setState(57);
				match(A);
				setState(58);
				match(ID);
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

	public static class CompContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(parParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parParser.ID, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comp);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__0);
				setState(64);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__1);
				setState(67);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(ID);
				setState(69);
				match(T__2);
				setState(70);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__3);
				setState(73);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__4);
				setState(76);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(ID);
				setState(78);
				match(T__5);
				setState(79);
				match(ID);
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

	public static class OperContext extends ParserRuleContext {
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
	 
		public OperContext() { }
		public void copyFrom(OperContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionContext extends OperContext {
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public AdditionContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends OperContext {
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public MultiplicationContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends OperContext {
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public SubtractionContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends OperContext {
		public TerminalNode NUM() { return getToken(parParser.NUM, 0); }
		public NumberContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends OperContext {
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public ModuloContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends OperContext {
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public DivisionContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDContext extends OperContext {
		public TerminalNode ID() { return getToken(parParser.ID, 0); }
		public IDContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		return oper(0);
	}

	private OperContext oper(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperContext _localctx = new OperContext(_ctx, _parentState);
		OperContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_oper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(ID);
				}
				break;
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new OperContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(87);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(88);
						match(T__6);
						setState(89);
						oper(8);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new OperContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(90);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(91);
						match(T__7);
						setState(92);
						oper(7);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new OperContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						match(T__8);
						setState(95);
						oper(6);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new OperContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						match(T__9);
						setState(98);
						oper(5);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new OperContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(99);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(100);
						match(T__10);
						setState(101);
						oper(4);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return oper_sempred((OperContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oper_sempred(OperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001al\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0004\u0000"+
		"\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000{\u0000\n\u0001\u0000"+
		"\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000"+
		"\u0006P\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n\u000e\u0005"+
		"\f\u0000\u0000\u000b\r\u0003\u0002\u0001\u0000\f\u000b\u0001\u0000\u0000"+
		"\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011\u0001\u0000\u0000\u0000"+
		"\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0015\u0005\r\u0000\u0000\u0012"+
		"\u0014\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0010\u0000\u0000\u0019"+
		"!\u0005\u0014\u0000\u0000\u001a\u001b\u0005\u0013\u0000\u0000\u001b!\u0005"+
		"\u0014\u0000\u0000\u001c\u001d\u0005\u0011\u0000\u0000\u001d!\u0005\u0014"+
		"\u0000\u0000\u001e\u001f\u0005\u0012\u0000\u0000\u001f!\u0005\u0014\u0000"+
		"\u0000 \u0018\u0001\u0000\u0000\u0000 \u001a\u0001\u0000\u0000\u0000 "+
		"\u001c\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\u0003\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u000e\u0000\u0000#$\u0005\u0017\u0000\u0000"+
		"$%\u0005\u000f\u0000\u0000%=\u0005\u0014\u0000\u0000&\'\u0005\u000e\u0000"+
		"\u0000\'(\u0005\u0018\u0000\u0000()\u0005\u000f\u0000\u0000)=\u0005\u0014"+
		"\u0000\u0000*+\u0005\u000e\u0000\u0000+,\u0005\u0019\u0000\u0000,-\u0005"+
		"\u000f\u0000\u0000-=\u0005\u0014\u0000\u0000./\u0005\u000e\u0000\u0000"+
		"/0\u0005\u001a\u0000\u000001\u0005\u000f\u0000\u00001=\u0005\u0014\u0000"+
		"\u000023\u0005\u000e\u0000\u000034\u0003\u0006\u0003\u000045\u0005\u000f"+
		"\u0000\u000056\u0005\u0014\u0000\u00006=\u0001\u0000\u0000\u000078\u0005"+
		"\u000e\u0000\u000089\u0003\b\u0004\u00009:\u0005\u000f\u0000\u0000:;\u0005"+
		"\u0014\u0000\u0000;=\u0001\u0000\u0000\u0000<\"\u0001\u0000\u0000\u0000"+
		"<&\u0001\u0000\u0000\u0000<*\u0001\u0000\u0000\u0000<.\u0001\u0000\u0000"+
		"\u0000<2\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000=\u0005\u0001"+
		"\u0000\u0000\u0000>?\u0005\u0014\u0000\u0000?@\u0005\u0001\u0000\u0000"+
		"@Q\u0005\u0014\u0000\u0000AB\u0005\u0014\u0000\u0000BC\u0005\u0002\u0000"+
		"\u0000CQ\u0005\u0014\u0000\u0000DE\u0005\u0014\u0000\u0000EF\u0005\u0003"+
		"\u0000\u0000FQ\u0005\u0014\u0000\u0000GH\u0005\u0014\u0000\u0000HI\u0005"+
		"\u0004\u0000\u0000IQ\u0005\u0014\u0000\u0000JK\u0005\u0014\u0000\u0000"+
		"KL\u0005\u0005\u0000\u0000LQ\u0005\u0014\u0000\u0000MN\u0005\u0014\u0000"+
		"\u0000NO\u0005\u0006\u0000\u0000OQ\u0005\u0014\u0000\u0000P>\u0001\u0000"+
		"\u0000\u0000PA\u0001\u0000\u0000\u0000PD\u0001\u0000\u0000\u0000PG\u0001"+
		"\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"Q\u0007\u0001\u0000\u0000\u0000RS\u0006\u0004\uffff\uffff\u0000SV\u0005"+
		"\u0014\u0000\u0000TV\u0005\u0017\u0000\u0000UR\u0001\u0000\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000Vh\u0001\u0000\u0000\u0000WX\n\u0007\u0000\u0000"+
		"XY\u0005\u0007\u0000\u0000Yg\u0003\b\u0004\bZ[\n\u0006\u0000\u0000[\\"+
		"\u0005\b\u0000\u0000\\g\u0003\b\u0004\u0007]^\n\u0005\u0000\u0000^_\u0005"+
		"\t\u0000\u0000_g\u0003\b\u0004\u0006`a\n\u0004\u0000\u0000ab\u0005\n\u0000"+
		"\u0000bg\u0003\b\u0004\u0005cd\n\u0003\u0000\u0000de\u0005\u000b\u0000"+
		"\u0000eg\u0003\b\u0004\u0004fW\u0001\u0000\u0000\u0000fZ\u0001\u0000\u0000"+
		"\u0000f]\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000i\t\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"\b\u000e\u0015 <PUfh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}