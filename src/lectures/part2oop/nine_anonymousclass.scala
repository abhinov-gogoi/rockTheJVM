package lectures.part2oop

object nine_anonymousclass extends App {

  abstract class Animal {
    def eat : Unit
  }
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("heheheheheh !!")
  }
  funnyAnimal.getClass
}
