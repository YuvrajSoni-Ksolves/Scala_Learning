package OOPS

class Writer(val firstName: String, val surName: String, val year: Int) {
  def fullname(): String = {
    return this.firstName + " " + this.surName
  }

}

class Novel(val name: String, val year: Int, val author: Writer) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val value: Int) {
  def currentCount(): Int = this.value

  def increament(): Unit = {
//     this.value +=1;
  };

  def increament(value: Int): Int = this.value + value;

  def decreament(): Int = this.value - 1;

  def decreament(value: Int): Int = this.value - value;
}

object Mai {
  def main(args: Array[String]): Unit = {
//    val author = new Writer("Charles", "Dickens", 1812);
//    val imposter = new Writer("Charles", "Dickens", 1812);
//    val novel = new Novel("Great Expectations", 1861, author)
//    println(novel.authorAge)
//    println(novel.isWrittenBy(imposter))

    val c = new Counter(10);
    println(c.currentCount());
    c.increament()
    c.increament()
    c.increament(10);
    c.decreament(4);
    c.increament()
    c.decreament();
    println(c.currentCount())
  }
}
