// Solution-1.scala
// Solution to Exercise 1 in "Functions as Objects"
import com.atomicscala.AtomicTest._

// DisplayVectorWithAnonymous.scala
var str = ""
val numberV = Vector(1, 2, 3, 4)
numberV.foreach(n => str += n)
str is "1234"

