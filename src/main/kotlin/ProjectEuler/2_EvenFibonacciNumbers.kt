package ProjectEuler

fun main() {
    println(evenFibonacciNumbers(4000000))
}

fun evenFibonacciNumbers(limit: Int): Long{
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