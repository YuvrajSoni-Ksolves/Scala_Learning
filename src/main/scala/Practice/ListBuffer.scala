package Practice

import scala.collection.mutable.ListBuffer

object ListBuffe{
  def main(args : Array[String]):Unit ={
    var name = ListBuffer[String]()
    name +="Yuvraj";
    name +="Soni";
    name.prepend("Ksolves")
    name.prepend("noida")
    println(name)
    name -="Ksolves";
    println(name)
    name.remove(2);
    println(name)
    val l1 = name.toList;
    println(l1)
}
}
