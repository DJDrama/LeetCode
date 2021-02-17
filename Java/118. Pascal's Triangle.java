/**
 * https://leetcode.com/problems/pascals-triangle/
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // O(numRows*numRows) time complexity
    // O(numRows*numRows) space complexity
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0)
            return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = res.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j) + prev.get(j - 1));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}
