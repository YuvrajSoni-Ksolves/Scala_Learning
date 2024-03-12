package Practice

object list{
  def main(args : Array[String]):Unit = {
    val mylist1 : List[String] = List("Yuvraj", "Soni","Ksolves")
    println(mylist1)
    for(w <- mylist1){
      println(w)
    }
    println(mylist1.head, mylist1.tail, mylist1.length);
    println(mylist1.isEmpty)

    val mylist2 :List[String] = List.fill(8)("Yuvraj");
    println(mylist1)
    val myList3=mylist1.reverse
    println(myList3)
  }

}