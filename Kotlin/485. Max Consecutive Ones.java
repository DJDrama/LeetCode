/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */

public class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 1)
                count++;
            else {
                res = Math.max(count, res);
                count = 0;
            }
        }
        return Math.max(count, res);
    }
}
