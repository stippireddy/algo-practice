package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode094 {

  public List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    while (root != null || !stack.isEmpty()) {
      if (root != null) {
        stack.push(root);
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        result.add(temp.val);
        if (temp.right != null) {
          root = temp.right;
        }
      }
    }
    return result;
  }
}
