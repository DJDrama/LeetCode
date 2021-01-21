import java.util.*
import kotlin.math.min

/**
 * https://leetcode.com/problems/path-with-maximum-minimum-value/
 **/

// O(n*m*log(n*m)) time complexity
// O(n*m) space complexity
fun maximumMinimumPath(A: Array<IntArray>): Int {
    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)
    val pq = PriorityQueue { a: IntArray, b: IntArray -> b[2] - a[2] }
    val n = A.size
    val m = A[0].size
    val visited = Array(n) { BooleanArray(m) }
    pq.offer(intArrayOf(0, 0, A[0][0]))
    visited[0][0] = true

    while (!pq.isEmpty()) {
        val polled = pq.poll()
        val x = polled[0]
        val y = polled[1]
        val value = polled[2]
        if (x == n - 1 && y == m - 1) {
            return value
        }

        for (i in dx.indices) {
            val nx = x + dx[i]
            val ny = y + dy[i]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny])
                continue
            visited[nx][ny] = true
            pq.offer(intArrayOf(nx, ny, Math.min(A[nx][ny], value)))
        }
    }
    return -1
}

fun main() {
    val input = arrayOf(intArrayOf(5, 4, 5), intArrayOf(1, 2, 6), intArrayOf(7, 4, 6))
    println(maximumMinimumPath(input)) // output: 4
}