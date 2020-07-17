// Generated from /Users/david/Coding/sceme/sceme_parser/src/main/antlr/Common.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Common extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, BOOL_TRUE=3, BOOL_FALSE=4, NAMED_CHAR_LITERAL=5, HEX_CHAR_LITERAL=6, 
		UNICODE_CHAR_LITERAL=7, CHAR_LITERAL=8, STRING=9, BYTEVECTOR=10, IDENTIFIER=11, 
		DELIMITED_IDENTIFIER=12, PECULIAR_IDENTIFIER=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "INTRALINE_WS", "WHITESPACE", "LINE_ENDING", "COMMENT", "LINE_COMMENT", 
			"NESTED_COMMENT", "DIRECTIVE", "BOOL_TRUE", "BOOL_FALSE", "NAMED_CHAR_LITERAL", 
			"HEX_CHAR_LITERAL", "UNICODE_CHAR_LITERAL", "CHAR_LITERAL", "CHARACTER_NAME", 
			"ANY_CHARACTER_VALUE", "STRING", "STRING_ELEMENT", "INLINE_HEX_ESCAPE", 
			"MNEMONIC_ESCAPE", "BYTEVECTOR", "BYTE", "IDENTIFIER", "DELIMITED_IDENTIFIER", 
			"SYMBOL_ELEMENT", "INITIAL", "SPECIAL_INITIAL", "SUBSEQUENT", "SPECIAL_SUBSEQUENT", 
			"EXPLICIT_SIGN", "PECULIAR_IDENTIFIER", "DOT_SUBSEQUENT", "SIGN_SUBSEQUENT", 
			"HEX_SCALAR_VALUE", "HEXDIGIT", "DIGIT", "LETTER", "L_PAREN", "R_PAREN", 
			"VERTICAL_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "BOOL_TRUE", "BOOL_FALSE", "NAMED_CHAR_LITERAL", 
			"HEX_CHAR_LITERAL", "UNICODE_CHAR_LITERAL", "CHAR_LITERAL", "STRING", 
			"BYTEVECTOR", "IDENTIFIER", "DELIMITED_IDENTIFIER", "PECULIAR_IDENTIFIER"
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


	public Common(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Common.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u01a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\5\4\\\n\4\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\5\6e\n\6"+
		"\3\6\3\6\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bv"+
		"\n\b\f\b\16\by\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0097"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\16\5\16\u00bf\n\16\3"+
		"\16\5\16\u00c2\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fe\n\20\3\21\3\21\3\22\3\22\7\22"+
		"\u0104\n\22\f\22\16\22\u0107\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0113\n\23\f\23\16\23\u0116\13\23\3\23\3\23\7\23"+
		"\u011a\n\23\f\23\16\23\u011d\13\23\3\23\5\23\u0120\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0130\n\26"+
		"\f\26\16\26\u0133\13\26\3\26\7\26\u0136\n\26\f\26\16\26\u0139\13\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0149\n\27\3\30\3\30\7\30\u014d\n\30\f\30\16\30\u0150\13\30\3\31\3"+
		"\31\7\31\u0154\n\31\f\31\16\31\u0157\13\31\3\31\3\31\3\32\3\32\3\32\5"+
		"\32\u015e\n\32\3\33\3\33\5\33\u0162\n\33\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u0169\n\35\3\36\3\36\5\36\u016d\n\36\3\37\3\37\3 \3 \3 \3 \7 \u0175\n"+
		" \f \16 \u0178\13 \3 \3 \3 \3 \7 \u017e\n \f \16 \u0181\13 \3 \3 \3 \7"+
		" \u0186\n \f \16 \u0189\13 \5 \u018b\n \3!\3!\5!\u018f\n!\3\"\3\"\3\""+
		"\5\"\u0194\n\"\3#\6#\u0197\n#\r#\16#\u0198\3$\3$\5$\u019d\n$\3%\3%\3&"+
		"\5&\u01a2\n&\3\'\3\'\3(\3(\3)\3)\4lw\2*\3\3\5\2\7\2\t\2\13\4\r\2\17\2"+
		"\21\2\23\5\25\6\27\7\31\b\33\t\35\n\37\2!\2#\13%\2\'\2)\2+\f-\2/\r\61"+
		"\16\63\2\65\2\67\29\2;\2=\2?\17A\2C\2E\2G\2I\2K\2M\2O\2Q\2\3\2\20\4\2"+
		"\13\13\"\"\4\2\f\f\17\17\3\2\2\0\4\2$$^^\6\2cdppttvv\3\2\62;\3\2\62\66"+
		"\3\2\62\67\4\2^^~~\n\2##&(,,\61\61<<>A`a\u0080\u0080\4\2\60\60BB\4\2-"+
		"-//\4\2CHch\4\2C\\c|\2\u01c1\2\3\3\2\2\2\2\13\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2"+
		"\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2?\3\2\2\2\3S\3\2\2\2\5W\3\2\2\2"+
		"\7[\3\2\2\2\t`\3\2\2\2\13d\3\2\2\2\rh\3\2\2\2\17q\3\2\2\2\21\u0096\3\2"+
		"\2\2\23\u009f\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2\2\31\u00b0\3\2\2"+
		"\2\33\u00b6\3\2\2\2\35\u00c5\3\2\2\2\37\u00fd\3\2\2\2!\u00ff\3\2\2\2#"+
		"\u0101\3\2\2\2%\u011f\3\2\2\2\'\u0121\3\2\2\2)\u0126\3\2\2\2+\u0129\3"+
		"\2\2\2-\u0148\3\2\2\2/\u014a\3\2\2\2\61\u0151\3\2\2\2\63\u015d\3\2\2\2"+
		"\65\u0161\3\2\2\2\67\u0163\3\2\2\29\u0168\3\2\2\2;\u016c\3\2\2\2=\u016e"+
		"\3\2\2\2?\u018a\3\2\2\2A\u018e\3\2\2\2C\u0193\3\2\2\2E\u0196\3\2\2\2G"+
		"\u019c\3\2\2\2I\u019e\3\2\2\2K\u01a1\3\2\2\2M\u01a3\3\2\2\2O\u01a5\3\2"+
		"\2\2Q\u01a7\3\2\2\2ST\5\7\4\2TU\3\2\2\2UV\b\2\2\2V\4\3\2\2\2WX\t\2\2\2"+
		"X\6\3\2\2\2Y\\\5\5\3\2Z\\\5\t\5\2[Y\3\2\2\2[Z\3\2\2\2\\\b\3\2\2\2]^\7"+
		"\17\2\2^a\7\f\2\2_a\t\3\2\2`]\3\2\2\2`_\3\2\2\2a\n\3\2\2\2be\5\r\7\2c"+
		"e\5\17\b\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fg\b\6\2\2g\f\3\2\2\2hl\7=\2\2"+
		"ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2"+
		"\2op\5\t\5\2p\16\3\2\2\2qr\7%\2\2rs\7~\2\2sw\3\2\2\2tv\13\2\2\2ut\3\2"+
		"\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7~\2\2{|\7%\2"+
		"\2|\20\3\2\2\2}~\7%\2\2~\177\7#\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2"+
		"\2\u0081\u0082\7n\2\2\u0082\u0083\7f\2\2\u0083\u0084\7/\2\2\u0084\u0085"+
		"\7e\2\2\u0085\u0086\7c\2\2\u0086\u0087\7u\2\2\u0087\u0097\7g\2\2\u0088"+
		"\u0089\7%\2\2\u0089\u008a\7#\2\2\u008a\u008b\7p\2\2\u008b\u008c\7q\2\2"+
		"\u008c\u008d\7/\2\2\u008d\u008e\7h\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7f\2\2\u0091\u0092\7/\2\2\u0092\u0093\7e\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7u\2\2\u0095\u0097\7g\2\2\u0096}\3\2\2\2\u0096"+
		"\u0088\3\2\2\2\u0097\22\3\2\2\2\u0098\u0099\7%\2\2\u0099\u009a\7v\2\2"+
		"\u009a\u009b\7t\2\2\u009b\u009c\7w\2\2\u009c\u00a0\7g\2\2\u009d\u009e"+
		"\7%\2\2\u009e\u00a0\7v\2\2\u009f\u0098\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\24\3\2\2\2\u00a1\u00a2\7%\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00aa\7g\2\2\u00a7\u00a8\7%\2\2"+
		"\u00a8\u00aa\7h\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\26\3"+
		"\2\2\2\u00ab\u00ac\7%\2\2\u00ac\u00ad\7^\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\5\37\20\2\u00af\30\3\2\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\7^\2"+
		"\2\u00b2\u00b3\7z\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5E#\2\u00b5\32\3"+
		"\2\2\2\u00b6\u00b7\7%\2\2\u00b7\u00b8\7^\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00bc\5G$\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2"+
		"\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5G$\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5G$\2\u00c1\u00c0\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5G$\2\u00c4\34\3\2\2\2"+
		"\u00c5\u00c6\7%\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\5!\21\2\u00c9\36\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7t\2\2\u00ce\u00fe\7o\2\2\u00cf\u00d0\7d\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7m\2\2\u00d3\u00d4"+
		"\7u\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7e\2\2\u00d7"+
		"\u00fe\7g\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7n\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc\u00dd\7v\2\2\u00dd\u00fe\7g\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7r\2\2\u00e3\u00fe\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7g\2\2"+
		"\u00e6\u00e7\7y\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7p\2\2\u00ea\u00fe\7g\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7w\2\2\u00ed"+
		"\u00ee\7n\2\2\u00ee\u00fe\7n\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1\u00f2\7v\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7t\2\2\u00f4\u00fe"+
		"\7p\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7c\2\2\u00f8"+
		"\u00f9\7e\2\2\u00f9\u00fe\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7c\2\2"+
		"\u00fc\u00fe\7d\2\2\u00fd\u00ca\3\2\2\2\u00fd\u00cf\3\2\2\2\u00fd\u00d8"+
		"\3\2\2\2\u00fd\u00de\3\2\2\2\u00fd\u00e4\3\2\2\2\u00fd\u00eb\3\2\2\2\u00fd"+
		"\u00ef\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe \3\2\2\2"+
		"\u00ff\u0100\t\4\2\2\u0100\"\3\2\2\2\u0101\u0105\7$\2\2\u0102\u0104\5"+
		"%\23\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7$"+
		"\2\2\u0109$\3\2\2\2\u010a\u0120\n\5\2\2\u010b\u0120\5)\25\2\u010c\u010d"+
		"\7^\2\2\u010d\u0120\7$\2\2\u010e\u010f\7^\2\2\u010f\u0120\7^\2\2\u0110"+
		"\u0114\7^\2\2\u0111\u0113\5\5\3\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u011b\5\t\5\2\u0118\u011a\5\5\3\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u0120\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5\'\24\2\u011f\u010a\3"+
		"\2\2\2\u011f\u010b\3\2\2\2\u011f\u010c\3\2\2\2\u011f\u010e\3\2\2\2\u011f"+
		"\u0110\3\2\2\2\u011f\u011e\3\2\2\2\u0120&\3\2\2\2\u0121\u0122\7^\2\2\u0122"+
		"\u0123\7z\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5E#\2\u0125(\3\2\2\2\u0126"+
		"\u0127\7^\2\2\u0127\u0128\t\6\2\2\u0128*\3\2\2\2\u0129\u012a\7%\2\2\u012a"+
		"\u012b\7w\2\2\u012b\u012c\7:\2\2\u012c\u012d\3\2\2\2\u012d\u0137\7*\2"+
		"\2\u012e\u0130\7\"\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0136\5-\27\2\u0135\u0131\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\7+\2\2\u013b,\3\2\2\2\u013c\u0149\t\7\2\2\u013d\u013e\t\7\2\2\u013e"+
		"\u0149\t\7\2\2\u013f\u0140\7\63\2\2\u0140\u0141\t\7\2\2\u0141\u0149\t"+
		"\7\2\2\u0142\u0143\7\64\2\2\u0143\u0144\t\b\2\2\u0144\u0149\t\7\2\2\u0145"+
		"\u0146\7\64\2\2\u0146\u0147\t\t\2\2\u0147\u0149\t\t\2\2\u0148\u013c\3"+
		"\2\2\2\u0148\u013d\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0142\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0149.\3\2\2\2\u014a\u014e\5\65\33\2\u014b\u014d\59\35"+
		"\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\60\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0155\5Q)\2\u0152"+
		"\u0154\5\63\32\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u0159\5Q)\2\u0159\62\3\2\2\2\u015a\u015e\5\'\24\2\u015b\u015e\5)\25\2"+
		"\u015c\u015e\n\n\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c"+
		"\3\2\2\2\u015e\64\3\2\2\2\u015f\u0162\5K&\2\u0160\u0162\5\67\34\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\66\3\2\2\2\u0163\u0164\t\13\2"+
		"\2\u01648\3\2\2\2\u0165\u0169\5\65\33\2\u0166\u0169\5I%\2\u0167\u0169"+
		"\5;\36\2\u0168\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		":\3\2\2\2\u016a\u016d\5=\37\2\u016b\u016d\t\f\2\2\u016c\u016a\3\2\2\2"+
		"\u016c\u016b\3\2\2\2\u016d<\3\2\2\2\u016e\u016f\t\r\2\2\u016f>\3\2\2\2"+
		"\u0170\u018b\5=\37\2\u0171\u0172\5=\37\2\u0172\u0176\5C\"\2\u0173\u0175"+
		"\59\35\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u018b\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\5="+
		"\37\2\u017a\u017b\7\60\2\2\u017b\u017f\5A!\2\u017c\u017e\59\35\2\u017d"+
		"\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u018b\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\60\2\2\u0183"+
		"\u0187\5A!\2\u0184\u0186\59\35\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2"+
		"\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\u0170\3\2\2\2\u018a\u0171\3\2\2\2\u018a\u0179\3\2\2\2\u018a"+
		"\u0182\3\2\2\2\u018b@\3\2\2\2\u018c\u018f\5C\"\2\u018d\u018f\7\60\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018fB\3\2\2\2\u0190\u0194\5"+
		"\65\33\2\u0191\u0194\5=\37\2\u0192\u0194\7B\2\2\u0193\u0190\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194D\3\2\2\2\u0195\u0197\5G$\2\u0196"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199F\3\2\2\2\u019a\u019d\5I%\2\u019b\u019d\t\16\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019dH\3\2\2\2\u019e\u019f\t\7\2\2\u019f"+
		"J\3\2\2\2\u01a0\u01a2\t\17\2\2\u01a1\u01a0\3\2\2\2\u01a2L\3\2\2\2\u01a3"+
		"\u01a4\7*\2\2\u01a4N\3\2\2\2\u01a5\u01a6\7+\2\2\u01a6P\3\2\2\2\u01a7\u01a8"+
		"\7~\2\2\u01a8R\3\2\2\2%\2[`dlw\u0096\u009f\u00a9\u00bb\u00be\u00c1\u00fd"+
		"\u0105\u0114\u011b\u011f\u0131\u0137\u0148\u014e\u0155\u015d\u0161\u0168"+
		"\u016c\u0176\u017f\u0187\u018a\u018e\u0193\u0198\u019c\u01a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}