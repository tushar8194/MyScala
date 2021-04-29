package dynamicPrograming



object kingdomDivision {

  def main(args: Array[String]): Unit = {

    println(kingdomDivision(5,Array(Array(1,2),Array(1,3),Array(3,4),Array(3,5))))
  }


  def kingdomDivision(n: Int, roads: Array[Array[Int]]): Int = {

    var connectionMap  =  scala.collection.mutable.Map[Int,Int]()

    var split = 0

    for(road <- roads) {

      if(connectionMap.contains(road(0))) {
        connectionMap ++ Map(road(0) -> (connectionMap(road(0))+1))
      }else {
        connectionMap ++ Map(road(0) -> 1)
      }



      if (connectionMap.contains(road(1))) {
        connectionMap ++ Map(road(1) -> (connectionMap(road(0))+1))
      }else {
        connectionMap ++ Map(road(1) -> 1)
      }




    }


    for(road <- roads) {

      if(connectionMap(road(0)) > 1 && connectionMap(road(1)) >1 ) {
        split += 1
      }

    }

    return (split+1)*2

  }

}
