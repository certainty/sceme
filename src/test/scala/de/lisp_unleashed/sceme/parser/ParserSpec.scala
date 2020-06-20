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

        parse("#\\ ") must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual ' '
        }

        parse("""#\
          """) must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual '\n'
        }

        parse("#\\\\") must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual '\\'
        }

      }

      "unicode" >> {
        parse("#\\u3434") must beLike {
          case Success(Vector(Ast.CharValue(v, _))) => v mustEqual '㐴'
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

    "string" >> {
      parse(""" "this is my string" """) must beLike {
        case Success(Vector(Ast.StringValue(v, _))) => v mustEqual ("this is my string")
      }
    }
  }

  private def parse(input: String): Try[Vector[Ast.Expression]] =
    ScemeParser.parse(input).map(_.exps.toVector)
}
