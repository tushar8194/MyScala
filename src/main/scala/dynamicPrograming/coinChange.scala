package dynamicPrograming

object coinChange {

  def main(args : Array[String]) : Unit ={

    //rintln(getWays(4,Array(1,2,3)))
    //println(getWays(10,Array(2,5,3,6)))
      println(getWays(250,Array(8,47,13,24,25,31,32,35,3 ,19, 40, 48, 1, 4, 17, 38, 22, 30, 33, 15, 44, 46, 36, 9, 20, 49)))
  }


  def getWays(n: Int, c: Array[Long]): Long = {


    if(c.max > 50 || c.max <1 || n < 1 || n > 250 || c.length <1 || c.length >50 ) {
      System.exit(0)
    }

    var lager = new Array[Long](n+1)
    lager(0)=1


    for(i <- 0 to c.length-1) {

      for( j <- 0 to lager.length-1){
        if(j >= c(i)) {
          lager(j) = lager(j) +  lager(j - c(i).toInt)
        }

      }

    }

    lager.last

  }

}
