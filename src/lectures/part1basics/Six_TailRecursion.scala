package lectures.part1basics

object Six_TailRecursion extends App {

  def factorial(n: Int): BigInt = {


    @scala.annotation.tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x <=1 ) accumulator
      else factHelper(x - 1, x * accumulator)
  factHelper(n,1)
  }
  println(factorial(50000))

  // So Why does this one work?
  // Its because we wrote factHelper as the last expression of the codeblock. This allows scala to preserve same stack
  // frame and not use additional stack frames for recursive calls.
  // So to make a recursive function tail recursive use the recursive call as the LAST EXPRESSION
}




