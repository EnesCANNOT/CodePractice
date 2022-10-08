package HackerRank

import kotlin.math.abs

fun main() {
    println(kangaroo(0, 2, 5, 3))
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String{
    if((x1 > x2 && v1 > v2) || (x2 > x1 && v2 >= v1)) return "NO"
    return if (abs(x2 - x1) % (v2 - v1) == 0) "YES" else "NO"
}