package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode102 {
  public List<List<Integer>> levelOrderBFS2Queues(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> queue1 = new ArrayDeque<>();
    ArrayDeque<TreeNode> queue2 = new ArrayDeque<>();
    queue1.add(root);
    while (!(queue1.isEmpty() && queue2.isEmpty())) {
      ArrayList<Integer> l = new ArrayList<>();
      while (!queue1.isEmpty()) {
        TreeNode temp = queue1.poll();
        l.add(temp.val);
        if (temp.left != null) {
          queue2.add(temp.left);
        }
        if (temp.right != null) {
          queue2.add(temp.right);
        }
      }
      if (!l.isEmpty()) {
        result.add(l);
        l.clear();
      }
      while (!queue2.isEmpty()) {
        TreeNode temp = queue2.poll();
        l.add(temp.val);
        if (temp.left != null) {
          queue1.add(temp.left);
        }
        if (temp.right != null) {
          queue1.add(temp.right);
        }
      }
      if (!l.isEmpty()) {
        result.add(l);
        l.clear();
      }
    }
    return result;
  }

  public List<List<Integer>> levelOrderBFS1QueueWithNull(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    LinkedList<TreeNode> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    List<Integer> l = new ArrayList<>();
    while (!q.isEmpty()) {
      TreeNode temp = q.poll();
      if (temp == null) {
        q.add(null);
        result.add(l);
        l = new ArrayList<>();
      } else {
        l.add(temp.val);
        if (temp.left != null) {
          q.add(temp.left);
        }
        if (temp.right != null) {
          q.add(temp.right);
        }
      }
    }
    return result;
  }

  public List<List<Integer>> levelOrderDFS(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    levelOrderDFS(root, result, 0);
    return result;
  }

  private void levelOrderDFS(TreeNode root, List<List<Integer>> result, int level) {
    if (root == null) {
      return;
    }
    if (result.size() < level + 1) {
      List<Integer> list = new ArrayList<>();
      result.add(list);
    }
    result.get(level).add(root.val);
    levelOrderDFS(root.left, result, level + 1);
    levelOrderDFS(root.right, result, level + 1);
  }
}
