package leetcode;

import java.util.ArrayDeque;
import karumanchi.trees.TreeNode;

public class LeetCode226 {

  public TreeNode invertTreeDFSRecursive(TreeNode root) {
    if (root == null) {
      return root;
    }
    TreeNode left = invertTreeDFSRecursive(root.left);
    TreeNode right = invertTreeDFSRecursive(root.right);
    root.left = right;
    root.right = left;
    return root;
  }

  public TreeNode invertTreeDFSIterative(TreeNode root) {
    if (root == null) {
      return root;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      TreeNode left = temp.left;
      temp.left = root.right;
      temp.right = left;
      if (temp.left != null) {
        stack.push(temp.left);
      }
      if (temp.right != null) {
        stack.push(temp.right);
      }
    }
    return root;
  }

  public TreeNode invertTreeBFSIterative(TreeNode root) {
    if (root == null) {
      return root;
    }
    ArrayDeque<TreeNode> queue = new ArrayDeque<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      TreeNode left = temp.left;
      temp.left = temp.right;
      temp.right = left;
      if (temp.left != null) {
        queue.offer(temp.left);
      }
      if (temp.right != null) {
        queue.offer(temp.right);
      }
    }
    return root;
  }
}
