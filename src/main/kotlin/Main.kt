import collections.Grocery
import kotlin.math.pow

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

    println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
    println(romanToInt("XXIV"))

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

fun checkIfPangram(sentence: String): Boolean {
    var map = mutableMapOf<Char, Boolean>()
    for(c in 'a'.rangeTo('z')){
        map[c] = false
    }
    for(i in sentence.indices){
        if(!map[sentence[i]]!!){
            map[sentence[i]] = true
        }
    }
    return !map.values.contains(false)
}

fun reverse1(x: Int): Int {
    var numC = x
    var digits = arrayListOf<Int>()
    while(numC>10){
        digits.add(numC % 10)
        numC /= 10
        if(numC < 10){
            digits.add(numC)
        }
    }
    println(digits)
    var res = 0.0
    var i = digits.size - 1
    var j = 0
    while (i >= 0){
        res += digits[j].toDouble() * 10.0.pow(i.toDouble())
        i--
        j++
    }
    println(res.toInt())
    if(x<0) res *= -1
    if(res>2.0.pow(31)*-1 || res<2.0.pow(-31) - 1) return 0
    return res.toInt()
}

fun reverse(x: Int): Int{
    val positiveValue: String
    val sign = if (x < 0) {
        positiveValue = x.toString().drop(1)
        "-"
    } else {
        positiveValue = x.toString()
        ""
    }
    val res = positiveValue.reversed()
    if (((-2.0).pow(31) <= res.toLong() && res.toLong() <= 2.0.pow(31) - 1).not()) {
        return 0
    }
    return (sign + res).toInt()
}

fun romanToInt(s: String): Int =
    s.mapIndexed { index, c ->
        when (c) {
            'I' -> if ("VX".contains(s.getOrNull(index + 1) ?: ' ')) -1 else 1
            'V' -> 5
            'X' -> if ("LC".contains(s.getOrNull(index + 1) ?: ' ')) -10 else 10
            'L' -> 50
            'C' -> if ("DM".contains(s.getOrNull(index + 1) ?: ' ')) -100 else 100
            'D' -> 500
            'M' -> 1000
            else -> throw IllegalArgumentException("$c is not valid")
        }
    }.sum()
