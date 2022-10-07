package HackerRank

fun main() {
    staircase(10)
}

/*
fun staircase(n: Int){
    (1..n).forEach {
        repeat(n-it){
            print(" ")
        }

        repeat(it){
            print("#")
        }

        println()
    }
}
 */

fun staircase(n: Int){
    for (i in 1..n){
        println(" ".repeat(n-i) + "#".repeat(i))
    }
}