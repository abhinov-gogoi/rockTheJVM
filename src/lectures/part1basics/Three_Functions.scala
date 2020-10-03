package lectures.part1basics

object Three_Functions extends App {
 def aFunction( a : String, b : Int): String = {
  a + " " + b
 }
 println(aFunction("I am", 23))

 def aParameterlessFn(): Int = 23
 println(aParameterlessFn)  //Parameterless fn can be called with just their names

 // RECURSION - when a fn calls itself. In Scala or functional programming languages in general, we prefer
 // to use recursion instead of loops.
 def aRepeatedFn(aString: String, n: Int): String = {
  if (n == 1) aString
  else aString + aRepeatedFn(aString, n-1)
 }
 println(aRepeatedFn("Kunhi ", 4))
}

// Also note compiler can infer result type for normal functions like the "aFunction" on top.So we can delete "String" word
// But compiler cannot infer result type of Recursive Functions
