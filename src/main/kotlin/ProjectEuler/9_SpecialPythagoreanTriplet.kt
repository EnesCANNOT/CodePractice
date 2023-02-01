package ProjectEuler

private fun main(){
    println(specialPythagoreanTriplet(1000))
}

private fun specialPythagoreanTriplet(sum: Int): Int{
    for (a in 1..sum-2) {
        for (b in a+1..sum-1) {
            val c = sum - a - b
            if (a * a + b * b == c * c) {
                println("a: $a, b: $b, c: $c, product: ${a * b * c}")
                return a*b*c
            }
        }
    }

    return -1
}