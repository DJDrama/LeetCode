/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */

public class NumberOfGoodPairs {
    // O(n) time complexity
    // O(101) space complexity
    int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums)
            arr[num]++;
        int res = 0;
        for (int ar : arr) {
            res += ar > 1 ? ar * (ar - 1) / 2 : 0;
        }
        return res;
    }
}

class Main {
    public static void main(String[] args) {
        NumberOfGoodPairs n = new NumberOfGoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(n.numIdenticalPairs(nums)); // Output: 4
    }
}
