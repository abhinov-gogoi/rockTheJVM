package lectures.part2oop

object eleven_Generics extends{

  class MyList[A] {
    // some class fields
  }

  object MyList {  //companion object
    def somemethod[A]: MyList[A] = ??? // method implementation
  }

  val someval = MyList.somemethod[Int]

  val list: List[Int] = List(1, 2, 3)
  
  class Animal
  class Cat extends Animal
  class Dog extends Animal

}
