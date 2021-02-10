/**
 * https://leetcode.com/problems/length-of-last-word/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public int lengthOfLastWord(String s) {
        int res = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            char c = s.charAt(j);
            if (Character.isLetter(c)) {
                res++;
            } else if (res > 0) {
                return res;
            }
        }
        return res;
    }
}