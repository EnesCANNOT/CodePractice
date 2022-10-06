package HackerRank

fun main() {
    val ar: Array<Long> = arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    println(aVeryBigSum(ar))
}

fun aVeryBigSum(ar: Array<Long>): Long = ar.sum()