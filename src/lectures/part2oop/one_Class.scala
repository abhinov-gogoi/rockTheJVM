package lectures.part2oop

object one_Class extends App {

  val aPerson = new Person("Abhi", 24) {
    greet("Kunhi")
    greet()
  }
}

class Person (name: String, age: Int) {
  def greet (name: String): Unit = println(s"${this.name} says, Hi $name")
  def greet(): Unit = println(s"Hi $name")


  // multiple constructors
  def this (name : String) = this (name , 12)
}



