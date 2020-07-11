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