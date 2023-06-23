package ch06

internal class Solution {
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
}