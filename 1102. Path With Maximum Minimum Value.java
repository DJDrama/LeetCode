import java.util.PriorityQueue;
import java.util.Stack;

/**
 * https://leetcode.com/problems/path-with-maximum-minimum-value/
 **/

public class PathWithMaximumMinimumValue {

    // O(nm*log(nm)) time complexity (m*n for BFS, log(m*n) for PriorityQueue poll, offer)
    // O(mn) space complexity
    public int maximumMinimumPath(int[][] A) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        int n = A.length;
        int m = A[0].length;
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        pq.offer(new int[]{0, 0, A[0][0]});
        while (!pq.isEmpty()) {
            int[] polled = pq.poll();
            int x = polled[0];
            int y = polled[1];
            if (x == n - 1 && y == m - 1) {
                return polled[2];
            }
            for (int i = 0; i < dx.length; i++) {
                if (x + dx[i] < 0 || x + dx[i] >= m || y + dy[i] < 0 || y + dy[i] >= n || visited[x + dx[i]][y + dy[i]]) {
                    continue;
                }
                visited[x + dx[i]][y + dy[i]] = true;
                pq.offer(new int[]{x + dx[i], y + dy[i], Math.min(polled[2], A[x + dx[i]][y + dy[i]])});
            }
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        PathWithMaximumMinimumValue p = new PathWithMaximumMinimumValue();
        int[][] input = {{5, 4, 5}, {1, 2, 6}, {7, 4, 6}};
        System.out.println(p.maximumMinimumPath(input)); // Output: 4
    }
}
