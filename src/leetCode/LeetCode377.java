package leetCode;

import java.util.HashMap;

public class LeetCode377 {
  /*

  Version 1:
  int ways = 0;

  public int combinationSum4(int[] nums, int target) {
    helper(nums, target);
    return ways;
  }

  private void helper(int[] nums, int target) {
    if (target == 0) {
      ways++;
      return;
    }
    if (target < 0) {
      return;
    }
    for(int i : nums) {
      helper(nums, target - i);
    }
  }

  Version 2:
  public int combinationSum4(int[] nums, int target) {
    return helper(nums, target);
  }

  private int helper(int[] nums, int target) {
    if (target == 0) {
      return 1;
    }
    if (target < 0) {
      return 0;
    }
    int ways = 0;
    for(int i : nums) {
      ways += helper(nums, target - i);
    }
    return ways;
  }
  */

  public int combinationSum4(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    return helper(nums, target, map);
  }

  private int helper(int[] nums, int target, HashMap<Integer, Integer> map) {
    if (target < 0) {
      return 0;
    }
    if (map.containsKey(target)) {
      return map.get(target);
    }
    int ways = 0;
    for (int i : nums) {
      ways += helper(nums, target - i, map);
    }
    map.put(target, ways);
    return ways;
  }
}
