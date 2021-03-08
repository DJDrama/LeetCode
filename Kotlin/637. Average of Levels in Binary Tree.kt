import java.util.
import java.util.*

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val res = mutableListOf<Double>()
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        while (!queue.isEmpty()) {
            val size = queue.size
            var sum = 0.0
            for (i in 0 until size) {
                val polled = queue.poll()
                sum += polled.`val`
                polled.left?.let {
                    queue.offer(it)
                }
                polled.right?.let {
                    queue.offer(it)
                }
            }
            res.add(sum / size)
        }
        return res.toDoubleArray()
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}