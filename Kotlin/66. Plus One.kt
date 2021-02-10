/**
 * https://leetcode.com/problems/plus-one/
 */

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun plusOne(digits: IntArray): IntArray {
        val len = digits.size
        for (i in len - 1 downTo 0) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i] += 1
                return digits
            }
        }
        val res = IntArray(len + 1)
        res[0] = 1
        return res
    }
}