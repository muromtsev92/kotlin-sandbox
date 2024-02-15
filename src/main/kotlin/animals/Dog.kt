package animals

class Dog (val name: String, var weight_param: Int, val breed_param: String){

    init{
        println("animals.Dog $name has been created")
    }

    var activities = arrayOf("Walking")
    val breed = breed_param.uppercase()

    init{
        println("The breed is $breed")
    }

    var weight = weight_param
        set(value){
            if (value>0) field = value
        }

    val weightInKgs: Double
        get() = weight/2.2


    fun bark(): String {
        return if (weight<20) "Yip!" else "Woof!"
    }
}