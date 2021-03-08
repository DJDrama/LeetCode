/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/
 */

class Solution {
    // O(n+m) time complexity
    // O(1) space complexity
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var i = matrix[0].size - 1
        var j = 0

        while (i >= 0 && j < matrix.size) {
            when {
                matrix[j][i] == target -> return true
                matrix[j][i] < target -> j++
                else -> i--
            }
        }
        return false
    }
}