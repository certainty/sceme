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
		WS=1, COMMENT=2, BOOL_TRUE=3, BOOL_FALSE=4, NAMED_CHAR_LITERAL=5, HEX_CHAR_LITERAL=6, 
		UNICODE_CHAR_LITERAL=7, CHAR_LITERAL=8, STRING=9, BYTEVECTOR=10, IDENTIFIER=11, 
		DELIMITED_IDENTIFIER=12, SYMBOL_ELEMENT=13, PECULIAR_IDENTIFIER=14, FIXNUM_2=15, 
		FLONUM_2=16, FIXNUM_8=17, FLONUM_8=18, FIXNUM_10=19, FLONUM_10=20, FIXNUM_16=21, 
		FLONUM_16=22;
	public static final int
		RULE_datum = 0, RULE_simple_datum = 1, RULE_symbol = 2, RULE_bool = 3, 
		RULE_character = 4, RULE_string = 5, RULE_number = 6, RULE_fixnum = 7, 
		RULE_flonum = 8, RULE_bytevector = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"datum", "simple_datum", "symbol", "bool", "character", "string", "number", 
			"fixnum", "flonum", "bytevector"
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
			"BYTEVECTOR", "IDENTIFIER", "DELIMITED_IDENTIFIER", "SYMBOL_ELEMENT", 
			"PECULIAR_IDENTIFIER", "FIXNUM_2", "FLONUM_2", "FIXNUM_8", "FLONUM_8", 
			"FIXNUM_10", "FLONUM_10", "FIXNUM_16", "FLONUM_16"
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
		public Simple_datumContext simple_datum() {
			return getRuleContext(Simple_datumContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			simple_datum();
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BytevectorContext bytevector() {
			return getRuleContext(BytevectorContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
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
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
			case BOOL_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				bool();
				}
				break;
			case NAMED_CHAR_LITERAL:
			case HEX_CHAR_LITERAL:
			case UNICODE_CHAR_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				character();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				string();
				}
				break;
			case FIXNUM_2:
			case FLONUM_2:
			case FIXNUM_8:
			case FLONUM_8:
			case FIXNUM_10:
			case FLONUM_10:
			case FIXNUM_16:
			case FLONUM_16:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				number();
				}
				break;
			case BYTEVECTOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				bytevector();
				}
				break;
			case IDENTIFIER:
			case DELIMITED_IDENTIFIER:
			case PECULIAR_IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				symbol();
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

	public static class SymbolContext extends ParserRuleContext {
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	 
		public SymbolContext() { }
		public void copyFrom(SymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SymbolPeculiarContext extends SymbolContext {
		public TerminalNode PECULIAR_IDENTIFIER() { return getToken(ScemeParser.PECULIAR_IDENTIFIER, 0); }
		public SymbolPeculiarContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSymbolPeculiar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSymbolPeculiar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSymbolPeculiar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolNormalContext extends SymbolContext {
		public TerminalNode IDENTIFIER() { return getToken(ScemeParser.IDENTIFIER, 0); }
		public SymbolNormalContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSymbolNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSymbolNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSymbolNormal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolDelimitedContext extends SymbolContext {
		public TerminalNode DELIMITED_IDENTIFIER() { return getToken(ScemeParser.DELIMITED_IDENTIFIER, 0); }
		public SymbolDelimitedContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSymbolDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSymbolDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSymbolDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_symbol);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new SymbolNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(IDENTIFIER);
				}
				break;
			case DELIMITED_IDENTIFIER:
				_localctx = new SymbolDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(DELIMITED_IDENTIFIER);
				}
				break;
			case PECULIAR_IDENTIFIER:
				_localctx = new SymbolPeculiarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(PECULIAR_IDENTIFIER);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTrueContext extends BoolContext {
		public TerminalNode BOOL_TRUE() { return getToken(ScemeParser.BOOL_TRUE, 0); }
		public BoolTrueContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends BoolContext {
		public TerminalNode BOOL_FALSE() { return getToken(ScemeParser.BOOL_FALSE, 0); }
		public BoolFalseContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bool);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(BOOL_TRUE);
				}
				break;
			case BOOL_FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(BOOL_FALSE);
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

	public static class CharacterContext extends ParserRuleContext {
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
	 
		public CharacterContext() { }
		public void copyFrom(CharacterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharacterNamedContext extends CharacterContext {
		public TerminalNode NAMED_CHAR_LITERAL() { return getToken(ScemeParser.NAMED_CHAR_LITERAL, 0); }
		public CharacterNamedContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCharacterNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCharacterNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCharacterNamed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterCharLiteralContext extends CharacterContext {
		public TerminalNode CHAR_LITERAL() { return getToken(ScemeParser.CHAR_LITERAL, 0); }
		public CharacterCharLiteralContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCharacterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCharacterCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCharacterCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterUnicodeLiteralContext extends CharacterContext {
		public TerminalNode UNICODE_CHAR_LITERAL() { return getToken(ScemeParser.UNICODE_CHAR_LITERAL, 0); }
		public CharacterUnicodeLiteralContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCharacterUnicodeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCharacterUnicodeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCharacterUnicodeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharacterHexLiteralContext extends CharacterContext {
		public TerminalNode HEX_CHAR_LITERAL() { return getToken(ScemeParser.HEX_CHAR_LITERAL, 0); }
		public CharacterHexLiteralContext(CharacterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCharacterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCharacterHexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCharacterHexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_character);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED_CHAR_LITERAL:
				_localctx = new CharacterNamedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(NAMED_CHAR_LITERAL);
				}
				break;
			case HEX_CHAR_LITERAL:
				_localctx = new CharacterHexLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(HEX_CHAR_LITERAL);
				}
				break;
			case UNICODE_CHAR_LITERAL:
				_localctx = new CharacterUnicodeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(UNICODE_CHAR_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterCharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(CHAR_LITERAL);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ScemeParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(STRING);
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

	public static class NumberContext extends ParserRuleContext {
		public FixnumContext fixnum() {
			return getRuleContext(FixnumContext.class,0);
		}
		public FlonumContext flonum() {
			return getRuleContext(FlonumContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIXNUM_2:
			case FIXNUM_8:
			case FIXNUM_10:
			case FIXNUM_16:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				fixnum();
				}
				break;
			case FLONUM_2:
			case FLONUM_8:
			case FLONUM_10:
			case FLONUM_16:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				flonum();
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

	public static class FixnumContext extends ParserRuleContext {
		public FixnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixnum; }
	 
		public FixnumContext() { }
		public void copyFrom(FixnumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FixnumDecContext extends FixnumContext {
		public TerminalNode FIXNUM_10() { return getToken(ScemeParser.FIXNUM_10, 0); }
		public FixnumDecContext(FixnumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFixnumDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFixnumDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFixnumDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FixnumBinContext extends FixnumContext {
		public TerminalNode FIXNUM_2() { return getToken(ScemeParser.FIXNUM_2, 0); }
		public FixnumBinContext(FixnumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFixnumBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFixnumBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFixnumBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FixnumHexContext extends FixnumContext {
		public TerminalNode FIXNUM_16() { return getToken(ScemeParser.FIXNUM_16, 0); }
		public FixnumHexContext(FixnumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFixnumHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFixnumHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFixnumHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FixnumOctContext extends FixnumContext {
		public TerminalNode FIXNUM_8() { return getToken(ScemeParser.FIXNUM_8, 0); }
		public FixnumOctContext(FixnumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFixnumOct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFixnumOct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFixnumOct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixnumContext fixnum() throws RecognitionException {
		FixnumContext _localctx = new FixnumContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fixnum);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIXNUM_2:
				_localctx = new FixnumBinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(FIXNUM_2);
				}
				break;
			case FIXNUM_8:
				_localctx = new FixnumOctContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(FIXNUM_8);
				}
				break;
			case FIXNUM_10:
				_localctx = new FixnumDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(FIXNUM_10);
				}
				break;
			case FIXNUM_16:
				_localctx = new FixnumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(FIXNUM_16);
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

	public static class FlonumContext extends ParserRuleContext {
		public FlonumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flonum; }
	 
		public FlonumContext() { }
		public void copyFrom(FlonumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FlonumHexContext extends FlonumContext {
		public TerminalNode FLONUM_16() { return getToken(ScemeParser.FLONUM_16, 0); }
		public FlonumHexContext(FlonumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFlonumHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFlonumHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFlonumHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlonumBinContext extends FlonumContext {
		public TerminalNode FLONUM_2() { return getToken(ScemeParser.FLONUM_2, 0); }
		public FlonumBinContext(FlonumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFlonumBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFlonumBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFlonumBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlonumDecContext extends FlonumContext {
		public TerminalNode FLONUM_10() { return getToken(ScemeParser.FLONUM_10, 0); }
		public FlonumDecContext(FlonumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFlonumDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFlonumDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFlonumDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlonumOctContext extends FlonumContext {
		public TerminalNode FLONUM_8() { return getToken(ScemeParser.FLONUM_8, 0); }
		public FlonumOctContext(FlonumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFlonumOct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFlonumOct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFlonumOct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlonumContext flonum() throws RecognitionException {
		FlonumContext _localctx = new FlonumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flonum);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLONUM_2:
				_localctx = new FlonumBinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(FLONUM_2);
				}
				break;
			case FLONUM_8:
				_localctx = new FlonumOctContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(FLONUM_8);
				}
				break;
			case FLONUM_10:
				_localctx = new FlonumDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(FLONUM_10);
				}
				break;
			case FLONUM_16:
				_localctx = new FlonumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(FLONUM_16);
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

	public static class BytevectorContext extends ParserRuleContext {
		public TerminalNode BYTEVECTOR() { return getToken(ScemeParser.BYTEVECTOR, 0); }
		public BytevectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytevector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterBytevector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitBytevector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitBytevector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BytevectorContext bytevector() throws RecognitionException {
		BytevectorContext _localctx = new BytevectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bytevector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(BYTEVECTOR);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\5\4$\n\4\3\5\3\5"+
		"\5\5(\n\5\3\6\3\6\3\6\3\6\5\6.\n\6\3\7\3\7\3\b\3\b\5\b\64\n\b\3\t\3\t"+
		"\3\t\3\t\5\t:\n\t\3\n\3\n\3\n\3\n\5\n@\n\n\3\13\3\13\3\13\2\2\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\2\2K\2\26\3\2\2\2\4\36\3\2\2\2\6#\3\2\2\2\b\'\3\2"+
		"\2\2\n-\3\2\2\2\f/\3\2\2\2\16\63\3\2\2\2\209\3\2\2\2\22?\3\2\2\2\24A\3"+
		"\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\37\5\b\5\2\31\37\5\n\6\2\32\37\5"+
		"\f\7\2\33\37\5\16\b\2\34\37\5\24\13\2\35\37\5\6\4\2\36\30\3\2\2\2\36\31"+
		"\3\2\2\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5"+
		"\3\2\2\2 $\7\r\2\2!$\7\16\2\2\"$\7\20\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2"+
		"\2$\7\3\2\2\2%(\7\5\2\2&(\7\6\2\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2\2\2).\7"+
		"\7\2\2*.\7\b\2\2+.\7\t\2\2,.\7\n\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3"+
		"\2\2\2.\13\3\2\2\2/\60\7\13\2\2\60\r\3\2\2\2\61\64\5\20\t\2\62\64\5\22"+
		"\n\2\63\61\3\2\2\2\63\62\3\2\2\2\64\17\3\2\2\2\65:\7\21\2\2\66:\7\23\2"+
		"\2\67:\7\25\2\28:\7\27\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2"+
		"\2:\21\3\2\2\2;@\7\22\2\2<@\7\24\2\2=@\7\26\2\2>@\7\30\2\2?;\3\2\2\2?"+
		"<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\23\3\2\2\2AB\7\f\2\2B\25\3\2\2\2\t\36#"+
		"\'-\639?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}