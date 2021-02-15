/**
 *  https://leetcode.com/problems/detect-capital/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun detectCapitalUse(word: String): Boolean {
        if (word.length == 1) return true

        if (word[0].isUpperCase() && word[1].isUpperCase()) {
            for (i in 2 until word.length) {
                if (word[i].isLowerCase()) {
                    return false
                }
            }
        } else {
            for (i in 1 until word.length) {
                if (word[i].isUpperCase()) {
                    return false
                }
            }
        }
        return true
    }
}