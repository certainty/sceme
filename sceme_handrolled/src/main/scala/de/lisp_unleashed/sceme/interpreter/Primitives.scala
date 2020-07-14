package de.lisp_unleashed.sceme.interpreter
import de.lisp_unleashed.sceme.runtime.Value
import de.lisp_unleashed.sceme.runtime.Value.{ Callable, Fixnum, ForeignLambda }

object Primitives {

  val FxPlus = ForeignLambda {
    case Seq() => throw ArityError(Variadic(2), 0)
    case args =>
      var result = BigInt(0)
      args.foreach {
        case Fixnum(v) => result += v
        case _         => throw ArgumentError("Expected #<fixnum> but got #{v}")
      }
      Fixnum(result)
  }

  val FxMult = ForeignLambda {
    case Seq() => throw ArityError(Variadic(2), 0)
    case args =>
      var result = BigInt(1)
      args.foreach {
        case Fixnum(v) => result *= v
        case _         => throw ArgumentError("Expected #<fixnum> but got #{v}")
      }
      Fixnum(result)
  }

  val FxMinus = ForeignLambda {
    case Seq() => throw ArityError(Variadic(2), 0)
    case Fixnum(v) +: rest =>
      var result = v
      rest.foreach {
        case Fixnum(v) => result -= v
        case _         => throw ArgumentError("Expected #<fixnum> but got #{v}")
      }
      Fixnum(result)
    case _ => throw ArgumentError("Invalid arguments supplied")
  }

  val FxDiv = ForeignLambda {
    case Seq() => throw ArityError(Variadic(2), 0)
    case Fixnum(v) +: rest =>
      var result = v
      rest.foreach {
        case Fixnum(v) => result = result / v
        case _         => throw ArgumentError("Expected #<fixnum> but got #{v}")
      }
      Fixnum(result)
    case _ => throw ArgumentError("Invalid arguments supplied")
  }

  val Equal = ForeignLambda {
    case Seq(_: Callable, _) => throw ArgumentError("Can't test precedures for equality")
    case Seq(_, _: Callable) => throw ArgumentError("Can't test precedures for equality")
    case Seq(x, y)           => Value.Boolean(x.equals(y))
    case s                   => throw ArityError(ExpectFixed(2), s.size)
  }

  // TODO: fix it for lists
  val Eqv = ForeignLambda {
    case Seq(x, y) => Value.Boolean(x.eq(y))
    case s         => throw ArityError(ExpectFixed(2), s.size)
  }

  // Lists
  val MakeList = ForeignLambda {
    case s => Value.ProperList(s)
  }

  val NullP = ForeignLambda {
    case Seq(Value.ProperList(Nil)) => Value.Boolean(true)
    case Seq(Value.ProperList(_))   => Value.Boolean(false)
    case Seq(_)                     => throw ArgumentError("Invalid argument")
    case s                          => throw ArityError(ExpectFixed(1), s.size)
  }

  val Car = ForeignLambda {
    case Seq(Value.ProperList(Nil))       => throw ArgumentError("Can't get car from empty list")
    case Seq(Value.ProperList(head :: _)) => head
    case Seq(_)                           => throw ArgumentError("Invalid argument")
    case s                                => throw ArityError(ExpectFixed(1), s.size)
  }

  val Cdr = ForeignLambda {
    case Seq(Value.ProperList(Nil))       => throw ArgumentError("Can't get car from empty list")
    case Seq(Value.ProperList(_ :: tail)) => Value.ProperList(tail)
    case Seq(_)                           => throw ArgumentError("Invalid argument")
    case s                                => throw ArityError(ExpectFixed(1), s.size)
  }

  val Cons = ForeignLambda {
    case Seq(v, Value.ProperList(ls))           => Value.ProperList(v +: ls)
    case Seq(v, Value.ImproperList((ls, rest))) => Value.ImproperList(v +: ls, rest)
    case Seq(a, b)                              => Value.ImproperList(Seq(a), b)
    case s                                      => throw ArityError(ExpectFixed(2), s.size)
  }

  // vectors
  val MakeVec = ForeignLambda {
    case s => Value.Vector(s.toVector)
  }

  def env = DefaultEnvironment(
    Map(
      Value.Symbol("null")   -> Value.ProperList.Null,
      Value.Symbol("void")   -> MakeList,
      Value.Symbol("fx+")    -> FxPlus,
      Value.Symbol("fx-")    -> FxMinus,
      Value.Symbol("fx*")    -> FxMult,
      Value.Symbol("fx/")    -> FxDiv,
      Value.Symbol("equal?") -> Equal,
      Value.Symbol("eqv?")   -> Equal,
      Value.Symbol("list")   -> MakeList,
      Value.Symbol("null?")  -> NullP,
      Value.Symbol("cons")   -> Cons,
      Value.Symbol("car")    -> Car,
      Value.Symbol("cdr")    -> Cdr,
      Value.Symbol("vector") -> MakeVec
    )
  )
}
