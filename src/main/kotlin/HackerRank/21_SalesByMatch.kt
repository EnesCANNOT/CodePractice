package HackerRank

fun main() {
    val ar = arrayOf(1, 2, 1, 2, 1, 3, 2)
    println(sockMerchant(9, ar))
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val map = ar.groupingBy { it }.eachCount().toSortedMap()
    var result = 0

    map.values.forEach {
        result += it / 2
    }

    return result
}