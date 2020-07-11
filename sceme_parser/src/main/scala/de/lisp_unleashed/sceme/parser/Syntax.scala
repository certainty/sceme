package de.lisp_unleashed.sceme.parser

sealed trait Sexp

trait Syntax[T] extends Sexp {
  def value: T
  def sourceSection: SourceInformation
  // printing will be added later
}

final case class StringSyntax(value: String, sourceSection: SourceInformation) extends Syntax[String]

final case class CharacterSyntax[Source](value: Char, sourceSection: SourceInformation) extends Syntax[Char]

final case class SymbolSyntax[Source](value: Symbol, sourceSection: SourceInformation) extends Syntax[Symbol]

final case class BooleanSyntax[Source](value: Boolean, sourceSection: SourceInformation) extends Syntax[Boolean]

final case class ProperListSyntax[Source](value: List[Sexp], sourceSection: SourceInformation)
    extends Syntax[List[Sexp]]

final case class PairSyntax[Source](value: (List[Sexp], Sexp), sourceSection: SourceInformation)
    extends Syntax[(List[Sexp], Sexp)]

final case class VectorSyntax[Source](value: Vector[Sexp], sourceSection: SourceInformation)
    extends Syntax[Vector[Sexp]]

final case class ByteVector[Source](value: Vector[Byte], sourceSection: SourceInformation) extends Syntax[Vector[Byte]]
