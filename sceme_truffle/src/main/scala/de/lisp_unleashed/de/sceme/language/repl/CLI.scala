package de.lisp_unleashed.de.sceme.language.repl

import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.source.Source
import de.lisp_unleashed.de.sceme.language.ScemeLanguage
import de.lisp_unleashed.de.sceme.language.nodes.ScemeRootNode
import de.lisp_unleashed.de.sceme.language.runtime.ScemeContext
import scala.io.StdIn

object CLI {
  private val lang = new ScemeLanguage

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

  private def runSceme(sourceText: String) = {
    val ctx     = new ScemeContext(lang)
    val source  = Source.newBuilder(ScemeLanguage.ID, sourceText, "<console>").build()
    val program = lang.parseScemeSource(source)
    Truffle.getRuntime
      .createCallTarget(new ScemeRootNode(lang, ctx.globalFrame.getFrameDescriptor, program))
      .call(ctx.globalFrame)
  }
}
