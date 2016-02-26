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
   def isPalindrome(n :Int) = n == reversed(n)

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
