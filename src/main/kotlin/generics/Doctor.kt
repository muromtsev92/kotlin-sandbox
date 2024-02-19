package generics

class Doctor<in T: Pet> {
    fun treat(t: T) {
        println("Treat pet ${t.name}")
    }
}