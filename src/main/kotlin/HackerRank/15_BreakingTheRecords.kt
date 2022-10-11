package HackerRank

fun main() {
    val scores = arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1)
    println(breakingRecords(scores).joinToString())
}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = scores[0]
    var minCounter = 0
    var max = scores[0]
    var maxCounter = 0

    scores.forEach {
        if (it < min){
            min = it
            minCounter++
        }

        if (it > max){
            max = it
            maxCounter++
        }
    }

    return arrayOf(maxCounter, minCounter)
}