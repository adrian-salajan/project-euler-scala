package problem3

/**
  * Created by adrian on 23/2/2016.
  */
object PrimeTests {

  def isPrime(n: Long) : Boolean = {
    for (i <- 2L to Math.sqrt(n).toLong) {
      if (n % i == 0) return false;
    }
    true
  }

  def isPrimeRecursive(n: Long) : Boolean = {
    return isPrimeRecursiveImpl(n, Math.sqrt(n).toLong)
  }

  private def isPrimeRecursiveImpl(n: Long, divisor: Long): Boolean = {
    if (divisor == 1) return true
    if (n % divisor == 0) return false
    else isPrimeRecursiveImpl(n, divisor - 1)

  }

}
