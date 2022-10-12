package LeetCode

fun main() {
    val nums: IntArray = intArrayOf(2, 7, 11, 15)
    val target = 9

    println(twoSum(nums, target)?.joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray? {
    for(index1 in nums.indices){
        for(index2 in nums.indices){
            if (index1 != index2){
                if((nums[index1] + nums[index2]) == target){
                    return intArrayOf(index1, index2)
                }
            }
        }
    }

    return null
}