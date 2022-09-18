/**
 * https://leetcode.com/problems/longest-valid-parentheses/
 */
class Solution {
    fun longestValidParentheses(s: String): Int {
        var res = 0
        val ds = java.util.LinkedList<Int>()
        ds.add(-1)
        s.forEachIndexed { i, c ->
            if (c == ')') {
                ds.removeLast()
                if (ds.isEmpty()) {
                    ds.add(i)
                } else {
                    res = res.coerceAtLeast(i - ds.last())
                }
            } else {
                ds.add(i)
            }
        }
        return res
    }
}

fun main() {
    val input = "(()"
    println(Solution().longestValidParentheses(s = input))
}