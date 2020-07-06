// Generated from main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.parser;
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
	 * Visit a parse tree produced by {@link ScemeParser#sexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpr(ScemeParser.SexprContext ctx);
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
}