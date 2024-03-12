package OOPS.Part2

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String): Boolean = {
      movie == this.favouriteMovie
    }

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck!!!";

    def isAlive: Boolean = true;

    def apply(): String = {
      s"Hii! my name is $name and I like $favouriteMovie"
    }
  }

  val marry = new Person("Marry", "Inception")
  println(marry likes "Inception")
  //infix notation or operator notation .(syntactic sugar)
  // only works with methods having only 1 parameter
  // "operators" in scala

  val tom = new Person("tom", "fight Club");
  println(marry + tom)
  //  println(marry.hangoutwith(tom))

  //  println(1 + 2)
  //  println(1.+(2))

  //mathematical operators work as methods in scala


  //prefix notation
  val x = -1; // -1 is equivalent with 1.unary_-
  val y = 1.unary_-;
  // unary works only works with few operators + - ~ !

  println(y, x)

  println(!marry)
  println(marry.unary_!)

  //  postfix notations
  println(marry.isAlive)
  println(marry isAlive)

  //apply
  println(marry.apply())
  println(marry())
}

