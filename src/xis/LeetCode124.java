package xis;

public class LeetCode124 {

  int maxPath = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    helper(root);
    return maxPath;
  }

  private int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = helper(root.left);
    int right = helper(root.right);
    int currentPath = 0;
    if (left > 0) {
      currentPath += left;
    }
    if (right > 0) {
      currentPath += right;
    }
    currentPath += root.val;
    maxPath = Integer.max(currentPath, maxPath);
    return Integer.max(Integer.max(root.val + left, root.val + right), Integer.max(root.val, 0));
  }
}
