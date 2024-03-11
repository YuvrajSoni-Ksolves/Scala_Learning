package Lectures

object StringOps {
  def main(args : Array[String]):Unit={
    val str : String = "Hello, I am using scala";
//    println(str.charAt(14))
//    starting index in substring is inclusive and ending index is exclusive
    println(str.substring(7,11));
    println(str.split(" ").toList)
    println(str.startsWith("H"))
    println(str.replace(' ', 'y'))
    println(str.toUpperCase())
    println(str.length())

    val aNumberString = "2";
    val aNumber = aNumberString.toInt;
//    println('a' +: aNumber :+ 'z')
    println(str.reverse)
    println(str.take(5))

    //Scala Specific : String interpolators.

    //S- interpolators
    val name = "david"
    val age = 12;
    val greeting = s"Hello! my name is ${name.toUpperCase} and I am ${age+10} years old"
    
    println(greeting)

    // F-interpolators
    val speed = 100.2f;
    val myth = f"$name%s can eat $speed%2.4f burgers per minute"
    println(myth)

    //raw-interpolator
     println("this is a\n new line")
    println(raw"this is a\n new line")
  }

}
