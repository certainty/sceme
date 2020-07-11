package de.lisp_unleashed.sceme.sexp
import java.util.Objects
import de.lisp_unleashed.sceme.parser.Location

sealed trait Value extends Sexp

object Value {
  sealed trait Simple   extends Value
  sealed trait Compound extends Value
  sealed trait Callable extends Value

  trait ForeignLambda extends Callable {
    override def location: Option[Location] = None
    def call(args: Seq[Value]): Value
  }

  object ForeignLambda {
    def apply(f: PartialFunction[Seq[Value], Value]): ForeignLambda =
      new ForeignLambda {
        override def call(args: Seq[Value]): Value = f.apply(args)
      }
  }

  case class Symbol(value: scala.Predef.String, location: Option[Location]) extends Simple {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Symbol => true
      case _         => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Symbol(v, _) => v == value
      case _            => false
    }

    override val hashCode: Int = value.hashCode
  }

  object Symbol {
    def apply(value: scala.Predef.String): Symbol                     = new Symbol(value, None)
    def apply(value: scala.Predef.String, location: Location): Symbol = new Symbol(value, Some(location))
  }

  case class Boolean(value: scala.Boolean, location: Option[Location]) extends Simple {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Boolean => true
      case _          => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Boolean(v, _) => this.canEqual(o) && v == value
      case _             => false
    }

    override val hashCode: Int = value.hashCode
  }

  object Boolean {
    val True  = Boolean(true)
    val False = Boolean(false)

    def apply(value: scala.Boolean): Boolean                     = new Boolean(value, None)
    def apply(value: scala.Boolean, location: Location): Boolean = new Boolean(value, Some(location))
  }

  case class Char(value: scala.Char, location: Option[Location]) extends Simple {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Char => true
      case _       => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Char(v, _) => this.canEqual(o) && v == value
      case _          => false
    }

    override val hashCode: Int = value.hashCode
  }

  object Char {
    def apply(value: scala.Char): Char                     = new Char(value, None)
    def apply(value: scala.Char, location: Location): Char = new Char(value, Some(location))
  }

  case class String(value: scala.Predef.String, location: Option[Location]) extends Simple {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Char => true
      case _       => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case String(v, _) => this.canEqual(o) && v == value
      case _            => false
    }

    override val hashCode: Int = value.hashCode
  }

  object String {
    def apply(value: scala.Predef.String): String                     = new String(value, None)
    def apply(value: scala.Predef.String, location: Location): String = new String(value, Some(location))
  }

  trait Number[T] {
    def value: T
  }

  case class Fixnum(value: BigInt, location: Option[Location]) extends Simple with Number[BigInt] {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Fixnum => true
      case _         => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Fixnum(v, _) => this.canEqual(o) && v == value
      case _            => false
    }

    override val hashCode: Int = value.hashCode
  }

  object Fixnum {
    def apply(value: BigInt): Fixnum                     = new Fixnum(value, None)
    def apply(value: BigInt, location: Location): Fixnum = new Fixnum(value, Some(location))
  }

  case class Flonum(value: BigDecimal, location: Option[Location]) extends Simple with Number[BigDecimal] {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Flonum => true
      case _         => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Flonum(v, _) => this.canEqual(o) && v == value
      case _            => false
    }

    override val hashCode: Int = value.hashCode
  }

  object Flonum {
    def apply(value: BigDecimal): Flonum                     = new Flonum(value, None)
    def apply(value: BigDecimal, location: Location): Flonum = new Flonum(value, Some(location))
  }

  case class Void(location: Option[Location]) extends Simple {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Void => true
      case _       => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case _: Void => this.canEqual(o)
      case _       => false
    }
  }

  object Void {
    val singleton: Void = Void()

    def apply(): Void                   = Void()
    def apply(location: Location): Void = Void(location)
  }

  case class ProperList(value: scala.List[Value], location: Option[Location]) extends Compound {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: ProperList => true
      case _             => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case ProperList(ls, _) => this.canEqual(o) && ls == value
      case _                 => false
    }

    override val hashCode: Int = value.hashCode
  }

  object ProperList {
    def Null: ProperList = ProperList(Nil)

    def apply(value: Seq[Value]): ProperList                     = new ProperList(value.toList, None)
    def apply(value: Seq[Value], location: Location): ProperList = new ProperList(value.toList, Some(location))
  }

  case class ImproperList(value: (scala.List[Value], Value), location: Option[Location]) extends Compound {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: ImproperList => true
      case _               => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case ImproperList(v, _) => this.canEqual(o) && v == value
      case _                  => false
    }

    override val hashCode: Int = value.hashCode
  }

  object ImproperList {
    def apply(car: Seq[Value], cdr: Value): ImproperList = new ImproperList((car.toList, cdr), None)
    def apply(car: Seq[Value], cdr: Value, location: Location): ImproperList =
      new ImproperList((car.toList, cdr), Some(location))
  }

  case class Vector(value: scala.Vector[Value], location: Option[Location]) extends Compound {
    override def canEqual(that: Any): scala.Boolean = that match {
      case _: Vector => true
      case _         => false
    }

    override def equals(o: Any): scala.Boolean = o match {
      case Vector(v, _) => this.canEqual(o) && v == value
      case _            => false
    }

    override val hashCode: Int = value.hashCode
  }

  object Vector {
    val Null: Vector = Vector(Nil)

    def apply(value: Seq[Value]): Vector                     = new Vector(value.toVector, None)
    def apply(value: Seq[Value], location: Location): Vector = new Vector(value.toVector, Some(location))
  }

  // TODO: this should really be a closure
  case class Procedure[F[_]](formals: Seq[Value.Symbol], action: F[Value], location: Option[Location])
      extends Callable {
    override def canEqual(that: Any): scala.Boolean = false

    override def equals(o: Any): scala.Boolean = false

    override val hashCode: Int = Objects.hash(formals, location)
  }

  object Procedure {

    def apply[F[_]](formals: Seq[Value.Symbol], action: F[Value]): Procedure[F] = new Procedure(formals, action, None)
    def apply[F[_]](formals: Seq[Value.Symbol], action: F[Value], location: Location): Procedure[F] =
      new Procedure(formals, action, Some(location))
  }

  case class MultipleValues(values: Seq[Value], location: Option[Location]) extends Value {
    override def canEqual(that: Any): scala.Boolean = false

    override def equals(o: Any): scala.Boolean = false

    override val hashCode: Int = Objects.hash(values)
  }
}
