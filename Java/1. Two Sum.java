/**
 * https://leetcode.com/problems/two-sum/
 */

import java.util.HashMap;

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap();
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return res;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = s.twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]); // Output: 0 1
    }
}