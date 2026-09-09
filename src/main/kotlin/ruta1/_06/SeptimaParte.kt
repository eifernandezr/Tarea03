package org.eifr.dsm.ruta1._06

fun main() {
    val winningBid = Bid(5_000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2_000)}.")
    println("Item B is sold at ${auctionPrice(null, 3_000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    if (bid == null) return minimumPrice
    return bid.amount.coerceAtLeast(minimumPrice)
}
