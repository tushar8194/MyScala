import scala.collection.mutable.ArrayBuffer

object ProblemSolvingCertificate {

  def main(args: Array[String]): Unit = {

    println(minTime2(Array(5,3,1),5,5))
    println(minTime2(Array(3,1,5),1,5))

    println(minTime2(Array(130291875,474356040,1,8),5,3))

  }


  def minTime(files: Array[Int], numCores: Int, limit: Int): Long = {


    val sortedFile  = files.sorted.reverse

    var eligible : String = ""


    var runTime : Long = 0

    for (i <- sortedFile) {
      if(i >= numCores) {
        if(i % numCores == 0) {
            eligible +=  i + ","
        }
        else
          runTime += i
      }
      else
        runTime += i

    }

    val revEligible = eligible.split(",").toList.reverse.map(_.toInt)

    if(revEligible.length > limit) {

      for (i <- 0 to limit) {
        runTime += revEligible(i) / numCores
      }

      for (i <- limit until  revEligible.length) {
        runTime += revEligible(i)
      }
    } else {
      for (i <- revEligible.indices) {
        runTime += revEligible(i) / numCores
      }
    }


    runTime
  }


  def minTime2(files: Array[Int], numCores: Int, limit: Int): Long = {


    val sortedFile  = files.sorted.reverse

    var eligible = ArrayBuffer[Int]()


    var runTime : Long = 0

    for (i <- sortedFile) {
      if(i >= numCores) {
        if(i % numCores == 0) {
           eligible +=  i
        }
        else
          runTime += i
      }
      else
        runTime += i

    }

    val revEligible = eligible.reverse

    if(revEligible.length > limit) {

      for (i <- 0 to limit) {
        runTime += revEligible(i) / numCores
      }

      for (i <- limit until  revEligible.length) {
        runTime += revEligible(i)
      }
    } else {
      for (i <- revEligible.indices) {
        runTime += revEligible(i) / numCores
      }
    }


    runTime
  }

}
