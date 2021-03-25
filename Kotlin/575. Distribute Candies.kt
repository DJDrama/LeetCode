/**
 * https://leetcode.com/problems/distribute-candies/
 */

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun distributeCandies(candyType: IntArray): Int {
        val set = mutableSetOf<Int>()
        candyType.forEach {
            set.add(it)
        }
        return Math.min(set.size, candyType.size / 2)
    }
}