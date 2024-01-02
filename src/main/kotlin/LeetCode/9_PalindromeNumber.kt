package LeetCode

fun main() {
    println(isPalindrome(10901))
}

fun isPalindrome(x: Int): Boolean {
    val check = x.toString()
    val firstPart = check.substring(0, check.length/2)
    val lastPart = if (check.length % 2 == 1) check.substring(check.length/2).drop(1) else check.substring(check.length/2)
    println(firstPart)
    println(lastPart)
    return firstPart.equals(lastPart.reversed())
}