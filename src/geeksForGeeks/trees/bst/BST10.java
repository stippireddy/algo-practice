package geeksForGeeks.trees.bst;

import karumanchi.trees.TreeNode;

public class BST10 {
  TreeNode getLCA(TreeNode node, int n1, int n2) {
    while (node != null) {
      if (node.val == n1 || node.val == n2) {
        return node;
      }
      if ((node.val > n1 && node.val < n2) || (node.val < n1 && node.val > n2)) {
        return node;
      }
      if (node.val < n1) {
        node = node.right;
      } else {
        node = node.left;
      }
    }
    return node;
  }
}
