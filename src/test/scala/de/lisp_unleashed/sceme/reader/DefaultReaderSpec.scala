package de.lisp_unleashed.sceme.reader

import de.lisp_unleashed.sceme.Value
import org.specs2.mutable.Specification

import scala.util.{ Success, Try }

class DefaultReaderSpec extends Specification {
  private val reader = new DefaultReader

  "parses" >> {
    "chars" >> {
      "whitespace" >> {
        read("#\\newline") must beLike {
          case Success(Value.Char(v, _)) => v mustEqual '\n'
        }

        read("#\\space") must beLike {
          case Success(Value.Char(v, _)) => v mustEqual ' '
        }
      }

      "any char" >> {
        read("#\\a") must beLike {
          case Success(Value.Char(v, _)) => v mustEqual 'a'
        }

        read("#\\ ") must beLike {
          case Success(Value.Char(v, _)) => v mustEqual ' '
        }

        read("""#\
          """) must beLike {
          case Success(Value.Char(v, _)) => v mustEqual '\n'
        }

        read("#\\\\") must beLike {
          case Success(Value.Char(v, _)) => v mustEqual '\\'
        }

      }

      "unicode" >> {
        read("#\\u3434") must beLike {
          case Success(Value.Char(v, _)) => v mustEqual '㐴'
        }
      }
    }

    "boolean" >> {
      read("#t") must beLike {
        case Success(Value.Boolean(v, _)) => v must beTrue
      }

      read("#f") must beLike {
        case Success(Value.Boolean(v, _)) => v must beFalse
      }
    }

    "string" >> {
      read(""" "this is my string" """) must beLike {
        case Success(Value.String(v, _)) => v mustEqual ("this is my string")
      }
    }

    "symbol" >> {
      read(""" 'foo """) must beLike {
        case Success(Value.Quote(Value.Symbol(v, _), _)) => v mustEqual "foo"
      }
    }

    "lists" >> {
      "proper" >> {
        read(""" (1 "foo") """) must beLike {
          case Success(Value.ProperList(List(Value.Fixnum(v, _), Value.String("foo", _)), _)) =>
            v mustEqual 1
        }
      }

      "improper" >> {
        read(""" (1 . "foo") """) must beLike {
          case Success(Value.ImproperList((List(Value.Fixnum(v, _)), Value.String("foo", _)), _)) =>
            v mustEqual 1
        }
      }
    }

    "vectors" >> {
      read("""#(1 "foo") """) must beLike {
        case Success(Value.Vector(Vector(Value.Fixnum(v, _), Value.String("foo", _)), _)) =>
          v mustEqual 1
      }
    }
  }

  private def read(input: String): Try[Value] =
    reader.tryRead(input, "tests").map(_._1)
}
