package de.lisp_unleashed.de.sceme
import de.lisp_unleashed.sceme.parser.{
  BooleanSyntax,
  CharacterSyntax,
  FixnumSyntax,
  ScemeReader,
  StringSyntax,
  SymbolSyntax
}
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

  "numbers" >> {
    read("65") must beLike {
      case FixnumSyntax(value, _) => value.toInt mustEqual 65
    }
  }

  "strings" >> {
    read(""" "this is a string" """) must beLike {
      case StringSyntax(value, _) => value mustEqual "this is a string"
    }

    read("\"\"") must beLike {
      case StringSyntax(value, _) => value mustEqual ""
    }

    read("""
           |"fooooo
           |
           |"
           |
           |""".stripMargin) must beLike {
      case StringSyntax(value, _) => value mustEqual ("fooooo\n\n")
    }

    read("""
           |"foo \" bar baz"
           |""".stripMargin) must beLike {
      case StringSyntax(value, _) => value mustEqual "foo \\\" bar baz"
    }
  }

  "symbols" >> {
    read("""foo""") must beLike {
      case SymbolSyntax(value, delimited, _) => {
        value mustEqual "foo"
        delimited must beFalse
      }
    }

    read("""|complicated symbol foo|""") must beLike {
      case SymbolSyntax(value, delimited, _) => {
        value mustEqual "complicated symbol foo"
        delimited must beTrue
      }
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
