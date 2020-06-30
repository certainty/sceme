package de.lisp_unleashed.sceme.repl
import zio.{ ExitCode, ZEnv, ZIO, console, _ }

object CLI extends App {
  val simpleRepl = new SimpleRepl

  override def run(_args: List[String]): ZIO[ZEnv, Nothing, ExitCode] =
    (simpleRepl
      .run()
      .as(ExitCode.success))
      .catchAll(e => console.putStrLn(s"Process died with: $e").as(ExitCode.failure))
}
