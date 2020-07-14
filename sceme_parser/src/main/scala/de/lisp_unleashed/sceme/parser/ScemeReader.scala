package de.lisp_unleashed.sceme.parser
import de.lisp_unleashed.sceme.parser.gen.{ ScemeBaseVisitor }
import org.antlr.v4.runtime.{ CharStreams, CodePointCharStream, CommonTokenStream, ParserRuleContext }

import scala.collection.JavaConverters._

class UnsupportedSyntaxException(message: String) extends Exception(message)

class ScemeReader(sourceStream: CodePointCharStream) extends ScemeBaseVisitor[Syntax[_]] {
  def readDatum(): Syntax[_] = {
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(sourceStream))
    val scemeParser = new gen.ScemeParser(tokenStream)
    visit(scemeParser.datum())
  }

  def readProgram(): Seq[Syntax[_]] = {
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(sourceStream))
    val scemeParser = new gen.ScemeParser(tokenStream)
    scemeParser.program().datum().asScala.map(visit)
  }

  private def createSourceInformation(ctx: ParserRuleContext) =
    SourceInformation(ctx.start.getLine,
                      ctx.start.getCharPositionInLine + 1,
                      ctx.stop.getStopIndex - ctx.start.getStartIndex)

  override def visitBoolTrue(ctx: gen.ScemeParser.BoolTrueContext): Syntax[Boolean] =
    BooleanSyntax(true, createSourceInformation(ctx))

  override def visitBoolFalse(ctx: gen.ScemeParser.BoolFalseContext): Syntax[Boolean] =
    BooleanSyntax(false, createSourceInformation(ctx))

  override def visitSymbolDelimited(ctx: gen.ScemeParser.SymbolDelimitedContext): Syntax[String] = {
    val symbolText = ctx.getText
    SymbolSyntax(symbolText.substring(1, symbolText.length - 1), true, createSourceInformation(ctx))
  }

  override def visitSymbolNormal(ctx: gen.ScemeParser.SymbolNormalContext): Syntax[String] =
    SymbolSyntax(ctx.getText, false, createSourceInformation(ctx))

  override def visitSymbolPeculiar(ctx: gen.ScemeParser.SymbolPeculiarContext): Syntax[String] =
    SymbolSyntax(ctx.getText, false, createSourceInformation(ctx))

  override def visitCharacterCharLiteral(ctx: gen.ScemeParser.CharacterCharLiteralContext): Syntax[Char] =
    CharacterSyntax(ctx.getText.charAt(2), createSourceInformation(ctx))

  override def visitCharacterHexLiteral(ctx: gen.ScemeParser.CharacterHexLiteralContext): Syntax[Char] = {
    val value = Integer.valueOf(ctx.getText.drop(3), 16)
    CharacterSyntax(value.toChar, createSourceInformation(ctx))
  }

  override def visitCharacterUnicodeLiteral(ctx: gen.ScemeParser.CharacterUnicodeLiteralContext): Syntax[Char] = {
    val value = Integer.valueOf(ctx.getText.drop(3), 16)
    CharacterSyntax(value.toChar, createSourceInformation(ctx))
  }

  override def visitCharacterNamed(ctx: gen.ScemeParser.CharacterNamedContext): Syntax[Char] = {
    val value = ctx.getText.drop(2) match {
      case "space"     => ' '
      case "newline"   => '\n'
      case "return"    => '\r'
      case "tab"       => '\t'
      case "alarm"     => 7.toChar
      case "null"      => 0.toChar
      case "backspace" => 8.toChar
      case "delete"    => 24.toChar
      case "escape"    => 27.toChar
    }
    CharacterSyntax(value, createSourceInformation(ctx))
  }

  override def visitString(ctx: gen.ScemeParser.StringContext): Syntax[_] = {
    // TODO: add support for inline hex escapes
    val value = ctx.getText
    StringSyntax(value.substring(1, value.length - 1), createSourceInformation(ctx))
  }

  override def visitFixnumBin(ctx: gen.ScemeParser.FixnumBinContext): Syntax[Long] = {
    val value = ctx.getText.drop(2)
    FixnumSyntax(java.lang.Long.valueOf(value, 2), createSourceInformation(ctx))
  }

  override def visitFixnumOct(ctx: gen.ScemeParser.FixnumOctContext): Syntax[Long] = {
    val value = ctx.getText.drop(2)
    FixnumSyntax(java.lang.Long.valueOf(value, 8), createSourceInformation(ctx))
  }

  override def visitFixnumDec(ctx: gen.ScemeParser.FixnumDecContext): Syntax[Long] = {
    val value = ctx.getText
    val num   = if (value.startsWith("#d")) value.drop(2) else value
    FixnumSyntax(java.lang.Long.valueOf(num), createSourceInformation(ctx))
  }

  override def visitFixnumHex(ctx: gen.ScemeParser.FixnumHexContext): Syntax[Long] = {
    val value = ctx.getText.drop(2)
    FixnumSyntax(java.lang.Long.valueOf(value, 16), createSourceInformation(ctx))
  }

  override def visitFlonumBin(ctx: gen.ScemeParser.FlonumBinContext): Syntax[Double] =
    throw new UnsupportedSyntaxException("Binary flonum literals not yet supported")

  override def visitFlonumOct(ctx: gen.ScemeParser.FlonumOctContext): Syntax[Double] =
    throw new UnsupportedSyntaxException("Octal flonum literals not yet supported")

  override def visitFlonumHex(ctx: gen.ScemeParser.FlonumHexContext): Syntax[_] =
    throw new UnsupportedSyntaxException("Hex flonum literals not yet supported")

  override def visitFlonumDec(ctx: gen.ScemeParser.FlonumDecContext): Syntax[_] = {
    val value = ctx.getText
    val num   = if (value.startsWith("#d")) value.drop(2) else value
    FlonumSyntax(java.lang.Double.valueOf(num), createSourceInformation(ctx))
  }

  override def visitBytevector(ctx: gen.ScemeParser.BytevectorContext): Syntax[Vector[Byte]] = {
    val value    = ctx.getText
    val byteText = value.substring(4, value.length - 1)
    val bytes    = byteText.split("\\s+").map(java.lang.Short.valueOf(_).byteValue())
    ByteVectorSyntax(bytes.toVector, createSourceInformation(ctx))
  }

  override def visitProper_list(ctx: gen.ScemeParser.Proper_listContext): Syntax[_] = {
    val elements = ctx.datum().asScala.map(visit(_)).toList
    ProperListSyntax(elements, createSourceInformation(ctx))
  }

  override def visitImproper_list(ctx: gen.ScemeParser.Improper_listContext): Syntax[_] = {
    val head = ctx.improper_head().datum().asScala.map(visit(_)).toList
    val tail = visit(ctx.improper_tail().datum())

    ImproperListSyntax((head, tail), createSourceInformation(ctx))
  }

  override def visitVector(ctx: gen.ScemeParser.VectorContext): Syntax[_] = {
    val elements = ctx.datum().asScala.map(visit(_)).toVector
    VectorSyntax(elements, createSourceInformation(ctx))
  }

  override def visitAbbreviation(ctx: gen.ScemeParser.AbbreviationContext): Syntax[_] = {
    val datum     = visit(ctx.datum())
    val quotation = visit(ctx.abbrev_prefix())
    ProperListSyntax(List(quotation, datum), createSourceInformation(ctx))
  }

  override def visitAbbrevQuote(ctx: gen.ScemeParser.AbbrevQuoteContext): Syntax[_] =
    SymbolSyntax("quote", false, createSourceInformation(ctx))

  override def visitAbbrevUnquote(ctx: gen.ScemeParser.AbbrevUnquoteContext): Syntax[_] =
    SymbolSyntax("unquote", false, createSourceInformation(ctx))

  override def visitAbbrevUnquoteSplicing(ctx: gen.ScemeParser.AbbrevUnquoteSplicingContext): Syntax[_] =
    SymbolSyntax("unquote-splicing", false, createSourceInformation(ctx))

  override def visitAbbrevQuasiQuote(ctx: gen.ScemeParser.AbbrevQuasiQuoteContext): Syntax[_] =
    SymbolSyntax("quasiquote", false, createSourceInformation(ctx))
}

object ScemeReader {
  def read(input: String): Syntax[_] =
    new ScemeReader(CharStreams.fromString(input)).readDatum()

  def read(reader: java.io.Reader): Syntax[_] =
    new ScemeReader(CharStreams.fromReader(reader)).readDatum()

  def readProgram(input: String): Seq[Syntax[_]] =
    new ScemeReader(CharStreams.fromString(input)).readProgram()

  def readProgram(reader: java.io.Reader): Seq[Syntax[_]] =
    new ScemeReader(CharStreams.fromReader(reader)).readProgram()

}
