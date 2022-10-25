package ProjectEuler

fun main() {
    val nthPrime = 10001
    println(findPrimeNumber(nthPrime))
}

private fun findPrimeNumber(nthPrime: Int): Int{
    var primeNumber = 0
    val primeArr = arrayListOf<Int>()
    var flag: Boolean
    while (primeArr.size != nthPrime){
        if (!primeArr.isEmpty()){
            flag = true
            for (prime in primeArr){
                if (primeNumber % prime == 0){
                    flag = false
                    break
                }
            }

            if (flag){
                primeArr.add(primeNumber)
            }
        }

        else{
            if (isPrime(primeNumber)){
                primeArr.add(primeNumber)
            }
        }

        primeNumber++
    }

    return primeArr.last()
}

private fun isPrime(num: Int): Boolean{
    if(num < 2)
        return false
    for (i in (2..num/2)){
        if (num % i == 0){
            return false
        }
    }

    return true
}