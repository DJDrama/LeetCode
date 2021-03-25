/**
 * https://leetcode.com/problems/distribute-candies/
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    public int distributeCandies(int[] candyType) {
        int len = candyType.length;
        int max = len / 2;
        Set<Integer> set = new HashSet<>();
        for (int ct : candyType) {
            set.add(ct);
        }
        return Math.min(max, set.size());
    }
}