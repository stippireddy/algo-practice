/**
 * Created by Sarveswara Tippireddy on Sep 3, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/path-sum-ii/description/
 */
package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode113 {

  List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> pathSumRecursive(TreeNode root, int sum) {
    if (root == null) {
      return result;
    }
    pathSum(root, sum, new ArrayList<Integer>());
    return result;
  }

  private void pathSum(TreeNode root, int sum, ArrayList<Integer> subResult) {
    subResult.add(root.val);
    if (root.left == null && root.right == null) {
      if (root.val == sum) {
        result.add(new ArrayList<>(subResult));
      }
    } else {
      if (root.left != null) {
        pathSum(root.left, sum - root.val, subResult);
      }
      if (root.right != null) {
        pathSum(root.right, sum - root.val, subResult);
      }
    }
    subResult.remove(subResult.size() - 1);
  }

  public List<List<Integer>> pathSumIterative(TreeNode root, int sum) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    int currentSum = root.val;
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    List<Integer> subResult = new ArrayList<>();
    subResult.add(root.val);
    stack.push(root);
    TreeNode prev = null;
    while (!stack.isEmpty()) {
      TreeNode curr = stack.peek();
      if (prev == null || prev.left == curr || prev.right == curr) {
        if (curr.left != null) {
          stack.push(curr.left);
          subResult.add(curr.left.val);
          currentSum += curr.left.val;
        } else if (curr.right != null) {
          stack.push(curr.right);
          subResult.add(curr.right.val);
          currentSum += curr.right.val;
        }
      } else if (curr.left == prev) {
        if (curr.right != null) {
          stack.push(curr.right);
          subResult.add(curr.right.val);
          currentSum += curr.right.val;
        }
      } else {
        if (curr.left == null && curr.right == null) {
          if (currentSum == sum) {
            res.add(new ArrayList<>(subResult));
          }
        }
        currentSum -= curr.val;
        stack.pop();
        subResult.remove(subResult.size() - 1);
      }
      prev = curr;
    }
    return res;
  }

}
