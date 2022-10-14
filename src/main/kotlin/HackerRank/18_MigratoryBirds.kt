package HackerRank

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)
    println(migratoryBirds(arr))
}

fun migratoryBirds(arr: Array<Int>): Int {
    val map = arr.groupingBy { it }.eachCount().toSortedMap()
    var result = 0

    for (key in map.keys){
        if (map.get(key) == map.values.max()) {
            result = key
            break
        }
    }

    return result
}