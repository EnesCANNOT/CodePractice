package ProjectEuler

private fun main() {
    println(multiplesOfThreeOrFive())
}

private fun multiplesOfThreeOrFive(): Long{
    val number1 = 3
    val number2 = 5
    val smallestValue = 1
    val greatestValue = 1000
    var result: Long = 0

    (smallestValue until greatestValue).forEach {
        if (it % number1 == 0 || it % number2 == 0)
            result += it
    }

    return result
}