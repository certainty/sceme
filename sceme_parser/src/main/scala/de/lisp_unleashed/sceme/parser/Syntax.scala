package de.lisp_unleashed.sceme.parser

sealed trait Sexp

trait Syntax[T] extends Sexp {
  def value: T
  def sourceSection: SourceInformation
  // printing will be added later
}

final case class StringSyntax(value: String, sourceSection: SourceInformation) extends Syntax[String]

final case class CharacterSyntax(value: Char, sourceSection: SourceInformation) extends Syntax[Char]

final case class SymbolSyntax(value: Symbol, sourceSection: SourceInformation) extends Syntax[Symbol]

final case class BooleanSyntax(value: Boolean, sourceSection: SourceInformation) extends Syntax[Boolean]

final case class FixnumSyntax(value: Long, sourceSection: SourceInformation) extends Syntax[Long]

final case class FlonumSyntax(value: Double, sourceSection: SourceInformation) extends Syntax[Double]

// TODO: add rational and complex

final case class ProperListSyntax(value: List[Sexp], sourceSection: SourceInformation) extends Syntax[List[Sexp]]

final case class PairSyntax(value: (List[Sexp], Sexp), sourceSection: SourceInformation)
    extends Syntax[(List[Sexp], Sexp)]

final case class VectorSyntax(value: Vector[Sexp], sourceSection: SourceInformation) extends Syntax[Vector[Sexp]]

final case class ByteVector(value: Vector[Byte], sourceSection: SourceInformation) extends Syntax[Vector[Byte]]
