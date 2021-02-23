/**
 * https://leetcode.com/problems/container-with-most-water/
 */
class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size - 1
        var res = 0
        while (i < j) {
            res = Math.max(res, Math.min(height[i], height[j]) * (j - i))
            if (height[i] < height[j]) i++
            else j--;
        }
        return res
    }

}