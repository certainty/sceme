// Generated from src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScemeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUE=1, FALSE=2, INTEGER_VALUE_PART=3, FLOAT_VALUE_PART=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRUE", "FALSE", "INTEGER_VALUE_PART", "INTEGER_PART", "FLOAT_VALUE_PART", 
			"FRACTIONAL_PART", "EXPONENT_PART", "EXPONENT_INDICATOR", "SIGN", "DIGIT19", 
			"DIGIT", "ZERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#t'", "'#f'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUE", "FALSE", "INTEGER_VALUE_PART", "FLOAT_VALUE_PART"
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


	public ScemeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sceme.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\5\4#\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\7\5*\n\5\f\5\16\5-\13\5\5\5/\n\5\3\6\3\6\5\6\63\n\6\3\6\5\6\66"+
		"\n\6\3\7\3\7\6\7:\n\7\r\7\16\7;\3\b\3\b\5\b@\n\b\3\b\6\bC\n\b\r\b\16\b"+
		"D\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\fO\n\f\3\r\3\r\2\2\16\3\3\5\4\7"+
		"\5\t\2\13\6\r\2\17\2\21\2\23\2\25\2\27\2\31\2\3\2\4\4\2GGgg\4\2--//\2"+
		"R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\3\33\3\2\2\2\5\36\3"+
		"\2\2\2\7\"\3\2\2\2\t.\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17=\3\2\2\2\21"+
		"F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33\34\7%\2\2"+
		"\34\35\7v\2\2\35\4\3\2\2\2\36\37\7%\2\2\37 \7h\2\2 \6\3\2\2\2!#\5\23\n"+
		"\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\5\t\5\2%\b\3\2\2\2&/\5\31\r\2\'+"+
		"\5\25\13\2(*\5\27\f\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2"+
		"\2-+\3\2\2\2.&\3\2\2\2.\'\3\2\2\2/\n\3\2\2\2\60\62\5\r\7\2\61\63\5\17"+
		"\b\2\62\61\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\66\5\17\b\2\65\60\3"+
		"\2\2\2\65\64\3\2\2\2\66\f\3\2\2\2\679\7\60\2\28:\5\27\f\298\3\2\2\2:;"+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\16\3\2\2\2=?\5\21\t\2>@\5\23\n\2?>\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2AC\5\27\f\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\20\3\2\2\2FG\t\2\2\2G\22\3\2\2\2HI\t\3\2\2I\24\3\2\2\2JK\4\63;\2"+
		"K\26\3\2\2\2LO\5\31\r\2MO\5\25\13\2NL\3\2\2\2NM\3\2\2\2O\30\3\2\2\2PQ"+
		"\7\62\2\2Q\32\3\2\2\2\f\2\"+.\62\65;?DN\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}