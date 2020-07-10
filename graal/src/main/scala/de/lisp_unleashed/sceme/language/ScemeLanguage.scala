package de.lisp_unleashed.sceme.language
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy
import com.oracle.truffle.api.{ CallTarget, TruffleLanguage }
import de.lisp_unleashed.sceme.language.parser.ScemeParser
import de.lisp_unleashed.sceme.language.runtime.ScemeContext

@TruffleLanguage.Registration(
  id = ScemeLanguage.ID,
  name = ScemeLanguage.NAME,
  version = ScemeLanguage.VERSION,
  defaultMimeType = ScemeLanguage.MIME_TYPE,
  contextPolicy = ContextPolicy.SHARED,
)
class ScemeLanguage extends TruffleLanguage[ScemeContext] {
  override def createContext(env: TruffleLanguage.Env): ScemeContext = ???

  override def parse(request: TruffleLanguage.ParsingRequest): CallTarget = {
    val source = request.getSource
    ScemeParser.parseProgram(source)
    ???
  }
}

object ScemeLanguage {
  final val MIME_TYPE = "application/x-sceme"
  final val NAME      = "Sceme"
  final val ID        = "sceme"
  final val VERSION   = "0.1"
}
