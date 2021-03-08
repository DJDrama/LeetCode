/**
 * https://leetcode.com/problems/missing-number/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = ((length * (length + 1)) / 2);
        for (int num : nums)
            sum -= num;
        return sum;
    }
}
