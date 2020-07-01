package de.lisp_unleashed.sceme.parser
import cats.implicits._
import de.lisp_unleashed.sceme.syntax._
import scala.util.Try

class ParseError(message: String, val location: Option[Location]) extends Exception(message) {
  def fullMessage(sourceMapper: SourceMapper): String = {
    val loc = location.map(sourceMapper.renderLocation(_))
    //val source = location.map(sourceMapper.renderLinePosition(_))
    s"RuntimeError: $message ${loc.getOrElse("")}"
  }
}

class ExpressionParser {
  def parse(data: Seq[Value]): Try[Seq[Expression]] =
    data.toList.traverse(parse)

  def parse(datum: Value): Try[Expression] =
    Try(unsafeParse(datum))

  private def unsafeParse(datum: Value): Expression =
    datum match {
      case Value.ProperList(List(Value.Symbol("quote", _), quoted), _)       => Quote(quoted)
      case Value.ProperList(List(Value.Symbol("quasiquote", _), quoted), _)  => unsafeParseQuasiQuote(quoted)
      case Value.ProperList(Value.Symbol("lambda", _) :: formals :: body, _) => unsafeParseLambda(formals, body)
      case v: Value.Symbol                                                   => Variable(v)
      case v: Value.Boolean                                                  => Literal(v)
      case v: Value.Number[_]                                                => Literal(v)
      case v: Value.Char                                                     => Literal(v)
      case v: Value.String                                                   => Literal(v)
      case Value.ProperList(operator :: operands, _)                         => ProcedureCall(unsafeParse(operator), operands.map(unsafeParse))
      case v                                                                 => throw new ParseError("Invalid expression", v.location)
    }

  private def unsafeParseQuasiQuote(datum: Value): Expression =
    datum match {
      case Value.ProperList(List(Value.Symbol("unquote", _), quoted), _) =>
        Unquote(unsafeParse(quoted))
      case Value.ProperList(List(Value.Symbol("unquote-splicing", _), quoted), _) =>
        UnquoteSplicing(unsafeParse(quoted))
      case v =>
        throw new ParseError("Invalid expression in quasiquote", v.location)
    }

  private def unsafeParseLambda(formals: Value, body: List[Value]): Expression =
    formals match {
      case Value.ProperList(variables, pos) => Lambda(unsafeParseVariables(variables), body.map(unsafeParse), pos)
      case v                                => throw new ParseError("Other forms of lambda expressions not yet supported", v.location)
    }

  private def unsafeParseVariables(variables: List[Value]): List[Variable] =
    variables.map { variable =>
      unsafeParse(variable) match {
        case v: Variable => v
        case v           => throw new ParseError(s"Expected list of variables but got ${v}", v.location)
      }
    }
}
