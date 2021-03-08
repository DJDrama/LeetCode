/**
 * https://leetcode.com/problems/add-strings/
 */

class Solution {
    // O(max(num1.length, num2.length)) time complexity
    // O(max(num1.length, num2.length)) space complexity
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += num2.charAt(j--) - '0';
            }
            carry = sum / 10;
            sb.append(sum % 10);
        }
        if (carry != 0)
            sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}