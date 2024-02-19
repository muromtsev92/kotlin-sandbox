package generics

import animals.Vet

class Contest<T: Pet>(var vet: Doctor<T>) {
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if(score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.max()
        for((t,score) in scores) {
            if(score == highScore) winners.add(t)
        }
        return winners
    }
}