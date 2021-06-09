package leetCode;

import java.util.ArrayDeque;

public class LeetCode114 {

  public void flatten(TreeNode root) {
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    helper(root, stack);
  }

  private void helper(TreeNode root, ArrayDeque<TreeNode> stack) {
    if (root == null) {
      return;
    }
    if (root.left == null) {
      flatten(root.right);
      stack.push(root.right);
    }

  }
}
