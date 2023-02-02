package LeetCode

fun main() {
    println(convert("PAYPALISHIRING", 3))
}

fun convert(s: String, numRows: Int): String {
    if (numRows == 1) return s
    val res = StringBuilder()
    val n = s.length
    val cycleLen = 2 * numRows - 2
    for (i in 0 until numRows) {
        for (j in 0 until n - i step cycleLen) {
            res.append(s[i + j])
            if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                res.append(s[j + cycleLen - i])
        }
    }

    return res.toString()
}