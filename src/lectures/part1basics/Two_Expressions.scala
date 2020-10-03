package lectures.part1basics

object Two_Expressions extends App {
 // If Expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 4 else 1   // Here the if expression gives back a value
  println(aConditionedValue)
 // Everything is Scala is an Expression

  var aVariable = 3
  val aValue = (aVariable = 4) // Unit === void in other languages
  println(aValue)

  // Expressions in Scala that return Unit are called SIDE EFFECTS , eg - println, reassigning vars, while loops
  // So side effects are results of Imperative programming. They are instructions. But in Scala they are
  // still expressions that return some value

  val aCodeblock = {
    val q = 2; val t = 3;
    if(q<t) "q is smaller" else "t is smaller"
  }
  println(aCodeblock)  //result of aCodeblock is determined by last line in the block

 val anotherCodeblock = {
  val q = 2; val t = 3;
  if(q<t) "q is smaller" else "t is smaller"
//  println("Hello, Kunhi")
  52
 }
 println(anotherCodeblock)
}
