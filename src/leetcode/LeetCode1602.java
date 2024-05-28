package leetcode;

import java.util.ArrayDeque;

public class LeetCode1602 {

  public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
    ArrayDeque<TreeNode> queue = new ArrayDeque<>();
    if (root == u) {
      return null;
    }
    queue.add(root);
    while (!queue.isEmpty()) {
      ArrayDeque<TreeNode> nextQueue = new ArrayDeque<>();
      while (!queue.isEmpty()) {
        TreeNode current = queue.poll();
        if (current == u) {
          return queue.isEmpty() ? null : queue.peek();
        }
        if (current.left != null) {
          nextQueue.add(current.left);
        }
        if (current.right != null) {
          nextQueue.add(current.right);
        }
      }
      queue = nextQueue;
    }
    return null;
  }
}
