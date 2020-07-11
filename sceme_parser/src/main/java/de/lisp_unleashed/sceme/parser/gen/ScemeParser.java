// Generated from sceme_parser/src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.parser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScemeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, L_PAREN=9, 
		R_PAREN=10, BOOLEAN=11, CHARACTER=12, STRING=13, BYTEVECTOR=14, NUMBER=15, 
		UINTEGER_10=16, IDENTIFIER=17, LINE_COMMENT=18, WS=19;
	public static final int
		RULE_datum = 0, RULE_simple_datum = 1, RULE_compound_datum = 2, RULE_list = 3, 
		RULE_vector = 4, RULE_abbreviation = 5, RULE_abbrev_prefix = 6, RULE_label = 7, 
		RULE_symbol = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"datum", "simple_datum", "compound_datum", "list", "vector", "abbreviation", 
			"abbrev_prefix", "label", "symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'#'", "'.'", "'#('", "'''", "'`'", "','", "',@'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "L_PAREN", "R_PAREN", 
			"BOOLEAN", "CHARACTER", "STRING", "BYTEVECTOR", "NUMBER", "UINTEGER_10", 
			"IDENTIFIER", "LINE_COMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "Sceme.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScemeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DatumContext extends ParserRuleContext {
		public Compound_datumContext compound_datum() {
			return getRuleContext(Compound_datumContext.class,0);
		}
		public Simple_datumContext simple_datum() {
			return getRuleContext(Simple_datumContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public DatumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterDatum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitDatum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitDatum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatumContext datum() throws RecognitionException {
		DatumContext _localctx = new DatumContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_datum);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				compound_datum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				simple_datum();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				label();
				setState(21);
				match(T__0);
				setState(22);
				datum();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				label();
				setState(25);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_datumContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ScemeParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(ScemeParser.NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(ScemeParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(ScemeParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScemeParser.IDENTIFIER, 0); }
		public TerminalNode BYTEVECTOR() { return getToken(ScemeParser.BYTEVECTOR, 0); }
		public Simple_datumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_datum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSimple_datum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSimple_datum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSimple_datum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_datumContext simple_datum() throws RecognitionException {
		Simple_datumContext _localctx = new Simple_datumContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simple_datum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_datumContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AbbreviationContext abbreviation() {
			return getRuleContext(AbbreviationContext.class,0);
		}
		public Compound_datumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_datum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCompound_datum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCompound_datum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCompound_datum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_datumContext compound_datum() throws RecognitionException {
		Compound_datumContext _localctx = new Compound_datumContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compound_datum);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				list();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				vector();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				abbreviation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(L_PAREN);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(37);
					datum();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(L_PAREN);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					datum();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
				setState(50);
				match(T__2);
				setState(51);
				datum();
				setState(52);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(57);
				datum();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbreviationContext extends ParserRuleContext {
		public Abbrev_prefixContext abbrev_prefix() {
			return getRuleContext(Abbrev_prefixContext.class,0);
		}
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public AbbreviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbreviation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAbbreviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAbbreviation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAbbreviation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbreviationContext abbreviation() throws RecognitionException {
		AbbreviationContext _localctx = new AbbreviationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_abbreviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			abbrev_prefix();
			setState(66);
			datum();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abbrev_prefixContext extends ParserRuleContext {
		public Abbrev_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrev_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAbbrev_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAbbrev_prefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAbbrev_prefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abbrev_prefixContext abbrev_prefix() throws RecognitionException {
		Abbrev_prefixContext _localctx = new Abbrev_prefixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_abbrev_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode UINTEGER_10() { return getToken(ScemeParser.UINTEGER_10, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__1);
			setState(71);
			match(UINTEGER_10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScemeParser.IDENTIFIER, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\4\3\4\3\4\5\4%\n\4\3\5\3"+
		"\5\7\5)\n\5\f\5\16\5,\13\5\3\5\3\5\3\5\6\5\61\n\5\r\5\16\5\62\3\5\3\5"+
		"\3\5\3\5\5\59\n\5\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\4\2\r"+
		"\21\23\23\3\2\7\n\2M\2\35\3\2\2\2\4\37\3\2\2\2\6$\3\2\2\2\b8\3\2\2\2\n"+
		":\3\2\2\2\fC\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22K\3\2\2\2\24\36\5\6\4\2"+
		"\25\36\5\4\3\2\26\27\5\20\t\2\27\30\7\3\2\2\30\31\5\2\2\2\31\36\3\2\2"+
		"\2\32\33\5\20\t\2\33\34\7\4\2\2\34\36\3\2\2\2\35\24\3\2\2\2\35\25\3\2"+
		"\2\2\35\26\3\2\2\2\35\32\3\2\2\2\36\3\3\2\2\2\37 \t\2\2\2 \5\3\2\2\2!"+
		"%\5\b\5\2\"%\5\n\6\2#%\5\f\7\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2"+
		"\2&*\7\13\2\2\')\5\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3"+
		"\2\2\2,*\3\2\2\2-9\7\f\2\2.\60\7\13\2\2/\61\5\2\2\2\60/\3\2\2\2\61\62"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\5\2\2\65\66"+
		"\5\2\2\2\66\67\7\f\2\2\679\3\2\2\28&\3\2\2\28.\3\2\2\29\t\3\2\2\2:>\7"+
		"\6\2\2;=\5\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"+
		"\2\2\2AB\7\f\2\2B\13\3\2\2\2CD\5\16\b\2DE\5\2\2\2E\r\3\2\2\2FG\t\3\2\2"+
		"G\17\3\2\2\2HI\7\4\2\2IJ\7\22\2\2J\21\3\2\2\2KL\7\23\2\2L\23\3\2\2\2\b"+
		"\35$*\628>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}