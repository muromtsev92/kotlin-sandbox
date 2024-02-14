fun main(args: Array<String>) {
    val words1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val words2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val words3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arrSize1 = words1.size
    val arrSize2 = words2.size
    val arrSize3 = words3.size

    val index1 = (Math.random() * arrSize1).toInt()
    val index2 = (Math.random() * arrSize2).toInt()
    val index3 = (Math.random() * arrSize3).toInt()

    val phrase = "${words1[index1]} ${words2[index2]} ${words3[index3]}"

    var bobik = Dog("bobik", 50, "mixed")
    println(bobik.bark())
}