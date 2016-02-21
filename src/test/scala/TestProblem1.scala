import euler.Problem1;
import euler.problem2.{FibGen, Problem2};
import org.junit.Test;
import org.junit.Assert.assertEquals
import problem2.SProblem2
;

/**
  * Created by adrian on 21/2/2016.
  */
class TestProblem1 {

  @Test
  def experiment() :Unit = {
    val a = Stream(1, 2, 3, 4)
    val b = Stream(1, 2, 3, 4)
    val ab = a.zip(b)
    ab.foreach(print)
    println
    val z = a.zip(a.tail)
    z.foreach(print)
  }

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
}
