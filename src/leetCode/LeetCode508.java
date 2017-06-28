package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import karumanchi.trees.TreeNode;

public class LeetCode508 {

  public int[] findFrequentTreeSum(TreeNode root) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    helper(root, map);
    int maxCount = 0;
    for (int key : map.keySet()) {
      if (map.get(key) > maxCount) {
        maxCount = map.get(key);
      }
    }
    List<Integer> resultList = new ArrayList<>();
    for (int key : map.keySet()) {
      if (map.get(key) == maxCount) {
        resultList.add(key);
      }
    }
    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
      result[i] = resultList.get(i);
    }
    return result;
  }

  private int helper(TreeNode root, HashMap<Integer, Integer> map) {
    if (root == null) {
      return 0;
    }
    int sum = helper(root.left, map) + helper(root.right, map) + root.val;
    root.val = sum;
    map.put(sum, map.getOrDefault(sum, 0) + 1);
    return sum;
  }
}
