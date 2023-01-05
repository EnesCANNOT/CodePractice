package LeetCode

fun main() {
    println(longestPalindrome("babad"))
}

fun longestPalindrome(s: String): String {
    if(s.length < 2) return s

    val dp = Array(s.length){ BooleanArray(s.length) }

    var start = 0
    var end = 0

    for(i in s.length - 1 downTo 0){
        for(j in i until s.length){
            dp[i][j] = (s[i] == s[j]) && (j - i < 2 || dp[i + 1][j - 1])

            if(dp[i][j] && j - i > end - start){
                start = i
                end = j
            }
        }
    }

    return s.substring(start, end + 1)
}