package HackerRank

fun main() {
    val a = arrayOf(2, 6)
    val b = arrayOf(24, 36)
    println(getTotalX(a, b))
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int = (a.max()!!..b.min()!!).count { num -> a.all { num % it == 0 } && b.all { it % num == 0 } }