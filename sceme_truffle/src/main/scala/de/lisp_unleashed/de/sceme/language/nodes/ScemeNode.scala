package de.lisp_unleashed.de.sceme.language.nodes

import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.{ Node, NodeInfo }
import com.oracle.truffle.api.source.SourceSection
import de.lisp_unleashed.de.sceme.language.{ ScemeLanguage, TruffleSourceScemeSource }
import de.lisp_unleashed.sceme.parser.Location

@NodeInfo(language = ScemeLanguage.ID, description = "The abstract base node for all sceme nodes")
trait ScemeNode[@specialized +T] extends Node {
  def execute(virtualFrame: VirtualFrame): T
}

object ScemeNode {
  def createSourceSection(source: TruffleSourceScemeSource, location: Location): SourceSection =
    source.source.createSection(location.lineNumber, location.start, location.stop)
}
