package de.lisp_unleashed.de.sceme
import de.lisp_unleashed.sceme.parser.Expression.Lambda
import de.lisp_unleashed.sceme.parser.{ProperListSyntax, ScemeParser}
import org.specs2.mutable.Specification


class ScemeParserSpec extends Specification {

    "lambda" >> {
        parse("(lambda x y)") must beLike {
            case Lambda(Right(sym), _, _) => sym.value mustEqual("x")
        }

        parse("(lambda () y)") must beLike {
            case Lambda(Left(ProperListSyntax(v, _)), _, _) => v mustEqual Nil
        }

      parse("(lambda (x) y)") must beLike {
        case Lambda(Left(ProperListSyntax(List(s), _)), _, _) => s.value mustEqual "x"
      }
    }

    private def parse(input: String) = {
       parser.parse(input)
    }
    private val parser = new ScemeParser
}
