package leetCode;

import java.util.ArrayDeque;

public class LeetCode230 {

  public int kthSmallest(TreeNode root, int k) {
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (root != null || !stack.isEmpty()) {
      if (root != null) {
        stack.push(root);
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        k--;
        if (k == 0) {
          return temp.val;
        }
        root = temp.right;
      }
    }
    return -1;
  }
}
