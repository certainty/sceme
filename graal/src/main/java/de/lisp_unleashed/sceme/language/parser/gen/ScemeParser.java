// Generated from src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.language.parser.gen;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, L_PAREN=17, 
		R_PAREN=18, BOOLEAN=19, CHARACTER=20, STRING=21, BYTEVECTOR=22, NUMBER=23, 
		UINTEGER_10=24, IDENTIFIER=25, LINE_COMMENT=26, WS=27;
	public static final int
		RULE_program = 0, RULE_command_or_definition = 1, RULE_command = 2, RULE_definition = 3, 
		RULE_def_formals = 4, RULE_constructor = 5, RULE_field_spec = 6, RULE_field_name = 7, 
		RULE_accessor = 8, RULE_mutator = 9, RULE_expression = 10, RULE_identifier = 11, 
		RULE_literal = 12, RULE_self_evaluating = 13, RULE_quotation = 14, RULE_procedure_call = 15, 
		RULE_operator = 16, RULE_operand = 17, RULE_lambda_expression = 18, RULE_formals = 19, 
		RULE_body = 20, RULE_sequence = 21, RULE_conditional = 22, RULE_test = 23, 
		RULE_consequent = 24, RULE_alternate = 25, RULE_assignment = 26, RULE_datum = 27, 
		RULE_simple_datum = 28, RULE_compound_datum = 29, RULE_list = 30, RULE_vector = 31, 
		RULE_abbreviation = 32, RULE_abbrev_prefix = 33, RULE_label = 34, RULE_symbol = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command_or_definition", "command", "definition", "def_formals", 
			"constructor", "field_spec", "field_name", "accessor", "mutator", "expression", 
			"identifier", "literal", "self_evaluating", "quotation", "procedure_call", 
			"operator", "operand", "lambda_expression", "formals", "body", "sequence", 
			"conditional", "test", "consequent", "alternate", "assignment", "datum", 
			"simple_datum", "compound_datum", "list", "vector", "abbreviation", "abbrev_prefix", 
			"label", "symbol"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'define'", "'defined-values'", "'defined-record-type'", 
			"'.'", "'''", "'quote'", "'lambda'", "'if'", "'set!'", "'='", "'#'", 
			"'#('", "'`'", "','", "',@'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "L_PAREN", "R_PAREN", "BOOLEAN", "CHARACTER", 
			"STRING", "BYTEVECTOR", "NUMBER", "UINTEGER_10", "IDENTIFIER", "LINE_COMMENT", 
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

	public static class ProgramContext extends ParserRuleContext {
		public List<Command_or_definitionContext> command_or_definition() {
			return getRuleContexts(Command_or_definitionContext.class);
		}
		public Command_or_definitionContext command_or_definition(int i) {
			return getRuleContext(Command_or_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				command_or_definition();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__12) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
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

	public static class Command_or_definitionContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public List<Command_or_definitionContext> command_or_definition() {
			return getRuleContexts(Command_or_definitionContext.class);
		}
		public Command_or_definitionContext command_or_definition(int i) {
			return getRuleContext(Command_or_definitionContext.class,i);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_or_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_or_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCommand_or_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCommand_or_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCommand_or_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_or_definitionContext command_or_definition() throws RecognitionException {
		Command_or_definitionContext _localctx = new Command_or_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command_or_definition);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(L_PAREN);
				setState(78);
				match(T__0);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					command_or_definition();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__12) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
				setState(84);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				command();
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

	public static class CommandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			expression();
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<TerminalNode> L_PAREN() { return getTokens(ScemeParser.L_PAREN); }
		public TerminalNode L_PAREN(int i) {
			return getToken(ScemeParser.L_PAREN, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> R_PAREN() { return getTokens(ScemeParser.R_PAREN); }
		public TerminalNode R_PAREN(int i) {
			return getToken(ScemeParser.R_PAREN, i);
		}
		public Def_formalsContext def_formals() {
			return getRuleContext(Def_formalsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<Field_specContext> field_spec() {
			return getRuleContexts(Field_specContext.class);
		}
		public Field_specContext field_spec(int i) {
			return getRuleContext(Field_specContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(L_PAREN);
				setState(93);
				match(T__1);
				setState(94);
				identifier();
				setState(95);
				expression();
				setState(96);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(L_PAREN);
				setState(99);
				match(T__1);
				setState(100);
				match(L_PAREN);
				setState(101);
				identifier();
				setState(102);
				def_formals();
				setState(103);
				match(R_PAREN);
				setState(104);
				body();
				setState(105);
				match(R_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(L_PAREN);
				setState(108);
				match(T__2);
				setState(109);
				formals();
				setState(110);
				body();
				setState(111);
				match(R_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(L_PAREN);
				setState(114);
				match(T__3);
				setState(115);
				identifier();
				setState(116);
				constructor();
				setState(117);
				identifier();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L_PAREN) {
					{
					{
					setState(118);
					field_spec();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(R_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(L_PAREN);
				setState(127);
				match(T__0);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L_PAREN) {
					{
					{
					setState(128);
					definition();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
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

	public static class Def_formalsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Def_formalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterDef_formals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitDef_formals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitDef_formals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_formalsContext def_formals() throws RecognitionException {
		Def_formalsContext _localctx = new Def_formalsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_formals);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(137);
					identifier();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__4);
				setState(144);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(145);
					identifier();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public List<Field_nameContext> field_name() {
			return getRuleContexts(Field_nameContext.class);
		}
		public Field_nameContext field_name(int i) {
			return getRuleContext(Field_nameContext.class,i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(L_PAREN);
			setState(154);
			identifier();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(155);
				field_name();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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

	public static class Field_specContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public Field_nameContext field_name() {
			return getRuleContext(Field_nameContext.class,0);
		}
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public MutatorContext mutator() {
			return getRuleContext(MutatorContext.class,0);
		}
		public Field_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterField_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitField_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitField_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_specContext field_spec() throws RecognitionException {
		Field_specContext _localctx = new Field_specContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_spec);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(L_PAREN);
				setState(164);
				field_name();
				setState(165);
				accessor();
				setState(166);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(L_PAREN);
				setState(169);
				field_name();
				setState(170);
				accessor();
				setState(171);
				mutator();
				setState(172);
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

	public static class Field_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Field_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterField_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitField_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitField_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_nameContext field_name() throws RecognitionException {
		Field_nameContext _localctx = new Field_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			identifier();
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

	public static class AccessorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			identifier();
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

	public static class MutatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterMutator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitMutator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitMutator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutatorContext mutator() throws RecognitionException {
		MutatorContext _localctx = new MutatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mutator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			identifier();
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

	public static class ExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Procedure_callContext procedure_call() {
			return getRuleContext(Procedure_callContext.class,0);
		}
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				procedure_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				lambda_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				assignment();
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

	public static class IdentifierContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			symbol();
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

	public static class LiteralContext extends ParserRuleContext {
		public QuotationContext quotation() {
			return getRuleContext(QuotationContext.class,0);
		}
		public Self_evaluatingContext self_evaluating() {
			return getRuleContext(Self_evaluatingContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				quotation();
				}
				break;
			case T__12:
			case BOOLEAN:
			case CHARACTER:
			case STRING:
			case BYTEVECTOR:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				self_evaluating();
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

	public static class Self_evaluatingContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ScemeParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(ScemeParser.NUMBER, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(ScemeParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(ScemeParser.STRING, 0); }
		public TerminalNode BYTEVECTOR() { return getToken(ScemeParser.BYTEVECTOR, 0); }
		public Self_evaluatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_evaluating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSelf_evaluating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSelf_evaluating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSelf_evaluating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_evaluatingContext self_evaluating() throws RecognitionException {
		Self_evaluatingContext _localctx = new Self_evaluatingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_self_evaluating);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(BOOLEAN);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(NUMBER);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				vector();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(CHARACTER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(STRING);
				}
				break;
			case BYTEVECTOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(BYTEVECTOR);
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

	public static class QuotationContext extends ParserRuleContext {
		public DatumContext datum() {
			return getRuleContext(DatumContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public QuotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterQuotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitQuotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitQuotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotationContext quotation() throws RecognitionException {
		QuotationContext _localctx = new QuotationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quotation);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__5);
				setState(205);
				datum();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(L_PAREN);
				setState(207);
				match(T__6);
				setState(208);
				datum();
				setState(209);
				match(R_PAREN);
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

	public static class Procedure_callContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public Procedure_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterProcedure_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitProcedure_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitProcedure_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_callContext procedure_call() throws RecognitionException {
		Procedure_callContext _localctx = new Procedure_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedure_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(L_PAREN);
			setState(214);
			operator();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__12) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(215);
				operand();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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

	public static class OperatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			expression();
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

	public static class OperandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expression();
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

	public static class Lambda_expressionContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitLambda_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitLambda_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lambda_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(L_PAREN);
			setState(228);
			match(T__7);
			setState(229);
			formals();
			setState(230);
			body();
			setState(231);
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

	public static class FormalsContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ScemeParser.IDENTIFIER, 0); }
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitFormals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitFormals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formals);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(L_PAREN);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(234);
					identifier();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(L_PAREN);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					identifier();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(247);
				match(T__4);
				setState(248);
				identifier();
				setState(249);
				match(R_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(IDENTIFIER);
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

	public static class BodyContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					definition();
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(260);
			sequence();
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

	public static class SequenceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					command();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(268);
			expression();
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

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public ConsequentContext consequent() {
			return getRuleContext(ConsequentContext.class,0);
		}
		public AlternateContext alternate() {
			return getRuleContext(AlternateContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(L_PAREN);
			setState(271);
			match(T__8);
			setState(272);
			test();
			setState(273);
			consequent();
			setState(274);
			alternate();
			setState(275);
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

	public static class TestContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expression();
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

	public static class ConsequentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConsequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterConsequent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitConsequent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitConsequent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsequentContext consequent() throws RecognitionException {
		ConsequentContext _localctx = new ConsequentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_consequent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expression();
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

	public static class AlternateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AlternateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAlternate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAlternate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAlternate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternateContext alternate() throws RecognitionException {
		AlternateContext _localctx = new AlternateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alternate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expression();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(ScemeParser.L_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(ScemeParser.R_PAREN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScemeListener ) ((ScemeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScemeVisitor ) return ((ScemeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(L_PAREN);
			setState(284);
			match(T__9);
			setState(285);
			identifier();
			setState(286);
			expression();
			setState(287);
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
		enterRule(_localctx, 54, RULE_datum);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				compound_datum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				simple_datum();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				label();
				setState(292);
				match(T__10);
				setState(293);
				datum();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				label();
				setState(296);
				match(T__11);
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
		enterRule(_localctx, 56, RULE_simple_datum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 58, RULE_compound_datum);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				list();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				vector();
				}
				break;
			case T__5:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
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
		enterRule(_localctx, 60, RULE_list);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(L_PAREN);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(308);
					datum();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(L_PAREN);
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					datum();
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0) );
				setState(321);
				match(T__4);
				setState(322);
				datum();
				setState(323);
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
		enterRule(_localctx, 62, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__12);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << L_PAREN) | (1L << BOOLEAN) | (1L << CHARACTER) | (1L << STRING) | (1L << BYTEVECTOR) | (1L << NUMBER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(328);
				datum();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
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
		enterRule(_localctx, 64, RULE_abbreviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			abbrev_prefix();
			setState(337);
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
		enterRule(_localctx, 66, RULE_abbrev_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__11);
			setState(342);
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
		enterRule(_localctx, 70, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u015d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2L\n\2\r\2\16\2M\3\3\3\3\3\3\6\3S"+
		"\n\3\r\3\16\3T\3\3\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\5\3\5\3\5\3\5\3\5\7\5\u0084"+
		"\n\5\f\5\16\5\u0087\13\5\3\5\5\5\u008a\n\5\3\6\7\6\u008d\n\6\f\6\16\6"+
		"\u0090\13\6\3\6\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\5\6\u009a\n"+
		"\6\3\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bf\n\f\3\r\3\r\3\16\3\16\5\16\u00c5\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d6\n\20\3\21\3\21\3\21\7\21\u00db\n\21\f\21\16"+
		"\21\u00de\13\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\7\25\u00ee\n\25\f\25\16\25\u00f1\13\25\3\25\3\25\3\25"+
		"\6\25\u00f6\n\25\r\25\16\25\u00f7\3\25\3\25\3\25\3\25\3\25\5\25\u00ff"+
		"\n\25\3\26\7\26\u0102\n\26\f\26\16\26\u0105\13\26\3\26\3\26\3\27\7\27"+
		"\u010a\n\27\f\27\16\27\u010d\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u012d\n\35\3\36\3\36"+
		"\3\37\3\37\3\37\5\37\u0134\n\37\3 \3 \7 \u0138\n \f \16 \u013b\13 \3 "+
		"\3 \3 \6 \u0140\n \r \16 \u0141\3 \3 \3 \3 \5 \u0148\n \3!\3!\7!\u014c"+
		"\n!\f!\16!\u014f\13!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\2\2&\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2"+
		"\4\4\2\25\31\33\33\4\2\b\b\20\22\2\u0163\2K\3\2\2\2\4Z\3\2\2\2\6\\\3\2"+
		"\2\2\b\u0089\3\2\2\2\n\u0099\3\2\2\2\f\u009b\3\2\2\2\16\u00b0\3\2\2\2"+
		"\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00b6\3\2\2\2\26\u00be\3\2\2\2\30"+
		"\u00c0\3\2\2\2\32\u00c4\3\2\2\2\34\u00cc\3\2\2\2\36\u00d5\3\2\2\2 \u00d7"+
		"\3\2\2\2\"\u00e1\3\2\2\2$\u00e3\3\2\2\2&\u00e5\3\2\2\2(\u00fe\3\2\2\2"+
		"*\u0103\3\2\2\2,\u010b\3\2\2\2.\u0110\3\2\2\2\60\u0117\3\2\2\2\62\u0119"+
		"\3\2\2\2\64\u011b\3\2\2\2\66\u011d\3\2\2\28\u012c\3\2\2\2:\u012e\3\2\2"+
		"\2<\u0133\3\2\2\2>\u0147\3\2\2\2@\u0149\3\2\2\2B\u0152\3\2\2\2D\u0155"+
		"\3\2\2\2F\u0157\3\2\2\2H\u015a\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2N\3\3\2\2\2OP\7\23\2\2PR\7\3\2\2QS\5\4\3\2RQ\3\2\2"+
		"\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\24\2\2W[\3\2\2\2X[\5\b"+
		"\5\2Y[\5\6\4\2ZO\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\5\3\2\2\2\\]\5\26\f\2]\7"+
		"\3\2\2\2^_\7\23\2\2_`\7\4\2\2`a\5\30\r\2ab\5\26\f\2bc\7\24\2\2c\u008a"+
		"\3\2\2\2de\7\23\2\2ef\7\4\2\2fg\7\23\2\2gh\5\30\r\2hi\5\n\6\2ij\7\24\2"+
		"\2jk\5*\26\2kl\7\24\2\2l\u008a\3\2\2\2mn\7\23\2\2no\7\5\2\2op\5(\25\2"+
		"pq\5*\26\2qr\7\24\2\2r\u008a\3\2\2\2st\7\23\2\2tu\7\6\2\2uv\5\30\r\2v"+
		"w\5\f\7\2w{\5\30\r\2xz\5\16\b\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\177\7\24\2\2\177\u008a\3\2\2\2\u0080\u0081\7\23"+
		"\2\2\u0081\u0085\7\3\2\2\u0082\u0084\5\b\5\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\24\2\2\u0089^\3\2\2\2\u0089d\3"+
		"\2\2\2\u0089m\3\2\2\2\u0089s\3\2\2\2\u0089\u0080\3\2\2\2\u008a\t\3\2\2"+
		"\2\u008b\u008d\5\30\r\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\7\2\2\u0092\u009a\5\30\r\2\u0093\u0095\5\30\r\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u008e\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u009a\13\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u00a0\5\30"+
		"\r\2\u009d\u009f\5\20\t\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\24\2\2\u00a4\r\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7"+
		"\5\20\t\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\7\24\2\2\u00a9\u00b1\3\2\2"+
		"\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\5\22\n\2\u00ad"+
		"\u00ae\5\24\13\2\u00ae\u00af\7\24\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a5"+
		"\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b1\17\3\2\2\2\u00b2\u00b3\5\30\r\2\u00b3"+
		"\21\3\2\2\2\u00b4\u00b5\5\30\r\2\u00b5\23\3\2\2\2\u00b6\u00b7\5\30\r\2"+
		"\u00b7\25\3\2\2\2\u00b8\u00bf\5\30\r\2\u00b9\u00bf\5\32\16\2\u00ba\u00bf"+
		"\5.\30\2\u00bb\u00bf\5 \21\2\u00bc\u00bf\5&\24\2\u00bd\u00bf\5\66\34\2"+
		"\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\27\3\2\2\2\u00c0"+
		"\u00c1\5H%\2\u00c1\31\3\2\2\2\u00c2\u00c5\5\36\20\2\u00c3\u00c5\5\34\17"+
		"\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00cd"+
		"\7\25\2\2\u00c7\u00cd\7\31\2\2\u00c8\u00cd\5@!\2\u00c9\u00cd\7\26\2\2"+
		"\u00ca\u00cd\7\27\2\2\u00cb\u00cd\7\30\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7"+
		"\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d6\58\35"+
		"\2\u00d0\u00d1\7\23\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\58\35\2\u00d3"+
		"\u00d4\7\24\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d0\3"+
		"\2\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00dc\5\"\22\2\u00d9"+
		"\u00db\5$\23\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7\24\2\2\u00e0!\3\2\2\2\u00e1\u00e2\5\26\f\2\u00e2#\3\2\2\2\u00e3"+
		"\u00e4\5\26\f\2\u00e4%\3\2\2\2\u00e5\u00e6\7\23\2\2\u00e6\u00e7\7\n\2"+
		"\2\u00e7\u00e8\5(\25\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7\24\2\2\u00ea"+
		"\'\3\2\2\2\u00eb\u00ef\7\23\2\2\u00ec\u00ee\5\30\r\2\u00ed\u00ec\3\2\2"+
		"\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00ff\7\24\2\2\u00f3\u00f5\7\23\2\2"+
		"\u00f4\u00f6\5\30\r\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\7\2\2\u00fa"+
		"\u00fb\5\30\r\2\u00fb\u00fc\7\24\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\7"+
		"\33\2\2\u00fe\u00eb\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		")\3\2\2\2\u0100\u0102\5\b\5\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\5,\27\2\u0107+\3\2\2\2\u0108\u010a\5\6\4\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5\26\f\2\u010f"+
		"-\3\2\2\2\u0110\u0111\7\23\2\2\u0111\u0112\7\13\2\2\u0112\u0113\5\60\31"+
		"\2\u0113\u0114\5\62\32\2\u0114\u0115\5\64\33\2\u0115\u0116\7\24\2\2\u0116"+
		"/\3\2\2\2\u0117\u0118\5\26\f\2\u0118\61\3\2\2\2\u0119\u011a\5\26\f\2\u011a"+
		"\63\3\2\2\2\u011b\u011c\5\26\f\2\u011c\65\3\2\2\2\u011d\u011e\7\23\2\2"+
		"\u011e\u011f\7\f\2\2\u011f\u0120\5\30\r\2\u0120\u0121\5\26\f\2\u0121\u0122"+
		"\7\24\2\2\u0122\67\3\2\2\2\u0123\u012d\5<\37\2\u0124\u012d\5:\36\2\u0125"+
		"\u0126\5F$\2\u0126\u0127\7\r\2\2\u0127\u0128\58\35\2\u0128\u012d\3\2\2"+
		"\2\u0129\u012a\5F$\2\u012a\u012b\7\16\2\2\u012b\u012d\3\2\2\2\u012c\u0123"+
		"\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0129\3\2\2\2\u012d"+
		"9\3\2\2\2\u012e\u012f\t\2\2\2\u012f;\3\2\2\2\u0130\u0134\5> \2\u0131\u0134"+
		"\5@!\2\u0132\u0134\5B\"\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0132\3\2\2\2\u0134=\3\2\2\2\u0135\u0139\7\23\2\2\u0136\u0138\58\35\2"+
		"\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0148\7\24\2\2"+
		"\u013d\u013f\7\23\2\2\u013e\u0140\58\35\2\u013f\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\7\7\2\2\u0144\u0145\58\35\2\u0145\u0146\7\24\2\2\u0146\u0148\3"+
		"\2\2\2\u0147\u0135\3\2\2\2\u0147\u013d\3\2\2\2\u0148?\3\2\2\2\u0149\u014d"+
		"\7\17\2\2\u014a\u014c\58\35\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2"+
		"\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0151\7\24\2\2\u0151A\3\2\2\2\u0152\u0153\5D#\2\u0153\u0154"+
		"\58\35\2\u0154C\3\2\2\2\u0155\u0156\t\3\2\2\u0156E\3\2\2\2\u0157\u0158"+
		"\7\16\2\2\u0158\u0159\7\32\2\2\u0159G\3\2\2\2\u015a\u015b\7\33\2\2\u015b"+
		"I\3\2\2\2\35MTZ{\u0085\u0089\u008e\u0096\u0099\u00a0\u00b0\u00be\u00c4"+
		"\u00cc\u00d5\u00dc\u00ef\u00f7\u00fe\u0103\u010b\u012c\u0133\u0139\u0141"+
		"\u0147\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}