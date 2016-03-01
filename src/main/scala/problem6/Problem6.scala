package problem6

import scala.collection.immutable.Range.Inclusive

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
// no math formulas, the scope is learning Scala
object Problem6 {


   def sumOfSquares(range: Inclusive):Long = {
      range.foldLeft(0){(res, e) => res + e*e }
   }

   def squareOfSum(range: Inclusive): Long = {
      val zipped = range.zip(range.reverse)
      val distinctPairs = zipped filter { t => t._1 < t._2}
      val sum = distinctPairs.map{ t => t._1 + t._2}.sum
      val singleOdd = zipped find { t => t._1 == t._2}
      singleOdd match {
         case None => sum * sum
         case Some(oddOne) => sum * sum + oddOne._1 * oddOne._2
      }

   }


   def solve() :Long = {
      val range = 1 to 100
      squareOfSum(range) - sumOfSquares(range)
   }

}
