package de.lisp_unleashed.sceme.parser
import de.lisp_unleashed.sceme.parser.gen.{ ScemeBaseVisitor, ScemeParser }
import org.antlr.v4.runtime.{ CharStreams, CodePointCharStream, CommonTokenStream, ParserRuleContext }

class UnsupportedSyntaxException(message: String) extends Exception(message)

class ScemeReader(sourceStream: CodePointCharStream) extends ScemeBaseVisitor[Syntax[_]] {
  def createAst(): Syntax[_] = {
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(sourceStream))
    val scemeParser = new gen.ScemeParser(tokenStream)
    visit(scemeParser.datum())
  }

  private def createSourceInformation(ctx: ParserRuleContext) =
    SourceInformation(ctx.start.getLine,
                      ctx.start.getCharPositionInLine + 1,
                      ctx.stop.getStopIndex - ctx.start.getStartIndex)

  override def visitBoolTrue(ctx: ScemeParser.BoolTrueContext): Syntax[Boolean] =
    BooleanSyntax(true, createSourceInformation(ctx))

  override def visitBoolFalse(ctx: ScemeParser.BoolFalseContext): Syntax[Boolean] =
    BooleanSyntax(false, createSourceInformation(ctx))

  override def visitSymbolDelimited(ctx: ScemeParser.SymbolDelimitedContext): Syntax[String] = {
    val symbolText = ctx.getText
    SymbolSyntax(symbolText.substring(1, symbolText.length - 1), true, createSourceInformation(ctx))
  }

  override def visitSymbolNormal(ctx: ScemeParser.SymbolNormalContext): Syntax[String] =
    SymbolSyntax(ctx.getText, false, createSourceInformation(ctx))

  override def visitSymbolPeculiar(ctx: ScemeParser.SymbolPeculiarContext): Syntax[String] =
    SymbolSyntax(ctx.getText, false, createSourceInformation(ctx))

  override def visitCharacterCharLiteral(ctx: ScemeParser.CharacterCharLiteralContext): Syntax[Char] =
    CharacterSyntax(ctx.getText.charAt(2), createSourceInformation(ctx))

  override def visitCharacterHexLiteral(ctx: ScemeParser.CharacterHexLiteralContext): Syntax[Char] = {
    val value = Integer.valueOf(ctx.getText.drop(3), 16)
    CharacterSyntax(value.toChar, createSourceInformation(ctx))
  }

  override def visitCharacterUnicodeLiteral(ctx: ScemeParser.CharacterUnicodeLiteralContext): Syntax[Char] = {
    val value = Integer.valueOf(ctx.getText.drop(3), 16)
    CharacterSyntax(value.toChar, createSourceInformation(ctx))
  }

  override def visitCharacterNamed(ctx: ScemeParser.CharacterNamedContext): Syntax[Char] = {
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

  override def visitString(ctx: ScemeParser.StringContext): Syntax[_] = {
    // TODO: add support for inline hex escapes
    val value = ctx.getText
    StringSyntax(value.substring(1, value.length - 1), createSourceInformation(ctx))
  }

  override def visitFixnumBin(ctx: ScemeParser.FixnumBinContext): Syntax[Long] = {
    val value = ctx.getText.drop(2)
    FixnumSyntax(java.lang.Long.valueOf(value, 2), createSourceInformation(ctx))
  }

  override def visitFixnumOct(ctx: ScemeParser.FixnumOctContext): Syntax[Long] = {
    val value = ctx.getText.drop(2)
    FixnumSyntax(java.lang.Long.valueOf(value, 8), createSourceInformation(ctx))
  }

  override def visitFixnumDec(ctx: ScemeParser.FixnumDecContext): Syntax[Long] = {
    val value = ctx.getText
    val num   = if (value.startsWith("#d")) value.drop(2) else value
    FixnumSyntax(java.lang.Long.valueOf(num), createSourceInformation(ctx))
  }

  override def visitFixnumHex(ctx: ScemeParser.FixnumHexContext): Syntax[Long] = {
    val value = ctx.getText.drop(2)
    FixnumSyntax(java.lang.Long.valueOf(value, 16), createSourceInformation(ctx))
  }

  override def visitFlonumBin(ctx: ScemeParser.FlonumBinContext): Syntax[Double] =
    throw new UnsupportedSyntaxException("Binary flonum literals not yet supported")

  override def visitFlonumOct(ctx: ScemeParser.FlonumOctContext): Syntax[Double] =
    throw new UnsupportedSyntaxException("Octal flonum literals not yet supported")

  override def visitFlonumHex(ctx: ScemeParser.FlonumHexContext): Syntax[_] =
    throw new UnsupportedSyntaxException("Hex flonum literals not yet supported")

  override def visitFlonumDec(ctx: ScemeParser.FlonumDecContext): Syntax[_] = {
    val value = ctx.getText
    val num   = if (value.startsWith("#d")) value.drop(2) else value
    FlonumSyntax(java.lang.Double.valueOf(num), createSourceInformation(ctx))
  }

  override def visitBytevector(ctx: ScemeParser.BytevectorContext): Syntax[Vector[Byte]] = {
    val value    = ctx.getText
    val byteText = value.substring(4, value.length - 1)
    val bytes    = byteText.split("\\s+").map(java.lang.Short.valueOf(_).byteValue())
    ByteVectorSyntax(bytes.toVector, createSourceInformation(ctx))
  }
}

object ScemeReader {
  def read(input: String): Syntax[_] =
    new ScemeReader(CharStreams.fromString(input)).createAst()

  def read(reader: java.io.Reader): Syntax[_] =
    new ScemeReader(CharStreams.fromReader(reader)).createAst()
}
