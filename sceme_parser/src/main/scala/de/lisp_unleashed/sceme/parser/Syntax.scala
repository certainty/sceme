package de.lisp_unleashed.sceme.parser

// external representation
sealed trait Sexp

trait Syntax[T] extends Sexp {
  def value: T
  def sourceSection: SourceInformation
}

sealed trait SelfEvaluating[T] extends Syntax[T]

final case class StringSyntax(value: String, sourceSection: SourceInformation) extends SelfEvaluating[String]

final case class CharacterSyntax(value: Char, sourceSection: SourceInformation) extends SelfEvaluating[Char]

final case class SymbolSyntax(value: String, delimited: Boolean, sourceSection: SourceInformation)
    extends SelfEvaluating[String]

final case class BooleanSyntax(value: Boolean, sourceSection: SourceInformation) extends SelfEvaluating[Boolean]

sealed trait NumberSyntax extends Sexp

sealed trait ExactNumberSyntax extends NumberSyntax

sealed trait InexactNumberSyntax extends NumberSyntax

final case class FixnumSyntax(value: Long, sourceSection: SourceInformation)
    extends SelfEvaluating[Long]
    with ExactNumberSyntax

final case class FlonumSyntax(value: Double, sourceSection: SourceInformation)
    extends SelfEvaluating[Double]
    with InexactNumberSyntax

// TODO: add rational & complex numbers

// TODO: add rational and complexs

sealed trait Pair extends Sexp

final case class ProperListSyntax(value: List[Syntax[_]], sourceSection: SourceInformation)
    extends Pair
    with Syntax[List[Syntax[_]]]

final case class ImproperListSyntax(value: (List[Syntax[_]], Syntax[_]), sourceSection: SourceInformation)
    extends Pair
    with Syntax[(List[Syntax[_]], Syntax[_])]

final case class VectorSyntax(value: Vector[Syntax[_]], sourceSection: SourceInformation)
    extends SelfEvaluating[Vector[Syntax[_]]]

final case class ByteVectorSyntax(value: Vector[Byte], sourceSection: SourceInformation)
    extends SelfEvaluating[Vector[Byte]]
