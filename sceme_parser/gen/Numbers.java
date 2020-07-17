// Generated from /Users/david/Coding/sceme/sceme_parser/src/main/antlr/Numbers.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Numbers extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIXNUM_2=1, FLONUM_2=2, FIXNUM_8=3, FLONUM_8=4, FIXNUM_10=5, FLONUM_10=6, 
		FIXNUM_16=7, FLONUM_16=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FIXNUM_2", "FLONUM_2", "FIXNUM_8", "FLONUM_8", "FIXNUM_10", "FLONUM_10", 
			"FIXNUM_16", "FLONUM_16", "RADIX_2", "RADIX_8", "RADIX_10", "RADIX_16", 
			"PREFIX_2", "PREFIX_8", "PREFIX_10", "PREFIX_16", "FIXNUM_PART_2", "FLONUM_PART_2", 
			"FIXNUM_PART_8", "FLONUM_PART_8", "FIXNUM_PART_10", "FLONUM_PART_10", 
			"FIXNUM_PART_16", "FLONUM_PART_16", "UINTEGER_2", "UINTEGER_8", "UINTEGER_10", 
			"UINTEGER_16", "DECIMAL_2", "DECIMAL_8", "DECIMAL_10", "DECIMAL_16", 
			"SUFFIX", "EXPONENT_MARKER", "SIGN", "INFNAN", "EXACTNESS", "DIGIT_2", 
			"DIGIT_8", "DIGIT_10", "DIGIT_16", "DIGIT"
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
			null, "FIXNUM_2", "FLONUM_2", "FIXNUM_8", "FLONUM_8", "FIXNUM_10", "FLONUM_10", 
			"FIXNUM_16", "FLONUM_16"
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


	public Numbers(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Numbers.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u0183\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\fx\n\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0083\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0093"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009b\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23\u00a4\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u00ad\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u00b6\n\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\5\31\u00bf\n\31\3\32\6\32\u00c2\n\32\r\32"+
		"\16\32\u00c3\3\33\6\33\u00c7\n\33\r\33\16\33\u00c8\3\34\6\34\u00cc\n\34"+
		"\r\34\16\34\u00cd\3\35\6\35\u00d1\n\35\r\35\16\35\u00d2\3\36\3\36\3\36"+
		"\3\36\3\36\6\36\u00da\n\36\r\36\16\36\u00db\3\36\3\36\3\36\6\36\u00e1"+
		"\n\36\r\36\16\36\u00e2\3\36\3\36\7\36\u00e7\n\36\f\36\16\36\u00ea\13\36"+
		"\3\36\3\36\5\36\u00ee\n\36\3\37\3\37\3\37\3\37\3\37\6\37\u00f5\n\37\r"+
		"\37\16\37\u00f6\3\37\3\37\3\37\6\37\u00fc\n\37\r\37\16\37\u00fd\3\37\3"+
		"\37\7\37\u0102\n\37\f\37\16\37\u0105\13\37\3\37\3\37\5\37\u0109\n\37\3"+
		" \3 \3 \3 \3 \6 \u0110\n \r \16 \u0111\3 \3 \3 \6 \u0117\n \r \16 \u0118"+
		"\3 \3 \7 \u011d\n \f \16 \u0120\13 \3 \3 \5 \u0124\n \3!\3!\3!\3!\3!\6"+
		"!\u012b\n!\r!\16!\u012c\3!\3!\3!\6!\u0132\n!\r!\16!\u0133\3!\3!\7!\u0138"+
		"\n!\f!\16!\u013b\13!\3!\3!\5!\u013f\n!\3\"\3\"\3\"\6\"\u0144\n\"\r\"\16"+
		"\"\u0145\5\"\u0148\n\"\3#\3#\3$\5$\u014d\n$\3$\5$\u0150\n$\5$\u0152\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u016c\n%\3&\3&\5&\u0170\n&\3&\3&\5&\u0174\n&\5&\u0176\n&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\5*\u0180\n*\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2\3\2\6\3"+
		"\2\62\63\3\2\629\4\2CHch\3\2\62;\2\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\3W\3\2\2\2\5Z\3\2\2\2\7]\3\2\2\2\t`\3\2\2\2\13c\3\2\2\2\rf\3\2\2\2\17"+
		"i\3\2\2\2\21l\3\2\2\2\23o\3\2\2\2\25r\3\2\2\2\27w\3\2\2\2\31y\3\2\2\2"+
		"\33\u0082\3\2\2\2\35\u008a\3\2\2\2\37\u0092\3\2\2\2!\u009a\3\2\2\2#\u009c"+
		"\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00ac\3\2\2\2+\u00ae\3\2\2\2"+
		"-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00be\3\2\2\2\63\u00c1\3\2\2\2\65\u00c6"+
		"\3\2\2\2\67\u00cb\3\2\2\29\u00d0\3\2\2\2;\u00ed\3\2\2\2=\u0108\3\2\2\2"+
		"?\u0123\3\2\2\2A\u013e\3\2\2\2C\u0147\3\2\2\2E\u0149\3\2\2\2G\u0151\3"+
		"\2\2\2I\u016b\3\2\2\2K\u0175\3\2\2\2M\u0177\3\2\2\2O\u0179\3\2\2\2Q\u017b"+
		"\3\2\2\2S\u017f\3\2\2\2U\u0181\3\2\2\2WX\5\33\16\2XY\5#\22\2Y\4\3\2\2"+
		"\2Z[\5\33\16\2[\\\5%\23\2\\\6\3\2\2\2]^\5\35\17\2^_\5\'\24\2_\b\3\2\2"+
		"\2`a\5\35\17\2ab\5)\25\2b\n\3\2\2\2cd\5\37\20\2de\5+\26\2e\f\3\2\2\2f"+
		"g\5\37\20\2gh\5-\27\2h\16\3\2\2\2ij\5!\21\2jk\5/\30\2k\20\3\2\2\2lm\5"+
		"!\21\2mn\5\61\31\2n\22\3\2\2\2op\7%\2\2pq\7d\2\2q\24\3\2\2\2rs\7%\2\2"+
		"st\7q\2\2t\26\3\2\2\2uv\7%\2\2vx\7f\2\2wu\3\2\2\2wx\3\2\2\2x\30\3\2\2"+
		"\2yz\7%\2\2z{\7z\2\2{\32\3\2\2\2|}\5\23\n\2}~\5K&\2~\u0083\3\2\2\2\177"+
		"\u0080\5K&\2\u0080\u0081\5\23\n\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0083\34\3\2\2\2\u0084\u0085\5\25\13\2\u0085\u0086\5K&\2"+
		"\u0086\u008b\3\2\2\2\u0087\u0088\5K&\2\u0088\u0089\5\25\13\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\36\3\2\2\2\u008c"+
		"\u008d\5\27\f\2\u008d\u008e\5K&\2\u008e\u0093\3\2\2\2\u008f\u0090\5K&"+
		"\2\u0090\u0091\5\27\f\2\u0091\u0093\3\2\2\2\u0092\u008c\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0093 \3\2\2\2\u0094\u0095\5\31\r\2\u0095\u0096\5K&\2\u0096"+
		"\u009b\3\2\2\2\u0097\u0098\5K&\2\u0098\u0099\5\31\r\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\5G$\2\u009d\u009e\5\63\32\2\u009e$\3\2\2\2\u009f\u00a0\5G$\2\u00a0\u00a1"+
		"\5;\36\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4\5I%\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4&\3\2\2\2\u00a5\u00a6\5G$\2\u00a6\u00a7\5\65\33\2"+
		"\u00a7(\3\2\2\2\u00a8\u00a9\5G$\2\u00a9\u00aa\5=\37\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00ad\5I%\2\u00ac\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad*"+
		"\3\2\2\2\u00ae\u00af\5G$\2\u00af\u00b0\5\67\34\2\u00b0,\3\2\2\2\u00b1"+
		"\u00b2\5G$\2\u00b2\u00b3\5? \2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\5I%\2\u00b5"+
		"\u00b1\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6.\3\2\2\2\u00b7\u00b8\5G$\2\u00b8"+
		"\u00b9\59\35\2\u00b9\60\3\2\2\2\u00ba\u00bb\5G$\2\u00bb\u00bc\5A!\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bf\5I%\2\u00be\u00ba\3\2\2\2\u00be\u00bd\3\2\2"+
		"\2\u00bf\62\3\2\2\2\u00c0\u00c2\5M\'\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\64\3\2\2\2\u00c5"+
		"\u00c7\5O(\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\66\3\2\2\2\u00ca\u00cc\5Q)\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"8\3\2\2\2\u00cf\u00d1\5S*\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3:\3\2\2\2\u00d4\u00d5\5\63\32"+
		"\2\u00d5\u00d6\5C\"\2\u00d6\u00ee\3\2\2\2\u00d7\u00d9\7\60\2\2\u00d8\u00da"+
		"\5M\'\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\5C\"\2\u00de\u00ee\3\2"+
		"\2\2\u00df\u00e1\5M\'\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\7\60"+
		"\2\2\u00e5\u00e7\5M\'\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\5C\"\2\u00ec\u00ee\3\2\2\2\u00ed\u00d4\3\2\2\2\u00ed"+
		"\u00d7\3\2\2\2\u00ed\u00e0\3\2\2\2\u00ee<\3\2\2\2\u00ef\u00f0\5\65\33"+
		"\2\u00f0\u00f1\5C\"\2\u00f1\u0109\3\2\2\2\u00f2\u00f4\7\60\2\2\u00f3\u00f5"+
		"\5O(\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5C\"\2\u00f9\u0109\3\2"+
		"\2\2\u00fa\u00fc\5O(\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103\7\60\2\2"+
		"\u0100\u0102\5O(\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\5C\"\2\u0107\u0109\3\2\2\2\u0108\u00ef\3\2\2\2\u0108\u00f2\3\2"+
		"\2\2\u0108\u00fb\3\2\2\2\u0109>\3\2\2\2\u010a\u010b\5\67\34\2\u010b\u010c"+
		"\5C\"\2\u010c\u0124\3\2\2\2\u010d\u010f\7\60\2\2\u010e\u0110\5Q)\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5C\"\2\u0114\u0124\3\2\2\2\u0115"+
		"\u0117\5Q)\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\7\60\2\2\u011b"+
		"\u011d\5Q)\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\5C\"\2\u0122\u0124\3\2\2\2\u0123\u010a\3\2\2\2\u0123\u010d\3\2\2\2\u0123"+
		"\u0116\3\2\2\2\u0124@\3\2\2\2\u0125\u0126\59\35\2\u0126\u0127\5C\"\2\u0127"+
		"\u013f\3\2\2\2\u0128\u012a\7\60\2\2\u0129\u012b\5S*\2\u012a\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\5C\"\2\u012f\u013f\3\2\2\2\u0130\u0132\5S*"+
		"\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0139\7\60\2\2\u0136\u0138\5S*\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\5C\"\2\u013d"+
		"\u013f\3\2\2\2\u013e\u0125\3\2\2\2\u013e\u0128\3\2\2\2\u013e\u0131\3\2"+
		"\2\2\u013fB\3\2\2\2\u0140\u0141\5E#\2\u0141\u0143\5G$\2\u0142\u0144\5"+
		"Q)\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0140\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148D\3\2\2\2\u0149\u014a\7g\2\2\u014aF\3\2\2\2\u014b\u014d\7-\2"+
		"\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152\3\2\2\2\u014e\u0150"+
		"\7/\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014c\3\2\2\2\u0151\u014f\3\2\2\2\u0152H\3\2\2\2\u0153\u0154\7-\2\2\u0154"+
		"\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156\u0157\7h\2\2\u0157\u0158\7\60\2"+
		"\2\u0158\u016c\7\62\2\2\u0159\u015a\7/\2\2\u015a\u015b\7k\2\2\u015b\u015c"+
		"\7p\2\2\u015c\u015d\7h\2\2\u015d\u015e\7\60\2\2\u015e\u016c\7\62\2\2\u015f"+
		"\u0160\7-\2\2\u0160\u0161\7p\2\2\u0161\u0162\7c\2\2\u0162\u0163\7p\2\2"+
		"\u0163\u0164\7\60\2\2\u0164\u016c\7\62\2\2\u0165\u0166\7/\2\2\u0166\u0167"+
		"\7p\2\2\u0167\u0168\7c\2\2\u0168\u0169\7p\2\2\u0169\u016a\7\60\2\2\u016a"+
		"\u016c\7\62\2\2\u016b\u0153\3\2\2\2\u016b\u0159\3\2\2\2\u016b\u015f\3"+
		"\2\2\2\u016b\u0165\3\2\2\2\u016cJ\3\2\2\2\u016d\u016e\7%\2\2\u016e\u0170"+
		"\7k\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0176\3\2\2\2\u0171"+
		"\u0172\7%\2\2\u0172\u0174\7g\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2"+
		"\2\u0174\u0176\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0173\3\2\2\2\u0176L"+
		"\3\2\2\2\u0177\u0178\t\2\2\2\u0178N\3\2\2\2\u0179\u017a\t\3\2\2\u017a"+
		"P\3\2\2\2\u017b\u017c\5U+\2\u017cR\3\2\2\2\u017d\u0180\5Q)\2\u017e\u0180"+
		"\t\4\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180T\3\2\2\2\u0181"+
		"\u0182\t\5\2\2\u0182V\3\2\2\2*\2w\u0082\u008a\u0092\u009a\u00a3\u00ac"+
		"\u00b5\u00be\u00c3\u00c8\u00cd\u00d2\u00db\u00e2\u00e8\u00ed\u00f6\u00fd"+
		"\u0103\u0108\u0111\u0118\u011e\u0123\u012c\u0133\u0139\u013e\u0145\u0147"+
		"\u014c\u014f\u0151\u016b\u016f\u0173\u0175\u017f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}