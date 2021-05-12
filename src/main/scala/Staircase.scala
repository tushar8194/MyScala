object Staircase {

  def main(args: Array[String]): Unit = {

    staircase(4)

  }

  def staircase(n: Int) {
    var j = n-1
    var spaces = " "
    var stair = "#"

    for(i <- 1 to n) {

      println(spaces*j + "" + stair)

      j = j -1
      stair = stair + "#"
    }

  }

}
