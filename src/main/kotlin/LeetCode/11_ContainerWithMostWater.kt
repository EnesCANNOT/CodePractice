package LeetCode

fun main() {
    print(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}

fun maxArea(height: IntArray): Int {
    var max_area = 0
    var left_column = 0
    var right_column = height.size-1

    while (left_column < right_column){
        if (height[left_column] < height[right_column]){
            max_area = Math.max(max_area, (height[left_column] * (right_column - left_column)))
            left_column++
        } else{
            max_area = Math.max(max_area, (height[right_column] * (right_column - left_column)))
            right_column--
        }
    }

    return max_area
}