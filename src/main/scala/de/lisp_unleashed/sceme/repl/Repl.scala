package de.lisp_unleashed.sceme.repl
import de.lisp_unleashed.sceme.Value
import de.lisp_unleashed.sceme.parser.SourceMapper
import de.lisp_unleashed.sceme.printer.{ Configuration, DefaultPrinter }
import de.lisp_unleashed.sceme.reader.{ DefaultReader, SyntaxError }
import zio.console.Console
import zio.{ console, ZIO }
import scala.util.{ Failure, Success, Try }

trait Repl[T] {
  def run(): T
}

class SimpleRepl extends Repl[ZIO[Console, Throwable, Unit]] {
  private val reader  = new DefaultReader
  private val printer = new DefaultPrinter(Configuration.default)

  override def run(): ZIO[Console, Throwable, Unit] =
    printBanner *> loop.forever

  private val read: ZIO[Console, Throwable, Try[(Value, SourceMapper)]] =
    console.putStr("sceme> ") *> console.getStrLn.map(reader.tryRead(_, "repl"))

  private def eval(form: Try[(Value, SourceMapper)]): ZIO[Console, Throwable, Try[(Value, SourceMapper)]] =
    form match {
      case Success((data, _)) =>
        val compiled = data
        for {
          _ <- console.putStrLn("Compiling")
          _ <- console.putStrLn(compiled.toString)
          _ <- console.putStrLn("\n\n")
        } yield form
      case _ => ZIO.succeed(form)
    }

  private val loop: ZIO[Console, Throwable, Unit] = read >>= eval >>= print

  private def print(data: Try[(Value, SourceMapper)]): ZIO[Console, Throwable, Unit] = data match {
    case Success((p, _))         => console.putStrLn(printer.print(p))
    case Failure(e: SyntaxError) => console.putStrLn(e.formattedError)
    case Failure(e)              => ZIO.fail(e)
  }

  private val printBanner: ZIO[Console, Nothing, Unit] = console.putStrLn("""
                                                                            |  ____
                                                                            | / ___|  ___ ___ _ __ ___   ___
                                                                            | \___ \ / __/ _ \ '_ ` _ \ / _ \
                                                                            |  ___) | (_|  __/ | | | | |  __/
                                                                            | |____/ \___\___|_| |_| |_|\___|
                                                                            |""".stripMargin)
}
