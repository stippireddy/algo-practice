/**
 * Created by Sarveswara Tippireddy on Aug 29, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import karumanchi.trees.TreeNode;

public class LeetCode637 {
  public List<Double> averageOfLevelsUsingBFS(TreeNode root) {
    ArrayList<Double> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    LinkedList<TreeNode> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
      LinkedList<TreeNode> tempQ = new LinkedList<>();
      double sum = 0;
      double size = q.size();
      while (!q.isEmpty()) {
        TreeNode temp = q.poll();
        sum += temp.val;
        if (temp.left != null) {
          tempQ.add(temp.left);
        }
        if (temp.right != null) {
          tempQ.add(temp.right);
        }
      }
      result.add(sum / size);
      q = tempQ;
    }
    return result;
  }

  public List<Double> averageOfLevelsUsingDFS(TreeNode root) {
    ArrayList<Double> result = new ArrayList<>();
    if (root != null) {
      ArrayList<Double> sum = new ArrayList<>();
      ArrayList<Integer> count = new ArrayList<>();
      helper(sum, count, root, 0);
      for (int i = 0; i < sum.size(); i++) {
        result.add(sum.get(i) / count.get(i));
      }
    }
    return result;
  }

  private void helper(ArrayList<Double> sum, ArrayList<Integer> count, TreeNode root, int i) {
    if (i < sum.size()) {
      sum.set(i, sum.get(i) + root.val);
    } else {
      sum.add(i, (double) root.val);
    }
    if (i < count.size()) {
      count.set(i, count.get(i) + 1);
    } else {
      count.add(i, 1);
    }
    if (root.left != null) {
      helper(sum, count, root.left, i + 1);
    }
    if (root.right != null) {
      helper(sum, count, root.right, i + 1);
    }
  }
}
