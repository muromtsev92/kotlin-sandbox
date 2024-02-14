class Dog (val name: String, var weight: Int, val breed: String){
    fun bark(): String {
        if (weight<20) return "Yip!" else return "Woof!"
    }
}