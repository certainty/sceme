package de.lisp_unleashed.sceme.repl
import zio.{ console, ExitCode, ZEnv, ZIO }
import zio._

object CLI extends App {
  val printer    = new ReplPrinter(PrinterConfig.default)
  val simpleRepl = new SimpleRepl(printer)

  override def run(_args: List[String]): ZIO[ZEnv, Nothing, ExitCode] =
    (simpleRepl
      .run()
      .as(ExitCode.success))
      .catchAll(e => console.putStrLn(s"Process died with: $e").as(ExitCode.failure))
}
