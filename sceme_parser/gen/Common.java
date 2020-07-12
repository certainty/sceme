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
		UNICODE_CHAR_LITERAL=7, CHAR_LITERAL=8, CHARACTER_NAME=9, ANY_CHARACTER_VALUE=10, 
		IDENTIFIER=11, DELIMITED_IDENTIFIER=12, SYMBOL_ELEMENT=13, PECULIAR_IDENTIFIER=14;
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
			"ANY_CHARACTER_VALUE", "IDENTIFIER", "DELIMITED_IDENTIFIER", "SYMBOL_ELEMENT", 
			"INITIAL", "SPECIAL_INITIAL", "SUBSEQUENT", "SPECIAL_SUBSEQUENT", "EXPLICIT_SIGN", 
			"PECULIAR_IDENTIFIER", "DOT_SUBSEQUENT", "SIGN_SUBSEQUENT", "MNEMONIC_ESCAPE", 
			"INLINE_HEX_ESCAPE", "HEX_SCALAR_VALUE", "HEXDIGIT", "DIGIT", "LETTER", 
			"L_PAREN", "R_PAREN", "VERTICAL_LINE"
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
			"HEX_CHAR_LITERAL", "UNICODE_CHAR_LITERAL", "CHAR_LITERAL", "CHARACTER_NAME", 
			"ANY_CHARACTER_VALUE", "IDENTIFIER", "DELIMITED_IDENTIFIER", "SYMBOL_ELEMENT", 
			"PECULIAR_IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0160\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4"+
		"T\n\4\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\5\6]\n\6\3\6\3\6\3\7\3\7\7\7c\n\7\f"+
		"\7\16\7f\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b4\n\16\3\16\5\16\u00b7\n\16\3\16\5\16\u00ba\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00f6\n\20\3\21\3\21\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff"+
		"\13\22\3\23\3\23\7\23\u0103\n\23\f\23\16\23\u0106\13\23\3\23\3\23\3\24"+
		"\3\24\3\24\5\24\u010d\n\24\3\25\3\25\5\25\u0111\n\25\3\26\3\26\3\27\3"+
		"\27\3\27\5\27\u0118\n\27\3\30\3\30\5\30\u011c\n\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u0124\n\32\f\32\16\32\u0127\13\32\3\32\3\32\3\32\3\32"+
		"\7\32\u012d\n\32\f\32\16\32\u0130\13\32\3\32\3\32\3\32\7\32\u0135\n\32"+
		"\f\32\16\32\u0138\13\32\5\32\u013a\n\32\3\33\3\33\5\33\u013e\n\33\3\34"+
		"\3\34\3\34\5\34\u0143\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\6\37\u014e\n\37\r\37\16\37\u014f\3 \3 \5 \u0154\n \3!\3!\3\"\5\"\u0159"+
		"\n\"\3#\3#\3$\3$\3%\3%\4do\2&\3\3\5\2\7\2\t\2\13\4\r\2\17\2\21\2\23\5"+
		"\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\2+\2-\2/\2\61\2\63\20"+
		"\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2\3\2\r\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\3\2\2\0\4\2^^~~\n\2##&(,,\61\61<<>A`a\u0080\u0080\4\2\60\60BB\4\2--/"+
		"/\6\2cdppttvv\4\2CHch\3\2\62;\4\2C\\c|\2\u016f\2\3\3\2\2\2\2\13\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2\63\3\2\2\2\3K\3\2\2\2\5O\3\2\2\2\7S\3\2\2\2\tX\3\2\2\2\13\\\3\2\2\2"+
		"\r`\3\2\2\2\17i\3\2\2\2\21\u008e\3\2\2\2\23\u0097\3\2\2\2\25\u00a1\3\2"+
		"\2\2\27\u00a3\3\2\2\2\31\u00a8\3\2\2\2\33\u00ae\3\2\2\2\35\u00bd\3\2\2"+
		"\2\37\u00f5\3\2\2\2!\u00f7\3\2\2\2#\u00f9\3\2\2\2%\u0100\3\2\2\2\'\u010c"+
		"\3\2\2\2)\u0110\3\2\2\2+\u0112\3\2\2\2-\u0117\3\2\2\2/\u011b\3\2\2\2\61"+
		"\u011d\3\2\2\2\63\u0139\3\2\2\2\65\u013d\3\2\2\2\67\u0142\3\2\2\29\u0144"+
		"\3\2\2\2;\u0147\3\2\2\2=\u014d\3\2\2\2?\u0153\3\2\2\2A\u0155\3\2\2\2C"+
		"\u0158\3\2\2\2E\u015a\3\2\2\2G\u015c\3\2\2\2I\u015e\3\2\2\2KL\5\7\4\2"+
		"LM\3\2\2\2MN\b\2\2\2N\4\3\2\2\2OP\t\2\2\2P\6\3\2\2\2QT\5\5\3\2RT\5\t\5"+
		"\2SQ\3\2\2\2SR\3\2\2\2T\b\3\2\2\2UV\7\17\2\2VY\7\f\2\2WY\t\3\2\2XU\3\2"+
		"\2\2XW\3\2\2\2Y\n\3\2\2\2Z]\5\r\7\2[]\5\17\b\2\\Z\3\2\2\2\\[\3\2\2\2]"+
		"^\3\2\2\2^_\b\6\2\2_\f\3\2\2\2`d\7=\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2"+
		"de\3\2\2\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5\t\5\2h\16\3\2\2\2ij\7%\2"+
		"\2jk\7~\2\2ko\3\2\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2"+
		"\2pr\3\2\2\2qo\3\2\2\2rs\7~\2\2st\7%\2\2t\20\3\2\2\2uv\7%\2\2vw\7#\2\2"+
		"wx\7h\2\2xy\7q\2\2yz\7n\2\2z{\7f\2\2{|\7/\2\2|}\7e\2\2}~\7c\2\2~\177\7"+
		"u\2\2\177\u008f\7g\2\2\u0080\u0081\7%\2\2\u0081\u0082\7#\2\2\u0082\u0083"+
		"\7p\2\2\u0083\u0084\7q\2\2\u0084\u0085\7/\2\2\u0085\u0086\7h\2\2\u0086"+
		"\u0087\7q\2\2\u0087\u0088\7n\2\2\u0088\u0089\7f\2\2\u0089\u008a\7/\2\2"+
		"\u008a\u008b\7e\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\u008f"+
		"\7g\2\2\u008eu\3\2\2\2\u008e\u0080\3\2\2\2\u008f\22\3\2\2\2\u0090\u0091"+
		"\7%\2\2\u0091\u0092\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0098\7g\2\2\u0095\u0096\7%\2\2\u0096\u0098\7v\2\2\u0097\u0090\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\24\3\2\2\2\u0099\u009a\7%\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u00a2\7g\2\2\u009f\u00a0\7%\2\2\u00a0\u00a2\7h\2\2\u00a1\u0099\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7%\2\2\u00a4\u00a5"+
		"\7^\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\37\20\2\u00a7\30\3\2\2\2\u00a8"+
		"\u00a9\7%\2\2\u00a9\u00aa\7^\2\2\u00aa\u00ab\7z\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ad\5=\37\2\u00ad\32\3\2\2\2\u00ae\u00af\7%\2\2\u00af\u00b0"+
		"\7^\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\5? \2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5?"+
		" \2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00ba\5? \2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2"+
		"\2\u00bb\u00bc\5? \2\u00bc\34\3\2\2\2\u00bd\u00be\7%\2\2\u00be\u00bf\7"+
		"^\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5!\21\2\u00c1\36\3\2\2\2\u00c2\u00c3"+
		"\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00f6\7o\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7e\2\2"+
		"\u00ca\u00cb\7m\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce"+
		"\7c\2\2\u00ce\u00cf\7e\2\2\u00cf\u00f6\7g\2\2\u00d0\u00d1\7f\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\u00f6\7g\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9"+
		"\7e\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7r\2\2\u00db\u00f6\7g\2\2\u00dc"+
		"\u00dd\7p\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7n\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00f6\7g\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7n\2\2\u00e6\u00f6\7n\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7w\2\2"+
		"\u00eb\u00ec\7t\2\2\u00ec\u00f6\7p\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef"+
		"\7r\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f6\7g\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f6\7d\2\2\u00f5\u00c2\3\2\2"+
		"\2\u00f5\u00c7\3\2\2\2\u00f5\u00d0\3\2\2\2\u00f5\u00d6\3\2\2\2\u00f5\u00dc"+
		"\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5"+
		"\u00f2\3\2\2\2\u00f6 \3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8\"\3\2\2\2\u00f9"+
		"\u00fd\5)\25\2\u00fa\u00fc\5-\27\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe$\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0104\5I%\2\u0101\u0103\5\'\24\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5I%\2\u0108&\3\2\2\2\u0109\u010d"+
		"\5;\36\2\u010a\u010d\59\35\2\u010b\u010d\n\5\2\2\u010c\u0109\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d(\3\2\2\2\u010e\u0111\5C\"\2\u010f"+
		"\u0111\5+\26\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111*\3\2\2\2"+
		"\u0112\u0113\t\6\2\2\u0113,\3\2\2\2\u0114\u0118\5)\25\2\u0115\u0118\5"+
		"A!\2\u0116\u0118\5/\30\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118.\3\2\2\2\u0119\u011c\5\61\31\2\u011a\u011c\t\7\2"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\60\3\2\2\2\u011d\u011e"+
		"\t\b\2\2\u011e\62\3\2\2\2\u011f\u013a\5\61\31\2\u0120\u0121\5\61\31\2"+
		"\u0121\u0125\5\67\34\2\u0122\u0124\5-\27\2\u0123\u0122\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u013a\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0129\5\61\31\2\u0129\u012a\7\60\2\2\u012a\u012e"+
		"\5\65\33\2\u012b\u012d\5-\27\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u013a\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0131\u0132\7\60\2\2\u0132\u0136\5\65\33\2\u0133\u0135\5-\27"+
		"\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u011f\3\2\2\2\u0139"+
		"\u0120\3\2\2\2\u0139\u0128\3\2\2\2\u0139\u0131\3\2\2\2\u013a\64\3\2\2"+
		"\2\u013b\u013e\5\67\34\2\u013c\u013e\7\60\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\66\3\2\2\2\u013f\u0143\5)\25\2\u0140\u0143\5\61\31"+
		"\2\u0141\u0143\7B\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u01438\3\2\2\2\u0144\u0145\7^\2\2\u0145\u0146\t\t\2\2\u0146:"+
		"\3\2\2\2\u0147\u0148\7^\2\2\u0148\u0149\7z\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\5=\37\2\u014b<\3\2\2\2\u014c\u014e\5? \2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150>\3\2\2\2"+
		"\u0151\u0154\5A!\2\u0152\u0154\t\n\2\2\u0153\u0151\3\2\2\2\u0153\u0152"+
		"\3\2\2\2\u0154@\3\2\2\2\u0155\u0156\t\13\2\2\u0156B\3\2\2\2\u0157\u0159"+
		"\t\f\2\2\u0158\u0157\3\2\2\2\u0159D\3\2\2\2\u015a\u015b\7*\2\2\u015bF"+
		"\3\2\2\2\u015c\u015d\7+\2\2\u015dH\3\2\2\2\u015e\u015f\7~\2\2\u015fJ\3"+
		"\2\2\2\36\2SX\\do\u008e\u0097\u00a1\u00b3\u00b6\u00b9\u00f5\u00fd\u0104"+
		"\u010c\u0110\u0117\u011b\u0125\u012e\u0136\u0139\u013d\u0142\u014f\u0153"+
		"\u0158\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}