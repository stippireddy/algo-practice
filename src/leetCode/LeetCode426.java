package leetCode;

import java.util.ArrayDeque;

public class LeetCode426 {

  public TreeNode treeToDoublyList(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode tail = findTail(root);
    TreeNode prev = tail;
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    while (!stack.isEmpty() || root != null) {
      if (root != null) {
        stack.push(root);
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        prev.right = temp;
        temp.left = prev;
        prev = temp;
        root = temp.right;
      }
    }
    return tail.right;
  }

  private TreeNode findTail(TreeNode root) {
    while (root.right != null) {
      root = root.right;
    }
    return root;
  }
}
