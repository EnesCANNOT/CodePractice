package ProjectEuler

fun main(){
    println(findHighlyDivisibleTriangleNumber(500))
}

fun findHighlyDivisibleTriangleNumber(dividerCounter: Long): Long{
    var total = 0L
    var number = 1L
    var flag = true
    while (flag){
        total += number
        val dividerNumber = findDividers(total).size.toLong()
        //println("Total : $total - Divider Number : $dividerNumber")
        if (dividerCounter < dividerNumber){
            flag = false
        }

        number++
    }

    return total
}

fun findDividers(number: Long): List<Long>{
    if (number < 1){
        throw IllegalArgumentException("Number must be greater than or equal to 1 : $number")
    }

    val dividers = mutableListOf<Long>()
    val sqrtNum = Math.sqrt(number.toDouble()).toInt()

    for (i in 1L..sqrtNum){
        if (number % i == 0L) {
            dividers.add(i)
            if (i != number / i) { // Avoid adding the same divisor twice for perfect squares
                dividers.add(number / i)
            }
        }
    }

    return dividers.toList()
}