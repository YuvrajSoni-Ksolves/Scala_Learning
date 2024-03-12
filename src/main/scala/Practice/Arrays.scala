// Scala program to adding elements in an array
// of the string as name.
object GFG
{
  // Main method
  def main(args: Array[String])
  {
    var name = new Array[String](4)

    // Adding element in an array
    name(0)="gfg"
    name(3)="geeks"
    name(1)="GeeksQuize"
    name(2 )="geeksforgeeks"
    println("After adding array elements : ")

    for ( m1 <-name )
    {
      println(m1 )
    }

  }
}
