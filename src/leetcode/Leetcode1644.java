package leetcode;

public class Leetcode1644 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = helper(root, p, q);
        if (lca == p) {
            return doesNodeExist(p, q) ? lca : null;
        }
        if (lca == q) {
            return doesNodeExist(q, p) ? lca : null;
        }
        return lca;
    }

    private boolean doesNodeExist(TreeNode root, TreeNode q) {
        if (root == null) {
            return false;
        }
        if (root == q) {
            return true;
        }
        return doesNodeExist(root.left, q) || doesNodeExist(root.right, q);
    }

    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = helper(root.left, p, q);
        TreeNode right = helper(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
