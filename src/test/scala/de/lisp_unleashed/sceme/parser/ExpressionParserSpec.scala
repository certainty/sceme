package de.lisp_unleashed.sceme.parser
import de.lisp_unleashed.sceme.reader.DefaultReader
import de.lisp_unleashed.sceme.sexp.Expression._
import de.lisp_unleashed.sceme.sexp.{ Expression, Value }
import org.specs2.mutable.Specification

import scala.util.{ Success, Try }

class ExpressionParserSpec extends Specification {
  "smoke test" >> {
    parse("'5") must beLike {
      case Success(Quote(Value.Fixnum(n, _))) => n mustEqual 5
    }

    parse("'(this is a list)") must beSuccessfulTry

    parse("\"foo\"") must beLike {
      case Success(Literal(Value.String(v, _))) => v mustEqual "foo"
    }

//    parse("(lambda (x y) (+ x y))") must beLike {
//      case Success(
//          Lambda(List(Variable(Value.Symbol("x", _)), Variable(Value.Symbol("x", _))),
//                 List(
//                   ProcedureCall(Variable(Value.Symbol("+", _)),
//                                 List(Variable(Value.Symbol("x", _)), Variable(Value.Symbol("y", _))))
//                 ),
//                 _)
//          ) =>
//        true mustEqual true
//    }
  }

  private def parse(input: String): Try[Expression] =
    reader.read(input).toTry.flatMap {
      case ((value, _)) => parser.parse(value)
    }

  private val parser = new ExpressionParser
  private val reader = new DefaultReader
}
