// Solution-2.scala
// Solution to Exercise 2 in "Evaluation Order"
import com.atomicscala.AtomicTest._

val sky = "sunny"
var temperature = 87
val somewhatSunnyAndWarm =
  (sky == "sunny" ||
  sky == "party cloudy") &&
  temperature > 80

 println(somewhatSunnyAndWarm)

