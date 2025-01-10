```scala
import scala.collection.mutable.ListBuffer

 object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Incorrect way to convert to immutable List
  val immutableList = buffer.toList //This is correct

  //The bug is here, you must not use this, this is wrong
  val immutableListWrong = buffer.result() // this returns mutable ListBuffer

  println(immutableList) // Output: List(1, 2, 3)
  println(immutableListWrong) // Output: ListBuffer(1, 2, 3)

  immutableListWrong += 4 //This line will compile and run successfully. This is a bug. The list is supposed to be immutable.
  println(immutableListWrong) //Output: ListBuffer(1, 2, 3, 4)
 }
```