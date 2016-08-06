package gov.hmrc.checkout

import gov.hmrc.checkout.Cart._

object CheckOut {
  def main(args: Array[String]) {
    /*
      A rudimentary console tool which accepts shopping items (space separated) e.g Apple Apple Orange Orange.
      On pressing enter in the console, the total cost of the items will be displayed
     */
    val shopping = io.StdIn.readLine().split(' ').toList
    println(totalCostWithOffers(Cart(shopping)))
  }
}