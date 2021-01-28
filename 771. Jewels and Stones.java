/**
 * https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    // O(jewels.length + stones.length) time complexity
    // O(58) space complexity
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[58];
        for (char c : jewels.toCharArray())
            arr[c - 'A']++;

        int res = 0;
        for (char c : stones.toCharArray())
            res += arr[c - 'A'];

        return res;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(s.numJewelsInStones(jewels, stones)); // Output: 3
    }
}
