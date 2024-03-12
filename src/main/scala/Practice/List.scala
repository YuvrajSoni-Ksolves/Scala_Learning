package Practice

import java.util
import scala.collection.mutable

object list {
  def main(args: Array[String]): Unit = {
    val mylist1: List[String] = List("Yuvraj", "Soni", "Ksolves")
    println(mylist1)
    for (w <- mylist1) {
      println(w)
    }
    println(mylist1.head, mylist1.tail, mylist1.length);
    println(mylist1.isEmpty)
    val nlist = mylist1.map(f => f + "?");
    println(nlist)

    val mylist2: List[String] = List.fill(8)("Yuvraj");
    println(mylist1)
    val myList3 = mylist1.reverse
    println(myList3)

    val m1 = List(1, 2, 3, 4, 5, 6, 7);
    val result = m1.filter(_ <= 5)

    println(result)
    val res = m1.reduce((a, b) => a + b);
    println(res)

    val str_elements: Seq[String] = Seq("hello",
      "Geeks", "For", "Geeks")
    println(s"Elements = $str_elements")

    // Concatenate strings with fold function
    val concat: String = str_elements.fold("")(
      (a, b) => a + "-" + b)
    println(s"After concatenation = $concat")
    //    fold is similar to reduce, but with fold we can take care of empty collections
    //concatenating two lists at same time
    val a = mutable.HashMap[String, String]();
    a.put("Yuvraj", "Noida");

    println(a.getOrElse("Yuvaj","Not Found"))

  }

}