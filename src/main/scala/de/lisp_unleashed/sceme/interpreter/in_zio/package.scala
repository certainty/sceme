package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.{ Environment, Value }

package object in_zio {
  type Instruction[T] = zio.ZIO[Environment, Throwable, T]
  type Program        = Instruction[Value]
}
