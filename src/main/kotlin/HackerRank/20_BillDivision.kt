package HackerRank

import kotlin.math.abs

fun main() {
    val bill = arrayOf(3, 10, 2, 9)
    bonAppetit(bill, 1, 7)
}

fun bonAppetit(bill: Array<Int>, k: Int, b: Int){
    when((bill.sum() - bill[k])/2 - b){
        0 -> println("Bon Appetit")
        else -> println(abs((bill.sum() - bill[k])/2 - b))
    }
}