package leetcode;

import karumanchi.trees.TreeNode;

public class LeetCode606 {

    public String tree2str(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        helper(root, sb);
        return sb.toString();
    }

    private void helper(TreeNode root, StringBuffer sb) {
        if (root == null) {
            return;
        }
        sb.append(root.val);
        if (root.left != null || root.right != null) {
            sb.append("(");
            if (root.left != null) {
                helper(root.left, sb);
            }
            sb.append(")");
            if (root.right != null) {
                sb.append("(");
                helper(root.right, sb);
                sb.append(")");
            }
        }
    }
}
