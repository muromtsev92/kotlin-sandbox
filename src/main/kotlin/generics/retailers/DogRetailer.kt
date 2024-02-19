package generics.retailers

import generics.Dog

class DogRetailer: Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}