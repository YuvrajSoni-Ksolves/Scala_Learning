package Lectures

object CBNvsCBV extends App{
  def callByValue(x : Long):Unit={
//    the absolute value is getting calculated first, then is passed into the function as an arguement
    println(s"System time $x")
    println(s"System time $x")
  }

  def callByName(x : =>Long) : Unit ={
    // => delays the evaluation of the parameter passed into the function until it is used.
    // "System.nanoTime()" gets passed in the function as a parameter, and gets calculated each time

    println(s"System time $x")
    println(s"System time $x")
  }
  callByValue(System.nanoTime());
  callByName(System.nanoTime());

  def infinite():Int = 1 +infinite()
  def printFirst(x:Int, y : => Int)= println(x);

  printFirst(20 , infinite());
//    printFirst(infinite() , 20);


}
