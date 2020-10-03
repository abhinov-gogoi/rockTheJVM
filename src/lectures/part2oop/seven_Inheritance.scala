package lectures.part2oop

object seven_Inheritance extends App{

  sealed class Animal {
    def eat = println("Chomp, chomp")
  }
  class Cat extends Animal {
    override def eat = println("Meow")
    def sleep: String = "3 hrs"

  }
  val unknownanimal: Animal = new Cat
  unknownanimal.eat




//   val carrot = new Cat
//  carrot.eat

//  val unknownanimal: Animal = new Cat
//  unknownanimal.eat
}



//object seven_Inheritance extends App{
//
//  class Animal {
//    protected def eat = println("Chomp, chomp")
//  }
//
//  class Cat extends Animal {
//    def chew {
//      eat
//      println("Chew")
//    }
//  }
//
//  val cat = new Cat
//  cat.eat
//
//  cat.chew
//}
