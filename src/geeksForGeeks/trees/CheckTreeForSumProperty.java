package geeksForGeeks.trees;

import karumanchi.trees.TreeNode;

//TODO Add testCases
public class CheckTreeForSumProperty {

  public boolean isValid(TreeNode root) {
    if (root == null || root.left == null && root.right == null) {
      return true;
    }
    int leftData = 0;
    if (root.left != null) {
      leftData = root.left.val;
    }
    int rightData = 0;
    if (root.right != null) {
      rightData = root.right.val;
    }
    return isValid(root.left) && isValid(root.right) && (root.val == leftData + rightData);
  }

}
