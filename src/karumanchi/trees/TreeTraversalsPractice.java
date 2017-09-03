package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversalsPractice {

  public static List<Integer> preOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
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

  public static List<Integer> inOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      if (root.left != null) {
        stack.push(root.left);
        root = root.left;
      } else {
        root = stack.pop();
        result.add(root.val);
        if (root.right != null) {
          stack.push(root.right);
          root = root.right;
        }
      }
    }
    return result;
  }

  public static List<Integer> postOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
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
        result.add(curr.val);
        stack.pop();
      }
      prev = curr;
    }
    return result;
  }

  public static List<Integer> preOrderRecursive(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    preOrderRecursive(root, result);
    return result;
  }

  private static void preOrderRecursive(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    result.add(root.val);
    preOrderRecursive(root.left, result);
    preOrderRecursive(root.right, result);
  }

  public static List<Integer> inOrderRecursive(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    inOrderRecursive(root, result);
    return result;
  }

  private static void inOrderRecursive(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    inOrderRecursive(root.left, result);
    result.add(root.val);
    inOrderRecursive(root.right, result);
  }

  public static List<Integer> postOrderRecursive(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    postOrderRecursive(root, result);
    return result;
  }

  private static void postOrderRecursive(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    postOrderRecursive(root.left, result);
    postOrderRecursive(root.right, result);
    result.add(root.val);
  }
}
