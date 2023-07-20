package HackerRank

import kotlin.math.abs

fun main() {
    val x = 1
    val y = 2
    val z = 3

    val result = catAndMouse(x, y, z)
    println(result)
}

fun catAndMouse(x: Int, y: Int, z: Int): String = if (abs(z-y) > abs(z-x)) "Cat A" else if (abs(z-x) > abs(z-y)) "Cat B" else "Mouse C"