import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */

class Solution {

    // O(n) time complexity
    // O(n) space complexity
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList();
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList();
        q.offer(curr);
        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0;
            int i = size;
            while (i-- > 0) {
                TreeNode polled = q.poll();
                sum += polled.val;
                if (polled.left != null)
                    q.offer(polled.left);
                if (polled.right != null)
                    q.offer(polled.right);
            }
            res.add(sum / size);
        }
        return res;
    }
}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
