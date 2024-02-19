package generics.retailers

import generics.Cat

class CatRetailer: Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}