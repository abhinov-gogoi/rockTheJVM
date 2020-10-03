package lectures.part1basics

object One_ValuesVariablesTypes extends App {

  //Variables
  var z: Int = 2
  z = 5  //Vars are mutable and can be reassigned.

  val x: Int= 10

  println(x)
  //  val x: Int= 11    // Shows Error cause Vals are Immutable and cant be reassigned.

  val y = "Hello, Kunhi"  // Types of vals are optional, because compiler can automatically infer types
  println(y)
  // Semicolons are allowed in Scala, but not necessary if we write each expression in its own line.
  // Semicolons are needed in scala when we write multiple expressions in single line.
  // But this is usually bad style of writing code.

  // Basic Data Types
  val anInt: Int = 1234567212
  val aString: String = "Hello, Kunhi"
  val aBoolean: Boolean = true
  val aChar: Char = 'a'              // single characters between single quotes
  val aShort: Short = 23411
  val aLong: Long = 234112345543456345L
  val aFloat: Float = 5.5f
  val aDouble: Double = 345.67845



}
