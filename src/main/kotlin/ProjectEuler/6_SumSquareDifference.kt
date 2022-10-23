package ProjectEuler

import kotlin.math.abs

private fun main() {
    val sumOfTheSquareLimit = 100L
    val squareOfTheSumLimit = 100L

    println(sumSquareDifference(sumOfTheSquareLimit, squareOfTheSumLimit))
}

private fun sumSquareDifference(n1: Long, n2: Long): Long{
    var result1 = 0L
    var result2 = 0L

    for (n in (1..n1)){
        result1 += (n * n)
        result2 += n
    }

    result2 *= result2

    return abs(result1 - result2)
}