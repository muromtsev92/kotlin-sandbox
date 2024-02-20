@file:Suppress("UNUSED_EXPRESSION")

import generics.*
import generics.retailers.*

fun main(args: Array<String>) {
    val catBarsik = Cat("Barsik")
    val catKatsuba = Cat("Katsuba")
    val fishFinny = Fish("Finny")

    var catDoc = Doctor<Cat>()
    var petDoc = Doctor<Pet>()

    val catContest = Contest<Cat>(petDoc)
    catContest.addScore(catBarsik, 120)
    catContest.addScore(catKatsuba, 180)
    val topCat = catContest.getWinners().first()
    petDoc.treat(catKatsuba)
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petDoc)
    petContest.addScore(catBarsik, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    petDoc.treat(fishFinny)
    println("Pet contest winner is ${topPet.name}")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()

    val action = {x: Int -> x + 7}
    println(action(12))

    val iterator = {it: String -> it.replace("abc", "ABC")}

    var list = mutableListOf("abc1abc", "abc-null-abc", "abcabcabc")
    for(s in list){
        println(iterator(s))
    }
}
