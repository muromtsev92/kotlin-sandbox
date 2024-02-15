package animals

abstract class Canine: Animal(), Roamable {
    override fun roam() {
        println("The canine is roaming")
    }
}