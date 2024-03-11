package OOPS

class Smartphone(val name: String, val number: Int) {

  def this(name: String) {
    this(name, number = 0);
  }

  def display(): Unit = {
    println(this.name);
    println(this.number)
  }

  def greet(name: String): Unit = {
    println(s"${this.name} says : Hi! ${name}")
  }

  def greet(): Unit = {
    println(s"Hii ${name}")
  }

  //overloading

}

object Main {
  def main(args: Array[String]): Unit = {
    var obj = new Smartphone(name = "Yuvraj");
    obj.display();
    obj.greet("Tarik")
    obj.greet()

  }
}
//class parameters are NOT FIELDS