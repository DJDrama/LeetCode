/**
 * https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity (O(26) space for the array)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int a : arr)
            if (a != 0) return false;
        return true;
    }
}