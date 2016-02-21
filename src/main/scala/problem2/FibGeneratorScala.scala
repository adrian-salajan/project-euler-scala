package problem2

/**
  * Created by adrian on 21/2/2016.
  */
class FibGeneratorScala extends Iterator[Int] {

  var previous = 1;
  var current = 2;
  override def hasNext: Boolean = true

  override def next(): Int = {
    val result = previous;
    previous = current;
    current += result;
    return result;
  }
}
