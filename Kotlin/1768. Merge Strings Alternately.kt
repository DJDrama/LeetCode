/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */

class Solution {
    // O(word1.length + word2.length) time complexity
    // O(word1.length + word2.length) space complexity
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val sb = StringBuilder()
        while (i < word1.length || j < word2.length) {
            if (i < word1.length) sb.append(word1[i++])
            if (j < word2.length) sb.append(word2[j++])
        }
        return sb.toString()
    }
}