package animals

abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}