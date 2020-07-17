package de.lisp_unleashed.de.sceme
import de.lisp_unleashed.sceme.parser.Expression.{ FixedArity, Lambda, Literal, QuasiQuote, Quote, Single, Variable }
import de.lisp_unleashed.sceme.parser._
import org.specs2.mutable.Specification

class ScemeParserSpec extends Specification {

  "literal" >> {
    parse("2343") must beLike {
      case Literal(v: FixnumSyntax) => v.value mustEqual 2343
    }

    parse("#t") must beLike {
      case Literal(v: BooleanSyntax) => v.value mustEqual true
    }

    parse("3.5") must beLike {
      case Literal(v: FlonumSyntax) => v.value mustEqual 3.5
    }

    parse("#()") must beLike {
      case Literal(v: VectorSyntax) => v.value must beEmpty
    }

    parse("#u8(10)") must beLike {
      case Literal(v: ByteVectorSyntax) => v.value mustEqual Vector(10.toByte)
    }

    parse("#\\a") must beLike {
      case Literal(v: CharacterSyntax) => v.value mustEqual 'a'
    }

    parse(""" "foo"  """) must beLike {
      case Literal(v: StringSyntax) => v.value mustEqual "foo"
    }
  }

  "variable" >> {
    parse("x") must beLike {
      case Variable(v: SymbolSyntax) => v.value mustEqual "x"
    }
  }

  "quotation" >> {
    parse("'foo") must beLike {
      case Quote(v: SymbolSyntax, _) => v.value mustEqual "foo"
    }

    parse("`foo") must beLike {
      case QuasiQuote(Literal(v: SymbolSyntax), _) => v.value mustEqual "foo"
    }
  }

  "smoke test" >> {
    parse("(list 1 2)") must beLike {
      case _ => true must beTrue
    }
  }

  "lambda" >> {
    parse("(lambda x y)") must beLike {
      case Lambda(Single(Variable(v)), _, _) => {
        v.value mustEqual "x"
      }
    }

    parse("(lambda () y)") must beLike {
      case Lambda(FixedArity(ls), _, _) => ls mustEqual Nil
    }

    parse("(lambda (x) y)") must beLike {
      case Lambda(FixedArity(List(Variable(x))), _, _) => x.value mustEqual "x"
    }
  }

  private def parse(input: String) =
    parser.parse(StringSource(input))

  private val parser = new ScemeParser
}
