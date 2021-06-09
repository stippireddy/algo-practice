package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LeetCode863 {

  public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
    List<Integer> result = new ArrayList<>();
    getKDistanceNodes(target, K, result);
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty() || root != null) {
      if (root != null) {
        stack.push(root);
        if (root == target) {
          break;
        }
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        root = temp.right;
      }
    }
    int distance = stack.size();
    for (int i = 1; i < distance; i++) {
      TreeNode temp = stack.pop();
      if (stack.peek().right == temp) {
        getKDistanceNodes(stack.peek().left, K - i, result);
      } else {
        getKDistanceNodes(stack.peek().right, K - i, result);
      }
    }
    return result;
  }

  private void getKDistanceNodes(TreeNode target, int k, List<Integer> result) {
    if (target == null) {
      return;
    }
    if (k == 0) {
      result.add(target.val);
      return;
    }
    getKDistanceNodes(target.left, k - 1, result);
    getKDistanceNodes(target.right, k - 1, result);
  }
}
