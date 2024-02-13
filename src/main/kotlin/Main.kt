fun main(args: Array<String>) {
    var x: Short = 1

    while (x.toInt() < 3){
        print(if (x.toInt() == 1) "Yab" else "Dab" )
        print("ba")
        x++
    }
    if (x.toInt()==3) println("Do")
}