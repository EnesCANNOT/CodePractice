package ProjectEuler

import kotlin.math.sqrt

private fun main() {
    println(summationOfPrimes(2000000))
}

private fun summationOfPrimes(number: Long): Long{

    fun isPrime(num: Long): Boolean{
        var flag: Boolean

        if (num >= 2){
            flag = true
            for(i in 2..(sqrt(num.toDouble())).toInt()){
                if (num % i == 0L){
                    flag = false
                    break
                }
            }
        } else{
            flag = false
        }

        return flag
    }

    var sum = 0L
    for (num in 1..number){
        if (isPrime(num)){
            sum += num
        }
    }

    return sum
}

