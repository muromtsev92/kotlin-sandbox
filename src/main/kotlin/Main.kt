fun main(args: Array<String>) {
    val song1 = Song("The Mesopotamians", "They might be giants")
    val song2 = Song("Going Underground", "The Jam")
    val song3 = Song("Make me smile", "Steve Harvey")

    println(song2.play())
    println(song2.stop())
    println(song3.play())
}