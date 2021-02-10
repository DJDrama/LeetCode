/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public int removeDuplicates(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[++res] = nums[i];
            }
        }
        return res + 1;
    }
}