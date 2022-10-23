package ProjectEuler

import kotlin.math.max

private fun main() {
    val digit = 3
    println(largestPalindromeProduct(digit))
}

private fun largestPalindromeProduct(digit: Int): Int{
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

private fun isPalindrome(number: Int): Boolean = (number.toString() == number.toString().reversed())