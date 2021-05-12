package dynamicPrograming

object diagonalDifference {

  def main(args: Array[String]): Unit = {

    val arr = Array(Array(1,2,3),Array(4,5,6), Array(9,8,9))

    println(diagonalDifference(arr))
  }


  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    var d1 = 0
    var d2 = 0
    var j = arr.length -1

    for(i <- 0 to arr.length -1){
      d1 = d1 + arr(i)(i)

      d2 = d2 + arr(j)(i)
      j -= 1
    }
    println(d1)
    println(d2)

    (d2-d1).abs
  }

}
