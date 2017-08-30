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
  public List<Double> averageOfLevels(TreeNode root) {
    ArrayList<Double> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    LinkedList<TreeNode> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()) {
      double sum = 0;
      double size = q.size() - 1;
      while (q.peek() != null) {
        TreeNode temp = q.poll();
        sum += temp.val;
        if (temp.left != null) {
          q.add(temp.left);
        }
        if (temp.right != null) {
          q.add(temp.right);
        }
      }
      result.add(sum / size);
      q.poll();
      if (!q.isEmpty()) {
        q.add(null);
      }
    }
    return result;
  }
}
