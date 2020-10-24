package leetCode;

public class LeetCode1026 {

  int maxDiff = 0;

  public int maxAncestorDiff(TreeNode root) {
    if (root == null) {
      return maxDiff;
    }
    helper(root.left, root.val, root.val);
    helper(root.right, root.val, root.val);
    return maxDiff;
  }

  private void helper(TreeNode root, int max, int min) {
    if (root == null) {
      return;
    }
    maxDiff = Integer.max(Math.abs(max - root.val), maxDiff);
    maxDiff = Integer.max(Math.abs(min - root.val), maxDiff);
    helper(root.left, Integer.max(max, root.val), Integer.min(min, root.val));
    helper(root.right, Integer.max(max, root.val), Integer.min(min, root.val));
  }
}
