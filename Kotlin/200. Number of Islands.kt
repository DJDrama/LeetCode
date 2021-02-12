/**
 * https://leetcode.com/problems/number-of-islands/
 */

class Solution {
    // O(n*m) time complexity
    // O(n*m) space complexity
    fun numIslands(grid: Array<CharArray>): Int {
        var res = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    res++
                    dfs(grid, i, j)
                }
            }
        }
        return res
    }

    private fun dfs(grid: Array<CharArray>, x: Int, y: Int) {
        if (x < 0 || y < 0 || x >= grid.size || y >= grid[0].size || grid[x][y] == '0')
            return
        grid[x][y] = '0'
        dfs(grid, x + 1, y)
        dfs(grid, x - 1, y)
        dfs(grid, x, y + 1)
        dfs(grid, x, y - 1)
    }
}