/**
 * https://leetcode.com/problems/student-attendance-record-i/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun checkRecord(s: String): Boolean {
        if (s.isEmpty()) return true
        var absent = 0
        for (i in s.indices) {
            if (s[i] == 'A')
                absent++
            if (i <= s.length - 3 && s[i] == 'L' && s[i + 1] == 'L' && s[i + 2] == 'L')
                return false
        }
        return absent < 2
    }
}