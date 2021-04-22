
import scala.collection.mutable.Stack

object maxElemnt {

  def main(args: Array[String]): Unit = {

   // print(maxElement(522,685,395))

    maxElem2(10,6,1)
  }


  def maxElem2 (n: Int, maxSum: Int, k: Int): Unit = {

    val list = List.range(0 , maxSum +1 )

    println(list)

    println(list.combinations(n).foreach{x =>
     if(x.sum <= maxSum) {
      println(x)}

    })

  }










  def maxElement(n: Int, maxSum: Int, k: Int): Int = {

    if( n < k || maxSum > 1000000000L || maxSum < 1 || n < 1|| n> maxSum){
      System.exit(0)
    }


    if (maxSum == 0){
      return 0
    }

    val stk = new Stack[Array[Int]]
    val arr = new Array[Int](n)
    stk.push(arr)
    var rtrnvalue  = 0

    for (i <- 1 to maxSum) {

      for (j <- 0 until  n) {

        val currArr = stk.top
        currArr(j) = i

        if(currArr.max > rtrnvalue){
          rtrnvalue = currArr.max
        }


        if (sumArr(currArr) == maxSum) {
          return rtrnvalue
        } else {
          currArr.foreach( x => print(x + ","))
          println("")
          stk.push(currArr)
        }
      }
    }
    rtrnvalue

  }

  def sumArr(arr : Array[Int]) : Int = {

    var k = 0
    for( i <- 0 to arr.length -1) {
      k = k+ arr(i)}
    k
  }

  def taskOfPairing(freq: Array[Long]): Long = {

    var doumbleCount = 0L

    for ( i <- 0 to freq.length -1  ) {
      doumbleCount = doumbleCount + freq(i)
    }

    doumbleCount / 2

  }


}
