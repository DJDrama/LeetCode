/**
 * https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        nums.forEach {
            set.add(it)
        }
        return set.size != nums.size
    }
}