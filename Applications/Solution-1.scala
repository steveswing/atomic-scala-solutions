// Solution-1.scala
// Solution to Exercise 1 in "Applications"
import com.atomicscala.AtomicTest._

object WhenAmI extends App {
  hi
  println(new java.util.Date())
  def hi = println("Hello! It's:")
}
