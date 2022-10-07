package HackerRank

fun main() {
    println(timeConversion("07:05:45PM"))
}

fun timeConversion(s: String): String{
    var hour = s.take(2).toInt()
    val middle = s.substring(2..7)
    val isAmPm = s.takeLast(2)

    if (hour == 12 && isAmPm == "AM")
        hour = 0

    if (hour < 12 && isAmPm == "PM")
        hour += 12

    val hourString = hour.toString().padStart(2, '0')
    return hourString + middle
}