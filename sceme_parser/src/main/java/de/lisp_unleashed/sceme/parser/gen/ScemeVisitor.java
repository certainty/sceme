// Generated from sceme_parser/src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.parser.gen;
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
	 * Visit a parse tree produced by {@link ScemeParser#proper_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProper_list(ScemeParser.Proper_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#improper_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImproper_list(ScemeParser.Improper_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(ScemeParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(ScemeParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ScemeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ScemeParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ScemeParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(ScemeParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#bytevector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytevector(ScemeParser.BytevectorContext ctx);
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
}