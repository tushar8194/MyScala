// {} curly braces is used to define scope

// [] is used to define data type

// Data type is always starts with capital letter like Map, Array, String, Int

// () is used to pass values inside

object tip {

  def main(args : Array[String]) : Unit = {

    val list = List(1, 2, 3, 4, 5, 6, 7, 8)

    println(list.foldLeft(1)(_ + _))

    println(list.foldLeft(0)( (x,y) => { println(x + " , " + y) ; x + y }))


  }

}