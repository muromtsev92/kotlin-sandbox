import animals.*

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    val s1 = Song("null", "agytin")
    val s2 = Song("null", "agytin")
    println(s1 == s2)
    var arr = intArrayOf(1,2,1)
    println(longestCommonPrefix(arrayOf("flower","flight")))
    println(longestCommonPrefix(arrayOf("ab","a")))

}

fun longestCommonPrefix(strs: Array<String>): String {
    var current = strs[0]
    for (i in 0..strs.size-2) {
        current = current.commonPrefixWith(strs[i+1])
    }
    return current
}