package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode103 {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    boolean leftToRight = true;
    while (!queue.isEmpty()) {
      int size = queue.size();
      LinkedList<Integer> subResult = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode current = queue.poll();
        if (leftToRight) {
          subResult.addLast(current.val);
        } else {
          subResult.addFirst(current.val);
        }
        if (current.left != null) {
          queue.add(current.left);
        }
        if (current.right != null) {
          queue.add(current.right);
        }
      }
      result.add(subResult);
      leftToRight = !leftToRight;
    }
    return result;
  }
}
