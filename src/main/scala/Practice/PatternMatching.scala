import scala.math._
//package Practice

sealed trait Shape {

  def area
}

case class Circle(a: Double) extends Shape {


  override def area(): Unit = {
    println(Pi * a * a);
  }
}

case class Square(a: Int) extends Shape {
  override def area(): Unit = {
    println(4 * a * a)
  }
}

case class Triangle(a: Int) extends Shape {
  override def area(): Unit = {
    println(pow(3, .0) * a * a)
  }
}

object PatternMatching extends App {
  def shapematcher(shape: Shape): String = {
    shape match {
      case Circle(a) => s"${Pi * a * a}"
      case Square(a) => s"${4 * a * a}"
      case Triangle(a) => s"${
        pow(3, .5) * a * a
      }"
      case _ => s"${-1}"
    }
  }

  val shape = Circle(10);
  val shape2 = Square(4);
  val shape3 = Triangle(10)
  println(shapematcher(shape))
  println(shapematcher(shape2))
  println(shapematcher(shape3))
}