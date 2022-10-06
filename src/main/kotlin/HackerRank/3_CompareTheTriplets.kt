package HackerRank

fun main() {
    val a = arrayOf(5, 6, 7)
    val b = arrayOf(3, 6, 10)
    compareTriplets(a, b).forEach {
        println(it)
    }
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int>{
    val scoreA = (0..a.lastIndex).count { a[it] > b[it] }
    val scoreB = (0..b.lastIndex).count { b[it] > a[it] }

    return arrayOf(scoreA, scoreB)
}