/**
 * https://leetcode.com/problems/climbing-stairs/
 */

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        val arr = IntArray(n)
        arr[0] = 1
        arr[1] = 2
        for (i in 2 until n)
            arr[i] = arr[i - 1] + arr[i - 2]

        return arr[n - 1]
    }
}