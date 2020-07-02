package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.sexp.Value

package object zio_interpreter {
  type Op[T]   = zio.ZIO[Context, Throwable, T]
  type Program = Op[Value]
}
