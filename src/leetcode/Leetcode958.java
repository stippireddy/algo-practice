package leetcode;

import java.util.ArrayDeque;

public class Leetcode958 {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        boolean hasSeenNull = false;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode t = q.pollFirst();
                if (t.left == null) {
                    hasSeenNull = true;
                } else {
                    if (hasSeenNull) {
                        return false;
                    }
                    q.add(t.left);
                }
                if (t.right == null) {
                    hasSeenNull = true;
                } else {
                    if (hasSeenNull) {
                        return false;
                    }
                    q.add(t.right);
                }
            }
        }
        return true;
    }
}
