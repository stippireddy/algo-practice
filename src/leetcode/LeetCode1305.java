package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeetCode1305 {

  public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();
    inOrder(root1, queue1);
    inOrder(root2, queue2);
    List<Integer> result = new ArrayList<>();
    while (!queue1.isEmpty() || !queue2.isEmpty()) {
      if (queue1.isEmpty()) {
        result.add(queue2.poll());
      } else if (queue2.isEmpty()) {
        result.add(queue1.poll());
      } else {
        if (queue1.peek() < queue2.peek()) {
          result.add(queue1.poll());
        } else {
          result.add(queue2.poll());
        }
      }
    }
    return result;
  }

  private void inOrder(TreeNode root, Queue<Integer> queue) {
    if (root == null) {
      return;
    }
    inOrder(root.left, queue);
    queue.add(root.val);
    inOrder(root.right, queue);
  }
}