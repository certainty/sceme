package de.lisp_unleashed.sceme.parser
import java.util.UUID
import org.parboiled2._
import scala.util.{ Failure, Success, Try }

trait Tokens extends StringBuilding with PositionTracking { this: Parser with Ignored =>
  def Token              = rule { Punctuator }
  val PunctuatorChar     = CharPredicate("()[].")
  def Punctuator         = rule { PunctuatorChar }
  def Keyword(s: String) = rule { atomic(Ignored.* ~ s ~ IgnoredNoComment.*) }
}

trait Ignored extends PositionTracking { this: Parser =>
  val WhiteSpace     = CharPredicate("\u0009\u0020")
  def CRLF           = rule { '\u000D' ~ '\u000A' }
  val LineTerminator = CharPredicate("\u000A")

  def Ignored          = rule { quiet(WhiteSpace | (CRLF | LineTerminator) ~ trackNewLine | Comment) }
  def IgnoredNoComment = rule { quiet(WhiteSpace | (CRLF | LineTerminator) ~ trackNewLine) }
  def Comment          = rule { ";" ~ CommentChar.* }
  def CommentChar      = rule { !(CRLF | LineTerminator) ~ ANY }

  def ws(char: Char): Rule0          = rule { quiet(Ignored.* ~ ch(char) ~ Ignored.*) }
  def wsNoComment(char: Char): Rule0 = rule { quiet(Ignored.* ~ ch(char) ~ IgnoredNoComment.*) }
  def ws(s: String): Rule0           = rule { quiet(Ignored.* ~ str(s) ~ Ignored.*) }
}

trait Values extends PositionTracking { this: Parser with Tokens with Ignored =>
  def Value = rule { BooleanValue }

  def BooleanValue = rule {
    Ignored.* ~ trackPos ~ Keyword("#t") ~> ((location) => Ast.BooleanValue(true, location)) |
      Ignored.* ~ trackPos ~ Keyword("#f") ~> ((location) => Ast.BooleanValue(false, location))
  }
}

trait Expressions { this: Parser with Values with Ignored =>
  def Source = rule {
    Ignored.* ~ trackPos ~ Expr.+ ~ Ignored.* ~ EOI ~> ((_, e) => e.toVector)
  }

  def Expr = rule { Value }
}

case class SyntaxError(parser: Parser, input: ParserInput, originalError: ParseError) extends Exception(originalError) {
  lazy val formattedError: String = formattedError()

  def formattedError(showPosition: Boolean = true): String =
    if (showPosition)
      parser.formatError(originalError)
    else
      parser.formatError(originalError, formatter = new ErrorFormatter(showPosition = false, showLine = false))

  override def getMessage = s"Syntax error while parsing sceme source. $formattedError"
}

class ScemeParser private (val input: ParserInput, val sourceId: String)
    extends Parser
    with Tokens
    with Ignored
    with Values
    with Expressions {
  override def parseLocations: Boolean = true
}

object ScemeParser {
  case class Result(exps: Seq[Ast.Expression], sourceMapper: SourceMapper)

  def parse(input: String): Try[Result] = {
    val parserInput  = ParserInput(input)
    val id           = UUID.randomUUID().toString
    val sourceMapper = new DefaultSourceMapper(id, input)
    val parser       = new ScemeParser(input, id)

    parser.Source.run() match {
      case Success(exprs)          => Success(Result(exprs, sourceMapper))
      case Failure(ex: ParseError) => Failure(SyntaxError(parser, parserInput, ex))
      case Failure(ex)             => Failure(ex)
    }
  }
}
