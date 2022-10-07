package HackerRank

fun main() {
    val arr = arrayOf(1, 3, 5, 7, 9)
    miniMaxSum(arr)
}

fun miniMaxSum(arr: Array<Int>){
    println("${ arr.map { it.toLong() }.sum() - arr.max()!!} ${arr.map { it.toLong() }.sum() - arr.min()!!}")
}