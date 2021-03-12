import java.util.*

/**
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 */

class Solution {
    // O(nlogn) time complexity
    // O(n) space complexity
    fun largestSumAfterKNegations(A: IntArray, K: Int): Int {
        val pq = PriorityQueue<Int>()
        A.forEach {
            pq.offer(it)
        }
        for (i in 0 until K)
            pq.offer(pq.poll() * -1)
        var res = 0
        while (!pq.isEmpty())
            res += pq.poll();
        return res
    }
}