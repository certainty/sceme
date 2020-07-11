package de.lisp_unleashed.sceme.parser
import de.lisp_unleashed.sceme.parser.gen.{ ScemeBaseVisitor, ScemeParser }
import org.antlr.v4.runtime.{ CharStreams, CodePointCharStream, CommonTokenStream, ParserRuleContext }

class ScemeReader(sourceStream: CodePointCharStream) extends ScemeBaseVisitor[Syntax[_]] {
  private val namedCharacterMap = Map(
    "space"     -> ' ',
    "alarm"     -> '\b',
    "backspace" -> ' ',
    "escape"    -> ' ',
    "return"    -> '\n',
    "tab"       -> '\t'
  )

  def createAst(): Syntax[_] = {
    val tokenStream = new CommonTokenStream(new gen.ScemeLexer(sourceStream))
    val scemeParser = new gen.ScemeParser(tokenStream)
    visit(scemeParser.datum())
  }

  private def createSourceInformation(ctx: ParserRuleContext) =
    SourceInformation(ctx.start.getLine,
                      ctx.start.getCharPositionInLine + 1,
                      ctx.stop.getStopIndex - ctx.start.getStartIndex)

  override def visitBool(ctx: ScemeParser.BoolContext): Syntax[_] = ctx.getText match {
    case "#t" | "#true"  => BooleanSyntax(true, createSourceInformation(ctx))
    case "#f" | "#false" => BooleanSyntax(false, createSourceInformation(ctx))
  }

  override def visitString(ctx: ScemeParser.StringContext): Syntax[_] = {
    val stringValue = ctx.getText
    StringSyntax(stringValue.substring(1, stringValue.length - 1), createSourceInformation(ctx))
  }

  override def visitCharacter(ctx: ScemeParser.CharacterContext): Syntax[_] =
    if (ctx.CHAR_LITERAL() != null) {
      CharacterSyntax(ctx.getText.charAt(2), createSourceInformation(ctx))
    } else if (ctx.NAMED_CHAR_LITERAL() != null) {
      CharacterSyntax(namedCharacterMap(ctx.getText.drop(2)), createSourceInformation(ctx))

    } else if (ctx.UNICODE_CHAR_LITERAL() != null) {
      val codePoint = Integer.parseInt(ctx.UNICODE_CHAR_LITERAL().getText.drop(3), 16)
      CharacterSyntax(codePoint.asInstanceOf[Char], createSourceInformation(ctx))
    } else if (ctx.HEX_CHAR_LITERAL() != null) {
      val codePoint = Integer.parseInt(ctx.HEX_CHAR_LITERAL().getText.drop(3), 16)
      CharacterSyntax(codePoint.asInstanceOf[Char], createSourceInformation(ctx))
    } else {
      CharacterSyntax('0', createSourceInformation(ctx))
    }
}

object ScemeReader {
  def read(input: String): Syntax[_] =
    new ScemeReader(CharStreams.fromString(input)).createAst()

  def read(reader: java.io.Reader): Syntax[_] =
    new ScemeReader(CharStreams.fromReader(reader)).createAst()
}
