package problem2

/**
  * Created by adrian on 21/2/2016.
  */
object SProblem2 {

  def solve3(limit :Int) :Int = {
    fibStream2.takeWhile( _ <= limit)
      .filter( _ % 2 == 0)
      .sum
  }

  def fibStream2 :Stream[Int] = 1 #:: 2 #:: fibStream2.zip(fibStream2.tail).map( t => t._1 + t._2)


  def solve2(limit :Int) :Int = {
    fibStream.takeWhile( _ <= limit)
      .filter( _ % 2 == 0)
      .sum
  }

  def fibStream = fib(1,2)
  def fib(a: Int, b: Int) : Stream[Int] = a #:: fib(b, a + b);

  def solve1(limit :Long) :Long = {
    val fg = new FibGeneratorScala()
    fg.takeWhile( _ <= limit)
        .filter( _ % 2 == 0)
          .sum
  }
}
