import collections.Grocery

fun main(args: Array<String>) {
//    var addFive = {x: Int -> x+5}
//    println("Add five to 11 is ${addFive(11)}")
//
//    val sumInt = {x: Int, y: Int -> x + y}
//    println("Sum of 5 and 6 is ${sumInt(5,6)}")
//
//    convert(5.0) { it * 1.8 + 32 }
//    convertFive { it * 1.8 + 32 }

    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val vegetables = groceries.filter{ it.category == "Vegetable"}
    println("vegetables: $vegetables")

    val notFrozen = groceries.filterNot { it.category == "Frozen" }.map {it.name}
    println("not frozen: $notFrozen")

    val groceryNames = groceries.map { it.name } //проходит по всем объектам, берет от каждого имя и кладет в список
    println("grocery names: $groceryNames")

    val halfPrices = groceries.map { it.unitPrice * 0.5 }
    println("half prices: $halfPrices")

    val newPrices = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("new prices: $newPrices")


    print("Costs < 3.0: ")
    val fewer3 = groceries.filter { it.unitPrice < 3.0 }
        .forEach { println(it.name) }



    groceries.groupBy { it.category }.forEach{
        println(it.key)
        it.value.forEach { println("    ${it.name}") }
    }

}

fun convert(
    x: Double,
    converter: (Double) -> Double
): Double {
    val result = converter(x)
    println("$x converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}
