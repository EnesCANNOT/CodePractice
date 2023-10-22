fun main() {
    val inputMatrix = arrayOf(
        arrayOf(5, 3, 4),
        arrayOf(1, 5, 8),
        arrayOf(6, 4, 2)
    )

    println("Minimum cost to form a magic square: ${formingMagicSquare(inputMatrix)}")
}

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val allPossibleMagicSquares = arrayOf(
        arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)),
        arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4)),
        arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)),
        arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8)),
        arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)),
        arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)),
        arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)),
        arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8))
    )

    var minCost = Int.MAX_VALUE

    for (magicSquare in allPossibleMagicSquares) {
        var cost = 0
        for (i in 0..2) {
            for (j in 0..2) {
                cost += Math.abs(s[i][j] - magicSquare[i][j])
            }
        }
        minCost = minOf(minCost, cost)
    }

    return minCost
}
