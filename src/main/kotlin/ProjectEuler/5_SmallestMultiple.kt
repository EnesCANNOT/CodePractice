package ProjectEuler

fun main() {
    val min = 1L
    val max = 20L
    println(smallestMultiple(min, max))
}

private fun smallestMultiple(min: Long, max: Long): Long{
    var result = 1L

    for (num in min..max){
        if (isPrime(num))
            result *= num
        else{
            result = findLCM(result, num)
        }
    }

    return result
}

private fun isPrime(num: Long): Boolean{
    if(num < 2)
        return false
    for (i in (2..num/2)){
        if (num % i == 0L){
            return false
        }
    }

    return true
}

private fun findLCM(num1: Long, num2: Long): Long{

    var i = 1
    var gcd = 1

    while (i <= num1 && i <= num2){
        if (num1 % i == 0L && num2 % i == 0L){
            gcd = i
        }

        i++
    }

    return (num1 * num2) / gcd
}