package OOPS.Part2

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String, age: Int = 0) {
    def likes(movie: String): Boolean = {
      movie == this.favouriteMovie
    }

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(name: String): Person = {
      val s = s"${this.name}  (${name})"
      new Person(s, this.favouriteMovie);
    }

    def + : Person = new Person(this.name, this.favouriteMovie, this.age + 1)

    def unary_! : String = s"$name, what the heck!!!";

    def unary_+ : Person = new Person(this.name, this.favouriteMovie, this.age + 1);

    def isAlive: Boolean = true;

    def apply(): String = {
      s"Hii! my name is $name and I like $favouriteMovie"
    }

    def apply(n: Int): String = {
      s"${name} watched ${favouriteMovie} ${n} times"
    }


    def show(): Unit = {
      println(this.name, this.favouriteMovie, this.age)
    }

    def learns(s: String): String = {
      s"${this.name} learns ${s}"
    }

    def learnsScala(): String = {
      return learns("Scala");
    }


  }

  val marry = new Person("Marry", "Inception", 10)
  println(marry.show())
  //  println(marry likes "Inception")
  //infix notation or operator notation .(syntactic sugar)
  // only works with methods having only 1 parameter
  // "operators" in scala

  val tom = new Person("tom", "fight Club");
  //  println(marry + tom)
  //  println(marry.hangoutwith(tom))

  //  println(1 + 2)
  //  println(1.+(2))

  //mathematical operators work as methods in scala


  //prefix notation
  val x = -1; // -1 is equivalent with 1.unary_-
  val y = 1.unary_-;
  // unary works only works with few operators + - ~ !

  //  println(y, x)

  //  println(!marry)
  //  println(marry.unary_!)

  //  postfix notations
  //  println(marry.isAlive)
  //  println(marry isAlive)

  //apply
  //  println(marry.apply())
  //  println(marry())

  println((marry + "the rockstar")())
  val np = marry.unary_+
//  np.show();
  println((+marry).show())
  val np2 = +marry;
  println(marry learns "Scala")
//  println(marry learnsScala())

  println(marry(10))

}

