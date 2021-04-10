object maxProductWordLength {

  def main(args: Array[String]) : Unit ={
    println(maxProduct(Array("abcw","baz","foo","bar","xtfn","abcdef")))
    println(maxProduct(Array("a","aa","aaa","aaaa")))
  }

  def maxProduct(words: Array[String]): Int = {

    if (words == null || words.isEmpty) return 0

    var res = 0
    val sets = words.map(_.toSet)

    for (i <- words.indices)
      for (j <- i + 1 until words.length) {
        if ((sets(i) & sets(j)).isEmpty) {
          res = math.max(res, words(i).length * words(j).length)
        }
      }

    res
  }

}
