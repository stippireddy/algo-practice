package leetCode;

public class Leetcode124 {

  private int maxSum = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    helper(root);
    return maxSum;
  }

  private int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = Integer.max(0, helper(root.left));
    int right = Integer.max(0, helper(root.right));

    maxSum = Integer.max(left + right + root.val, maxSum);
    return Integer.max(left, right) + root.val;
  }
}
