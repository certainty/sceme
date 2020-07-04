package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.interpreter.zio_interpreter.Primitives
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import org.specs2.mutable.Specification
import zio._

import scala.util.Try

class ZIOIntepreterSpec extends Specification {
  "smoke tests" >> {
    val program =
      """
        |((lambda (x y) (fx+ x y)) 1 2)
        |""".stripMargin

    interpret(program) must beSuccessfulTry("3")
  }

  "more smoke tests" >> {
    val program =
      """
        |(typeOf (lambda (x) x))
        |""".stripMargin

    interpret(program) must beSuccessfulTry("Procedure")
  }

  "conditionals" >> {
    interpret("(if #t 1 2)") must beSuccessfulTry("1")
    interpret("(if #f 1 2)") must beSuccessfulTry("2")
  }

  private def interpret(p: String) = {
    val program = for {
      result <- ZIOInterpreter.interpret(p, "test", new Context(Primitives.env))
    } yield printer.print(result)

    Try(runtime.unsafeRun(program))
  }

  private val printer = new DefaultPrinter(Configuration.default)
  private val runtime = Runtime.default
}
