package ProjectEuler

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val result = largestPrimeFactor(600851475143)
    println(result)
    getCurrentDate()
}

fun largestPrimeFactor(number: Long): Long{
    val arr = arrayListOf<Long>()

    for (prime in (2..number/2)){
        if (isPrime(prime)){
            if(number % prime == 0L){
                getCurrentDate()
                println(prime)
                arr.add(prime)
            }
        }
    }

    return arr.last()
}

fun isPrime(num: Long): Boolean{
    if(num < 2)
        return false
    for (i in (2..num/2)){
        if (num % i == 0L){
            return false
        }
    }

    return true
}

fun getCurrentDate(){
    val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
    println(sdf.format(Date()))
}