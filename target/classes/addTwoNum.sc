
def getSum(p: Int, q: Int): Int = {

  var a: Int = p
  var b: Int = q

  if(a< -1000 && b > 1000)
  {System.exit(0)}

  while(b != 0) {
    println(a + " , " + b)
    val carry = a & b
    println("carry " + carry)
    a = a ^ b
    println("a^ " + a)
    b = carry << 1

  }
  a
}

getSum(5,25)
