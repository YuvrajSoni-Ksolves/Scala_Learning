package Lectures

import scala.annotation.tailrec


object Recusrion {
  def main(args: Array[String]): Unit = {
//    println(factorial(7))
//    println(anotherFatorial(20000))

//    println(concatString("Hello",10));
//    print(isPrimeTail(3));
      println(fibonacciTail(1))
      println(fibonacciTail(2))
      println(fibonacciTail(3))
      println(fibonacciTail(4))
      println(fibonacciTail(5))
      println(fibonacciTail(6))
      println(fibonacciTail(7))
      println(fibonacciTail(8))
  }
  def factorial(n : Int) : Int = {
    if(n<=1)return 1;
    return n * factorial(n-1);  //HEAD RECURSION
  }
  def anotherFatorial(x : BigInt):BigInt = {
    @tailrec
    def helper(x : BigInt, accumulator : BigInt): BigInt ={
      if(x<=1)return accumulator;
      else return helper(x-1, x*accumulator); //TAIL RECURSION = use recursive call as the LAST expression
    }
    helper(x,1);
  }

  //WHEN WE NEED LOOPS, WE USE TAIL_RECURSION.

//  1. Concatenates a string n times
  def concatString(a : String, n : Int) : String ={
    @tailrec
    def helper(a : String, acc : String, n:Int): String = {
      if(n==1)return a+acc;
      else return helper(a, acc + a, n-1);
    }
    helper(a,"",n);
  }
//  2. Is prime using tail recursion
  def isPrimeTail(n: Int):Boolean={
    @tailrec
    def helper(n:Int, div:Int =2):Boolean={
      if(n<2)return false;
      else if(n== div) return true;
      else if(n%div ==0)return false;
      else return helper(n ,div+1);
    }
    helper(n,2);
  }
//  3. Fibonacci using tail recursion
  def fibonacciTail(n : Int) :Int = {
    if(n==1 || n == 2)return 1
    @tailrec
    def helper(n :Int, last : Int, secondLast : Int): Int = {
      if(n==2 || n == 3 )return last + secondLast;
      else {
//        var t = a;
        return helper(n-1, last + secondLast, last);
      }
    }
    helper(n , 1 , 1);
  }

}
