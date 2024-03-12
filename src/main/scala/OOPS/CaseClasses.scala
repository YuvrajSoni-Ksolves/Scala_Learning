package OOPS

object CaseClasses extends App {
  case class Employee(name: String, age: Int, salary: Float) {

  }

  var emp = new Employee("Yuvraj", 20, 20000.00f);
  println(emp)
  //  emp.name = "Ajay";
  //  error as its an object of case class

  //  2 Equals, hashcode and toString
  val tester = new Employee("ajay", 29, 2323.03f);
  println(tester.toString)
  val tester2 = new Employee("ajay", 29, 2323.03f);
  println(tester == tester2)
  // more useful, while using collections

  //COMPANION OBJECT
  //  whenever we use class, its going to apply the apply method
  val analyst = Employee("Mani", 23, 2000.23f)
  println(analyst)
  // to hold the light weight data object,
  // that's when we use case class


  //CASE OBJECT
  //NO COMPANION OBJECT
  //  because case object is companion object
  case object Person {
    def getPersonalDetails = {
      "My name is YUVRAJ"
    }
  }

  println(Person.getPersonalDetails)

  val maxi = 10
  val inc = 2
  for (a <- 0 until maxi by inc) {
    println(a)
  }

  //jackson
  //case classes : json parsing
  // pojo in java
  //  grouping on collections, filtering,searching, mapping
}

