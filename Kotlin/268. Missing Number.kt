/**
 * https://leetcode.com/problems/missing-number/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun missingNumber(nums: IntArray): Int {
        val len = nums.size
        var sum = (len * (len + 1)) / 2
        nums.forEach {
            sum -= it
        }
        return sum
    }
}