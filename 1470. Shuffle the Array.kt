/**
 * https://leetcode.com/problems/shuffle-the-array/
 */

// O(n) time complexity
// O(n) space complexity
fun shuffle(nums: IntArray, n: Int): IntArray {
    val res = IntArray(2 * n)
    for (i in nums.indices) {
        res[i] = if (i % 2 == 0) nums[i / 2] else nums[i / 2 + n]
    }
    return res
}

fun main() {
    val nums = intArrayOf(2, 5, 1, 3, 4, 7)
    val n = 3
    val res = shuffle(nums, n)
    for (r in res)
        print("$r ") // Output: 2 3 5 4 1 7
}