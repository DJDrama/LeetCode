/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */

public class Solution {
    // O(n) time complexity
    // O(101) space complexity
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums)
            arr[num]++;
        for (int i = 1; i < arr.length; i++)
            arr[i] += arr[i - 1];

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
                continue;
            }
            res[i] = arr[nums[i] - 1];
        }
        return res;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = s.smallerNumbersThanCurrent(nums);
        for (int r : res)
            System.out.print(r + " "); // Output: 4 0 1 1 3
    }
}