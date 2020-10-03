package lectures.part2oop

object five_OOP extends App {
  object Person {
    //this type of method is called FACTORY METHOD
    //because its purpose is to build new class from another two other instances of same class
    def apply(mother : Person, father: Person): Person = new Person("Mike")
  }
  class Person(val name: String)

  val mary = new Person(name = "Mary")
  val john = new Person(name= "John")
  val mike = Person(mary, john)
}
















//object five_OOP extends App {
//
//  object Person {
//    // some other fields
//  }
//  class Person {
//    // some fields
//  }
//  // COMPANIONS - class Person and object Person are companions
//
//  val simanta = new Person
//  val karna = new Person
//  println(simanta==karna)  // refers to different instances
//
//  val person1 = Person
//  val person2 = Person
//  println(person1==person2) // refers to same instance
//}
