/**
 * https://leetcode.com/problems/same-tree/submissions/
 */

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (q == null && p == null) return true;
        if (q == null || p == null) return false;
        if (p?.`val` != q?.`val`) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}