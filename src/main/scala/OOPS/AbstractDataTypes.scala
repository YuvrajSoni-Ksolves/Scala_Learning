package OOPS

object AbstractDataTypes extends App {
  // abstract class contains unimplemented fields and methods
  // abstract classes cannot be instantiated
  abstract class Animal {
    val creatureType: String = "wild"

    def eat: Unit
  }

  class Dog extends Animal {

    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch, crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit

    val preferredMeal: String = "fresh meat"

  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "carnivore"

    def eat: Unit = println("flesh")

    def eat(animal: Animal): Unit = {
      println(s"I am a croc and I'm eating ${animal.creatureType}")
    }
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //  traits vs abstract classes
  //1 traits do not have constructor parameters
  //  2 multiple traits can be inherited by the same class and only one class can be extended
  //  3 traits = behaviour, abstract class = "thing"

}
