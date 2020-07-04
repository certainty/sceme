package de.lisp_unleashed.sceme.parser
import cats.implicits._
import de.lisp_unleashed.sceme.sexp.Expression._
import de.lisp_unleashed.sceme.sexp._
import scala.util.Try

class ParseError(message: String, val location: Option[Location]) extends Exception(message) {
  def fullMessage(sourceMapper: SourceMapper): String = {
    val loc = location.map(sourceMapper.renderLocation(_))
    s"ParseError: $message ${loc.getOrElse("")}"
  }
}

/**
 *  The ExpressionParser implements what you would refer to the actual scheme parser.
 *  It uses the scheme reader to consumer the input and interprets the resulting data.
 *
 *  This separation makes sense due to the homoiconicity of lisps.
 *  The forms recognised by the parser are the core forms described in http://agl.cs.unm.edu/~williams/cs491/three-imp.pdf
 *  with some syntatic extensions.
 */
class ExpressionParser {
  def parse(data: List[Value]): Try[Expression] =
    data.traverse(parse).map(Begin(_, data.headOption.flatMap(_.location)))

  def parse(datum: Value): Try[Expression] =
    Try(unsafeParse(datum))

  private def unsafeParse(datum: Value, location: Option[Location] = None): Expression =
    datum match {
      case Value.ProperList(List(Value.Symbol("quote", loc), quoted), _) => Quote(quoted, location.orElse(loc))
      case Value.ProperList(List(Value.Symbol("quasiquote", loc), quoted), _) =>
        unsafeParseQuasiQuote(quoted, location.orElse(loc))
      case Value.ProperList(Value.Symbol("lambda", _) :: formals :: body, loc) =>
        unsafeParseLambda(formals, body.toVector, location.orElse(loc))
      case Value.ProperList(Value.Symbol("begin", _) :: exprs, loc) =>
        Begin(exprs.map(unsafeParse(_)), location.orElse(loc))
      case Value.ProperList(List(Value.Symbol("set!", _), variable: Value.Symbol, value), loc) =>
        Set(Variable(variable), unsafeParse(value), location.orElse(loc))
      case Value.ProperList(List(Value.Symbol("if", loc), test, consequent, alternative), _) =>
        If(unsafeParse(test), unsafeParse(consequent), unsafeParse(alternative), location.orElse(loc))
      case Value.ProperList(List(Value.Symbol("call/cc", _), rest), loc) =>
        CallCC(unsafeParse(rest), location.orElse(loc))
      case v: Value.Symbol    => Variable(v)
      case v: Value.Boolean   => Literal(v)
      case v: Value.Number[_] => Literal(v)
      case v: Value.Char      => Literal(v)
      case v: Value.String    => Literal(v)
      case Value.ProperList(operator :: operands, loc) =>
        ProcedureCall(unsafeParse(operator, loc), operands.map(unsafeParse(_)).toVector)
      case v => throw new ParseError("Invalid expression", v.location)
    }

  private def unsafeParseQuasiQuote(datum: Value, location: Option[Location]): Expression =
    datum match {
      case Value.ProperList(List(Value.Symbol("unquote", loc), quoted), _) =>
        Unquote(unsafeParse(quoted, location), loc)
      case Value.ProperList(List(Value.Symbol("unquote-splicing", loc), quoted), _) =>
        UnquoteSplicing(unsafeParse(quoted, loc))
      case v => throw new ParseError("Invalid expression in quasiquote", v.location)
    }

  private def unsafeParseLambda(formals: Value, body: Vector[Value], location: Option[Location]): Expression =
    formals match {
      case Value.ProperList(variables, _) =>
        Lambda(unsafeParseVariables(variables.toVector), body.map(unsafeParse(_)), location)
      case v => throw new ParseError("Other forms of lambda expressions not yet supported", v.location)
    }

  private def unsafeParseVariables(variables: Vector[Value]): Vector[Variable] =
    variables.map { variable =>
      unsafeParse(variable) match {
        case v: Variable => v
        case v           => throw new ParseError(s"Expected list of variables but got ${v}", v.location)
      }
    }
}
