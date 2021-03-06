// Solution-3.scala
// Solution to Exercise 3 in "Imports & Packages"

// Solution 1: import specific classes
import com.atomicscala.royals.{Royalty, Crest}

val royal3 = new Royalty("Henry", "Laughs")
val title3 = royal3.title()
assert("Sir Laughsalot" == title3,
  "Expected Sir Laughsalot, Got " + title3)

val crest2 = new Crest("Bear", "1875")
assert("Bear in the year 1875" ==
  crest2.description(),
  "Expected Bear in the year 1875, Got " +
  crest2)
println(crest2.description)

// Solution 2: import everything

import com.atomicscala.royals._
val royal2 = new Royalty("Henry", "Laughs")
val title2 = royal2.title()
assert("Sir Laughsalot" == title2,
  "Expected Sir Laughsalot, Got " + title2)
println(title2)

// this won't work if Crest isn't
// imported
val crest3 = new Crest("Bear", "1875")
assert("Bear in the year 1875" ==
  crest3.description(),
  "Expected Bear in the year 1875, Got " +
  crest3)
println(crest3.description)
