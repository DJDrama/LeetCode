/**
 * https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val arr = IntArray(26)
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }
        for (i in arr.indices)
            if (arr[i] != 0) return false
        return true
    }
}