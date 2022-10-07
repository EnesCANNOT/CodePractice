package HackerRank

fun main() {
    val candles = arrayOf(3, 2, 1, 3)
    println(birthdayCakeCandles(candles))
}

fun birthdayCakeCandles(candles: Array<Int>): Int{
    candles.sort()
    return candles.count { it == candles.get(candles.lastIndex) }
}