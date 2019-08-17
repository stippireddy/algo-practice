package geeksForGeeks.trees.bst;

import karumanchi.trees.TreeNode;

public class BST2 {

    TreeNode deleteNode(TreeNode root, int key) {
    if (root == null) {
      return root;
    }
    TreeNode nodeToBeReturned = root;
    TreeNode prev = null;
    while (root != null) {
      if (key < root.val) {
        prev = root;
        root = root.left;
      } else if (root.val < key) {
        prev = root;
        root = root.right;
      } else {
        break;
      }
    }
    if (root.left == null && root.right == null) {
      if (prev.left.val == key) {
        prev.left = null;
      } else {
        prev.right = null;
      }
    } else if (root.left == null) {
      if (prev.left.val == key) {
        prev.left = root.right;
      } else {
        prev.right = root.right;
      }
    } else if (root.right == null) {
      if (prev.left.val == key) {
        prev.left = root.left;
      } else {
        prev.right = root.left;
      }
    } else {
      TreeNode successor = root.right;
      prev = root;
      while (successor.left != null) {
        prev = successor;
        successor = successor.left;
      }
      root.val = successor.val;
      deleteNode(prev, successor.val);
    }
    return nodeToBeReturned;
  }
}
