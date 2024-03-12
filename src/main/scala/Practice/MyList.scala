//package Practice
//
//abstract class MyList {
//  //  head = first element of the list
//  //  tail = remainder of the list
//  //    isEmpty = is this list empty
//  //    add(int) => new list with this element added
//  //    toString => string representation of the list
//
//  def head: Int;
//
//  def Tail: MyList
//
//  def isEmpty: Boolean
//
//  def add(element: Int): MyList
//
//}
//
//object Empty extends MyList{
//  def head: Int = throw new NoSuchElementException
//
//  def Tail: MyList = throw new NoSuchElementException
//
//  def isEmpty: Boolean = true
//
//  def add(element: Int): MyList = new Cons(element, Empty)
//}
//
//class Cons(head:Int, tail :MyList) extends MyList{
//  def head: Int = ???
//
//  def Tail: MyList = ???
//
//  def isEmpty: Boolean = ???
//
//  def add(element: Int): MyList = ???
//}
