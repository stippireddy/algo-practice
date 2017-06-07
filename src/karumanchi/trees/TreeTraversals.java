package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversals {

  public static List<Integer> preOrder(TreeNode root) {
    if (root == null) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
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
    if (root == null) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
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
    if (root == null) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    TreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
      if (curr != null) {
        stack.push(curr);
        curr = curr.getLeft();
      } else {
        TreeNode temp = stack.peek().getRight();
        if (temp == null) {
          do {
            temp = stack.pop();
            result.add(temp.val);
          } while (!stack.isEmpty() && stack.peek().getRight() == temp);
        } else {
          curr = temp;
        }
      }
    }
    return result;
  }

  public static List<Integer> preOrderRecursive(TreeNode root) {
    if (root == null) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
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
    if (root == null) {
      return null;
    }
    List<Integer> result = new ArrayList<>();
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
}
