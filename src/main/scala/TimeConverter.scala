object TimeConverter {

  def main(args: Array[String]): Unit = {

    //println(timeConversion("07:05:45PM"))
    println(timeConversion("12:00:00AM"))
  }

  def timeConversion(s: String): String = {

    if(s.contains("AM") && s.substring(0,2) == "12"){
      "00" + s.substring(2,8)
    } else if(s.contains("AM") ){
      s.substring(0,8)
    } else if(s.contains("PM") && s.substring(0,2) == "12"){
      s.substring(0,8)
    } else {
     val hrs = s.substring(0,2).toInt + 12
      hrs + s.substring(2,8)
    }

  }


}
