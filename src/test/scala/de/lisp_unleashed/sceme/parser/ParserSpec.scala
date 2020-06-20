package de.lisp_unleashed.sceme.parser
import org.specs2.mutable.Specification

import scala.util.{ Success, Try }

class ParserSpec extends Specification {
  "parses atoms" >> {
    parse("#t") must beLike {
      case Success(Vector(Ast.BooleanValue(v, _))) => v must beTrue
    }
  }

  private def parse(input: String): Try[Vector[Ast.Expression]] =
    ScemeParser.parse(input).map(_.exps.toVector)
}
