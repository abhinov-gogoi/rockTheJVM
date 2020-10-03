package lectures.part2oop

object two_methodnotations extends App {

  class Person(val name : String, favouritemovie: String){
    def likes(movie : String): Boolean = movie==favouritemovie
    def +(person : Person): String = s"$name is watching a movie with ${person.name}"
  }

  val abhi = new Person("Abhi", "spiderman")
  val sam = new Person("Sam", "superman")

  // These two expressions are equivalent
  println(abhi.likes("spiderman"))
  println(abhi likes "spiderman")   // Infix notation (methods with single parameter can be written like this)

  // operator
  println(abhi+sam)

}
