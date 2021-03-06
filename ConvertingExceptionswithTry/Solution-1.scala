// Solution-1.scala
// Solution to Exercise 1 in "Converting Exceptions with Try"
import com.atomicscala.AtomicTest._

/*{oldDescription}
 Modify TryTransform.scala to show that all the Try calls can be replaced with Success. Satisfy the following tests:
f(0) is "OK Bob"
f(1) is "Reason"
f(2) is "11"
f(3) is "1.618"
{oldDescription}*/

import util.{Try, Success, Failure}
import errors._

def f(n:Int) = Try(toss(n)).transform(
  i => Success(s"$i Bob"), // Success
  e => e match { // Failure
    case Except1(why) => Success(why)
    case Except2(n) => Success(n)
    case Except3(msg, d) => Success(d)
  }
).get

f(0) is "OK Bob"
f(1) is "Reason"
f(2) is "11"
f(3) is "1.618"

// Starter Code:
f(0) is "OK Bob"
f(1) is "Reason"
f(2) is "11"
f(3) is "1.618"
