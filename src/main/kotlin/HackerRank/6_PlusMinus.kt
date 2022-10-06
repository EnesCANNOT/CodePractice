package HackerRank

fun main() {
    val arr = arrayOf(-2, -1, 0, 1, 2)
    println(plusMinus(arr))
}

fun plusMinus(arr: Array<Int>){
    println(String.format("%.6f", arr.count { it > 0 } / arr.size.toDouble()))
    println(String.format("%.6f", arr.count { it < 0 } / arr.size.toDouble()))
    println(String.format("%.6f", arr.count { it == 0 } / arr.size.toDouble()))
}