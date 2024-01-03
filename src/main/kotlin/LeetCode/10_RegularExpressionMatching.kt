package LeetCode

fun main() {
    /*
    val s = "aa"
    val p = "a"
    */

    /*
    val s = "aa"
    val p = "a*"
    */

    val s = "ab"
    val p = ".*"

    println("String : $s\nPattern : $p\nOutput : ${isMatch(s, p)}")
}

fun isMatch(s: String, p: String): Boolean {
    val dp = Array(s.length + 1) { BooleanArray(p.length + 1) }
    dp[0][0] = true

    for (j in 1..p.length) {
        if (p[j - 1] == '*') {
            dp[0][j] = dp[0][j - 2]
        }
    }

    for (i in 1..s.length) {
        for (j in 1..p.length) {
            if (p[j - 1] == s[i - 1] || p[j - 1] == '.') {
                dp[i][j] = dp[i - 1][j - 1]
            } else if (p[j - 1] == '*') {
                dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s[i - 1] == p[j - 2] || p[j - 2] == '.'))
            }
        }
    }

    return dp[s.length][p.length]
}