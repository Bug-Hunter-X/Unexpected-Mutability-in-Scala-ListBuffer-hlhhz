```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Correct way to convert to immutable List
  val immutableList = buffer.toList 

  println(immutableList) // Output: List(1, 2, 3)

  // Attempting to modify immutableList will result in a compile-time error
  // immutableList += 4 // This line will cause a compile-time error
}
```