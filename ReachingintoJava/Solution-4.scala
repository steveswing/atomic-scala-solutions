// Solution-4.scala
// Solution to Exercise 4 in "Reaching into Java"
import com.atomicscala.AtomicTest._

// scala -classpath ../commons-math-2.2/commons-math-2.2.jar ReachingIntoJava.scala

import org.apache.commons.math._
import stat._

val f = new Frequency
f.addValue("cat")
f.addValue("dog")
f.addValue("cat")
f.addValue("bird")
f.addValue("cat")
f.addValue("cat")
f.addValue("kitten")
f.addValue("mouse")
f.getCount("cat") is 4

