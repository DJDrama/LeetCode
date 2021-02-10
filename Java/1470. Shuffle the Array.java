/**
 * https://leetcode.com/problems/shuffle-the-array/
 */

public class ShuffleTheArray {
    // O(n) time complexity
    // O(n) space complexity
    int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                res[i] = nums[i / 2];
            else
                res[i] = nums[i / 2 + n];
        }
        return res;
    }
}

class Main {
    public static void main(String[] args) {
        ShuffleTheArray s = new ShuffleTheArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] res = s.shuffle(nums, n);
        for (int r : res)
            System.out.print(r + " "); // Output: 2 3 5 4 1 7
    }
}
