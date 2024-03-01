import collections.Grocery

fun main(args: Array<String>) {

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
    println(differenceOfSum(intArrayOf(1,15,6,3)))

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


fun differenceOfSum(nums: IntArray): Int {
    var sumN = 0
    var sumD = 0
    for (num in nums){
        sumN += num
        var j = 0
        if (num < 10) sumD += num
        var numC = num
        while(numC>10){
            j += numC % 10
            numC /= 10
            if(numC < 10){
                j += numC
            }
        }
        sumD += j
    }
    return sumN - sumD
}