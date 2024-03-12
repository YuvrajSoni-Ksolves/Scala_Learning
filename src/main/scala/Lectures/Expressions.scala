package Lectures

object Expressions extends App{
     def main2(unit: Unit):Unit = {
      val x = 1 + 2; // EXPRESSION
       println(x);
       println(2+3+4);
       // + - * / % | || & && ! << >>
       //(>>> right shift with zero extension)
       println(1 == x);
       println(!(1==x));

       //changing a variable is called side effect
       var aVariable = 2
       aVariable += 3

       // Instructions(DO) vs Expression (VALUE)

       //IF EXPRESSION
       val aCondition = false;
       val aConditionValue = if(aCondition){
         5
       }else 3; println(aConditionValue)
      println(if(aCondition) 6 else 7)

       //IF is an expression in SCALA

       var i = 0;
       while(i< 10){
         println(i);
         i+=10;
       }
       //NEVER WRITE THIS AGAIN!!!

       //EVERYTHING IN SCALA IS AN EXPRESSION
       val aWeirdValue = (aVariable = 78);
       println(aWeirdValue)
       println(aVariable)

      //SIDE EFFECTS : PRINTLN(), WHILE, REASSIGN

       //CODE BLOCKS

       val aCodeBlock = {
         val y = 2;
         val z = y + 1;
         if (z > 2) "hello" else "good bye"
       };
       println(println("hello world"));
       val someValue = {
         2 < 3;
       }

//       value of codeblock is the value of its last constituent
       val someOtherValue = {
         if(someValue) 999 else 1000;
         val r = 1212;
          r
       }
       println(someValue, someOtherValue);

    }
  main2()
}
