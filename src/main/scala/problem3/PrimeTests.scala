package problem3

import scala.collection.immutable.Stream.#::

/**
  * Created by adrian on 23/2/2016.
  */
object PrimeTests {

   def isPrime(n: Long): Boolean = {
      for (i <- 2L to Math.sqrt(n).toLong) {
         if (n % i == 0) return false;
      }
      true
   }

   def isPrimeRecursive(n: Long): Boolean = {
      return isPrimeRecursiveImpl(n, Math.sqrt(n).toLong)
   }

   private def isPrimeRecursiveImpl(n: Long, divisor: Long): Boolean = {
      if (divisor == 1) return true
      if (n % divisor == 0) return false
      else isPrimeRecursiveImpl(n, divisor - 1)
   }

   //all primes have form of 6k +/- 1, except 2 and 3
   def isPrimeOptimised(n: Long): Boolean = {

      def multipleOf6(i: Int, n: Long): Stream[Long] = {
         val mLower = 6 * i - 1;
         if (mLower > n) Stream.empty
         else mLower #:: (6 * i + 1) #:: multipleOf6(i + 1, n)
      }

      def multipleOf6Stream(n: Long): Stream[Long] = {
         multipleOf6(1, n)
      }
      if (n % 2 == 0) return false
      if (n % 3 == 0) return false

      for (m6 <- multipleOf6Stream(Math.sqrt(n).toLong))
         if (n % m6 == 0) return false

      true
   }

}
