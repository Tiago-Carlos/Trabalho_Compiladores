// Generated from /home/tiago/IdeaProjects/Trabalho_Compiladores/lex.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u000f\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bZ\b\b\n\b\f\b]\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\tc\b\t\n\t\f\tf\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0004\nk\b\n\u000b\n\f\nl\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000bs\b\u000b\u0001\u000b\u0001\u000b\u0005\u000bw\b\u000b\n\u000b\f"+
		"\u000bz\t\u000b\u0003\u000b|\b\u000b\u0001\f\u0001\f\u0005\f\u0080\b\f"+
		"\n\f\f\f\u0083\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0090\b\r\u0001\u000e\u0005"+
		"\u000e\u0093\b\u000e\n\u000e\f\u000e\u0096\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u009a\b\u000e\n\u000e\f\u000e\u009d\t\u000e\u0000\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0007\u0001\u0000az\u0004\u000009AZ__az\u0002"+
		"\u0000\n\n\r\r\u0002\u0000\t\n  \u0001\u000019\u0001\u000009\u0002\u0000"+
		"\"\"\\\\\u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u0007?"+
		"\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000"+
		"\u0011W\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000\u0015j"+
		"\u0001\u0000\u0000\u0000\u0017{\u0001\u0000\u0000\u0000\u0019}\u0001\u0000"+
		"\u0000\u0000\u001b\u008f\u0001\u0000\u0000\u0000\u001d\u0094\u0001\u0000"+
		"\u0000\u0000\u001f \u0005:\u0000\u0000 !\u0005D\u0000\u0000!\"\u0005E"+
		"\u0000\u0000\"#\u0005C\u0000\u0000#$\u0005L\u0000\u0000$%\u0005A\u0000"+
		"\u0000%&\u0005R\u0000\u0000&\'\u0005A\u0000\u0000\'(\u0005C\u0000\u0000"+
		"()\u0005A\u0000\u0000)*\u0005O\u0000\u0000*\u0002\u0001\u0000\u0000\u0000"+
		"+,\u0005:\u0000\u0000,-\u0005A\u0000\u0000-.\u0005L\u0000\u0000./\u0005"+
		"G\u0000\u0000/0\u0005O\u0000\u000001\u0005R\u0000\u000012\u0005I\u0000"+
		"\u000023\u0005T\u0000\u000034\u0005M\u0000\u000045\u0005O\u0000\u0000"+
		"5\u0004\u0001\u0000\u0000\u000067\u0005A\u0000\u000078\u0005T\u0000\u0000"+
		"89\u0005R\u0000\u00009:\u0005I\u0000\u0000:;\u0005B\u0000\u0000;<\u0005"+
		"U\u0000\u0000<=\u0005I\u0000\u0000=>\u0005R\u0000\u0000>\u0006\u0001\u0000"+
		"\u0000\u0000?@\u0005A\u0000\u0000@\b\u0001\u0000\u0000\u0000AB\u0005i"+
		"\u0000\u0000BC\u0005n\u0000\u0000CD\u0005t\u0000\u0000D\n\u0001\u0000"+
		"\u0000\u0000EF\u0005s\u0000\u0000FG\u0005t\u0000\u0000GH\u0005r\u0000"+
		"\u0000HI\u0005i\u0000\u0000IJ\u0005n\u0000\u0000JK\u0005g\u0000\u0000"+
		"K\f\u0001\u0000\u0000\u0000LM\u0005b\u0000\u0000MN\u0005o\u0000\u0000"+
		"NO\u0005o\u0000\u0000OP\u0005l\u0000\u0000P\u000e\u0001\u0000\u0000\u0000"+
		"QR\u0005f\u0000\u0000RS\u0005l\u0000\u0000ST\u0005o\u0000\u0000TU\u0005"+
		"a\u0000\u0000UV\u0005t\u0000\u0000V\u0010\u0001\u0000\u0000\u0000W[\u0007"+
		"\u0000\u0000\u0000XZ\u0007\u0001\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\\u0012\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005"+
		"/\u0000\u0000_`\u0005/\u0000\u0000`d\u0001\u0000\u0000\u0000ac\b\u0002"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000gh\u0006\t\u0000\u0000h\u0014\u0001\u0000\u0000"+
		"\u0000ik\u0007\u0003\u0000\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000no\u0006\n\u0000\u0000o\u0016\u0001\u0000\u0000\u0000"+
		"p|\u00050\u0000\u0000qs\u0005-\u0000\u0000rq\u0001\u0000\u0000\u0000r"+
		"s\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tx\u0007\u0004\u0000"+
		"\u0000uw\u0007\u0005\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{p\u0001\u0000\u0000\u0000"+
		"{r\u0001\u0000\u0000\u0000|\u0018\u0001\u0000\u0000\u0000}\u0081\u0005"+
		"\"\u0000\u0000~\u0080\b\u0006\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085"+
		"\u001a\u0001\u0000\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087\u0088"+
		"\u0005r\u0000\u0000\u0088\u0089\u0005u\u0000\u0000\u0089\u0090\u0005e"+
		"\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b\u008c\u0005a\u0000\u0000"+
		"\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e\u0090"+
		"\u0005e\u0000\u0000\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u008a\u0001"+
		"\u0000\u0000\u0000\u0090\u001c\u0001\u0000\u0000\u0000\u0091\u0093\u0007"+
		"\u0005\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u009b\u0005,\u0000\u0000\u0098\u009a\u0007\u0005"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u001e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u000b\u0000[dlrx{\u0081\u008f\u0094\u009b\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}