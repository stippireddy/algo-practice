package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode144 {

  public List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      result.add(temp.val);
      if (temp.right != null) {
        stack.push(temp.right);
      }
      if (temp.left != null) {
        stack.push(temp.left);
      }
    }
    return result;
  }
}
