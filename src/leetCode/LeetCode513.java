/**
 * Created by Sarveswara Tippireddy on Dec 14, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/find-bottom-left-tree-value/description/
 * 
 */
package leetCode;

import java.util.ArrayDeque;

import karumanchi.trees.TreeNode;

public class LeetCode513 {

  public int findBottomLeftValueBFS(TreeNode root) {
    ArrayDeque<TreeNode> q1 = new ArrayDeque<>();
    ArrayDeque<TreeNode> q2 = new ArrayDeque<>();
    q1.add(root);
    TreeNode result = root;
    while (!q1.isEmpty()) {
      result = q1.peek();
      while (!q1.isEmpty()) {
        TreeNode temp = q1.poll();
        if (temp.left != null)
          q2.add(temp.left);
        if (temp.right != null)
          q2.add(temp.right);
      }
      ArrayDeque<TreeNode> temp = q1;
      q1 = q2;
      q2 = temp;
    }
    return result.val;
  }

  int res;
  int height;

  public int findBottomLeftValueDFS(TreeNode root) {
    height = 0;
    helper(root, 1);
    return res;
  }

  private void helper(TreeNode node, int currentHeight) {
    if (node != null) {
      if (currentHeight > height) {
        height = currentHeight;
        res = node.val;
      }
      helper(node.left, currentHeight + 1);
      helper(node.right, currentHeight + 1);
    }
  }

}
