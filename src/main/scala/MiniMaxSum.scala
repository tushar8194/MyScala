object MiniMaxSum {

  def main(args: Array[String]): Unit = {

   // miniMaxSum(Array(1,3,5,7,9))

    miniMaxSum(Array(793810624 ,895642170 ,685903712 ,623789054 ,468592370))
  }

  def sum(xs: scala.collection.mutable.Iterable[Int]): Long =
    xs.foldLeft(0L)(_ + _)

  def miniMaxSum(arr: Array[Int]) {

    val arrSorted = arr.sorted

    val min : Long = sum(arrSorted) - arrSorted(arrSorted.length-1)

    val max : Long = sum(arrSorted) - arrSorted(0)

    println(min + " " + max)

  }

}
