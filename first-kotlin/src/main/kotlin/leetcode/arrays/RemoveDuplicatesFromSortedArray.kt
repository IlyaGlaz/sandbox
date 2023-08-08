package leetcode.arrays

fun main() {
    val nums = intArrayOf(1, 1, 1, 1, 2)

    println(removeDuplicates(nums))
}

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element
 * appears only once. The relative order of the elements should be
 * kept the same. Then return the number of unique elements in nums.
 */
fun removeDuplicates(nums: IntArray): Int {
    var j = 0
    for (i in nums.indices) {
        if (nums[j] != nums[i]) {
            j++
            nums[j] = nums[i]
        }
    }
    return nums.copyOf(j + 1).size
}
