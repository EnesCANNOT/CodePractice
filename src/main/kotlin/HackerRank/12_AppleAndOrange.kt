package HackerRank

fun main() {
    val apples = arrayOf(-2, 2, 1)
    val oranges = arrayOf(5, -6)
    countApplesAndOranges(7, 11, 5, 15, apples, oranges)
}

/*
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var appleCounter = 0
    var orangeCounter = 0

    apples.forEach {
        if (a + it >= s && a + it <= t){
            appleCounter++
        }
    }

    oranges.forEach {
        if (b + it >= s && b + it <= t){
            orangeCounter++
        }
    }

    println(appleCounter)
    println(orangeCounter)
}
*/

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>){
    println(apples.count { a + it in s..t })
    println(oranges.count { b + it in s..t })
}