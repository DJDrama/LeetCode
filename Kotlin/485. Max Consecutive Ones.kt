/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var res = 0
        var count = 0
        nums.forEach { n ->
            if (n == 1)
                count++
            else {
                res = Math.max(res, count)
                count = 0
            }
        }
        return Math.max(res, count)
    }
}