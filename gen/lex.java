// Generated from /home/tiago/Desktop/Trabalho_Compiladores/lex.g4 by ANTLR 4.10.1
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
		ATRIBUIR=1, A=2, TIPO_INT=3, TIPO_STRING=4, TIPO_BOOL=5, TIPO_FLOAT=6, 
		BOOL=7, ID=8, COMMENT=9, WS=10, NUM=11, STRING=12, FLOAT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATRIBUIR", "A", "TIPO_INT", "TIPO_STRING", "TIPO_BOOL", "TIPO_FLOAT", 
			"BOOL", "ID", "COMMENT", "WS", "NUM", "STRING", "FLOAT"
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
			"BOOL", "ID", "COMMENT", "WS", "NUM", "STRING", "FLOAT"
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
		"\u0004\u0000\r\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006F\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007J\b\u0007\n\u0007\f\u0007M\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bS\b\b\n\b\f\bV\t\b\u0001\b\u0001\b\u0001\t\u0004\t["+
		"\b\t\u000b\t\f\t\\\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nc\b\n\u0001"+
		"\n\u0001\n\u0005\ng\b\n\n\n\f\nj\t\n\u0003\nl\b\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000bp\b\u000b\n\u000b\f\u000bs\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0005\fx\b\f\n\f\f\f{\t\f\u0001\f\u0001\f\u0005\f\u007f\b\f\n"+
		"\f\f\f\u0082\t\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u0001\u0000\u0007\u0001\u0000az\u0004\u000009AZ__az\u0002"+
		"\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0001\u000019\u0001\u000009\u0002"+
		"\u0000\"\"\\\\\u008c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000"+
		"\u0000\u0003$\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007"+
		"*\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b6\u0001\u0000"+
		"\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000"+
		"\u0011N\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015k"+
		"\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019y\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005A\u0000\u0000\u001c\u001d\u0005T\u0000\u0000"+
		"\u001d\u001e\u0005R\u0000\u0000\u001e\u001f\u0005I\u0000\u0000\u001f "+
		"\u0005B\u0000\u0000 !\u0005U\u0000\u0000!\"\u0005I\u0000\u0000\"#\u0005"+
		"R\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005A\u0000\u0000%\u0004"+
		"\u0001\u0000\u0000\u0000&\'\u0005i\u0000\u0000\'(\u0005n\u0000\u0000("+
		")\u0005t\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005s\u0000\u0000"+
		"+,\u0005t\u0000\u0000,-\u0005r\u0000\u0000-.\u0005i\u0000\u0000./\u0005"+
		"n\u0000\u0000/0\u0005g\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005"+
		"b\u0000\u000023\u0005o\u0000\u000034\u0005o\u0000\u000045\u0005l\u0000"+
		"\u00005\n\u0001\u0000\u0000\u000067\u0005f\u0000\u000078\u0005l\u0000"+
		"\u000089\u0005o\u0000\u00009:\u0005a\u0000\u0000:;\u0005t\u0000\u0000"+
		";\f\u0001\u0000\u0000\u0000<=\u0005t\u0000\u0000=>\u0005r\u0000\u0000"+
		">?\u0005u\u0000\u0000?F\u0005e\u0000\u0000@A\u0005f\u0000\u0000AB\u0005"+
		"a\u0000\u0000BC\u0005l\u0000\u0000CD\u0005s\u0000\u0000DF\u0005e\u0000"+
		"\u0000E<\u0001\u0000\u0000\u0000E@\u0001\u0000\u0000\u0000F\u000e\u0001"+
		"\u0000\u0000\u0000GK\u0007\u0000\u0000\u0000HJ\u0007\u0001\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0005/\u0000\u0000OP\u0005/\u0000\u0000PT\u0001\u0000"+
		"\u0000\u0000QS\b\u0002\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0006\b\u0000\u0000X\u0012"+
		"\u0001\u0000\u0000\u0000Y[\u0007\u0003\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\t\u0000\u0000_\u0014"+
		"\u0001\u0000\u0000\u0000`l\u00050\u0000\u0000ac\u0005-\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dh\u0007\u0004\u0000\u0000eg\u0007\u0005\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000k`\u0001"+
		"\u0000\u0000\u0000kb\u0001\u0000\u0000\u0000l\u0016\u0001\u0000\u0000"+
		"\u0000mq\u0005\"\u0000\u0000np\b\u0006\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005"+
		"\"\u0000\u0000u\u0018\u0001\u0000\u0000\u0000vx\u0007\u0005\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|\u0080\u0005,\u0000\u0000}\u007f\u0007\u0005\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u001a"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u000b\u0000"+
		"EKT\\bhkqy\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}