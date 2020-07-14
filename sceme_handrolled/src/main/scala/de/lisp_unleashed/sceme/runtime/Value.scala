package de.lisp_unleashed.sceme.runtime
import java.util.Objects

sealed trait Value

object Value {
  sealed trait Callable extends Value

  trait ForeignLambda extends Callable {
    def call(args: List[Value]): Value
  }

  object ForeignLambda {
    def apply(f: PartialFunction[List[Value], Value]): ForeignLambda =
      new ForeignLambda {
        override def call(args: List[Value]): Value = f.apply(args)
      }
  }

  case class Symbol(value: scala.Predef.String) extends Value

  case class Boolean(value: scala.Boolean) extends Value

  object Boolean {
    val True  = Boolean(true)
    val False = Boolean(false)
  }

  case class Char(value: scala.Char) extends Value

  case class String(value: scala.Predef.String) extends Value

  trait Number[T] extends Value {
    def value: T
  }

  case class Fixnum(value: BigInt) extends Number[BigInt]

  case class Flonum(value: BigDecimal) extends Number[BigDecimal]

  case object Void extends Value

  case class ProperList(value: scala.List[Value]) extends Value

  object ProperList {
    def Null: ProperList = ProperList(Nil)
  }

  case class ImproperList(value: (scala.List[Value], Value)) extends Value

  object ImproperList {
    def apply(car: Seq[Value], cdr: Value): ImproperList = new ImproperList((car.toList, cdr))
  }

  case class Vector(value: scala.Vector[Value]) extends Value

  object Vector {
    val Null: Vector = Vector(scala.Vector.empty)
  }

  // TODO: this should really be a closure
  case class Procedure[F[_]](formals: Seq[Value.Symbol], action: F[Value]) extends Callable {
    override def canEqual(that: Any): scala.Boolean = false

    override def equals(o: Any): scala.Boolean = false

    override val hashCode: Int = Objects.hash(formals)
  }

  case class MultipleValues(values: Seq[Value]) extends Value
}
