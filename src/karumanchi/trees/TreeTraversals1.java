package karumanchi.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TreeTraversals1 {

  public static List<Integer> preOrder(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<Integer> result = new ArrayList<>();
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
    if (root == null) {
      return null;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<Integer> result = new ArrayList<>();
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
    if (root == null) {
      return null;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayList<Integer> result = new ArrayList<>();
    do {
      if (root.left != null) {
        stack.push(root);
        root = root.left;
      } else {
        TreeNode temp = stack.peek();
      }
    } while (root != null || !stack.isEmpty());
      
  }

  public static List<Integer> preOrderRecursive(TreeNode root) {}

  private static void preOrderRecursive(TreeNode root, List<Integer> result) {}

  public static List<Integer> inOrderRecursive(TreeNode root) {}

  private static void inOrderRecursive(TreeNode root, List<Integer> result) {}
}
