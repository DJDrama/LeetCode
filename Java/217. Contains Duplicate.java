/**
 * https://leetcode.com/problems/contains-duplicate/submissions/
 */

import java.util.HashSet;
import java.util.Set;

class Solution {
    // O(n) time complexity
    // O(n) space complexity
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        return set.size() != nums.length;
    }
}