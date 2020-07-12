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
		UNICODE_CHAR_LITERAL=7, CHAR_LITERAL=8, STRING=9, IDENTIFIER=10, DELIMITED_IDENTIFIER=11, 
		SYMBOL_ELEMENT=12, PECULIAR_IDENTIFIER=13;
	public static final int
		RULE_datum = 0, RULE_symbol = 1, RULE_bool = 2, RULE_character = 3, RULE_string = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"datum", "symbol", "bool", "character", "string"
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
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
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
			case BOOL_FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				bool();
				}
				break;
			case NAMED_CHAR_LITERAL:
			case HEX_CHAR_LITERAL:
			case UNICODE_CHAR_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				character();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				string();
				}
				break;
			case IDENTIFIER:
			case DELIMITED_IDENTIFIER:
			case PECULIAR_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
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
		enterRule(_localctx, 2, RULE_symbol);
		try {
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new SymbolNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(IDENTIFIER);
				}
				break;
			case DELIMITED_IDENTIFIER:
				_localctx = new SymbolDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(DELIMITED_IDENTIFIER);
				}
				break;
			case PECULIAR_IDENTIFIER:
				_localctx = new SymbolPeculiarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
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
		enterRule(_localctx, 4, RULE_bool);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TRUE:
				_localctx = new BoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(BOOL_TRUE);
				}
				break;
			case BOOL_FALSE:
				_localctx = new BoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
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
		enterRule(_localctx, 6, RULE_character);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMED_CHAR_LITERAL:
				_localctx = new CharacterNamedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(NAMED_CHAR_LITERAL);
				}
				break;
			case HEX_CHAR_LITERAL:
				_localctx = new CharacterHexLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(HEX_CHAR_LITERAL);
				}
				break;
			case UNICODE_CHAR_LITERAL:
				_localctx = new CharacterUnicodeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(UNICODE_CHAR_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				_localctx = new CharacterCharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
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
		enterRule(_localctx, 8, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\5\3"+
		"\26\n\3\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2\2\'\2\20\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\b\37\3\2\2\2"+
		"\n!\3\2\2\2\f\21\5\6\4\2\r\21\5\b\5\2\16\21\5\n\6\2\17\21\5\4\3\2\20\f"+
		"\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3\2\2\2\21\3\3\2\2\2\22\26\7"+
		"\f\2\2\23\26\7\r\2\2\24\26\7\17\2\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24"+
		"\3\2\2\2\26\5\3\2\2\2\27\32\7\5\2\2\30\32\7\6\2\2\31\27\3\2\2\2\31\30"+
		"\3\2\2\2\32\7\3\2\2\2\33 \7\7\2\2\34 \7\b\2\2\35 \7\t\2\2\36 \7\n\2\2"+
		"\37\33\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \t\3\2\2\2!\""+
		"\7\13\2\2\"\13\3\2\2\2\6\20\25\31\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}