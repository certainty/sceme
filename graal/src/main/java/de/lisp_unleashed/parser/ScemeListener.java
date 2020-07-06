// Generated from src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScemeParser}.
 */
public interface ScemeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScemeParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void enterSexpr(ScemeParser.SexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void exitSexpr(ScemeParser.SexprContext ctx);
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
	 * Enter a parse tree produced by {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ScemeParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ScemeParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ScemeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ScemeParser.NumberContext ctx);
}