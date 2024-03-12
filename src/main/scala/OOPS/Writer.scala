class Writer(val fname: String, val lname: String, val year: Int) {
  def fullname(): String = {
    this.fname + " " + this.lname
  }
}

class Novel(val name: String, val year: Int, val author: Writer) {
  def authorAge(): Int = {
    return year - this.author.year;
  }

  def isWrittenBy(author: Writer): Boolean = {
    return author == this.author
  }

  def copy(newyear: Int): Novel = {
    new Novel(name, newyear, author);
  }
}

class Counter(val count: Int = 0) {
  def currentCount(): Int = this.count

  //immutability in objects
  def increment(): Counter = {
    println("incrementing")
    new Counter(this.count + 1);
  }

  def decrement(): Counter = {
    println("decrementing")
    new Counter(this.count - 1);
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this;
    else increment.increment(n - 1)
  }

  def decrement(n: Int): Counter = {
    if (n <= 0) return this;
    else decrement.decrement(n - 1)
  }

  def print(): Unit = println(this.count)

}

object Main {
  def main(args: Array[String]): Unit = {
    val author = new Writer("Charles", "Dickens", 1950);
    println(author.fullname())
    val novel = new Novel("Great Expectations", 1970, author);
    println(novel.authorAge())
    println(novel.isWrittenBy(author))

    val author2 = new Writer("JK", "Rowling", 1990);
    println(novel.isWrittenBy(author2))



    val counter = new Counter();
    counter.increment().print()
    counter.increment(100).print();
//    counter.decrement(85).print()
//    println(counter.currentCount())
    val c2 = counter.increment().increment(10).increment()
//    println(counter.count)
    println("c2 count is : "+c2.count)
  }
}