/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */

public class RunningSumOf1dArray {
    // O(n) time complexity
    // O(1) space complexity
    int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        return nums;
    }
}

class T {
    public static void main(String[] args) {
        RunningSumOf1dArray r = new RunningSumOf1dArray();
        int[] nums = {1, 2, 3, 4};
        r.runningSum(nums);
        for (int num : nums)
            System.out.print(num + " "); // output: 1, 3, 6, 10
    }
}