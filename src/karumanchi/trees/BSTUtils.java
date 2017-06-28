package karumanchi.trees;

public class BSTUtils {

  public static TreeNode search(TreeNode root, int key) {
    if (root == null || root.val == key) {
      return root;
    }
    if (root.val < key) {
      return search(root.right, key);
    } else {
      return search(root.left, key);
    }
  }

  public static TreeNode getMinimum(TreeNode root) {
    if (root == null) {
      return root;
    }
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

  public static TreeNode getMaximum(TreeNode root) {
    if (root == null) {
      return root;
    }
    while (root.right != null) {
      root = root.right;
    }
    return root;
  }

  public static TreeNode getSuccessor(TreeNode root, TreeNode node) {
    if (node.right != null) {
      return getMinimum(root.right);
    }
    TreeNode successor = null;
    while (root != null) {
      if (root.val < node.val) {
        root = root.right;
      } else if (root.val > node.val) {
        successor = root;
        root = root.left;
      } else {
        break;
      }
    }
    return successor;
  }
}
