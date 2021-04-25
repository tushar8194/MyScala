

object pairSocks {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {

    var stock : Map[Int, Int] =  Map[Int, Int]()

    var pairCount = 0

    for ( i <- 0 until n){
      println("i -> " + i + " and " + ar(i))
      if(stock.contains(ar(i))) {
        println("true")
        pairCount = pairCount + 1
        stock -= ar(i)
      } else {
        println("false")
        stock += (ar(i) -> 1)
      }
      println(stock.keys.foreach(x => print(x)))
    }

    pairCount
  }


  def main(args: Array[String]): Unit = {
    println(sockMerchant(9, Array(10 ,20 ,20 ,10 ,10 ,30 ,50 ,10,20)))
  }

}
