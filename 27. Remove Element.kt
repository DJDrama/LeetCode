/**
 * https://leetcode.com/problems/remove-element/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var c = 0
        var len = nums.size
        while (c < len) {
            if (nums[c] != `val`) c++
            else {
                nums[c] = nums[len - 1]
                len--
            }
        }
        return c
    }
}