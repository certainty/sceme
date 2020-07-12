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
	 * Visit a parse tree produced by the {@code symbolNormal}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolNormal(ScemeParser.SymbolNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbolDelimited}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolDelimited(ScemeParser.SymbolDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbolPeculiar}
	 * labeled alternative in {@link ScemeParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolPeculiar(ScemeParser.SymbolPeculiarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(ScemeParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link ScemeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(ScemeParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterNamed}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterNamed(ScemeParser.CharacterNamedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterHexLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterHexLiteral(ScemeParser.CharacterHexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterUnicodeLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterUnicodeLiteral(ScemeParser.CharacterUnicodeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterCharLiteral}
	 * labeled alternative in {@link ScemeParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterCharLiteral(ScemeParser.CharacterCharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ScemeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ScemeParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixnumBin}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixnumBin(ScemeParser.FixnumBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixnumOct}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixnumOct(ScemeParser.FixnumOctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixnumDec}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixnumDec(ScemeParser.FixnumDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixnumHex}
	 * labeled alternative in {@link ScemeParser#fixnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixnumHex(ScemeParser.FixnumHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flonumBin}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlonumBin(ScemeParser.FlonumBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flonumOct}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlonumOct(ScemeParser.FlonumOctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flonumDec}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlonumDec(ScemeParser.FlonumDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flonumHex}
	 * labeled alternative in {@link ScemeParser#flonum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlonumHex(ScemeParser.FlonumHexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScemeParser#bytevector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBytevector(ScemeParser.BytevectorContext ctx);
}