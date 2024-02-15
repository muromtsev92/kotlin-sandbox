package animals

class Vet {
    fun giveShot(a: Animal){
        a.makeNoise()
        println("The med was injected in the ass of ${a.image}")
    }
}