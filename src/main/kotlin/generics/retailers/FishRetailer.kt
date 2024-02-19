package generics.retailers

import generics.Fish

class FishRetailer: Retailer<Fish> {
    override fun sell(): Fish{
        println("Sell fish")
        return (Fish(""))
    }
}