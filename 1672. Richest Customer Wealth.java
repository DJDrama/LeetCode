/**
 * https://leetcode.com/problems/richest-customer-wealth/
 */

public class RichestCustomerWealth {
    // O(n^2) time complexity
    // O(1) space complexity
    int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}

class T {
    public static void main(String[] args) {
        RichestCustomerWealth r = new RichestCustomerWealth();
        int[][] input = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(r.maximumWealth(input)); // Output: 6
    }
}