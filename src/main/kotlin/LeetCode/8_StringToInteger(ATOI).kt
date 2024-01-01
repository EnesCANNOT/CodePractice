package LeetCode

fun main() {
    // val str = "AA+0058+9"
    val str = "a z--42"
    println(str)
    println(myAtoi(str))
}

fun myAtoi(str: String): Int {
    var index = 0
    var sign = 1
    var result = 0

    // Remove leading whitespaces
    while (index < str.length && str[index] == ' ') {
        index++
    }

    // Check for optional sign
    if (index < str.length && (str[index] == '+' || str[index] == '-')) {
        sign = if (str[index] == '-') -1 else 1
        index++
    }

    // Process digits
    while (index < str.length && Character.isDigit(str[index])) {
        val digit = str[index] - '0'

        // Check for overflow
        if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > Int.MAX_VALUE % 10)) {
            return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
        }

        result = result * 10 + digit
        index++
    }

    return result * sign
}