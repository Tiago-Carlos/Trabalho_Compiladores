// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\pars.g4 by ANTLR 4.9.2

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
public class parsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ATRIBUIR=14, A=15, TIPO_INT=16, 
		TIPO_STRING=17, TIPO_BOOL=18, TIPO_FLOAT=19, ID=20, COMMENT=21, WS=22, 
		NUM=23, STRING=24, BOOL=25, FLOAT=26;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_atri = 2, RULE_comp = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "atri", "comp", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':DECLARACAO'", "':ALGORITMO'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'", "'ATRIBUIR'", "'A'", 
			"'int'", "'string'", "'bool'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", "TIPO_BOOL", 
			"TIPO_FLOAT", "ID", "COMMENT", "WS", "NUM", "STRING", "BOOL", "FLOAT"
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
	public String getGrammarFileName() { return "pars.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<AtriContext> atri() {
			return getRuleContexts(AtriContext.class);
		}
		public AtriContext atri(int i) {
			return getRuleContext(AtriContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
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
			match(T__1);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATRIBUIR) {
				{
				{
				setState(18);
				atri();
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
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoStringContext extends DeclContext {
		public TerminalNode TIPO_STRING() { return getToken(parsParser.TIPO_STRING, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public DeclaracaoStringContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterDeclaracaoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitDeclaracaoString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitDeclaracaoString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracaoBoolContext extends DeclContext {
		public TerminalNode TIPO_BOOL() { return getToken(parsParser.TIPO_BOOL, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public DeclaracaoBoolContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterDeclaracaoBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitDeclaracaoBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitDeclaracaoBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracaoFloatContext extends DeclContext {
		public TerminalNode TIPO_FLOAT() { return getToken(parsParser.TIPO_FLOAT, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public DeclaracaoFloatContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterDeclaracaoFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitDeclaracaoFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitDeclaracaoFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracaoIntContext extends DeclContext {
		public TerminalNode TIPO_INT() { return getToken(parsParser.TIPO_INT, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public DeclaracaoIntContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterDeclaracaoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitDeclaracaoInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitDeclaracaoInt(this);
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
				_localctx = new DeclaracaoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(TIPO_INT);
				setState(25);
				match(ID);
				}
				break;
			case TIPO_FLOAT:
				_localctx = new DeclaracaoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(TIPO_FLOAT);
				setState(27);
				match(ID);
				}
				break;
			case TIPO_STRING:
				_localctx = new DeclaracaoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(TIPO_STRING);
				setState(29);
				match(ID);
				}
				break;
			case TIPO_BOOL:
				_localctx = new DeclaracaoBoolContext(_localctx);
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

	public static class AtriContext extends ParserRuleContext {
		public AtriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atri; }
	 
		public AtriContext() { }
		public void copyFrom(AtriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuirBoolContext extends AtriContext {
		public TerminalNode ATRIBUIR() { return getToken(parsParser.ATRIBUIR, 0); }
		public TerminalNode BOOL() { return getToken(parsParser.BOOL, 0); }
		public TerminalNode A() { return getToken(parsParser.A, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public AtribuirBoolContext(AtriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAtribuirBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAtribuirBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAtribuirBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirNumContext extends AtriContext {
		public TerminalNode ATRIBUIR() { return getToken(parsParser.ATRIBUIR, 0); }
		public TerminalNode NUM() { return getToken(parsParser.NUM, 0); }
		public TerminalNode A() { return getToken(parsParser.A, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public AtribuirNumContext(AtriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAtribuirNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAtribuirNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAtribuirNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirComparationContext extends AtriContext {
		public TerminalNode ATRIBUIR() { return getToken(parsParser.ATRIBUIR, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode A() { return getToken(parsParser.A, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public AtribuirComparationContext(AtriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAtribuirComparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAtribuirComparation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAtribuirComparation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirFloatContext extends AtriContext {
		public TerminalNode ATRIBUIR() { return getToken(parsParser.ATRIBUIR, 0); }
		public TerminalNode FLOAT() { return getToken(parsParser.FLOAT, 0); }
		public TerminalNode A() { return getToken(parsParser.A, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public AtribuirFloatContext(AtriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAtribuirFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAtribuirFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAtribuirFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirStringContext extends AtriContext {
		public TerminalNode ATRIBUIR() { return getToken(parsParser.ATRIBUIR, 0); }
		public TerminalNode STRING() { return getToken(parsParser.STRING, 0); }
		public TerminalNode A() { return getToken(parsParser.A, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public AtribuirStringContext(AtriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAtribuirString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAtribuirString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAtribuirString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribuirOperationContext extends AtriContext {
		public TerminalNode ATRIBUIR() { return getToken(parsParser.ATRIBUIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode A() { return getToken(parsParser.A, 0); }
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public AtribuirOperationContext(AtriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAtribuirOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAtribuirOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAtribuirOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtriContext atri() throws RecognitionException {
		AtriContext _localctx = new AtriContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atri);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AtribuirNumContext(_localctx);
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
				_localctx = new AtribuirStringContext(_localctx);
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
				_localctx = new AtribuirBoolContext(_localctx);
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
				_localctx = new AtribuirFloatContext(_localctx);
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
				_localctx = new AtribuirComparationContext(_localctx);
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
				_localctx = new AtribuirOperationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(ATRIBUIR);
				setState(56);
				expr(0);
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
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	 
		public CompContext() { }
		public void copyFrom(CompContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MenorIgualContext extends CompContext {
		public List<TerminalNode> ID() { return getTokens(parsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parsParser.ID, i);
		}
		public MenorIgualContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualContext extends CompContext {
		public List<TerminalNode> ID() { return getTokens(parsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parsParser.ID, i);
		}
		public IgualContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorIgualContext extends CompContext {
		public List<TerminalNode> ID() { return getTokens(parsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parsParser.ID, i);
		}
		public MaiorIgualContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterMaiorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitMaiorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitMaiorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorQueContext extends CompContext {
		public List<TerminalNode> ID() { return getTokens(parsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parsParser.ID, i);
		}
		public MaiorQueContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterMaiorQue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitMaiorQue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitMaiorQue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteContext extends CompContext {
		public List<TerminalNode> ID() { return getTokens(parsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parsParser.ID, i);
		}
		public DiferenteContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterDiferente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitDiferente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitDiferente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorQueContext extends CompContext {
		public List<TerminalNode> ID() { return getTokens(parsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(parsParser.ID, i);
		}
		public MenorQueContext(CompContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterMenorQue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitMenorQue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitMenorQue(this);
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
				_localctx = new MaiorQueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__2);
				setState(64);
				match(ID);
				}
				break;
			case 2:
				_localctx = new MenorQueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__3);
				setState(67);
				match(ID);
				}
				break;
			case 3:
				_localctx = new MaiorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(ID);
				setState(69);
				match(T__4);
				setState(70);
				match(ID);
				}
				break;
			case 4:
				_localctx = new MenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(ID);
				setState(72);
				match(T__5);
				setState(73);
				match(ID);
				}
				break;
			case 5:
				_localctx = new IgualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__6);
				setState(76);
				match(ID);
				}
				break;
			case 6:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(ID);
				setState(78);
				match(T__7);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUM() { return getToken(parsParser.NUM, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModuloContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(parsParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parsListener ) ((parsListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parsVisitor ) return ((parsVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
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
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(88);
						match(T__8);
						setState(89);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(91);
						match(T__9);
						setState(92);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						match(T__10);
						setState(95);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(97);
						match(T__11);
						setState(98);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(100);
						match(T__12);
						setState(101);
						expr(4);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\7\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\6\3\6\3\6\5"+
		"\6X\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6i\n\6\f\6\16\6l\13\6\3\6\2\3\n\7\2\4\6\b\n\2\2\2}\2\f\3\2\2\2\4\"\3"+
		"\2\2\2\6>\3\2\2\2\bR\3\2\2\2\nW\3\2\2\2\f\20\7\3\2\2\r\17\5\4\3\2\16\r"+
		"\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20"+
		"\3\2\2\2\23\27\7\4\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\33\7\22\2\2\33#\7"+
		"\26\2\2\34\35\7\25\2\2\35#\7\26\2\2\36\37\7\23\2\2\37#\7\26\2\2 !\7\24"+
		"\2\2!#\7\26\2\2\"\32\3\2\2\2\"\34\3\2\2\2\"\36\3\2\2\2\" \3\2\2\2#\5\3"+
		"\2\2\2$%\7\20\2\2%&\7\31\2\2&\'\7\21\2\2\'?\7\26\2\2()\7\20\2\2)*\7\32"+
		"\2\2*+\7\21\2\2+?\7\26\2\2,-\7\20\2\2-.\7\33\2\2./\7\21\2\2/?\7\26\2\2"+
		"\60\61\7\20\2\2\61\62\7\34\2\2\62\63\7\21\2\2\63?\7\26\2\2\64\65\7\20"+
		"\2\2\65\66\5\b\5\2\66\67\7\21\2\2\678\7\26\2\28?\3\2\2\29:\7\20\2\2:;"+
		"\5\n\6\2;<\7\21\2\2<=\7\26\2\2=?\3\2\2\2>$\3\2\2\2>(\3\2\2\2>,\3\2\2\2"+
		">\60\3\2\2\2>\64\3\2\2\2>9\3\2\2\2?\7\3\2\2\2@A\7\26\2\2AB\7\5\2\2BS\7"+
		"\26\2\2CD\7\26\2\2DE\7\6\2\2ES\7\26\2\2FG\7\26\2\2GH\7\7\2\2HS\7\26\2"+
		"\2IJ\7\26\2\2JK\7\b\2\2KS\7\26\2\2LM\7\26\2\2MN\7\t\2\2NS\7\26\2\2OP\7"+
		"\26\2\2PQ\7\n\2\2QS\7\26\2\2R@\3\2\2\2RC\3\2\2\2RF\3\2\2\2RI\3\2\2\2R"+
		"L\3\2\2\2RO\3\2\2\2S\t\3\2\2\2TU\b\6\1\2UX\7\26\2\2VX\7\31\2\2WT\3\2\2"+
		"\2WV\3\2\2\2Xj\3\2\2\2YZ\f\t\2\2Z[\7\13\2\2[i\5\n\6\n\\]\f\b\2\2]^\7\f"+
		"\2\2^i\5\n\6\t_`\f\7\2\2`a\7\r\2\2ai\5\n\6\bbc\f\6\2\2cd\7\16\2\2di\5"+
		"\n\6\7ef\f\5\2\2fg\7\17\2\2gi\5\n\6\6hY\3\2\2\2h\\\3\2\2\2h_\3\2\2\2h"+
		"b\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lj\3\2\2"+
		"\2\n\20\27\">RWhj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}