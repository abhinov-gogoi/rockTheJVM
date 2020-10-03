package lectures.part2oop

object three_unaryOperators extends App {

  class Person(val name : String){
    def isAlive : Boolean = true
  }
  val abhi = new Person("abhi")

  println(abhi.isAlive)
  println(abhi isAlive)
  // postfix notation can be used for function with no parameters
}

//class Person(val name : String){
//    def apply() : String = s"$name says Hello Kunhi"
//  }
//  val abhi = new Person("Abhi")
//  println(abhi())











//class Person(val name : String){
//  def unary_! : String = s"$name says Hello Kunhi !!!!"
//}
//val abhi = new Person("abhi")
//
//println(abhi.unary_!)
//println(!abhi) // equivalent
//// prefix notation
//val x = -1
//val y = 1.unary_-   // unary + - ~ !
//
//}

