// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\lex.g4 by ANTLR 4.9.2

package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATRIBUIR=1, A=2, TIPO_INT=3, TIPO_STRING=4, TIPO_BOOL=5, TIPO_FLOAT=6, 
		ID=7, COMMENT=8, WS=9, NUM=10, STRING=11, BOOL=12, FLOAT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", "TIPO_BOOL", "TIPO_FLOAT", 
			"ID", "COMMENT", "WS", "NUM", "STRING", "BOOL", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ATRIBUIR'", "'A'", "'int'", "'string'", "'bool'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", "TIPO_BOOL", "TIPO_FLOAT", 
			"ID", "COMMENT", "WS", "NUM", "STRING", "BOOL", "FLOAT"
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


	public lex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7\bA\n\b\f\b\16\bD\13\b\3\t\3\t\3\t"+
		"\3\t\7\tJ\n\t\f\t\16\tM\13\t\3\t\3\t\3\n\6\nR\n\n\r\n\16\nS\3\n\3\n\3"+
		"\13\3\13\5\13Z\n\13\3\13\3\13\7\13^\n\13\f\13\16\13a\13\13\5\13c\n\13"+
		"\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\rw\n\r\3\16\7\16z\n\16\f\16\16\16}\13\16\3\16\3\16\7\16\u0081"+
		"\n\16\f\16\16\16\u0084\13\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\t\3\2c|\6\2\62;C\\aac|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\4\2$$^^\2\u008e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\3\35\3\2\2\2\5&\3\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13\63\3\2\2\2\r8"+
		"\3\2\2\2\17>\3\2\2\2\21E\3\2\2\2\23Q\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31"+
		"v\3\2\2\2\33{\3\2\2\2\35\36\7C\2\2\36\37\7V\2\2\37 \7T\2\2 !\7K\2\2!\""+
		"\7D\2\2\"#\7W\2\2#$\7K\2\2$%\7T\2\2%\4\3\2\2\2&\'\7C\2\2\'\6\3\2\2\2("+
		")\7k\2\2)*\7p\2\2*+\7v\2\2+\b\3\2\2\2,-\7u\2\2-.\7v\2\2./\7t\2\2/\60\7"+
		"k\2\2\60\61\7p\2\2\61\62\7i\2\2\62\n\3\2\2\2\63\64\7d\2\2\64\65\7q\2\2"+
		"\65\66\7q\2\2\66\67\7n\2\2\67\f\3\2\2\289\7h\2\29:\7n\2\2:;\7q\2\2;<\7"+
		"c\2\2<=\7v\2\2=\16\3\2\2\2>B\t\2\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2C\20\3\2\2\2DB\3\2\2\2EF\7\61\2\2FG\7\61\2\2GK\3\2\2\2"+
		"HJ\n\4\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2"+
		"NO\b\t\2\2O\22\3\2\2\2PR\t\5\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2TU\3\2\2\2UV\b\n\2\2V\24\3\2\2\2Wc\7\62\2\2XZ\7/\2\2YX\3\2\2\2YZ\3\2"+
		"\2\2Z[\3\2\2\2[_\t\6\2\2\\^\t\7\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2bW\3\2\2\2bY\3\2\2\2c\26\3\2\2\2dh\7$\2\2eg"+
		"\n\b\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2k"+
		"l\7$\2\2l\30\3\2\2\2mn\7v\2\2no\7t\2\2op\7w\2\2pw\7g\2\2qr\7h\2\2rs\7"+
		"c\2\2st\7n\2\2tu\7u\2\2uw\7g\2\2vm\3\2\2\2vq\3\2\2\2w\32\3\2\2\2xz\t\7"+
		"\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0082"+
		"\7.\2\2\177\u0081\t\7\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\34\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\r\2BKSY_bhv{\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}