import euler.Problem1;
import euler.problem2.{Problem2};
import org.junit.Test;
import org.junit.Assert.{assertEquals, assertTrue, assertFalse}
import problem2.SProblem2
import problem3.{PrimeTests, SProblem3}
import problem5.Problem5
import problem6.Problem6
;

/**
  * Created by adrian on 21/2/2016.
  */
class TestProblems {

  @Test
  def test1(): Unit = {
    assertEquals(Problem1.getSumOfMultiplesBelow3(1000),
      SProblem1.getSumOfMultiplesBelow3(1000));
  }

  @Test
  def test2(): Unit = {
    assertEquals(4613732, Problem2.solve1(4000000));

    assertEquals(4613732, SProblem2.solve1(4000000));
    assertEquals(4613732, SProblem2.solve2(4000000));
    assertEquals(4613732, SProblem2.solve3(4000000));

  }

  @Test
  def test3() {

    assertEquals(List(2, 5), SProblem3.primeFactors(100)())
    assertEquals(List(3, 11), SProblem3.primeFactors(99)())
    assertEquals(List(2, 41, 61), SProblem3.primeFactors(5002)())

    assertEquals(6857, SProblem3.primeFactors(SProblem3.BIG_NUMBER)(PrimeTests.isPrimeOptimised).last)
    assertEquals(6857, SProblem3.getLastFactor(SProblem3.BIG_NUMBER))
  }

  @Test //palindrome
  def test4(): Unit = {
    assertTrue(Problem4.isPalindrome(1221))
    assertTrue(Problem4.isPalindrome(909))

    assertFalse(Problem4.isPalindrome(109))
    assertFalse(Problem4.isPalindrome(12))

    assertEquals(906609, Problem4.highestNaivePali)
  }

  @Test //smalles number divisible with all numbers in range 1..20
  def test5(): Unit = {

    assertEquals(232792560, Problem5.solve(rangeMax = 20))
  }
  @Test // sum of squares - square of sum  1..100
  def test6(): Unit = {
    assertEquals(25164150, Problem6.solve())
  }

}

