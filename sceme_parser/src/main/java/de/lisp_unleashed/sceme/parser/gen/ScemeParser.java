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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WS=9, 
		COMMENT=10, BOOL_TRUE=11, BOOL_FALSE=12, NAMED_CHAR_LITERAL=13, HEX_CHAR_LITERAL=14, 
		UNICODE_CHAR_LITERAL=15, CHAR_LITERAL=16, STRING=17, BYTEVECTOR=18, IDENTIFIER=19, 
		DELIMITED_IDENTIFIER=20, SYMBOL_ELEMENT=21, PECULIAR_IDENTIFIER=22, FIXNUM_2=23, 
		FLONUM_2=24, FIXNUM_8=25, FLONUM_8=26, FIXNUM_10=27, FLONUM_10=28, FIXNUM_16=29, 
		FLONUM_16=30;
	public static final int
		RULE_datum = 0, RULE_simple_datum = 1, RULE_compound_datum = 2, RULE_symbol = 3, 
		RULE_bool = 4, RULE_character = 5, RULE_string = 6, RULE_number = 7, RULE_fixnum = 8, 
		RULE_flonum = 9, RULE_bytevector = 10, RULE_proper_list = 11, RULE_improper_list = 12, 
		RULE_improper_head = 13, RULE_improper_tail = 14, RULE_vector = 15, RULE_abbreviation = 16, 
		RULE_abbrev_prefix = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"datum", "simple_datum", "compound_datum", "symbol", "bool", "character", 
			"string", "number", "fixnum", "flonum", "bytevector", "proper_list", 
			"improper_list", "improper_head", "improper_tail", "vector", "abbreviation", 
			"abbrev_prefix"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "'#('", "'''", "'`'", "','", "',@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"BOOL_TRUE", "BOOL_FALSE", "NAMED_CHAR_LITERAL", "HEX_CHAR_LITERAL", 
			"UNICODE_CHAR_LITERAL", "CHAR_LITERAL", "STRING", "BYTEVECTOR", "IDENTIFIER", 
			"DELIMITED_IDENTIFIER", "SYMBOL_ELEMENT", "PECULIAR_IDENTIFIER", "FIXNUM_2", 
			"FLONUM_2", "FIXNUM_8", "FLONUM_8", "FIXNUM_10", "FLONUM_10", "FIXNUM_16", 
			"FLONUM_16"
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
		public Compound_datumContext compound_datum() {
			return getRuleContext(Compound_datumContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
			case BOOL_FALSE:
			case NAMED_CHAR_LITERAL:
			case HEX_CHAR_LITERAL:
			case UNICODE_CHAR_LITERAL:
			case CHAR_LITERAL:
			case STRING:
			case BYTEVECTOR:
			case IDENTIFIER:
			case DELIMITED_IDENTIFIER:
			case PECULIAR_IDENTIFIER:
			case FIXNUM_2:
			case FLONUM_2:
			case FIXNUM_8:
			case FLONUM_8:
			case FIXNUM_10:
			case FLONUM_10:
			case FIXNUM_16:
			case FLONUM_16:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				simple_datum();
				}
				break;
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				compound_datum();
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
			case BOOL_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				bool();
				}
				break;
			case NAMED_CHAR_LITERAL:
			case HEX_CHAR_LITERAL:
			case UNICODE_CHAR_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				character();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
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
				setState(43);
				number();
				}
				break;
			case BYTEVECTOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				bytevector();
				}
				break;
			case IDENTIFIER:
			case DELIMITED_IDENTIFIER:
			case PECULIAR_IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
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

	public static class Compound_datumContext extends ParserRuleContext {
		public Proper_listContext proper_list() {
			return getRuleContext(Proper_listContext.class,0);
		}
		public Improper_listContext improper_list() {
			return getRuleContext(Improper_listContext.class,0);
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
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				proper_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				improper_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				vector();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				abbreviation();
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
		enterRule(_localctx, 6, RULE_symbol);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new SymbolNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(IDENTIFIER);
				}
				break;
			case DELIMITED_IDENTIFIER:
				_localctx = new SymbolDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(DELIMITED_IDENTIFIER);
				}
				break;
			case PECULIAR_IDENTIFIER:
				_localctx = new SymbolPeculiarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
		enterRule(_localctx, 8, RULE_bool);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(BOOL_TRUE);
				}
				break;
			case BOOL_FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
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
		enterRule(_localctx, 10, RULE_character);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED_CHAR_LITERAL:
				_localctx = new CharacterNamedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(NAMED_CHAR_LITERAL);
				}
				break;
			case HEX_CHAR_LITERAL:
				_localctx = new CharacterHexLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(HEX_CHAR_LITERAL);
				}
				break;
			case UNICODE_CHAR_LITERAL:
				_localctx = new CharacterUnicodeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(UNICODE_CHAR_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterCharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
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
		enterRule(_localctx, 12, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		enterRule(_localctx, 14, RULE_number);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIXNUM_2:
			case FIXNUM_8:
			case FIXNUM_10:
			case FIXNUM_16:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				fixnum();
				}
				break;
			case FLONUM_2:
			case FLONUM_8:
			case FLONUM_10:
			case FLONUM_16:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
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
		enterRule(_localctx, 16, RULE_fixnum);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIXNUM_2:
				_localctx = new FixnumBinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(FIXNUM_2);
				}
				break;
			case FIXNUM_8:
				_localctx = new FixnumOctContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(FIXNUM_8);
				}
				break;
			case FIXNUM_10:
				_localctx = new FixnumDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(FIXNUM_10);
				}
				break;
			case FIXNUM_16:
				_localctx = new FixnumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
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
		enterRule(_localctx, 18, RULE_flonum);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLONUM_2:
				_localctx = new FlonumBinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(FLONUM_2);
				}
				break;
			case FLONUM_8:
				_localctx = new FlonumOctContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(FLONUM_8);
				}
				break;
			case FLONUM_10:
				_localctx = new FlonumDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(FLONUM_10);
				}
				break;
			case FLONUM_16:
				_localctx = new FlonumHexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
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
		enterRule(_localctx, 20, RULE_bytevector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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

	public static class Proper_listContext extends ParserRuleContext {
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public Proper_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proper_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterProper_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitProper_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitProper_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proper_listContext proper_list() throws RecognitionException {
		Proper_listContext _localctx = new Proper_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_proper_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << NAMED_CHAR_LITERAL) | (1L << HEX_CHAR_LITERAL) | (1L << UNICODE_CHAR_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << IDENTIFIER) | (1L << DELIMITED_IDENTIFIER) | (1L << PECULIAR_IDENTIFIER) | (1L << FIXNUM_2) | (1L << FLONUM_2) | (1L << FIXNUM_8) | (1L << FLONUM_8) | (1L << FIXNUM_10) | (1L << FLONUM_10) | (1L << FIXNUM_16) | (1L << FLONUM_16))) != 0)) {
				{
				{
				setState(90);
				datum();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__1);
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

	public static class Improper_listContext extends ParserRuleContext {
		public Improper_headContext improper_head() {
			return getRuleContext(Improper_headContext.class,0);
		}
		public Improper_tailContext improper_tail() {
			return getRuleContext(Improper_tailContext.class,0);
		}
		public Improper_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_improper_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterImproper_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitImproper_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitImproper_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Improper_listContext improper_list() throws RecognitionException {
		Improper_listContext _localctx = new Improper_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_improper_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
			setState(99);
			improper_head();
			setState(100);
			match(T__2);
			setState(101);
			improper_tail();
			setState(102);
			match(T__1);
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

	public static class Improper_headContext extends ParserRuleContext {
		public List<DatumContext> datum() {
			return getRuleContexts(DatumContext.class);
		}
		public DatumContext datum(int i) {
			return getRuleContext(DatumContext.class,i);
		}
		public Improper_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_improper_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterImproper_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitImproper_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitImproper_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Improper_headContext improper_head() throws RecognitionException {
		Improper_headContext _localctx = new Improper_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_improper_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				datum();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << NAMED_CHAR_LITERAL) | (1L << HEX_CHAR_LITERAL) | (1L << UNICODE_CHAR_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << IDENTIFIER) | (1L << DELIMITED_IDENTIFIER) | (1L << PECULIAR_IDENTIFIER) | (1L << FIXNUM_2) | (1L << FLONUM_2) | (1L << FIXNUM_8) | (1L << FLONUM_8) | (1L << FIXNUM_10) | (1L << FLONUM_10) | (1L << FIXNUM_16) | (1L << FLONUM_16))) != 0) );
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

	public static class Improper_tailContext extends ParserRuleContext {
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public Improper_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_improper_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterImproper_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitImproper_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitImproper_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Improper_tailContext improper_tail() throws RecognitionException {
		Improper_tailContext _localctx = new Improper_tailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_improper_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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

	public static class VectorContext extends ParserRuleContext {
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
		enterRule(_localctx, 30, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__3);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << NAMED_CHAR_LITERAL) | (1L << HEX_CHAR_LITERAL) | (1L << UNICODE_CHAR_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << IDENTIFIER) | (1L << DELIMITED_IDENTIFIER) | (1L << PECULIAR_IDENTIFIER) | (1L << FIXNUM_2) | (1L << FLONUM_2) | (1L << FIXNUM_8) | (1L << FLONUM_8) | (1L << FIXNUM_10) | (1L << FLONUM_10) | (1L << FIXNUM_16) | (1L << FLONUM_16))) != 0)) {
				{
				{
				setState(112);
				datum();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__1);
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
		enterRule(_localctx, 32, RULE_abbreviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			abbrev_prefix();
			setState(121);
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
	 
		public Abbrev_prefixContext() { }
		public void copyFrom(Abbrev_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbbrevQuoteContext extends Abbrev_prefixContext {
		public AbbrevQuoteContext(Abbrev_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAbbrevQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAbbrevQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAbbrevQuote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbbrevQuasiQuoteContext extends Abbrev_prefixContext {
		public AbbrevQuasiQuoteContext(Abbrev_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAbbrevQuasiQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAbbrevQuasiQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAbbrevQuasiQuote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbbrevUnquoteContext extends Abbrev_prefixContext {
		public AbbrevUnquoteContext(Abbrev_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAbbrevUnquote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAbbrevUnquote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAbbrevUnquote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbbrevUnquoteSplicingContext extends Abbrev_prefixContext {
		public AbbrevUnquoteSplicingContext(Abbrev_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAbbrevUnquoteSplicing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAbbrevUnquoteSplicing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAbbrevUnquoteSplicing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abbrev_prefixContext abbrev_prefix() throws RecognitionException {
		Abbrev_prefixContext _localctx = new Abbrev_prefixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_abbrev_prefix);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new AbbrevQuoteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new AbbrevQuasiQuoteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new AbbrevUnquoteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new AbbrevUnquoteSplicingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(T__7);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4"+
		"\3\4\3\4\5\4\67\n\4\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\5\6@\n\6\3\7\3\7\3\7"+
		"\3\7\5\7F\n\7\3\b\3\b\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\5\nR\n\n\3\13\3"+
		"\13\3\13\3\13\5\13X\n\13\3\f\3\f\3\r\3\r\7\r^\n\r\f\r\16\ra\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17l\n\17\r\17\16\17m\3\20\3\20"+
		"\3\21\3\21\7\21t\n\21\f\21\16\21w\13\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23\u0082\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\2\2\u008d\2(\3\2\2\2\4\60\3\2\2\2\6\66\3\2\2\2\b;\3"+
		"\2\2\2\n?\3\2\2\2\fE\3\2\2\2\16G\3\2\2\2\20K\3\2\2\2\22Q\3\2\2\2\24W\3"+
		"\2\2\2\26Y\3\2\2\2\30[\3\2\2\2\32d\3\2\2\2\34k\3\2\2\2\36o\3\2\2\2 q\3"+
		"\2\2\2\"z\3\2\2\2$\u0081\3\2\2\2&)\5\4\3\2\')\5\6\4\2(&\3\2\2\2(\'\3\2"+
		"\2\2)\3\3\2\2\2*\61\5\n\6\2+\61\5\f\7\2,\61\5\16\b\2-\61\5\20\t\2.\61"+
		"\5\26\f\2/\61\5\b\5\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2"+
		"\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\67\5\30\r\2\63\67\5\32\16\2\64"+
		"\67\5 \21\2\65\67\5\"\22\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66"+
		"\65\3\2\2\2\67\7\3\2\2\28<\7\25\2\29<\7\26\2\2:<\7\30\2\2;8\3\2\2\2;9"+
		"\3\2\2\2;:\3\2\2\2<\t\3\2\2\2=@\7\r\2\2>@\7\16\2\2?=\3\2\2\2?>\3\2\2\2"+
		"@\13\3\2\2\2AF\7\17\2\2BF\7\20\2\2CF\7\21\2\2DF\7\22\2\2EA\3\2\2\2EB\3"+
		"\2\2\2EC\3\2\2\2ED\3\2\2\2F\r\3\2\2\2GH\7\23\2\2H\17\3\2\2\2IL\5\22\n"+
		"\2JL\5\24\13\2KI\3\2\2\2KJ\3\2\2\2L\21\3\2\2\2MR\7\31\2\2NR\7\33\2\2O"+
		"R\7\35\2\2PR\7\37\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\23\3\2"+
		"\2\2SX\7\32\2\2TX\7\34\2\2UX\7\36\2\2VX\7 \2\2WS\3\2\2\2WT\3\2\2\2WU\3"+
		"\2\2\2WV\3\2\2\2X\25\3\2\2\2YZ\7\24\2\2Z\27\3\2\2\2[_\7\3\2\2\\^\5\2\2"+
		"\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\4"+
		"\2\2c\31\3\2\2\2de\7\3\2\2ef\5\34\17\2fg\7\5\2\2gh\5\36\20\2hi\7\4\2\2"+
		"i\33\3\2\2\2jl\5\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\35\3\2"+
		"\2\2op\5\2\2\2p\37\3\2\2\2qu\7\6\2\2rt\5\2\2\2sr\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\4\2\2y!\3\2\2\2z{\5$\23\2{|\5"+
		"\2\2\2|#\3\2\2\2}\u0082\7\7\2\2~\u0082\7\b\2\2\177\u0082\7\t\2\2\u0080"+
		"\u0082\7\n\2\2\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082%\3\2\2\2\17(\60\66;?EKQW_mu\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}