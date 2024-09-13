package leetcode;

import java.util.ArrayDeque;

public class Leetcode623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (depth-- > 2) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode current = q.poll();
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }

        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            TreeNode left = current.left;
            TreeNode right = current.right;
            current.left = new TreeNode(val);
            current.right = new TreeNode(val);
            current.left.left = left;
            current.right.right = right;
        }
        return root;
    }
}
