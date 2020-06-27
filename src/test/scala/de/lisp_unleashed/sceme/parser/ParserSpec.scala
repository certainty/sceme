package de.lisp_unleashed.sceme.parser
import org.specs2.mutable.Specification

import scala.util.{ Success, Try }

class ParserSpec extends Specification {
  "parses" >> {
    "chars" >> {
      "whitespace" >> {
        parse("#\\newline") must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual '\n'
        }

        parse("#\\space") must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual ' '
        }
      }

      "any char" >> {
        parse("#\\a") must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual 'a'
        }

        parse("#\\ ") must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual ' '
        }

        parse("""#\
          """) must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual '\n'
        }

        parse("#\\\\") must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual '\\'
        }

      }

      "unicode" >> {
        parse("#\\u3434") must beLike {
          case Success(Vector(Ast.Char(v, _))) => v mustEqual '㐴'
        }
      }
    }

    "boolean" >> {
      parse("#t") must beLike {
        case Success(Vector(Ast.Boolean(v, _))) => v must beTrue
      }

      parse("#f") must beLike {
        case Success(Vector(Ast.Boolean(v, _))) => v must beFalse
      }
    }

    "string" >> {
      parse(""" "this is my string" """) must beLike {
        case Success(Vector(Ast.String(v, _))) => v mustEqual ("this is my string")
      }
    }

    "symbol" >> {
      parse(""" 'foo """) must beLike {
        case Success(Vector(Ast.Abbreviation(Ast.Quote, Ast.Symbol(v, _), _))) => v mustEqual "foo"
      }
    }

    "lists" >> {
      "proper" >> {
        parse(""" (1 "foo") """) must beLike {
          case Success(Vector(Ast.ProperList(List(Ast.Fixnum(v, _), Ast.String("foo", _)), _))) =>
            v mustEqual 1
        }
      }

      "improper" >> {
        parse(""" (1 . "foo") """) must beLike {
          case Success(Vector(Ast.ImproperList(List(Ast.Fixnum(v, _)), Ast.String("foo", _), _))) =>
            v mustEqual 1
        }
      }
    }

    "vectors" >> {
      parse("""#(1 "foo") """) must beLike {
        case Success(Vector(Ast.Vector(Vector(Ast.Fixnum(v, _), Ast.String("foo", _)), _))) =>
          v mustEqual 1
      }
    }
  }

  private def parse(input: String): Try[Vector[Ast.Datum]] =
    ScemeParser.parse(input).map(_.data.toVector)
}
