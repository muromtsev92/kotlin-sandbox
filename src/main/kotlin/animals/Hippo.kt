package animals

class Hippo: Animal() {
    override val image = "animals.Hippo.jpg"
    override val food = "grass"
    override val habitat = "wasser"

    override fun makeNoise() {
        println("Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}