package Practice
//import scala.io.StdIn


object evenodd {
  def main(args : Array[String]):Unit = {
    val a = scala.io.StdIn.readInt()
    if(a%2==0)println("even")
    else println("odd")
  }
}

