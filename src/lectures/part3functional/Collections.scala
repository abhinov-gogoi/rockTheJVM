package lectures.part3functional
object Collections extends App{
 // List - https://www.scala-lang.org/api/current/scala/collection/immutable/List.html
 val aList = List(1,2,3,4)
 println(aList)
 println(aList.isEmpty)
 println(aList.head)
 println(aList.tail)
 // map
 println(aList.map(_ + 10))
 println(aList.map(_ + " is a number"))
 // filter
 println(aList.filter(_ % 2 == 0))
 // flatmap - Builds a new list by applying a function to all elements of this list
 // and using the elements of the resulting collections.
 val toPair = (x : Int) => (List(x , x+10))
 println(aList.flatMap(toPair))
}








//// map
//println(aList.map(_ + 10))
//println(aList.map(_ + " is a number"))
//// filter
//println(aList.filter(_ % 2 == 0))
//// flatmap - Builds a new list by applying a function to all elements of this list
//// and using the elements of the resulting collections.
//val toPair = (x : Int) => (List(x , x+10))
//println(aList.flatMap(toPair))
