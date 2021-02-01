/**
 * https://leetcode.com/problems/remove-element/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
