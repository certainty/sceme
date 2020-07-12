// Generated from sceme_parser/src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.parser.gen;
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
		WS=1, COMMENT=2, BOOL_TRUE=3, BOOL_FALSE=4, NAMED_CHAR_LITERAL=5, HEX_CHAR_LITERAL=6, 
		UNICODE_CHAR_LITERAL=7, CHAR_LITERAL=8, STRING=9, IDENTIFIER=10, DELIMITED_IDENTIFIER=11, 
		SYMBOL_ELEMENT=12, PECULIAR_IDENTIFIER=13;
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
			"MNEMONIC_ESCAPE", "IDENTIFIER", "DELIMITED_IDENTIFIER", "SYMBOL_ELEMENT", 
			"INITIAL", "SPECIAL_INITIAL", "SUBSEQUENT", "SPECIAL_SUBSEQUENT", "EXPLICIT_SIGN", 
			"PECULIAR_IDENTIFIER", "DOT_SUBSEQUENT", "SIGN_SUBSEQUENT", "HEX_SCALAR_VALUE", 
			"HEXDIGIT", "DIGIT", "LETTER", "L_PAREN", "R_PAREN", "VERTICAL_LINE"
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
			"IDENTIFIER", "DELIMITED_IDENTIFIER", "SYMBOL_ELEMENT", "PECULIAR_IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0184\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\5\6a\n\6\3\6\3\6\3\7"+
		"\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16\b"+
		"u\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a6\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b8\n\16\3\16\5\16\u00bb\n\16\3\16\5\16\u00be"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00fa\n\20\3\21\3\21\3\22\3\22\7\22\u0100\n\22\f"+
		"\22\16\22\u0103\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u010f\n\23\f\23\16\23\u0112\13\23\3\23\3\23\7\23\u0116\n\23\f\23"+
		"\16\23\u0119\13\23\3\23\5\23\u011c\n\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\7\26\u0128\n\26\f\26\16\26\u012b\13\26\3\27\3\27"+
		"\7\27\u012f\n\27\f\27\16\27\u0132\13\27\3\27\3\27\3\30\3\30\3\30\5\30"+
		"\u0139\n\30\3\31\3\31\5\31\u013d\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u0144"+
		"\n\33\3\34\3\34\5\34\u0148\n\34\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0150"+
		"\n\36\f\36\16\36\u0153\13\36\3\36\3\36\3\36\3\36\7\36\u0159\n\36\f\36"+
		"\16\36\u015c\13\36\3\36\3\36\3\36\7\36\u0161\n\36\f\36\16\36\u0164\13"+
		"\36\5\36\u0166\n\36\3\37\3\37\5\37\u016a\n\37\3 \3 \3 \5 \u016f\n \3!"+
		"\6!\u0172\n!\r!\16!\u0173\3\"\3\"\5\"\u0178\n\"\3#\3#\3$\5$\u017d\n$\3"+
		"%\3%\3&\3&\3\'\3\'\4hs\2(\3\3\5\2\7\2\t\2\13\4\r\2\17\2\21\2\23\5\25\6"+
		"\27\7\31\b\33\t\35\n\37\2!\2#\13%\2\'\2)\2+\f-\r/\16\61\2\63\2\65\2\67"+
		"\29\2;\17=\2?\2A\2C\2E\2G\2I\2K\2M\2\3\2\16\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\3\2\2\0\4\2$$^^\6\2cdppttvv\4\2^^~~\n\2##&(,,\61\61<<>A`a\u0080\u0080"+
		"\4\2\60\60BB\4\2--//\4\2CHch\3\2\62;\4\2C\\c|\2\u0198\2\3\3\2\2\2\2\13"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2#\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2;\3\2\2"+
		"\2\3O\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\t\\\3\2\2\2\13`\3\2\2\2\rd\3\2\2\2"+
		"\17m\3\2\2\2\21\u0092\3\2\2\2\23\u009b\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7"+
		"\3\2\2\2\31\u00ac\3\2\2\2\33\u00b2\3\2\2\2\35\u00c1\3\2\2\2\37\u00f9\3"+
		"\2\2\2!\u00fb\3\2\2\2#\u00fd\3\2\2\2%\u011b\3\2\2\2\'\u011d\3\2\2\2)\u0122"+
		"\3\2\2\2+\u0125\3\2\2\2-\u012c\3\2\2\2/\u0138\3\2\2\2\61\u013c\3\2\2\2"+
		"\63\u013e\3\2\2\2\65\u0143\3\2\2\2\67\u0147\3\2\2\29\u0149\3\2\2\2;\u0165"+
		"\3\2\2\2=\u0169\3\2\2\2?\u016e\3\2\2\2A\u0171\3\2\2\2C\u0177\3\2\2\2E"+
		"\u0179\3\2\2\2G\u017c\3\2\2\2I\u017e\3\2\2\2K\u0180\3\2\2\2M\u0182\3\2"+
		"\2\2OP\5\7\4\2PQ\3\2\2\2QR\b\2\2\2R\4\3\2\2\2ST\t\2\2\2T\6\3\2\2\2UX\5"+
		"\5\3\2VX\5\t\5\2WU\3\2\2\2WV\3\2\2\2X\b\3\2\2\2YZ\7\17\2\2Z]\7\f\2\2["+
		"]\t\3\2\2\\Y\3\2\2\2\\[\3\2\2\2]\n\3\2\2\2^a\5\r\7\2_a\5\17\b\2`^\3\2"+
		"\2\2`_\3\2\2\2ab\3\2\2\2bc\b\6\2\2c\f\3\2\2\2dh\7=\2\2eg\13\2\2\2fe\3"+
		"\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5\t\5\2l\16"+
		"\3\2\2\2mn\7%\2\2no\7~\2\2os\3\2\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st"+
		"\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7~\2\2wx\7%\2\2x\20\3\2\2\2y"+
		"z\7%\2\2z{\7#\2\2{|\7h\2\2|}\7q\2\2}~\7n\2\2~\177\7f\2\2\177\u0080\7/"+
		"\2\2\u0080\u0081\7e\2\2\u0081\u0082\7c\2\2\u0082\u0083\7u\2\2\u0083\u0093"+
		"\7g\2\2\u0084\u0085\7%\2\2\u0085\u0086\7#\2\2\u0086\u0087\7p\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7/\2\2\u0089\u008a\7h\2\2\u008a\u008b\7q\2\2"+
		"\u008b\u008c\7n\2\2\u008c\u008d\7f\2\2\u008d\u008e\7/\2\2\u008e\u008f"+
		"\7e\2\2\u008f\u0090\7c\2\2\u0090\u0091\7u\2\2\u0091\u0093\7g\2\2\u0092"+
		"y\3\2\2\2\u0092\u0084\3\2\2\2\u0093\22\3\2\2\2\u0094\u0095\7%\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098\7w\2\2\u0098\u009c\7g\2\2"+
		"\u0099\u009a\7%\2\2\u009a\u009c\7v\2\2\u009b\u0094\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\24\3\2\2\2\u009d\u009e\7%\2\2\u009e\u009f\7h\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a6\7g\2\2"+
		"\u00a3\u00a4\7%\2\2\u00a4\u00a6\7h\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\7^\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\5\37\20\2\u00ab\30\3\2\2\2\u00ac\u00ad\7%\2"+
		"\2\u00ad\u00ae\7^\2\2\u00ae\u00af\7z\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\5A!\2\u00b1\32\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\5C\"\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5C\"\2\u00ba\u00b9\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\5C\"\2\u00bd"+
		"\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\5C"+
		"\"\2\u00c0\34\3\2\2\2\u00c1\u00c2\7%\2\2\u00c2\u00c3\7^\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\5!\21\2\u00c5\36\3\2\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7n\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00fa\7o\2\2"+
		"\u00cb\u00cc\7d\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7m\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7c\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3\u00fa\7g\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00fa"+
		"\7g\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7e\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7r\2\2\u00df\u00fa\7g\2\2\u00e0\u00e1\7p\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00fa\7g\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7w\2\2\u00e9\u00ea\7n\2\2\u00ea\u00fa\7n\2\2\u00eb\u00ec\7t\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0\u00fa\7p\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7r\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7e\2\2\u00f5\u00fa\7g\2\2\u00f6\u00f7\7v\2\2"+
		"\u00f7\u00f8\7c\2\2\u00f8\u00fa\7d\2\2\u00f9\u00c6\3\2\2\2\u00f9\u00cb"+
		"\3\2\2\2\u00f9\u00d4\3\2\2\2\u00f9\u00da\3\2\2\2\u00f9\u00e0\3\2\2\2\u00f9"+
		"\u00e7\3\2\2\2\u00f9\u00eb\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f6\3\2"+
		"\2\2\u00fa \3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc\"\3\2\2\2\u00fd\u0101\7"+
		"$\2\2\u00fe\u0100\5%\23\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0105\7$\2\2\u0105$\3\2\2\2\u0106\u011c\n\5\2\2\u0107\u011c"+
		"\5)\25\2\u0108\u0109\7^\2\2\u0109\u011c\7$\2\2\u010a\u010b\7^\2\2\u010b"+
		"\u011c\7^\2\2\u010c\u0110\7^\2\2\u010d\u010f\5\5\3\2\u010e\u010d\3\2\2"+
		"\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0117\5\t\5\2\u0114\u0116\5\5\3\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011c\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\5\'\24\2\u011b"+
		"\u0106\3\2\2\2\u011b\u0107\3\2\2\2\u011b\u0108\3\2\2\2\u011b\u010a\3\2"+
		"\2\2\u011b\u010c\3\2\2\2\u011b\u011a\3\2\2\2\u011c&\3\2\2\2\u011d\u011e"+
		"\7^\2\2\u011e\u011f\7z\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5A!\2\u0121"+
		"(\3\2\2\2\u0122\u0123\7^\2\2\u0123\u0124\t\6\2\2\u0124*\3\2\2\2\u0125"+
		"\u0129\5\61\31\2\u0126\u0128\5\65\33\2\u0127\u0126\3\2\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a,\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u0130\5M\'\2\u012d\u012f\5/\30\2\u012e\u012d\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5M\'\2\u0134.\3\2\2\2\u0135"+
		"\u0139\5\'\24\2\u0136\u0139\5)\25\2\u0137\u0139\n\7\2\2\u0138\u0135\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\60\3\2\2\2\u013a"+
		"\u013d\5G$\2\u013b\u013d\5\63\32\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2"+
		"\2\2\u013d\62\3\2\2\2\u013e\u013f\t\b\2\2\u013f\64\3\2\2\2\u0140\u0144"+
		"\5\61\31\2\u0141\u0144\5E#\2\u0142\u0144\5\67\34\2\u0143\u0140\3\2\2\2"+
		"\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\66\3\2\2\2\u0145\u0148"+
		"\59\35\2\u0146\u0148\t\t\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"8\3\2\2\2\u0149\u014a\t\n\2\2\u014a:\3\2\2\2\u014b\u0166\59\35\2\u014c"+
		"\u014d\59\35\2\u014d\u0151\5? \2\u014e\u0150\5\65\33\2\u014f\u014e\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0166\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\59\35\2\u0155\u0156\7\60"+
		"\2\2\u0156\u015a\5=\37\2\u0157\u0159\5\65\33\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0166\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\60\2\2\u015e\u0162\5=\37\2\u015f"+
		"\u0161\5\65\33\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3"+
		"\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u014b\3\2\2\2\u0165\u014c\3\2\2\2\u0165\u0154\3\2\2\2\u0165\u015d\3\2"+
		"\2\2\u0166<\3\2\2\2\u0167\u016a\5? \2\u0168\u016a\7\60\2\2\u0169\u0167"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a>\3\2\2\2\u016b\u016f\5\61\31\2\u016c"+
		"\u016f\59\35\2\u016d\u016f\7B\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016d\3\2\2\2\u016f@\3\2\2\2\u0170\u0172\5C\"\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"B\3\2\2\2\u0175\u0178\5E#\2\u0176\u0178\t\13\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0176\3\2\2\2\u0178D\3\2\2\2\u0179\u017a\t\f\2\2\u017aF\3\2\2\2\u017b"+
		"\u017d\t\r\2\2\u017c\u017b\3\2\2\2\u017dH\3\2\2\2\u017e\u017f\7*\2\2\u017f"+
		"J\3\2\2\2\u0180\u0181\7+\2\2\u0181L\3\2\2\2\u0182\u0183\7~\2\2\u0183N"+
		"\3\2\2\2\"\2W\\`hs\u0092\u009b\u00a5\u00b7\u00ba\u00bd\u00f9\u0101\u0110"+
		"\u0117\u011b\u0129\u0130\u0138\u013c\u0143\u0147\u0151\u015a\u0162\u0165"+
		"\u0169\u016e\u0173\u0177\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}