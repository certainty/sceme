package de.lisp_unleashed.de.sceme.language
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy
import com.oracle.truffle.api.source.Source
import com.oracle.truffle.api.{ CallTarget, TruffleLanguage }
import de.lisp_unleashed.de.sceme.language.nodes.ScemeNode
import de.lisp_unleashed.de.sceme.language.parser_backend.TruffleBackend
import de.lisp_unleashed.de.sceme.language.runtime.ScemeContext
import de.lisp_unleashed.sceme.parser.{ ScemeParser, ScemeSource }
import org.antlr.v4.runtime.{ CharStreams, CodePointCharStream }

case class TruffleSourceScemeSource(source: Source) extends ScemeSource {
  override def stream: CodePointCharStream =
    CharStreams.fromReader(source.getReader)
}

@TruffleLanguage.Registration(
  id = ScemeLanguage.ID,
  name = ScemeLanguage.NAME,
  version = ScemeLanguage.VERSION,
  defaultMimeType = ScemeLanguage.MIME_TYPE,
  contextPolicy = ContextPolicy.SHARED,
)
class ScemeLanguage extends TruffleLanguage[ScemeContext] {
  override def createContext(env: TruffleLanguage.Env): ScemeContext = new ScemeContext(this)

  override def parse(request: TruffleLanguage.ParsingRequest): CallTarget = {
    parseScemeSource(request.getSource)
    ???
  }

  def parseScemeSource(source: Source): Seq[ScemeNode[_]] = {
    val parser         = new ScemeParser
    val ast            = parser.parseProgram(TruffleSourceScemeSource(source))
    val truffleProgram = new TruffleBackend(ast)
    truffleProgram.toTruffle
  }
}

object ScemeLanguage {
  final val MIME_TYPE = "application/x-sceme"
  final val NAME      = "Sceme"
  final val ID        = "sceme"
  final val VERSION   = "0.1"
}
