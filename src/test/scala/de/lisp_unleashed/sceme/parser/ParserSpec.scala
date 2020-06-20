package de.lisp_unleashed.sceme.parser
import org.specs2.mutable.Specification

import scala.util.Success

class ParserSpec extends Specification {
  "ignores whitespace" >> {
    assertParses("   \t\r\n", Seq.empty)
  }

  "parses atoms" >> {
    assertParses("   #t", Seq(Ast.BooleanValue(true, Some(Location(1, 1, 1)))))
  }

  private def assertParses(input: String, expected: Seq[Ast.Expression]) =
    ScemeParser.parse(input) must beLike {
      case Success(result) => result.exps mustEqual (expected)
    }
}
