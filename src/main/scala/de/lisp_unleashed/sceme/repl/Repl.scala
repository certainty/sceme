package de.lisp_unleashed.sceme.repl
import de.lisp_unleashed.sceme.parser.{ Ast, ScemeParser, SyntaxError }
import zio.console.Console
import zio.{ console, ZIO }

import scala.util.{ Failure, Success }

trait Repl[T] {
  def run(): T
}

class SimpleRepl(printer: Printer) extends Repl[ZIO[Console, Throwable, Unit]] {
  override def run(): ZIO[Console, Throwable, Unit] =
    printBanner *> loop().forever

  private def loop(): ZIO[Console, Throwable, Unit] =
    for {
      form <- read
      _    <- print(form)
    } yield ()

  private def read: ZIO[Console, Throwable, Either[Throwable, Ast.Program]] =
    for {
      _    <- console.putStr("sceme> ")
      line <- console.getStrLn
      data <- parse(line).either
    } yield data

  private def parse(line: String): ZIO[Console, Throwable, Ast.Program] =
    ScemeParser.parse(line) match {
      case Failure(exception) => ZIO.fail(exception)
      case Success(value)     => ZIO.succeed(value.data)
    }

  private def print(data: Either[Throwable, Ast.Program]): ZIO[Console, Throwable, Unit] = data match {
    case Right(p)             => console.putStrLn(printer.printAll(p))
    case Left(e: SyntaxError) => console.putStrLn(e.formattedError)
    case Left(e)              => ZIO.fail(e)
  }

  private val printBanner: ZIO[Console, Nothing, Unit] = console.putStrLn("""
                                                                            |  ____
                                                                            | / ___|  ___ ___ _ __ ___   ___
                                                                            | \___ \ / __/ _ \ '_ ` _ \ / _ \
                                                                            |  ___) | (_|  __/ | | | | |  __/
                                                                            | |____/ \___\___|_| |_| |_|\___|
                                                                            |""".stripMargin)
}
