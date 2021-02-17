/**
 * https://leetcode.com/problems/student-attendance-record-i/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public boolean checkRecord(String s) {
        if (s == null || s.length() == 0) return true;
        int absent = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
                absent++;
            if (i <= s.length() - 3
                    && s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                return false;
        }
        return absent < 2;
    }
}