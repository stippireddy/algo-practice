package leetcode;

public class Leetcode129 {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 0);
        return sum;
    }

    private void helper(TreeNode root, int currentSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if (root.left == null && root.right == null) {
            sum += currentSum;
        }
        helper(root.left, currentSum * 10);
        helper(root.right, currentSum * 10);
    }
}
