/**
 * https://leetcode.com/problems/container-with-most-water/
 */

class Solution {
    // O(n) time complexity
    // O(1) space complexity
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}