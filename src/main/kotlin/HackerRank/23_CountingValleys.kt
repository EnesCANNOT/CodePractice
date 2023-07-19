package HackerRank

fun main() {
    //val steps = 8
    //val path = "UDDDUDUU"

    val steps = 12
    val path = "DDUUDDUDUUUD"

    val result = countingValleys(steps, path)
    println(result)
}

fun countingValleys(steps: Int, path: String): Int {
    var valleyCounter = 0
    var altitude = 0

    path.indices.forEach {
        if (path[it] == 'U'){
            altitude++
            if (altitude == 0){
                valleyCounter++
            }
        } else{
            altitude--
        }
    }

    return valleyCounter
}