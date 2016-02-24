package problem3

import scala.collection.immutable.Stream.cons

/**
  * Created by adrian on 23/2/2016.
  */
//TODO more efficient implementations!
object SProblem3 {

  val BIG_NUMBER = 600851475143L;
  type PrimeTest = (Long) => Boolean

  def primeFactors(n :Long)(primeTest: PrimeTest = PrimeTests.isPrime):List[Long] = {

    var factors :List[Long] = Nil
    var number = n;

    var primeIterator = new PrimeIterator(number, primeTest)

    while (number != 1L) {
      val prime = primeIterator.next()
      if ( number % prime == 0) {
        factors = prime :: factors
        number = number / prime
        primeIterator = new PrimeIterator(number, primeTest)
      }
    }
    factors.distinct.reverse
  }

  def getPrimeIterator(limit:Long) = new PrimeIterator(limit, PrimeTests.isPrime)


  class PrimeIterator(val limit:Long, primeTest:PrimeTest) extends Iterator[Long] {
    var i = 2L;
    override def hasNext: Boolean = i <= limit

    override def next(): Long = {
      val r = i
      do i+=1 while (!primeTest(i))
      r
    }
  }

  //So that's what a "factor" means...
  def getLastFactor(n :Long):Long = {
    var number = n;
    var factor = 2;
    var lastFactor = factor;
    while (number != 1L) {
      if (number % factor == 0) {
        lastFactor = factor;
        while (number % factor == 0) {number = number / factor}
      }
      factor += 1;
    }
    lastFactor
  }

}
