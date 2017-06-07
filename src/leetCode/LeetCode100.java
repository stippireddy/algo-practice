package leetCode;

import karumanchi.trees.TreeNode;

public class LeetCode100 {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null) {
      return p == q;
    }
    return (p.val == q.val) && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
  }
}
