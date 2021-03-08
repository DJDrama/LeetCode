/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 */

class Solution {
    // O(n+m) time complexity (n=row, m=column)
    // O(1) space complexity
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;

        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target)
                i--;
            else if (matrix[i][j] < target)
                j++;
            else
                return true;
        }
        return false;
    }
}