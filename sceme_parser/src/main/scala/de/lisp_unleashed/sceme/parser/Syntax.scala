package de.lisp_unleashed.sceme.parser

// external representation
sealed trait Sexp

trait Syntax[T] extends Sexp {
  def value: T
  def sourceSection: SourceInformation
}

sealed trait SelfEvaluating

final case class StringSyntax(value: String, sourceSection: SourceInformation) extends Syntax[String] with SelfEvaluating

final case class CharacterSyntax(value: Char, sourceSection: SourceInformation) extends Syntax[Char] with SelfEvaluating

final case class SymbolSyntax(value: String, delimited: Boolean, sourceSection: SourceInformation)
    extends Syntax[String] with SelfEvaluating

final case class BooleanSyntax(value: Boolean, sourceSection: SourceInformation) extends Syntax[Boolean] with SelfEvaluating

sealed trait Number extends Sexp with SelfEvaluating

sealed trait ExactNumber   extends Number

sealed trait InexactNumber extends Number

final case class FixnumSyntax(value: Long, sourceSection: SourceInformation) extends Syntax[Long] with ExactNumber

final case class FlonumSyntax(value: Double, sourceSection: SourceInformation) extends Syntax[Double] with InexactNumber

// TODO: add rational & complex numbers

// TODO: add rational and complexs

sealed trait Pair extends Sexp

final case class ProperListSyntax(value: List[Sexp], sourceSection: SourceInformation) extends Pair with Syntax[List[Sexp]]

final case class ImproperListSyntax(value: (List[Sexp], Sexp), sourceSection: SourceInformation)
    extends Pair with Syntax[(List[Sexp], Sexp)]

final case class VectorSyntax(value: Vector[Sexp], sourceSection: SourceInformation) extends Syntax[Vector[Sexp]] with SelfEvaluating

final case class ByteVectorSyntax(value: Vector[Byte], sourceSection: SourceInformation) extends Syntax[Vector[Byte]] with SelfEvaluating


