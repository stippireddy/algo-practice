/**
 * Created by Sarveswara Tippireddy on Dec 14, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/balanced-binary-tree/description/
 */
package leetcode;

import karumanchi.trees.TreeNode;

public class LeetCode110 {

  public boolean isBalanced(TreeNode root) {
    if (helper(root) < 0) {
      return false;
    } else {
      return true;
    }
  }

  private int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int lHeight = helper(root.left);
    int rHeight = helper(root.right);
    if (lHeight < 0 || rHeight < 0) {
      return -1;
    }
    if (Math.abs(rHeight - lHeight) < 2) {
      return Integer.max(lHeight, rHeight) + 1;
    }
    return -1;
  }
}
