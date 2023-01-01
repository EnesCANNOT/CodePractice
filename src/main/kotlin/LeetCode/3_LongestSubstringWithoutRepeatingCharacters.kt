package LeetCode

fun main(){
    println(lengthOfLongestSubstring(" "))
}

fun lengthOfLongestSubstring(s: String): Int {

    if (s == "")
        return 0

    var start = 0
    var end = 0
    var maxLength = 0
    val uniqueCharacters: MutableSet<Char> = HashSet()
    while (end < s.length) {
        if (uniqueCharacters.add(s[end])) {
            end++
            maxLength = maxLength.coerceAtLeast(uniqueCharacters.size)
        } else {
            uniqueCharacters.remove(s[start])
            start++
        }
    }
    return maxLength
}