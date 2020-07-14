package de.lisp_unleashed.sceme.repl
import java.io.EOFException

import de.lisp_unleashed.sceme.interpreter.{ Context, RuntimeError, ZIOInterpreter }
import de.lisp_unleashed.sceme.parser.ParseError
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import de.lisp_unleashed.sceme.runtime.Value
import zio.console.Console
import zio.{ console, ZIO }

class SimpleRepl extends Repl[ZIO[Console, Throwable, Unit]] {
  private val printer     = new DefaultPrinter(Configuration.default)
  private val replContext = new Context(Repl.environment)

  override def run(): ZIO[Console, Throwable, Unit] =
    (printBanner *> loop.forever).catchAll {
      case _: EOFException => ZIO.succeed(())
    }

  private val read: ZIO[Console, Throwable, String] =
    console.putStr("sceme> ") *> console.getStrLn

  private def eval(input: String) =
    for {
      value <- ZIOInterpreter.interpret(input, replContext)
    } yield value

  private val loop: ZIO[Console, Throwable, Unit] =
    for {
      exprs  <- read
      result <- (eval(exprs) >>= print).catchAll(handleErrors)
    } yield result

  private def print(datum: Value): ZIO[Console, Throwable, Unit] =
    console.putStrLn(printer.print(datum))

  private def handleErrors: PartialFunction[Throwable, ZIO[Console, Throwable, Unit]] = {
    case e: RuntimeError => console.putStrLn(e.getMessage)
    case e: ParseError   => console.putStrLn(e.getMessage)
  }

  private val printBanner: ZIO[Console, Nothing, Unit] = console.putStrLn("""
                                                                            |  ____
                                                                            | / ___|  ___ ___ _ __ ___   ___
                                                                            | \___ \ / __/ _ \ '_ ` _ \ / _ \
                                                                            |  ___) | (_|  __/ | | | | |  __/
                                                                            | |____/ \___\___|_| |_| |_|\___|
                                                                            |""".stripMargin)
}
