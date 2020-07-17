package de.lisp_unleashed.de.sceme.language.nodes
import com.oracle.truffle.api.frame.{ FrameDescriptor, VirtualFrame }
import com.oracle.truffle.api.nodes.Node.Children
import com.oracle.truffle.api.nodes.RootNode
import de.lisp_unleashed.de.sceme.language.ScemeLanguage

class ScemeRootNode(language: ScemeLanguage, frameDescriptor: FrameDescriptor, nodes: Seq[ScemeNode[_]])
    extends RootNode(language, frameDescriptor) {
  @Children private final val children = nodes

  override def execute(frame: VirtualFrame): Object = {
    var result: Object = null
    children.foreach { child =>
      result = child.execute(frame).asInstanceOf[Object]
    }
    result
  }
}
