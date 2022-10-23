package ProjectEuler

private fun main() {
    val limit = 4000000
    println(evenFibonacciNumbers(limit))
}

private fun evenFibonacciNumbers(limit: Int): Long{
    var num1 = 0
    var num2 = 1
    var result: Long = 0

    while (num2 < limit){
        if (num2 % 2 == 0)
            result += num2

        num2 = num1 + num2
        num1 = num2 - num1
    }

    return result
}