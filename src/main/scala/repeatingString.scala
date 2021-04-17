object repeatingString {

    def main(args: Array[String]): Unit = {

      println(repeatedString("aba", 10))
      //println(repeatedString("a", "1000000000000".toLong))
    }

  def calculateOccur(str: String) : Long = {
    var count = 0L
    for( i<- 0 until str.length){
      if(str.charAt(i) == 'a')
        count += 1
    }
    count
  }

    def repeatedString(s: String, n: Long): Long = {

      println("string "+ s )
      println("length " + n)


      if(1 > s.length || 100 < s.length)
        System.exit(0)

      if( 1 > n || 1000000000000L < n)
        System.exit(0)


      val len = s.length
      var count : Long = 0L


      if(len < n){
        count = count + calculateOccur(s)
        println("initial count " + count)
        var remendar = (n % len).toInt
        println("remendar " + remendar)
        count = count * (n / len)
        if(remendar != 0)
          count = count + calculateOccur(s.substring(0,remendar))
      } else{
        count = count + calculateOccur(s.substring(0,n.toInt))
      }
      count
    }

}
