package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import org.specs2.mutable.Specification
import zio._

import scala.util.Try

class ZIOIntepreterSpec extends Specification {
  "lists" >> {
    interpret("(list 1 2)") must beSuccessfulTry("'(1 2)")
    interpret("(cons 1 (list 1 2))") must beSuccessfulTry("'(1 1 2)")
    interpret("(cdr (list 1 2))") must beSuccessfulTry("'(2)")
    interpret("(car (list 1 2))") must beSuccessfulTry("1")
    interpret("(null? (list))") must beSuccessfulTry("#t")
    interpret("(null? (list 1 2))") must beSuccessfulTry("#f")
  }

  "conditionals" >> {
    interpret("(if #t 1 2)") must beSuccessfulTry("1")
    interpret("(if #f 1 2)") must beSuccessfulTry("2")

    interpret("(if 3 1 2)") must beSuccessfulTry("1")
    interpret("(if \"foo\" 1 2)") must beSuccessfulTry("1")
  }

  "smoke tests" >> {
    val program =
      """
        |((lambda (x y) (fx+ x y)) 1 2)
        |""".stripMargin

    interpret(program) must beSuccessfulTry("3")
  }

  private def interpret(p: String) = {
    val program = for {
      result <- ZIOInterpreter.interpret(p, new Context(Primitives.env))
    } yield printer.print(result)

    Try(runtime.unsafeRun(program))
  }

  private val printer = new DefaultPrinter(Configuration.default)
  private val runtime = Runtime.default
}
