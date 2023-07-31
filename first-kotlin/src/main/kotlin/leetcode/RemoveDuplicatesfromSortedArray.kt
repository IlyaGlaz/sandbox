package leetcode

fun main() {
    val nums = intArrayOf(1, 1, 1, 1, 2)

    println(removeDuplicates(nums))
}


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
