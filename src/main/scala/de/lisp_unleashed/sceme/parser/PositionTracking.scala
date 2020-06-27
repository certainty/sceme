package de.lisp_unleashed.sceme.parser
import org.parboiled2._
import scala.annotation.tailrec

trait PositionTracking { this: Parser =>
  private var lineIdx = Array(0)
  def parseLocations: Boolean
  def sourceId: String

  def trackNewLine: Rule0 = rule {
    test(parseLocations) ~ run {
      if (!contains(lineIdx, cursor)) lineIdx = lineIdx :+ cursor
    } | MATCH
  }

  def trackPos: Rule1[Option[Location]] = rule {
    test(parseLocations) ~ push {
      val (size, lastCursor) = findLastItem(lineIdx, cursor)
      Some(Location(sourceId, cursor, size, cursor - lastCursor + 1))
    } | push(None)
  }

  private def contains(arr: Array[Int], item: Int): Boolean = {
    @tailrec def go(i: Int): Boolean =
      if (i < 0) false
      else if (arr(i) < item) false
      else if (arr(i) == item) true
      else go(i - 1)

    go(arr.length - 1)
  }

  private def findLastItem(arr: Array[Int], item: Int): (Int, Int) = {
    @tailrec def go(i: Int, last: Int): (Int, Int) =
      if (i < 0) (i + 1, last)
      else if (arr(i) <= item) (i + 1, arr(i))
      else go(i - 1, arr(i))

    go(arr.length - 1, 0)
  }
}
