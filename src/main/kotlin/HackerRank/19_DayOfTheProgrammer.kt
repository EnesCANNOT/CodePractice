package HackerRank

fun main() {
    println(dayOfProgrammer(2100))
}

fun dayOfProgrammer(year: Int): String {
    val result = ".09.$year"
    if(year >= 1919){
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return "12$result"
        else
            return "13$result"
    }

    else if (year == 1918)
        return "26$result"

    else{
        if (year % 4 == 0)
            return "12$result"
        else
            return "13$result"
    }
}