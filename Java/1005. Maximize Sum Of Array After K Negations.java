import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 */
class Solution {
    // O(nlogn) time complexity
    // O(n) space complexity
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a: A){
            pq.offer(a);
        }
        for(int i=0; i<K; i++){
            pq.offer(pq.poll()*-1);
        }
        int res=0;
        while(!pq.isEmpty())
            res += pq.poll();
        return res;
    }
}