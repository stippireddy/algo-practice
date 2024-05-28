/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/path-sum/description/
 */
package leetcode;

import java.util.ArrayDeque;
import karumanchi.trees.TreeNode;

public class LeetCode112 {

  public boolean hasPathSumRecursive(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.left == null && root.right == null) {
      return root.val == sum;
    }
    return hasPathSumRecursive(root.left, sum - root.val)
        || hasPathSumRecursive(root.right, sum - root.val);
  }

  public boolean hasPathSumIterative(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    int currentSum = root.val;
    TreeNode prev = null;
    while (!stack.isEmpty()) {
      TreeNode curr = stack.peek();
      if (curr.left == null && curr.right == null && currentSum == sum) {
        return true;
      }
      if (prev == null || prev.left == curr || prev.right == curr) {
        if (curr.left != null) {
          currentSum += curr.left.val;
          stack.push(curr.left);
        } else if (curr.right != null) {
          currentSum += curr.right.val;
          stack.push(curr.right);
        }
      } else if (curr.left == prev) {
        if (curr.right != null) {
          currentSum += curr.right.val;
          stack.push(curr.right);
        }
      } else {
        if (root.left == null && root.right == null) {
          return root.val == sum;
        }
        currentSum -= curr.val;
        stack.pop();
      }
      prev = curr;
    }
    return false;
  }
}
