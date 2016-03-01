//Find the sum of all the multiples of 3 or 5 below 1000.
object SProblem1 {

  def getSumOfMultiplesBelow3(n :Int) : Int = {
    sumMultiplesOf3(n) + sumMultiplesOf5(n) - sumMultiplesOf15(n)
  }

  def sumMultiples(n :Int, d: Int) = {
    val p = (n-1) / d;
    val sum = p * (p +1)
    d * sum / 2
  }

  def sumMultiplesOf3(n :Int) = sumMultiples(n, 3)
  def sumMultiplesOf5(n :Int) = sumMultiples(n, 5)
  def sumMultiplesOf15(n :Int) = sumMultiples(n, 15)

  def getSumOfMultiplesBelow2(n :Int) : Int = {
    (1 until n)
      .filter((i) => multipleOf3(i) || multipleOf5(i))
      .sum
  }

  def getSumOfMultiplesBelow1(n :Int) : Int = {
    var sum = 0;
    for (i <- 1 until n) {
      if (multipleOf3(i) || multipleOf5(i)) {
        sum += i;
      }
    }
    sum
  }
  def divisible(n: Int, d: Int) = n % d == 0
  def multipleOf3(i :Int) = divisible(i, 3);
  def multipleOf5(i :Int) = divisible(i, 5);
}
