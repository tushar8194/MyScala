object findRoomCount {


  def main(args: Array[String]): Unit = {

    println(findRoomCount())
  }


  def findRoomCount() : Int = {

    //val inputList = List((1, 2), (2, 3), (4, 5), (6, 7), (9, 10))
    //val inputList = List((1, 2), (4, 5), (6, 7), (9, 10))
    val inputList = List((1, 2), (4, 5), (6, 7), (9, 10))
    var personCount = 10
    var roomMap: Map[Int, Int] = Map[Int, Int]()
    var roomCount: Int = 0

    for (i <- inputList) {

      if (roomMap.contains(i._1)) {
        println("adding in room of " + i._1)
        roomMap ++ Map(i._2 -> roomMap(i._1))
        personCount = personCount -1
      } else if (roomMap.contains(i._2)) {
        println("adding in room of " + i._2)
        roomMap ++ Map(i._1 -> roomMap(i._2))
        personCount = personCount -1
      } else {
        println("Adding in new room")
        roomCount = roomCount + 1
        roomMap ++ Map(i._1 -> roomCount)
        personCount = personCount -1
        roomMap ++ Map(i._2 -> roomCount)
        personCount = personCount -1
        println("New room count" + roomCount)
      }

    }



    roomCount + personCount
  }

}
