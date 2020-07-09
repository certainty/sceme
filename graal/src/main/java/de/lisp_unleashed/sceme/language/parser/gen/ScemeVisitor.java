// Generated from src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.language.parser.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScemeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScemeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScemeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ScemeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#command_or_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_or_definition(ScemeParser.Command_or_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ScemeParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(ScemeParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#def_formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_formals(ScemeParser.Def_formalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(ScemeParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(ScemeParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#field_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_name(ScemeParser.Field_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#accessor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessor(ScemeParser.AccessorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#mutator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutator(ScemeParser.MutatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ScemeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ScemeParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ScemeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#self_evaluating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_evaluating(ScemeParser.Self_evaluatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#quotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotation(ScemeParser.QuotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(ScemeParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(ScemeParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(ScemeParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(ScemeParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormals(ScemeParser.FormalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ScemeParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ScemeParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ScemeParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(ScemeParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#consequent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequent(ScemeParser.ConsequentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#alternate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternate(ScemeParser.AlternateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ScemeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatum(ScemeParser.DatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#simple_datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_datum(ScemeParser.Simple_datumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#compound_datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_datum(ScemeParser.Compound_datumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ScemeParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(ScemeParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviation(ScemeParser.AbbreviationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrev_prefix(ScemeParser.Abbrev_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ScemeParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(ScemeParser.SymbolContext ctx);
}