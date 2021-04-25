package dynamicPrograming

object equalDistribution {

  //https://www.hackerrank.com/challenges/equal/problem

  def main(args : Array[String]) : Unit = {

    //println(equal(Array(10, 7, 12)))
    //println(equal(Array(2, 2,3, 7)))
    //println(equal(Array(2, 2,3, 7)))
    //println(equal2(Array(2, 2,3, 7)))
    println(equal(Array(512, 125, 928, 381, 890, 90, 512, 789, 469, 473, 908, 990, 195, 763, 102, 643, 458, 366, 684, 857, 126, 534, 974, 875, 459, 892,686,373,127,297,576,991,774,856,372,664,946,237,806,767,62,714,758,258,477,860,253,287,579,289,496)))
    println(equal2(Array(512, 125, 928, 381, 890, 90, 512, 789, 469, 473, 908, 990, 195, 763, 102, 643, 458, 366, 684, 857, 126, 534, 974, 875, 459, 892,686,373,127,297,576,991,774,856,372,664,946,237,806,767,62,714,758,258,477,860,253,287,579,289,496)))

    //println(equal2(Array(11,6,8,7)))
  }

  def equal(arr: Array[Int]): Int = {

    var sortedArr = arr.sorted
    var min = sortedArr.head
    var max = sortedArr.last

    var diff = (max -min)
    var rounds = 0

    while (diff !=0) {

      if(diff == 1) {
        sortedArr = updateArr(sortedArr,1)
      } else if(diff < 5) {
        sortedArr = updateArr(sortedArr,2)
      } else {
        sortedArr = updateArr(sortedArr,5)
      }
      min = sortedArr.head
      max = sortedArr.last
      rounds +=1

      diff = (max -min)
    }

    rounds
  }



  def updateArr(arr : Array[Int], num : Int): Array[Int] = {

    for(i <- 0 to arr.length-2) {
      arr(i) = arr(i) + num
    }

    arr.sorted

  }





  // Not working
  def equal2(arr: Array[Int]): Int = {

    var p = arr.min

    var possibilities = new Array[Int](5)

    for(m <- possibilities.indices ) {
      var l =0
      for(i <- arr.indices) {
        val diff = arr(i) - p + m
         l = l + (diff % 5 + (diff % 5) / 2 + (diff % 5 % 2) / 1)
      }
      possibilities(m) = l
    }

    possibilities.min
  }





}
