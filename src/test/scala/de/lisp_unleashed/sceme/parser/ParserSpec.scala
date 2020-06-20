package de.lisp_unleashed.sceme.parser
import org.specs2.mutable.Specification

import scala.util.{ Success, Try }

class ParserSpec extends Specification {
  "parses" >> {
    "chars" >> {
      "whitespace" >> {
        parse("#\\newline") must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual '\n'
        }

        parse("#\\space") must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual ' '
        }
      }

      "any char" >> {
        parse("#\\a") must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual 'a'
        }
      }
    }

    "boolean" >> {
      parse("#t") must beLike {
        case Success(Vector(Ast.BooleanValue(v, _))) => v must beTrue
      }

      parse("#f") must beLike {
        case Success(Vector(Ast.BooleanValue(v, _))) => v must beFalse
      }
    }
  }

  private def parse(input: String): Try[Vector[Ast.Expression]] =
    ScemeParser.parse(input).map(_.exps.toVector)
}
