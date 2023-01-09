package HackerRank

fun main() {
    println(pageCount(5, 1))
}

fun pageCount(n: Int, p: Int): Int {
    val start = p/2
    val end = n/2 - start
    val result: Int
    if (start<end) result=start else result = end
    return result
}