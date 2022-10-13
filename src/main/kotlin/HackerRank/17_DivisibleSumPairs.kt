package HackerRank

fun main() {
    val ar = arrayOf(1, 3, 2, 6, 1, 2)
    println(divisibleSumPairs(6, 3, ar))
}

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var result = 0
    for(index in ar.indices){
        var counter = index + 1
        while (counter < n){
            if ((ar[index] + ar[counter]) % k == 0){
                result++
            }
            counter++
        }
    }

    return result
}