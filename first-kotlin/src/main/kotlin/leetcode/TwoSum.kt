package leetcode

fun main() {
    val nums = intArrayOf(3, 4, 20, 100)

    println(twoSum(nums, 103).joinToString())
}

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val secondInt: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        if (secondInt.containsKey(nums[i])) {
            return intArrayOf(secondInt[nums[i]]!!, i)
        }
        secondInt[target - nums[i]] = i
    }
    return intArrayOf()
}