package animals

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("the animal is making noise")
    }

    open fun eat(){
        println("the animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}