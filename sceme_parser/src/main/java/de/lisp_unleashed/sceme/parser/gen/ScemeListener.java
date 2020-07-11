// Generated from sceme_parser/src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.parser.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScemeParser}.
 */
public interface ScemeListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link ScemeParser#proper_list}.
	 * @param ctx the parse tree
	 */
	void enterProper_list(ScemeParser.Proper_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#proper_list}.
	 * @param ctx the parse tree
	 */
	void exitProper_list(ScemeParser.Proper_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#improper_list}.
	 * @param ctx the parse tree
	 */
	void enterImproper_list(ScemeParser.Improper_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#improper_list}.
	 * @param ctx the parse tree
	 */
	void exitImproper_list(ScemeParser.Improper_listContext ctx);
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
	 * Enter a parse tree produced by {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ScemeParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ScemeParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ScemeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ScemeParser.StringContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(ScemeParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(ScemeParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#bytevector}.
	 * @param ctx the parse tree
	 */
	void enterBytevector(ScemeParser.BytevectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#bytevector}.
	 * @param ctx the parse tree
	 */
	void exitBytevector(ScemeParser.BytevectorContext ctx);
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
}