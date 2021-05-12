object PlusMinus {

  def main(args: Array[String]): Unit = {

  plusMinus(Array(1,1,0,-1,-1))
  }


  def plusMinus(arr: Array[Int]) {

    val len = arr.length
    var positv = 0
    var negatv = 0
    var zeros = 0

    for(i <- 0 to arr.length-1){

      if(arr(i) > 0){
        positv +=1
      }else if(arr(i) < 0){
        negatv += 1
      } else {
        zeros +=1
      }

    }

    var postvRatio :Double = positv.toFloat / len

    var ngtvRatio : Double = negatv.toFloat / len

    var zeroRatio : Double = zeros.toFloat /len

    println(f"$postvRatio%1.6f")

    println(f"$ngtvRatio%1.6f")

    println(f"$zeroRatio%1.6f")

  }

}
