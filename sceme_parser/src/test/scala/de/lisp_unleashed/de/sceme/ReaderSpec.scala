package de.lisp_unleashed.de.sceme
import de.lisp_unleashed.sceme.parser.{ BooleanSyntax, CharacterSyntax, ScemeReader, StringSyntax }
import org.specs2.mutable.Specification

class ReaderSpec extends Specification {

  "char" >> {
    read("""#\f""") must beLike {
      case CharacterSyntax(value, _) => value mustEqual 'f'
    }

    read("""#\space""") must beLike {
      case CharacterSyntax(value, _) => value mustEqual ' '
    }

    read("#\\u344f") must beLike {
      case CharacterSyntax(value, _) => value mustEqual '㑏'
    }

    read("#\\x65") must beLike {
      case CharacterSyntax(value, _) => value mustEqual 'e'
    }
  }

  "strings" >> {
    read(""" "this is a string" """) must beLike {
      case StringSyntax(value, _) => value mustEqual "this is a string"
    }

    read("\"\"") must beLike {
      case StringSyntax(value, _) => value mustEqual ""
    }
  }

  "boolean" >> {
    read("""#t""") must beLike {
      case BooleanSyntax(value, _) => value must beTrue
    }

    read("""#true""") must beLike {
      case BooleanSyntax(value, _) => value must beTrue
    }

    read("""#f""") must beLike {
      case BooleanSyntax(value, _) => value must beFalse
    }

    read("""#false""") must beLike {
      case BooleanSyntax(value, _) => value must beFalse
    }
  }

  private def read(input: String) =
    ScemeReader.read(input)
}
