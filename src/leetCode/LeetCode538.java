package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import karumanchi.trees.TreeNode;

public class LeetCode538 {

  private int sum;

  public TreeNode convertBSTIterativeDFS(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode nodeToBeReturned = root;
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<TreeNode> result = new ArrayList<>();
    while (!stack.isEmpty() || root != null) {
      if (root != null) {
        stack.push(root);
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        result.add(temp);
        root = temp.right;
      }
    }
    for (int i = result.size() - 2; i >= 0; i--) {
      result.get(i).val += result.get(i + 1).val;
    }
    return nodeToBeReturned;
  }

  public TreeNode convertBSTRecursiveDFS(TreeNode root) {
    helper(root);
    return root;
  }

  private void helper(TreeNode root) {
    if (root == null) {
      return;
    }
    helper(root.right);
    root.val += sum;
    sum = root.val;
    helper(root.left);
  }
}
