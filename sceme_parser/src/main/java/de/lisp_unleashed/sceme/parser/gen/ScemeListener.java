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
}