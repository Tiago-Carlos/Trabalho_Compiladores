// Generated from C:/Users/tiago/IdeaProjects/Trabalho Compiladores\Expr.g4 by ANTLR 4.9.2

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
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, NUM=8, INT_TYPE=9, 
		COMMENT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ID", "NUM", "INT_TYPE", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'*'", "'+'", "'/'", "'%'", null, null, "'INT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "NUM", "INT_TYPE", "COMMENT", 
			"WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rO\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7"+
		"\b(\n\b\f\b\16\b+\13\b\3\t\3\t\5\t/\n\t\3\t\3\t\7\t\63\n\t\f\t\16\t\66"+
		"\13\t\5\t8\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13B\n\13\f\13\16"+
		"\13E\13\13\3\13\3\13\3\f\6\fJ\n\f\r\f\16\fK\3\f\3\f\2\2\r\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\b\3\2c|\6\2\62;C\\aac|\3\2"+
		"\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2T\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2"+
		"\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r#\3\2\2\2\17%\3\2\2\2\21\67"+
		"\3\2\2\2\239\3\2\2\2\25=\3\2\2\2\27I\3\2\2\2\31\32\7<\2\2\32\4\3\2\2\2"+
		"\33\34\7?\2\2\34\6\3\2\2\2\35\36\7,\2\2\36\b\3\2\2\2\37 \7-\2\2 \n\3\2"+
		"\2\2!\"\7\61\2\2\"\f\3\2\2\2#$\7\'\2\2$\16\3\2\2\2%)\t\2\2\2&(\t\3\2\2"+
		"\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\20\3\2\2\2+)\3\2\2\2,8\7\62"+
		"\2\2-/\7/\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\64\t\4\2\2\61\63\t\5"+
		"\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2"+
		"\2\66\64\3\2\2\2\67,\3\2\2\2\67.\3\2\2\28\22\3\2\2\29:\7K\2\2:;\7P\2\2"+
		";<\7V\2\2<\24\3\2\2\2=>\7/\2\2>?\7/\2\2?C\3\2\2\2@B\n\6\2\2A@\3\2\2\2"+
		"BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\b\13\2\2G\26\3\2"+
		"\2\2HJ\t\7\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\f"+
		"\2\2N\30\3\2\2\2\t\2).\64\67CK\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}