package de.lisp_unleashed.sceme.language
import com.oracle.truffle.api.source.Source
import de.lisp_unleashed.sceme.language.parser.ScemeParser

import scala.io.StdIn

object ScemeMain {
  def main(args: Array[String]): Unit =
    repl()

  private def repl(): Unit = {
    var continue = true
    while (continue) {
      val line = StdIn.readLine("sceme> ")
      if (line == null) {
        continue = false
      } else {
        runSceme(line)
      }
    }
  }

  private def runSceme(sourceText: String): Unit = {
    val source = Source.newBuilder(ScemeLanguage.ID, sourceText, "<console>").build()
    // TODO: at some point register the language as a component and use this to retrieve an engine here
    val ast = ScemeParser.parseProgram(source)
    println(s"Running on ${ast}")
    ()
  }

}
