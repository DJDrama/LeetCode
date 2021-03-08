/**
 * https://leetcode.com/problems/add-strings/
 */

class Solution {
    // O(max(num1.length, num2.length)) time complexity
    // O(max(num1.length, num2.length)) space complexity
    fun addStrings(num1: String, num2: String): String {
        var i = num1.length - 1
        var j = num2.length - 1
        var carry = 0
        val sb = StringBuilder()
        while (i >= 0 || j >= 0) {
            var sum = carry
            if (i >= 0) {
                sum += num1[i--] - '0'
            }
            if (j >= 0) {
                sum += num2[j--] - '0'
            }
            carry = sum / 10
            sb.append(sum % 10)
        }
        if (carry != 0)
            sb.append(carry)
        return sb.reverse().toString()
    }
}