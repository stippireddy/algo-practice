package leetcode;

import java.util.HashMap;

public class LeetCode337 {

  HashMap<TreeNode, Integer> map = new HashMap<>();

  public int rob(TreeNode root) {
    int sum = 0;
    if (root == null) {
      return sum;
    }
    if (map.containsKey(root)) {
      return map.get(root);
    }
    sum += root.val;
    if (root.left != null) {
      sum += rob(root.left.left);
      sum += rob(root.left.right);
    }
    if (root.right != null) {
      sum += rob(root.right.left);
      sum += rob(root.right.right);
    }
    sum = Integer.max(sum, rob(root.left) + rob(root.right));
    map.put(root, sum);
    return sum;
  }
}
