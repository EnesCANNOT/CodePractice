package ProjectEuler

import kotlin.math.max

fun main() {
    println(largestPalindromeProduct(3))
}

fun largestPalindromeProduct(digit: Int): Int{
    val maxLimit = "9".repeat(digit).toInt()
    val minLimit = ("1" + "0".repeat(digit - 1)).toInt()
    var result = 1

    for (num1 in (maxLimit downTo minLimit)){
        for (num2 in (maxLimit downTo minLimit)){
            if (isPalindrome(num1 * num2))
                result = max(result, (num1 * num2))
        }
    }

    return result
}

fun isPalindrome(number: Int): Boolean = (number.toString() == number.toString().reversed())