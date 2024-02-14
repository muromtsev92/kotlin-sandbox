
fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")

    while(true){
        var gameScore = 0
        var userScore = 0
        val gameChoice = getGameChoice(options)
        val userChoice = getUserChoice(options)
        val winner = getWinner(gameChoice, userChoice)
        if(winner == "Player") userScore++ else if(winner == "CPU") gameScore++
        printSummary(winner, gameScore, userScore)
    }
}

//    fun getGameChoice(optionsParam: Array<String>): String {
//        return optionsParam[(Math.random() * optionsParam.size).toInt()]
//    }

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {

    var isValidChoice = false
    var userChoice = ""
    while(!isValidChoice){
        print("Make a choice of:")
        for (x in optionsParam) print(" $x")
        println(".")
        val userInput = readlnOrNull()
        if(userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        if(!isValidChoice) println("Your choice is not valid")
    }
    return userChoice
}

fun getWinner(gameChoice: String, userChoice: String): String {
    println("CPU choice is $gameChoice || Your choice is $userChoice")
    if(userChoice == gameChoice) return "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Scissors" && gameChoice == "Paper") ||
        (userChoice == "Paper" && gameChoice == "Rock")) {

        return "Player"}
    else return "CPU"
}

fun printSummary(winner:String, gameScore: Int, userScore: Int){
    if(winner == "Tie!") println(winner)
    else println("Winner is $winner")
    println("CPU: $gameScore - YOU: $userScore")
    println("__________________________")
    println("")
}



