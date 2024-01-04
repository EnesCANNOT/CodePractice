package HackerRank

fun main() {
    println(pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
}

fun pickingNumbers(a: Array<Int>): Int {
    val frequencyMap = mutableMapOf<Int, Int>()

    for (num in a) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    var maxLen = 0

    for (num in frequencyMap.keys) {
        val currentLen = frequencyMap[num]!! + frequencyMap.getOrDefault(num + 1, 0)
        if (currentLen > maxLen) {
            maxLen = currentLen
        }
    }

    return maxLen
}