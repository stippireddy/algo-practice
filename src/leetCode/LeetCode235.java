/**
 * Created by Sarveswara Tippireddy on Sep 7, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 */
package leetCode;

import karumanchi.trees.TreeNode;

public class LeetCode235 {

  public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || p == null || q == null) {
      return root;
    }
    if (root.val < p.val && root.val < q.val) {
      return lowestCommonAncestorRecursive(root.right, p, q);
    } else if (root.val > p.val && root.val > q.val) {
      return lowestCommonAncestorRecursive(root.left, p, q);
    } else {
      return root;
    }
  }

  public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || p == null || q == null) {
      return root;
    }
    while (true) {
      if (root.val < p.val && root.val < q.val) {
        root = root.right;
      } else if (root.val > p.val && root.val > q.val) {
        root = root.left;
      } else {
        return root;
      }
    }
  }
}
