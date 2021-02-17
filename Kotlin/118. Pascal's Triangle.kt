/**
 * https://leetcode.com/problems/pascals-triangle/
 */

class Solution {
    // O(numRows*numRows) time complexity
    // O(numRows*numRows) space complexity
    fun generate(numRows: Int): List<List<Int>> {
        val res = ArrayList<MutableList<Int>>()

        if (numRows == 0) return res
        res.add(mutableListOf())
        res[0].add(1)

        for (i in 1 until numRows) {
            val prev = res[i - 1]
            val curr = mutableListOf<Int>()
            curr.add(1)
            for (j in 1 until i) {
                curr.add(prev[j - 1] + prev[j])
            }
            curr.add(1)
            res.add(curr)
        }
        return res
    }
}