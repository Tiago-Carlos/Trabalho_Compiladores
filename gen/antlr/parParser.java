// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores/src/antlr\par.g4 by ANTLR 4.9.2
package antlr;
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		public TerminalNode ID() { return getToken(parParser.ID, 0); }
		public TerminalNode NUM() { return getToken(parParser.NUM, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parListener ) ((parListener)listener).exitOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parVisitor ) return ((parVisitor<? extends T>)visitor).visitOper(this);
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
				setState(83);
				match(ID);
				}
				break;
			case NUM:
				{
				setState(84);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(87);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(88);
						match(T__6);
						setState(89);
						oper(9);
						}
						break;
					case 2:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(90);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(91);
						match(T__7);
						setState(92);
						oper(8);
						}
						break;
					case 3:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(93);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(94);
						match(T__8);
						setState(95);
						oper(7);
						}
						break;
					case 4:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						match(T__9);
						setState(98);
						oper(6);
						}
						break;
					case 5:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(T__10);
						setState(101);
						oper(5);
						}
						break;
					case 6:
						{
						_localctx = new OperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_oper);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(T__5);
						setState(104);
						oper(4);
						}
						break;
					}
					} 
				}
				setState(109);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\7\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6\3\6\5"+
		"\6X\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2\u0081\2"+
		"\f\3\2\2\2\4\"\3\2\2\2\6>\3\2\2\2\bR\3\2\2\2\nW\3\2\2\2\f\20\7\16\2\2"+
		"\r\17\5\4\3\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21"+
		"\23\3\2\2\2\22\20\3\2\2\2\23\27\7\17\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26"+
		"\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32"+
		"\33\7\22\2\2\33#\7\26\2\2\34\35\7\25\2\2\35#\7\26\2\2\36\37\7\23\2\2\37"+
		"#\7\26\2\2 !\7\24\2\2!#\7\26\2\2\"\32\3\2\2\2\"\34\3\2\2\2\"\36\3\2\2"+
		"\2\" \3\2\2\2#\5\3\2\2\2$%\7\20\2\2%&\7\31\2\2&\'\7\21\2\2\'?\7\26\2\2"+
		"()\7\20\2\2)*\7\32\2\2*+\7\21\2\2+?\7\26\2\2,-\7\20\2\2-.\7\33\2\2./\7"+
		"\21\2\2/?\7\26\2\2\60\61\7\20\2\2\61\62\7\34\2\2\62\63\7\21\2\2\63?\7"+
		"\26\2\2\64\65\7\20\2\2\65\66\5\b\5\2\66\67\7\21\2\2\678\7\26\2\28?\3\2"+
		"\2\29:\7\20\2\2:;\5\n\6\2;<\7\21\2\2<=\7\26\2\2=?\3\2\2\2>$\3\2\2\2>("+
		"\3\2\2\2>,\3\2\2\2>\60\3\2\2\2>\64\3\2\2\2>9\3\2\2\2?\7\3\2\2\2@A\7\26"+
		"\2\2AB\7\3\2\2BS\7\26\2\2CD\7\26\2\2DE\7\4\2\2ES\7\26\2\2FG\7\26\2\2G"+
		"H\7\5\2\2HS\7\26\2\2IJ\7\26\2\2JK\7\6\2\2KS\7\26\2\2LM\7\26\2\2MN\7\7"+
		"\2\2NS\7\26\2\2OP\7\26\2\2PQ\7\b\2\2QS\7\26\2\2R@\3\2\2\2RC\3\2\2\2RF"+
		"\3\2\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2\2\2S\t\3\2\2\2TU\b\6\1\2UX\7\26\2\2"+
		"VX\7\31\2\2WT\3\2\2\2WV\3\2\2\2Xm\3\2\2\2YZ\f\n\2\2Z[\7\t\2\2[l\5\n\6"+
		"\13\\]\f\t\2\2]^\7\n\2\2^l\5\n\6\n_`\f\b\2\2`a\7\13\2\2al\5\n\6\tbc\f"+
		"\7\2\2cd\7\f\2\2dl\5\n\6\bef\f\6\2\2fg\7\r\2\2gl\5\n\6\7hi\f\5\2\2ij\7"+
		"\b\2\2jl\5\n\6\6kY\3\2\2\2k\\\3\2\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh"+
		"\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\13\3\2\2\2om\3\2\2\2\n\20\27\""+
		">RWkm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}