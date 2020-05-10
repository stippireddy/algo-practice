package geeksForGeeks.trees.bst;

import karumanchi.trees.TreeNode;

public class BST1 {

  public TreeNode insertIterative(TreeNode root, int data) {
    TreeNode nodeToBeInserted = new TreeNode(data);
    if (root == null) {
      return nodeToBeInserted;
    }
    TreeNode nodeToBeReturned = root;
    TreeNode prev = null;
    while (root != null) {
      prev = root;
      if (data == root.val) {
        return nodeToBeReturned;
      } else if (data < root.val) {
        root = root.left;
      } else {
        root = root.right;
      }
    }
    if (data < prev.val) {
      prev.left = nodeToBeInserted;
    } else {
      prev.right = nodeToBeInserted;
    }
    return nodeToBeReturned;
  }

  public TreeNode insertRecursive(TreeNode root, int data) {
    TreeNode nodeToBeInserted = new TreeNode(data);
    if (root == null) {
      return nodeToBeInserted;
    }
    if (data < root.val) {
      root.left = insertRecursive(root.left, data);
    } else if (data > root.val) {
      root.right = insertRecursive(root.right, data);
    }
    return root;
  }
}
