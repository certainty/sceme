package de.lisp_unleashed.sceme.parser
import java.util.UUID
import org.parboiled2._
import scala.util.{ Failure, Success, Try }

// https://people.csail.mit.edu/jaffer/r5rs_9.html

trait Tokens extends StringBuilding with PositionTracking { this: Parser with Ignored =>
  val PunctuatorChar = CharPredicate("()'`,.")
  def Punctuator     = rule { PunctuatorChar }

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

trait Keywords extends PositionTracking { this: Parser with Ignored =>
  val syntacticKeywords = Set("else", "=>", "define", "unquote", "unquote-splicing")
  val expresssionKeywords =
    Set("quote",
        "lambda",
        "if",
        "set!",
        "begin",
        "cond",
        "and",
        "or",
        "case",
        "let",
        "let*",
        "letrec",
        "do",
        "delay",
        "quasiquote")

  def Keyword(s: String) = rule { atomic(Ignored.* ~ s ~ IgnoredNoComment.*) }
}

trait Program { this: Parser with Expressions with Ignored =>
  def Program = rule {
    Ignored.* ~ trackPos ~ Expression.+ ~ Ignored.* ~ EOI ~> ((_, p) => p.toVector)
  }
}

trait Expressions { this: Parser with Literals with Ignored =>
  def Expression = rule { Literal }
}

trait Literals extends PositionTracking { this: Parser with Keywords with Ignored =>
  def Literal        = rule { SelfEvaluating }
  def SelfEvaluating = rule { BoolLiteral | CharLiteral } //| NumberLiteral | StringLiteral }

  def BoolLiteral = rule {
    Ignored.* ~ trackPos ~ Keyword("#t") ~> ((location) => Ast.BooleanValue(true, location)) |
      Ignored.* ~ trackPos ~ Keyword("#f") ~> ((location) => Ast.BooleanValue(false, location))
  }

  def CharLiteral = rule {
    Ignored.* ~ trackPos ~ quiet(str("#\\")) ~ SingleCharacter ~> ((location, c) => Ast.CharValue(c, location))
  }

  def SingleCharacter = rule {
    str("space") ~> (() => ' ') |
      str("newline") ~> (() => '\n') |
      capture(ANY) ~> ((c) => c(0))
  }
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
    with Keywords
    with Literals
    with Expressions
    with Program {
  override def parseLocations: Boolean = true
}

object ScemeParser {
  case class Result(exps: Seq[Ast.Expression], sourceMapper: SourceMapper)

  def parse(input: String): Try[Result] = {
    val parserInput  = ParserInput(input)
    val id           = UUID.randomUUID().toString
    val sourceMapper = new DefaultSourceMapper(id, input)
    val parser       = new ScemeParser(input, id)

    parser.Program.run() match {
      case Success(exprs)          => Success(Result(exprs, sourceMapper))
      case Failure(ex: ParseError) => Failure(SyntaxError(parser, parserInput, ex))
      case Failure(ex)             => Failure(ex)
    }
  }
}
