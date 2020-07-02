package de.lisp_unleashed.sceme.repl
import java.io.EOFException

import de.lisp_unleashed.sceme.interpreter.{ Context, RuntimeError, ZIOInterpreter }
import de.lisp_unleashed.sceme.parser.{ ParseError, SourceMapper }
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import de.lisp_unleashed.sceme.reader.DefaultReader
import de.lisp_unleashed.sceme.sexp.{ Expression, Value }
import de.lisp_unleashed.sceme.{ Parser, ReadError }
import zio.console.Console
import zio.{ console, ZIO }

class SimpleRepl extends Repl[ZIO[Console, Throwable, Unit]] {
  private val reader      = new DefaultReader
  private val printer     = new DefaultPrinter(Configuration.default)
  private val parser      = new Parser(reader)
  private val interpreter = new ZIOInterpreter(printer)

  override def run(): ZIO[Console, Throwable, Unit] =
    (printBanner *> loop.forever).catchAll {
      case _: EOFException => ZIO.succeed(())
    }

  private val read: ZIO[Console, Throwable, (Expression, SourceMapper)] = {
    console.putStr("sceme> ") *> console.getStrLn >>= parse
  }

  private def parse(line: String): ZIO[Console, Throwable, (Expression, SourceMapper)] =
    ZIO.fromTry(parser.parse(line, "repl"))

  private def eval(expr: Expression): ZIO[Console, Throwable, Value] = {
    val program = interpreter.interpret(Seq(expr))
    program.provide(new Context(Repl.environment))
  }

  private val loop: ZIO[Console, Throwable, Unit] = {
    for {
      (expr, sm) <- read // might fail hard
      _          <- (eval(expr) >>= print).catchAll(handleErrors(sm))
    } yield ()
  }

  private def print(datum: Value): ZIO[Console, Throwable, Unit] =
    console.putStrLn(printer.print(datum))

  private def handleErrors(sourceMapper: SourceMapper): PartialFunction[Throwable, ZIO[Console, Throwable, Unit]] = {
    case e: ReadError    => console.putStrLn(s"Error: ${e.getMessage} caused by: ${e.getCause.getMessage}")
    case e: RuntimeError => console.putStrLn(e.fullMessage(sourceMapper))
    case e: ParseError   => console.putStrLn(e.fullMessage(sourceMapper))
  }

  private val printBanner: ZIO[Console, Nothing, Unit] = console.putStrLn("""
                                                                            |  ____
                                                                            | / ___|  ___ ___ _ __ ___   ___
                                                                            | \___ \ / __/ _ \ '_ ` _ \ / _ \
                                                                            |  ___) | (_|  __/ | | | | |  __/
                                                                            | |____/ \___\___|_| |_| |_|\___|
                                                                            |""".stripMargin)
}
