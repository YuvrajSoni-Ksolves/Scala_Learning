package Lectures

object VariableTypes extends  App{
  val x : Int = 12;
  println(x)

  //x = 23;
  //VALS ARE IMMUTABLE

  val y = 12;
  //TYPE OF VAL IS OPTIONAL,
  // COMPILER CAN INTER TYPES

  val aString : String = "Yuvraj";
  val anotherString : String = "Soni";
  val res = aString + " "+anotherString;
  println(res)

  val aChar : Char = 'y';
  val anInt = y;
  val aShort :Short = 1234;
  val aLong : Long = 1212323425;
  val aFloat : Float = 2.4f;
  val aDouble :Double = 3.14;

  //variable in scala

  var aVariable : Int = 12;
  aVariable+=10;  //Side effects
  println(aVariable);

}
