package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.runtime.Value

package object interpreter {
  type Op[T]   = zio.ZIO[Context, Throwable, T]
  type Program = Op[Value]
}
