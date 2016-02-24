import org.openjdk.jmh.annotations._
import problem3.{PrimeTests, SProblem3}
import org.scalameter.api._
import org.scalameter.picklers.Implicits

object BenchmarkProblems extends Bench.LocalTime {

   val itera = Gen.range("range")(1, 20, 1)

   performance of "isPrime" in {
      measure method "primeFactors" in {
         using(itera) in {
            n => {
               SProblem3.primeFactors(SProblem3.BIG_NUMBER)(PrimeTests.isPrime);
            }
         }
      }
   }

   performance of "isPrimeRecursive" in {
      measure method "primeFactors" in {
         using(itera) in {
            n => {
               SProblem3.primeFactors(SProblem3.BIG_NUMBER)(PrimeTests.isPrimeRecursive);
            }
         }
      }
   }

   performance of "isPrimeOptimised" in {
      measure method "primeFactors" in {
         using(itera) in {
            n => {
               SProblem3.primeFactors(SProblem3.BIG_NUMBER)(PrimeTests.isPrimeOptimised);
            }
         }
      }
   }

   performance of "getLastFactor" in {
      measure method "getLastFactor" in {
         using(itera) in {
            n => {
               SProblem3.getLastFactor(SProblem3.BIG_NUMBER);
            }
         }
      }
   }

}
