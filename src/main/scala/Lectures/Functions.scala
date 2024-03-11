package Lectures

object Functions extends {
  def main(args : Array[String]): Unit = {
    val a = "Yuvraj";
    val b = "Soni";
    val ans = aFunction(a,b);
    println(ans)
    println(aParameterLessFunction());
    println(aParameterLessFunction())
    val res = aRepeatedFunction("Yuvraj",3);
    println(res);

    greeting("Yuvraj", 20);

    println(factorial(6))

    println(fibinacci(5))

    println(isPrime(13))
    println(isPrime2(10))
  }

  def aFunction(a:String, b : String)= {
    a + " " + b;
  }
  def aParameterLessFunction() : Int = 42
  //WHEN YOU NEED LOOPS, USE RECURSION

  def aRepeatedFunction(aString : String, n : Int ):String={
    if (n==1)aString;
    else aString + aRepeatedFunction(aString, n-1)
  }

//  GREETING FACTORIAL
  def greeting(name : String, age : Int):Unit ={
    println(s"Hii, my name is ${age} and I am ${age} years old")
  }

//  FATORIAL FUNCTION
  def factorial(n : Int) : Int = {
    if(n<=1)return 1;
    return n * factorial(n-1);
  }
//FIBONACCI FUNCTION
  def fibinacci(n : Int): Int = {
    if(n==1 || n ==2 )return n;
    return fibinacci(n-1) + fibinacci(n-2);
  }

  //Prime number or not
  def isPrime(n : Int) : Boolean= {
    if(n<=1)return false;
    else if(n == 2 || n == 3)true;
    for(i <- 2 to n/2){
      if(n%i==0)return false;
    }
    return true;
  }
  def isPrime2(n : Int):Boolean ={
    def isPrimeUtil(t : Int): Boolean = {
      if(t<=1)true;
      else return n%t!=0 && isPrimeUtil(t-1);
    }
    isPrimeUtil(n/2);
  }

}
