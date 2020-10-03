package lectures.part1basics

object Five_Recursions extends App {

  def factorial(n: Int): BigInt =
    if (n<=1) 1
    else {

      println("Computing factorial of " + n + ", I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n )
      result
    }
//    println(factorial(10))
    println(factorial(5000))


}
