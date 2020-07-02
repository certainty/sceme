package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.Parser
import de.lisp_unleashed.sceme.interpreter.zio_interpreter.Prelude
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import de.lisp_unleashed.sceme.reader.DefaultReader
import org.specs2.mutable.Specification
import zio.ZIO
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

  private def interpret(p: String) = {
    val output = for {
      (ast, _) <- ZIO.fromTry(parser.parse(p, "test"))
      result   <- interpreter.interpret(Seq(ast))
    } yield printer.print(result)

    Try(runtime.unsafeRun(output.provide(new Context(Prelude.env))))
  }

  private val printer     = new DefaultPrinter(Configuration.default)
  private val interpreter = new ZIOInterpreter(printer)
  private val parser      = new Parser(new DefaultReader)
  private val runtime     = Runtime.default
}
