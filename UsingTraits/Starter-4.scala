// Starter Code for Exercise 4
// From "Using Traits" atom
import com.atomicscala.AtomicTest._

// From
wikipedia.org/wiki/Art_periods
// Pre-Renaissance: before 1300
// Renaissance: 1300-1599
// Baroque: 1600-1699
// Late Baroque: 1700-1789
// Romanticism: 1790-1880
// Modern: 1881-1970
// Contemporary: after 1971
val period = new ArtPeriod
period.show(1400) is "Renaissance"
period.show(1650) is "Baroque"
period.show(1279) is "Pre-Renaissance"
