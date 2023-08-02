package leetcode

fun main() {
    val nums = intArrayOf(2, 3, 4, 6, 9)

    println(searchInsert(nums, 2))
}

/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. If not, return the
 * index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
fun searchInsert(nums: IntArray, target: Int): Int {
    var index = 0

    if (nums.isEmpty()) {
        return index
    }

    if (target > nums[nums.size - 1]) {
        return nums.size
    }

    var i = -1
    do {
        i++
        index = i
    } while (target > nums[i])

    return index
}
