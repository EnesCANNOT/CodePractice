package HackerRank

fun main() {
    val s = arrayOf(1, 1, 1, 1, 1, 1)
    println(birthday(s, 3, 2))
}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count = 0
    for (i in (0..s.size - m)){
        var sum = 0

        for (j in 0 until m) {
            sum += s[i+j]
        }

        if (sum == d)
            count++
    }

    return count
}