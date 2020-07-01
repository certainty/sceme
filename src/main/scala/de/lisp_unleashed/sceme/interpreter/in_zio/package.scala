package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.ScemeRuntime
import de.lisp_unleashed.sceme.syntax.Value

package object in_zio {
  type Instruction[T] = zio.ZIO[ScemeRuntime, Throwable, T]
  type Program        = Instruction[Value]
}
