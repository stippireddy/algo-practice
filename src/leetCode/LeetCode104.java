package leetCode;

import karumanchi.trees.TreeNode;

public class LeetCode104 {
  
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
  }
  
}
