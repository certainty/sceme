// Generated from src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.language.parser.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScemeParser}.
 */
public interface ScemeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScemeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ScemeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ScemeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#command_or_definition}.
	 * @param ctx the parse tree
	 */
	void enterCommand_or_definition(ScemeParser.Command_or_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#command_or_definition}.
	 * @param ctx the parse tree
	 */
	void exitCommand_or_definition(ScemeParser.Command_or_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ScemeParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ScemeParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(ScemeParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(ScemeParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#def_formals}.
	 * @param ctx the parse tree
	 */
	void enterDef_formals(ScemeParser.Def_formalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#def_formals}.
	 * @param ctx the parse tree
	 */
	void exitDef_formals(ScemeParser.Def_formalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(ScemeParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(ScemeParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(ScemeParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(ScemeParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#field_name}.
	 * @param ctx the parse tree
	 */
	void enterField_name(ScemeParser.Field_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#field_name}.
	 * @param ctx the parse tree
	 */
	void exitField_name(ScemeParser.Field_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#accessor}.
	 * @param ctx the parse tree
	 */
	void enterAccessor(ScemeParser.AccessorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#accessor}.
	 * @param ctx the parse tree
	 */
	void exitAccessor(ScemeParser.AccessorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#mutator}.
	 * @param ctx the parse tree
	 */
	void enterMutator(ScemeParser.MutatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#mutator}.
	 * @param ctx the parse tree
	 */
	void exitMutator(ScemeParser.MutatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ScemeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ScemeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ScemeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ScemeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ScemeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ScemeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#self_evaluating}.
	 * @param ctx the parse tree
	 */
	void enterSelf_evaluating(ScemeParser.Self_evaluatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#self_evaluating}.
	 * @param ctx the parse tree
	 */
	void exitSelf_evaluating(ScemeParser.Self_evaluatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#quotation}.
	 * @param ctx the parse tree
	 */
	void enterQuotation(ScemeParser.QuotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#quotation}.
	 * @param ctx the parse tree
	 */
	void exitQuotation(ScemeParser.QuotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(ScemeParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(ScemeParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ScemeParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ScemeParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(ScemeParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(ScemeParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(ScemeParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(ScemeParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(ScemeParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(ScemeParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ScemeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ScemeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ScemeParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ScemeParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(ScemeParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(ScemeParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(ScemeParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(ScemeParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#consequent}.
	 * @param ctx the parse tree
	 */
	void enterConsequent(ScemeParser.ConsequentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#consequent}.
	 * @param ctx the parse tree
	 */
	void exitConsequent(ScemeParser.ConsequentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#alternate}.
	 * @param ctx the parse tree
	 */
	void enterAlternate(ScemeParser.AlternateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#alternate}.
	 * @param ctx the parse tree
	 */
	void exitAlternate(ScemeParser.AlternateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ScemeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ScemeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#datum}.
	 * @param ctx the parse tree
	 */
	void enterDatum(ScemeParser.DatumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#datum}.
	 * @param ctx the parse tree
	 */
	void exitDatum(ScemeParser.DatumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#simple_datum}.
	 * @param ctx the parse tree
	 */
	void enterSimple_datum(ScemeParser.Simple_datumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#simple_datum}.
	 * @param ctx the parse tree
	 */
	void exitSimple_datum(ScemeParser.Simple_datumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#compound_datum}.
	 * @param ctx the parse tree
	 */
	void enterCompound_datum(ScemeParser.Compound_datumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#compound_datum}.
	 * @param ctx the parse tree
	 */
	void exitCompound_datum(ScemeParser.Compound_datumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ScemeParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ScemeParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(ScemeParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(ScemeParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#abbreviation}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviation(ScemeParser.AbbreviationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#abbreviation}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviation(ScemeParser.AbbreviationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAbbrev_prefix(ScemeParser.Abbrev_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAbbrev_prefix(ScemeParser.Abbrev_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ScemeParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ScemeParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ScemeParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ScemeParser.SymbolContext ctx);
}