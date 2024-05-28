package leetcode;

import java.util.ArrayDeque;

public class LeetCode1161 {
    public int maxLevelSum(TreeNode root) {
        int result = 1;
        int level = 1;
        int maxSum = root.val;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) {

                }
            }
        }
        return -1;
    }
}
