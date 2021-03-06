// Solution-2.scala
// Solution to Exercise 2 in "Overloading"
import com.atomicscala.AtomicTest._

def f() : Int = { 0 }
def f(i: Int): Int = { i }
def f(i: Int, j: Int) = { i + j }
def f(i: Int, j: Int, k: Int) = { i + j + k }
def f(i: Int, j: Int, k: Int, l: Int) = { i + j + k + l }

f() is 0
f(1) is 1
f(1, 2) is 3
f(1, 2, 3) is 6
f(1, 2, 3, 4) is 10


