package leetCode;

import karumanchi.trees.TreeNode;

public class LeetCode563 {
  
  public int findTilt(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int[] result = findTiltHelper(root);
    return result[2];
  }

  public int[] findTiltHelper(TreeNode root) {
    if (root == null) {
      return new int[3];
    }
    int[] result = new int[3];
    int[] leftResult = findTiltHelper(root.left);
    int[] rightResult = findTiltHelper(root.right);
    int rightVal = root.right == null ? 0 : root.right.val;
    int leftVal = root.left == null ? 0 : root.left.val;
    result[0] = leftResult[0] + leftResult[1] + leftVal;
    result[1] = rightResult[0] + rightResult[1] + rightVal;
    result[2] = Math.abs(result[0] - result[1]) + leftResult[2] + rightResult[2];
    return result;
  }
  
}
