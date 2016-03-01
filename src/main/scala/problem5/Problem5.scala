package problem5

import problem3.SProblem3

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//aka least common denominator
object Problem5 {

   def solve(rangeMin :Int = 2, rangeMax :Int) :Int = {
      val range = rangeMin to rangeMax
      val numberToPrimeFactors = range.map(n => (n, SProblem3.factorize(n)())).toMap
      val primeFactorMaxAppearances = for (
         n <- 2 to 20
      ) yield (n, maxOccurences(n, numberToPrimeFactors))
      primeFactorMaxAppearances.foldLeft(1)((r, t) => r * Math.pow(t._1, t._2).toInt)
   }

   def maxOccurences(n: Int, numberToPrimeFactors: Map[Int, List[Long]]) = {
      numberToPrimeFactors.values.map((li) => li.count(_ == n)).max
   }

}
