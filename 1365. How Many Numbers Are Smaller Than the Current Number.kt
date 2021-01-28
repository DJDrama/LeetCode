/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */

class Solution {
    // O(n) time complexity
    // O(101) space complexity
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val arr = IntArray(101)
        nums.forEach {
            arr[it]++
        }
        for (i in 1 until arr.size)
            arr[i] += arr[i - 1]

        val res = IntArray(nums.size)
        for (i in nums.indices) {
            if (nums[i] == 0) {
                res[i] = 0
                continue
            }
            res[i] = arr[nums[i] - 1]
        }
        return res
    }
}

fun main() {
    val s = Solution()
    val nums = intArrayOf(8, 1, 2, 2, 3)
    val res = s.smallerNumbersThanCurrent(nums)
    for (r in res)
        print("$r ") // Output: 4 0 1 1 3

}