// Generated from sceme_parser/src/main/antlr/Sceme.g4 by ANTLR 4.8
package de.lisp_unleashed.sceme.parser.gen;
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
	 * Enter a parse tree produced by the {@code symbolNormal}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbolNormal(ScemeParser.SymbolNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbolNormal}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbolNormal(ScemeParser.SymbolNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbolDelimited}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbolDelimited(ScemeParser.SymbolDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbolDelimited}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbolDelimited(ScemeParser.SymbolDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbolPeculiar}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbolPeculiar(ScemeParser.SymbolPeculiarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbolPeculiar}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbolPeculiar(ScemeParser.SymbolPeculiarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(ScemeParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(ScemeParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(ScemeParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(ScemeParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterNamed}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacterNamed(ScemeParser.CharacterNamedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterNamed}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacterNamed(ScemeParser.CharacterNamedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterHexLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacterHexLiteral(ScemeParser.CharacterHexLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterHexLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacterHexLiteral(ScemeParser.CharacterHexLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterUnicodeLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacterUnicodeLiteral(ScemeParser.CharacterUnicodeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterUnicodeLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacterUnicodeLiteral(ScemeParser.CharacterUnicodeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterCharLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacterCharLiteral(ScemeParser.CharacterCharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterCharLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacterCharLiteral(ScemeParser.CharacterCharLiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code fixnumBin}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void enterFixnumBin(ScemeParser.FixnumBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixnumBin}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void exitFixnumBin(ScemeParser.FixnumBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixnumOct}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void enterFixnumOct(ScemeParser.FixnumOctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixnumOct}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void exitFixnumOct(ScemeParser.FixnumOctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixnumDec}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void enterFixnumDec(ScemeParser.FixnumDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixnumDec}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void exitFixnumDec(ScemeParser.FixnumDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixnumHex}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void enterFixnumHex(ScemeParser.FixnumHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixnumHex}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 */
	void exitFixnumHex(ScemeParser.FixnumHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flonumBin}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void enterFlonumBin(ScemeParser.FlonumBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flonumBin}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void exitFlonumBin(ScemeParser.FlonumBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flonumOct}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void enterFlonumOct(ScemeParser.FlonumOctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flonumOct}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void exitFlonumOct(ScemeParser.FlonumOctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flonumDec}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void enterFlonumDec(ScemeParser.FlonumDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flonumDec}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void exitFlonumDec(ScemeParser.FlonumDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flonumHex}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void enterFlonumHex(ScemeParser.FlonumHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flonumHex}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 */
	void exitFlonumHex(ScemeParser.FlonumHexContext ctx);
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
	 * Enter a parse tree produced by {@link ScemeParser#improper_head}.
	 * @param ctx the parse tree
	 */
	void enterImproper_head(ScemeParser.Improper_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#improper_head}.
	 * @param ctx the parse tree
	 */
	void exitImproper_head(ScemeParser.Improper_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScemeParser#improper_tail}.
	 * @param ctx the parse tree
	 */
	void enterImproper_tail(ScemeParser.Improper_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScemeParser#improper_tail}.
	 * @param ctx the parse tree
	 */
	void exitImproper_tail(ScemeParser.Improper_tailContext ctx);
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
	 * Enter a parse tree produced by the {@code abbrevQuote}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevQuote(ScemeParser.AbbrevQuoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abbrevQuote}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevQuote(ScemeParser.AbbrevQuoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abbrevQuasiQuote}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevQuasiQuote(ScemeParser.AbbrevQuasiQuoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abbrevQuasiQuote}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevQuasiQuote(ScemeParser.AbbrevQuasiQuoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abbrevUnquote}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevUnquote(ScemeParser.AbbrevUnquoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abbrevUnquote}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevUnquote(ScemeParser.AbbrevUnquoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abbrevUnquoteSplicing}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevUnquoteSplicing(ScemeParser.AbbrevUnquoteSplicingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abbrevUnquoteSplicing}
	 * labeled alternative in {@link ScemeParser#abbrev_prefix}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevUnquoteSplicing(ScemeParser.AbbrevUnquoteSplicingContext ctx);
}