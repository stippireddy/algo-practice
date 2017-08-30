package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversals1 {

  public static List<Integer> preOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    while (root != null || !stack.isEmpty()) {
      if (root != null) {
        result.add(root.val);
        stack.push(root);
        root = root.left;
      } else {
        TreeNode temp = stack.pop();
        if (temp.right != null) {
          root = temp.right;
        }
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

  public static List<Integer> postOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
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
