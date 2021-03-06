// Solution-9.scala
// Solution to Exercise 9 in "Class Arguments"
import com.atomicscala.AtomicTest._

def squareThem(x: Int*):Int = {
  var square = 0
  for (i <- x) {
    square = square + i*i
  }
  square
}
// Starter Code:
squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
