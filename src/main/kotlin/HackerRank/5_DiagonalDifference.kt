package HackerRank

import kotlin.math.abs

fun main() {
    val arr: Array<Array<Int>> = arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))
    println(diagonalDifference(arr))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int{
    val d1 = (0 until arr.size).sumOf { arr[it][it] }
    val d2 = (0 until arr.size).sumOf { arr[it][arr.size - it - 1] }

    return abs(d1 - d2)
}