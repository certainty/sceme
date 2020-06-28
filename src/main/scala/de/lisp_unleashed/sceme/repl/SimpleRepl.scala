package de.lisp_unleashed.sceme.repl
import java.io.EOFException
import de.lisp_unleashed.sceme.parser.SourceMapper
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import de.lisp_unleashed.sceme.reader.DefaultReader
import de.lisp_unleashed.sceme.{ ReadError, RuntimeError, Value, ZIOCompiler }
import zio.console.Console
import zio.{ console, ZIO }

class SimpleRepl extends Repl[ZIO[Console, Throwable, Unit]] {
  private val reader   = new DefaultReader
  private val printer  = new DefaultPrinter(Configuration.default)
  private val compiler = new ZIOCompiler

  override def run(): ZIO[Console, Throwable, Unit] =
    (printBanner *> loop.forever).catchAll {
      case _: EOFException => ZIO.succeed(())
    }

  private val read: ZIO[Console, Throwable, (Value, SourceMapper)] = {
    console.putStr("sceme> ") *> console.getStrLn >>= readDatum
  }

  private def readDatum(line: String): ZIO[Console, Throwable, (Value, SourceMapper)] =
    ZIO.fromEither(reader.read(line, "repl"))

  private def eval(datum: Value): ZIO[Console, Throwable, Value] = {
    val program = compiler.compile(Seq(datum))
    program.provide(Repl.environment)
  }

  private val loop: ZIO[Console, Throwable, Unit] = {
    for {
      (datum, sm) <- read
      _           <- (eval(datum) >>= print).catchAll(handleErrors(sm))
    } yield ()
  }

  private def print(datum: Value): ZIO[Console, Throwable, Unit] =
    console.putStrLn(printer.print(datum))

  private def handleErrors(sourceMapper: SourceMapper): PartialFunction[Throwable, ZIO[Console, Throwable, Unit]] = {
    case e: ReadError    => console.putStrLn(s"Error: ${e.getMessage} caused by: ${e.getCause.getMessage}")
    case e: RuntimeError => console.putStrLn(e.fullMessage(sourceMapper))
  }

  private val printBanner: ZIO[Console, Nothing, Unit] = console.putStrLn("""
                                                                            |  ____
                                                                            | / ___|  ___ ___ _ __ ___   ___
                                                                            | \___ \ / __/ _ \ '_ ` _ \ / _ \
                                                                            |  ___) | (_|  __/ | | | | |  __/
                                                                            | |____/ \___\___|_| |_| |_|\___|
                                                                            |""".stripMargin)
}
