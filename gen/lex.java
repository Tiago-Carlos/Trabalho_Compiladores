// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\lex.g4 by ANTLR 4.9.2
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
		DECLARACAO=1, ALGORITMO=2, ATRIBUIR=3, A=4, TIPO_INT=5, TIPO_STRING=6, 
		TIPO_BOOL=7, TIPO_FLOAT=8, ID=9, COMMENT=10, WS=11, NUM=12, STRING=13, 
		BOOL=14, FLOAT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DECLARACAO", "ALGORITMO", "ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", 
			"TIPO_BOOL", "TIPO_FLOAT", "ID", "COMMENT", "WS", "NUM", "STRING", "BOOL", 
			"FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':DECLARACAO'", "':ALGORITMO'", "'ATRIBUIR'", "'A'", "'int'", 
			"'string'", "'bool'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARACAO", "ALGORITMO", "ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\13\3\13\3\13\3\13\7\13e\n\13\f\13\16"+
		"\13h\13\13\3\13\3\13\3\f\6\fm\n\f\r\f\16\fn\3\f\3\f\3\r\3\r\5\ru\n\r\3"+
		"\r\3\r\7\ry\n\r\f\r\16\r|\13\r\5\r~\n\r\3\16\3\16\7\16\u0082\n\16\f\16"+
		"\16\16\u0085\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0092\n\17\3\20\7\20\u0095\n\20\f\20\16\20\u0098\13\20\3\20\3"+
		"\20\7\20\u009c\n\20\f\20\16\20\u009f\13\20\2\2\21\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\t\3\2c|\6\2"+
		"\62;C\\aac|\4\2\f\f\17\17\4\2\13\f\"\"\3\2\63;\3\2\62;\4\2$$^^\2\u00a9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5-\3\2"+
		"\2\2\78\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rG\3\2\2\2\17N\3\2\2\2\21S\3\2"+
		"\2\2\23Y\3\2\2\2\25`\3\2\2\2\27l\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35"+
		"\u0091\3\2\2\2\37\u0096\3\2\2\2!\"\7<\2\2\"#\7F\2\2#$\7G\2\2$%\7E\2\2"+
		"%&\7N\2\2&\'\7C\2\2\'(\7T\2\2()\7C\2\2)*\7E\2\2*+\7C\2\2+,\7Q\2\2,\4\3"+
		"\2\2\2-.\7<\2\2./\7C\2\2/\60\7N\2\2\60\61\7I\2\2\61\62\7Q\2\2\62\63\7"+
		"T\2\2\63\64\7K\2\2\64\65\7V\2\2\65\66\7O\2\2\66\67\7Q\2\2\67\6\3\2\2\2"+
		"89\7C\2\29:\7V\2\2:;\7T\2\2;<\7K\2\2<=\7D\2\2=>\7W\2\2>?\7K\2\2?@\7T\2"+
		"\2@\b\3\2\2\2AB\7C\2\2B\n\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F\f\3\2\2"+
		"\2GH\7u\2\2HI\7v\2\2IJ\7t\2\2JK\7k\2\2KL\7p\2\2LM\7i\2\2M\16\3\2\2\2N"+
		"O\7d\2\2OP\7q\2\2PQ\7q\2\2QR\7n\2\2R\20\3\2\2\2ST\7h\2\2TU\7n\2\2UV\7"+
		"q\2\2VW\7c\2\2WX\7v\2\2X\22\3\2\2\2Y]\t\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\_"+
		"\3\2\2\2][\3\2\2\2]^\3\2\2\2^\24\3\2\2\2_]\3\2\2\2`a\7\61\2\2ab\7\61\2"+
		"\2bf\3\2\2\2ce\n\4\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\b\13\2\2j\26\3\2\2\2km\t\5\2\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2op\3\2\2\2pq\b\f\2\2q\30\3\2\2\2r~\7\62\2\2su\7/\2\2t"+
		"s\3\2\2\2tu\3\2\2\2uv\3\2\2\2vz\t\6\2\2wy\t\7\2\2xw\3\2\2\2y|\3\2\2\2"+
		"zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}r\3\2\2\2}t\3\2\2\2~\32\3\2\2"+
		"\2\177\u0083\7$\2\2\u0080\u0082\n\b\2\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7$\2\2\u0087\34\3\2\2\2\u0088\u0089\7v\2\2"+
		"\u0089\u008a\7t\2\2\u008a\u008b\7w\2\2\u008b\u0092\7g\2\2\u008c\u008d"+
		"\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0092\7g\2\2\u0091\u0088\3\2\2\2\u0091\u008c\3\2\2\2\u0092\36\3\2\2\2"+
		"\u0093\u0095\t\7\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009d\7.\2\2\u009a\u009c\t\7\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e \3\2\2\2\u009f\u009d"+
		"\3\2\2\2\r\2]fntz}\u0083\u0091\u0096\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}