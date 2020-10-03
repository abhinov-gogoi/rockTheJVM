package lectures.part3functional

import scala.collection.mutable

object Sequences extends App {

  // Seq - https://www.scala-lang.org/api/current/scala/collection/Seq.html
  val aSequence = Seq(1,2,3,4,5)

  println(aSequence)
  println(aSequence.length)
  println(aSequence.reverse)
  println(aSequence(3))
  println(aSequence ++ Seq(8,9,10))
  println(aSequence.sorted)


  // by default scala always picks immutable collections
  val aSet = Set(1,2)
  val anotherSet = mutable.Set(1,2)

  // Range
  val aRange : Seq[Int] = 1 to 10
  println(aRange)

  // Arrays
  val numbers = Array(1,2,3,4)
  val fourElements = Array.ofDim[String](4)
  println(fourElements)
  fourElements.foreach(println)

  // mutation
  numbers(3) = 0  // syntactic sugar for number.update(3 , 0)
  println(numbers.mkString(" "))

  // arrays and seq
  val numbersSeq : Seq[Int] = numbers // implicit conversion
  println(numbersSeq)
}
