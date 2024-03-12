package OOPS

object InheritanceandTraits extends App {

  //single class inheritance
  sealed class Animal {
    val creatureType = "wild"

    def eat = println("nom nom nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0);
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name, age) {
  }

  //overriding
  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat
      println("woof woof")
    }

    //    override val creatureType: String = "domestic"
  }

  val dog = new Dog("K9");
  dog.eat
  println(dog.creatureType)

  //type substitution - polymorphism
  val unknownAnimal: Animal = new Dog("k9");
  unknownAnimal.eat;

  //preventing overrides
  //  1 use final on member
  //  2 use final on the entire class
  // 3 seal the class = extend in this file, but prevent extension in other files


}
