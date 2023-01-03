package LeetCode

fun main(){
    var nums1 = intArrayOf(1, 3)
    var nums2 = intArrayOf(2)

    println(findMedianSortedArrays(nums1, nums2))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    var arr = arrayListOf<Int>()
    nums1.forEach {
        arr.add(it)
    }
    nums2.forEach {
        arr.add(it)
    }

    arr.sort()

    if (arr.size % 2 == 0){
        return ((arr[arr.size/2].toDouble()) + (arr[arr.size/2 - 1].toDouble())) / 2
    }

    else{
        return arr[arr.size/2].toDouble()
    }
}

/*
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var nums: IntArray = intArrayOf(*nums1, *nums2)

        nums.sort()

        if (nums.size % 2 == 0){
            return ((nums[nums.size / 2] + nums[nums.size / 2 - 1]) / 2.0)
        } else{
            return nums[nums.size / 2].toDouble()
        }

        return 0.0
    }
*/