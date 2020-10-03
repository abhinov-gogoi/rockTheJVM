package exercises

import java.util.NoSuchElementException

abstract class MyList {
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(x : Int): MyList
}

object Empty extends MyList{
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = ???
  def add(x : Int): MyList = ???
}

class cons( h: Int, t: Int) extends MyList {
  def head: Int = ???
  def tail: MyList = ???
  def isEmpty: Boolean = ???
  def add(x : Int): MyList = ???
}
