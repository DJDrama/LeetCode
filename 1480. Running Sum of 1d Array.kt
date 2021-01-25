/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
// O(n) time complexity
// O(1) space complexity
fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] += nums[i - 1]
    }
    return nums
}

fun main() {
    val n = intArrayOf(1, 2, 3, 4)
    runningSum(n)
    n.forEach {
        print("$it ")
    }
}