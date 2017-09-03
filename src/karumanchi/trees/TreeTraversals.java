package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversals {

  public static List<Integer> preOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      root = stack.pop();
      result.add(root.val);
      if (root.getRight() != null) {
        stack.push(root.getRight());
      }
      if (root.getLeft() != null) {
        stack.push(root.getLeft());
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
      if (root.getLeft() != null) {
        stack.push(root.getLeft());
        root = root.getLeft();
      } else {
        root = stack.pop();
        result.add(root.getVal());
        if (root.getRight() != null) {
          stack.push(root.getRight());
          root = root.getRight();
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
    result.add(root.getVal());
    preOrderRecursive(root.getLeft(), result);
    preOrderRecursive(root.getRight(), result);
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
    inOrderRecursive(root.getLeft(), result);
    result.add(root.getVal());
    inOrderRecursive(root.getRight(), result);
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
    postOrderRecursive(root.getLeft(), result);
    postOrderRecursive(root.getRight(), result);
    result.add(root.getVal());
  }

}
