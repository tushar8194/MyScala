object lexicalOrder {

  def main(args: Array[String]): Unit = {

    println(biggerIsGreater("fedcbabcd"))

  }



  def biggerIsGreater(w: String): String = {

    val arr = w.toCharArray
    var largetI = -1
    var largestJ = -1

    // find the larget i that p[i] < p[i+1]
    for( i <- 0 to arr.length-2) {
      if (arr(i) < arr(i + 1)) {
        largetI = i
      }
    }

      if(largetI == -1){
        return "no answer"
      }



    // larget j that p[i] < p[j]
    for(j <- 0 to arr.length-1) {
      if(arr(largetI) < arr(j)){
        largestJ = j
      }
    }


    // swap i and j
    var temp  = arr(largetI)
    arr(largetI) =arr(largestJ)
    arr(largestJ) =temp


    // reverse from largetI+1 to end
    val strt = arr.slice(0, largetI+1)
    val end = arr.slice(largetI+1,arr.length+1).reverse

    (strt ++ end).mkString("")

  }



}
