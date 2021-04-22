object higherOrder {

  def main(args : Array[String]) : Unit = {

    println(double(2))
    println(double)
    println(triple(3))
    println(triple)
  }


  def double = (i: Int) => i*2

  def triple : Int => Int = i => i*3
}
