//Find the largest palindrome made from the product of two 3-digit numbers.
object Problem4 {

   def highestNaivePali = {
      var maxPali = -1;
      for {
         i <- 999 to 100 by -1
         j <- i to 100 by -1 //optimisation #1
         candidate = i * j
         if (candidate > maxPali) //optimisation #2
      } if (isPalindrome(candidate)) maxPali = candidate
      maxPali
   }
   def isPalindrome(n :Int) = n == reversedRec(n)

   def reversedRecImpl(res: Int, n: Int): Int = {
      if (n == 0) res
      else reversedRecImpl(res * 10 + n % 10, n / 10)
   }

   def reversedRec(n :Int) = {
      reversedRecImpl(0, n)
   }
   //iterative
   def reversed(n :Int) = {
      var t = n;
      var reversed = 0;
      while (t > 0) {
         reversed = reversed * 10 + t % 10;
         t = t / 10
      }
      reversed
   }
}
