package Lectures

import scala.annotation.tailrec

object DefaultArgs {
  def main(args : Array[String]):Unit={
    val fac10 = fact(7)
    println(fac10)
    savePictures(height = 2,width = 690, format = "png")
  }
  @tailrec
  def fact(n : Int, acc : Int = 1):Int={

    if(n<=1)return acc;
    else return fact(n-1, acc * n);
  }
  def savePictures(format :String = "jpg", width :Int = 1920, height : Int = 1080):Unit = {
    println("Saving pictures")
    println(format, width,height)
  }

}
