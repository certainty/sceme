package de.lisp_unleashed.sceme
import java.io.IOException

import de.lisp_unleashed.sceme.parser.ScemeParser
import zio._
import zio.console.Console
import scala.util.{ Failure, Success }

object Repl extends App {
  override def run(args: List[String]): ZIO[ZEnv, Nothing, ExitCode] =
    (printBanner *> runRepl.forever)
      .as(ExitCode.success)
      .catchAll(e => console.putStrLn(s"Process died with: $e").as(ExitCode.failure))

  private def parse(line: String): String =
    ScemeParser.parse(line) match {
      case Failure(exception) => s"Error: ${exception.getMessage}"
      case Success(value)     => value.data.map(_.print).mkString("\n")
    }

  private val printBanner: ZIO[Console, Nothing, Unit] = console.putStrLn("""
                                                                            | ____
                                                                            | / ___|  ___ ___ _ __ ___   ___
                                                                            | \___ \ / __/ _ \ '_ ` _ \ / _ \
                                                                            |  ___) | (_|  __/ | | | | |  __/
                                                                            | |____/ \___\___|_| |_| |_|\___|
                                                                            |""".stripMargin)

  def runRepl: ZIO[Console, IOException, Unit] =
    for {
      _    <- console.putStr("sceme> ")
      form <- console.getStrLn
      _    <- console.putStrLn(parse(form))
    } yield ()
}
