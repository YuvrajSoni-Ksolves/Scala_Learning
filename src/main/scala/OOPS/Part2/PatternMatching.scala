package OOPS.Part2

object PatternMatching {
  def main(args: Array[String]): Unit = {
    def testStr(str: String): String = {
      str match {
        case "G1" => "GFG"
        case "G2" => "Scala Tutorials"
        case _ => "Default Case Executed"
      }
    }

    println(test(1))
    println(testStr("G1"))
  }

  def test(i: Int): String = {

    i match {
      case 1 => return ("first case")
      case 2 => return ("second case")
      case _ => return ("no match found")
    }
  }
}
