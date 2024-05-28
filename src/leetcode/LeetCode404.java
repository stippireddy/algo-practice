package leetcode;

import java.util.ArrayDeque;
import karumanchi.trees.TreeNode;

public class LeetCode404 {

  public int sumOfLeftLeavesRecursive(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return recursiveHelper(root, root.left) + recursiveHelper(root, root.right);
  }

  private int recursiveHelper(TreeNode parent, TreeNode child) {
    if (child == null) {
      return 0;
    }
    if (child.left == null && child.right == null && parent.left == child) {
      return child.val;
    }
    return recursiveHelper(child, child.left) + recursiveHelper(child, child.right);
  }

  public int sumOfLeftLeavesIterative(TreeNode root) {
    if (root == null) {
      return 0;
    }
    ArrayDeque<TreeNode> q = new ArrayDeque<>();
    q.offer(root);
    int sum = 0;
    while (!q.isEmpty()) {
      TreeNode temp = q.poll();
      if (temp.left != null && temp.left.left == null && temp.left.right == null) {
        sum += temp.left.val;
      }
      if (temp.left != null) {
        q.offer(temp.left);
      }
      if (temp.right != null) {
        q.offer(temp.right);
      }
    }
    return sum;
  }
}
