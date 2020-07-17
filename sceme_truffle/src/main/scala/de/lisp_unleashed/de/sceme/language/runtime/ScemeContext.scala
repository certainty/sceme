package de.lisp_unleashed.de.sceme.language.runtime

import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.frame.{ FrameDescriptor, MaterializedFrame, VirtualFrame }
import de.lisp_unleashed.de.sceme.language.ScemeLanguage

class ScemeContext(val language: ScemeLanguage) {
  private val globalFrameDescriptor: FrameDescriptor = new FrameDescriptor()

  val globalFrame: MaterializedFrame = {
    val frame = Truffle.getRuntime.createVirtualFrame(null, globalFrameDescriptor)
    addTopLevel(frame).materialize()
  }

  private def addTopLevel(frame: VirtualFrame): VirtualFrame = frame
}
