/**
 * https://leetcode.com/problems/length-of-last-word/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun lengthOfLastWord(s: String): Int {
        var res = 0
        for (j in s.length - 1 downTo 0) {
            val c = s[j]
            if (c != ' ') {
                res++
            } else if (res > 0)
                return res
        }
        return res
    }
}