object addTwoNum {

  def main(args: Array[String]): Unit = {

    println(getSum(25,30))
  }


  def getSum(p: Int, q: Int): Int = {

    var a: Int = p
    var b: Int = q

    if(a< -1000 && b > 1000)
    {System.exit(0)}

    while(b != 0) {
      println(a + " , " + b)
      val carry = a & b
      println("val carry = a & b : " + carry)
      a = a ^ b
      println("a = a ^ b : " + a)
      b = carry << 1
      println("b = carry << 1 : "  + b)

    }
    a
  }

}
