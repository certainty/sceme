package de.lisp_unleashed.sceme.printer

case class Configuration private (
  maxStringLength: Int,
  maxCollectionElements: Int // how many elements of a list are shown max
)

object Configuration {
  val default: Configuration = Configuration(300, 50)

  def apply(maxStringLength: Int, maxCollectionElements: Int): Configuration = {
    assert(maxCollectionElements > 0)
    assert(maxStringLength > 0)

    new Configuration(maxCollectionElements, maxStringLength)
  }
}
