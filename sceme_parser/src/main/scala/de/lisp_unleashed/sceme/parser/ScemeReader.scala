package de.lisp_unleashed.sceme.parser
import de.lisp_unleashed.sceme.parser.gen.{ ScemeBaseVisitor, ScemeParser }
import org.antlr.v4.runtime.{ CharStreams, CodePointCharStream, CommonTokenStream, ParserRuleContext }

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

}

object ScemeReader {
  def read(input: String): Syntax[_] =
    new ScemeReader(CharStreams.fromString(input)).createAst()

  def read(reader: java.io.Reader): Syntax[_] =
    new ScemeReader(CharStreams.fromReader(reader)).createAst()
}
