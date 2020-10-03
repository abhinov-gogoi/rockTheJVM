package lectures.part1basics

object FunctionExamplesUsingRecursion extends App {

  // Factorial of a number
  def Factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * Factorial(n-1)
  }
  println(Factorial(5))

  // Fibonacci numbers- 1 1 2 3 5 8 13 21
  def fibonacci(n: Int): Int = {
    if (n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(8))

}