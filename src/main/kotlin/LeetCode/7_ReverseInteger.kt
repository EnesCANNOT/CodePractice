package LeetCode

fun main() {
    println(reverse(9646324351))
}

fun reverse(x: Any): Int? {
    var num: String
    var isPositive: Boolean

    when (x) {
        is Long -> {
            num = x.toString()
            isPositive = x >= 0
        }

        is Int -> {
            num = x.toString()
            isPositive = x >= 0
        }

        else -> return null
    }

    if (!isPositive) {
        num = num.substring(1)
    }
    num = num.reversed()

    while (num.length > 1 && num[0] == '0') {
        num = num.substring(1)
    }

    var result: Int? = null
    when (isPositive) {
        true -> {
            result = num.toIntOrNull()
        }
        false -> {
            result = ("-" + num).toIntOrNull()
        }
    }

    return result ?: 0
}
