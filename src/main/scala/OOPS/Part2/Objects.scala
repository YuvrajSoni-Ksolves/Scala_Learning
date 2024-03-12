package OOPS.Part2

object Objects extends App {
  //SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALOTY ("static")
  object Person { // type + only instance
    val N_Eyes = 2;

    def canFly: Boolean = false;

    //    factory method
    def apply(mother: Person, father: Person): Person = {
      new Person("Bobby");
    }
  }

  class Person(val name: String) {
    // instance level functionality
  }
  //COMPANIONS

  println(Person.N_Eyes)
  //  println(Person.canFly)
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)
  val person1 = Person;
  val person2 = Person
  println(person1 == person2)
  //scala object is a singleton object

  val bobbie = Person(mary, john)

  //Scala Applications = Scala Object with
  //  def main(args : Array[String]): Unit


}
