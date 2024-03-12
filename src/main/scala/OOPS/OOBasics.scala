package OOPS

object OOBasics extends App {
  val person = new Person("Yuvraj", 20);
  println(person.name)
  println(person.age)
  println(person.x)
  person.greet("John")
  person.greet()
  val person2 = new Person();
  person.display()
  person2.display()
}

class Person(val name: String="", val age: Int =0) { //Constructor
  // { } are the delimeters to the class' body
  val x = 2;
  println(1 + 1)

  //multiple constructors



  //  overloading
  def greet(name: String): Unit = println(s"${this.name} says :  Hi,$name");

  def greet(): Unit = println(s"Hii ${this.name}")

  def display():Unit = {
    println(this.name, this.age)
  }
}


//class parameter are NOT FIELDS