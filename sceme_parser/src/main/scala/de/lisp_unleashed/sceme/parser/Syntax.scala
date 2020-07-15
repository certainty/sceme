package de.lisp_unleashed.sceme.parser
/*
 * Syntax represents everything that is part of the external representation. So a datum in that sense.
 * Scheme programs are made out of syntax at this level. There are higher order constructs created from these, which
 * form the `Expressions`.
 */

sealed trait Syntax[T] extends SourceInformation {
  def value: T
}

sealed trait SelfEvaluating[T] extends Syntax[T]

final case class StringSyntax(value: String, location: Location) extends SelfEvaluating[String]

final case class CharacterSyntax(value: Char, location: Location) extends SelfEvaluating[Char]

final case class SymbolSyntax(value: String, delimited: Boolean, location: Location)
    extends SelfEvaluating[String]

final case class BooleanSyntax(value: Boolean, location: Location) extends SelfEvaluating[Boolean]

sealed trait NumberSyntax[T] extends SelfEvaluating[T]
sealed trait ExactNumberSyntax[T] extends NumberSyntax[T]
sealed trait InexactNumberSyntax[T] extends NumberSyntax[T]

final case class FixnumSyntax(value: Long, location: Location) extends ExactNumberSyntax[Long]

final case class FlonumSyntax(value: Double, location: Location) extends InexactNumberSyntax[Double]

// TODO: add rational & complex numbers

// TODO: add rational and complexs

final case class VectorSyntax(value: Vector[Syntax[_]], location: Location)
    extends SelfEvaluating[Vector[Syntax[_]]]

final case class ByteVectorSyntax(value: Vector[Byte], location: Location) extends SelfEvaluating[Vector[Byte]]

sealed trait Pair[T] extends Syntax[T]

final case class ProperListSyntax(value: List[Syntax[_]], location: Location)
  extends Pair[List[Syntax[_]]]

final case class ImproperListSyntax(value: (List[Syntax[_]], Syntax[_]), location: Location)
  extends Pair[(List[Syntax[_]], Syntax[_])] {
  val head: List[Syntax[_]] = value._1
  val tail: Syntax[_] = value._2
}


