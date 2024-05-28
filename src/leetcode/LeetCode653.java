/**
 * Created by Sarveswara Tippireddy on Sep 3, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
 */
package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import karumanchi.trees.TreeNode;

public class LeetCode653 {

  HashSet<Integer> setForRecursiveFunction = new HashSet<>();

  public boolean findTargetRecursiveDFS(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    if (setForRecursiveFunction.contains(k - root.val)) {
      return true;
    }
    setForRecursiveFunction.add(root.val);
    return findTargetRecursiveDFS(root.left, k) || findTargetRecursiveDFS(root.right, k);
  }

  public boolean findTargetIterativeDFSPreOrder(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    HashSet<Integer> set = new HashSet<>();
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode temp = stack.pop();
      if (set.contains(k - temp.val)) {
        return true;
      } else {
        set.add(temp.val);
      }
      if (temp.right != null) {
        stack.push(temp.right);
      }
      if (temp.left != null) {
        stack.push(temp.left);
      }
    }
    return false;
  }

  public boolean findTargetIterativeDFSInOrder(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    HashSet<Integer> set = new HashSet<>();
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      if (root.left != null) {
        stack.push(root.left);
        root = root.left;
      } else {
        root = stack.pop();
        if (set.contains(k - root.val)) {
          return true;
        } else {
          set.add(root.val);
        }
        if (root.right != null) {
          stack.push(root.right);
          root = root.right;
        }
      }
    }
    return false;
  }

  public boolean findTargetIterativeDFSPostOrder(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    HashSet<Integer> set = new HashSet<>();
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    TreeNode prev = null;
    while (!stack.isEmpty()) {
      TreeNode curr = stack.peek();
      if (prev == null || prev.left == curr || prev.right == curr) {
        if (curr.left != null) {
          stack.push(curr.left);
        } else if (curr.right != null) {
          stack.push(curr.right);
        }
      } else if (curr.left == prev) {
        if (curr.right != null) {
          stack.push(curr.right);
        }
      } else {
        if (set.contains(k - curr.val)) {
          return true;
        } else {
          set.add(curr.val);
        }
        stack.pop();
      }
      prev = curr;
    }
    return false;
  }

  public boolean findTargetIterativeBFS(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    HashSet<Integer> set = new HashSet<>();
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode temp = q.poll();
      if (set.contains(k - temp.val)) {
        return true;
      } else {
        set.add(temp.val);
      }
      if (temp.right != null) {
        q.add(temp.right);
      }
      if (temp.left != null) {
        q.add(temp.left);
      }
    }
    return false;
  }

  public boolean findTargetUsingInOrderAndArray(TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    ArrayList<Integer> result = new ArrayList<>();
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      if (root.left != null) {
        stack.push(root.left);
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        result.add(temp.val);
        if (temp.right != null) {
          stack.push(temp.right);
          root = temp.right;
        }
      }
    }
    int i = 0, j = result.size() - 1;
    while (i < j) {
      int currentSum = result.get(i) + result.get(j);
      if (currentSum == k) {
        return true;
      } else if (currentSum > k) {
        j--;
      } else {
        i++;
      }
    }
    return false;
  }
}
