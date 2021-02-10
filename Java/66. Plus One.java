/**
 * https://leetcode.com/problems/plus-one/
 */

class Solution {
    // O(n) time complexity
    // O(digits.length + 1) space complexity == O(n) space complexity
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] res = new int[len + 1];
        res[0] = 1;
        return res;
    }
}