package leetCode;

import java.util.HashMap;

public class LeetCode001 {

  public int[] twoSumBruteForce(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          break;
        }
      }
    }
    return result;
  }

  public int[] twoSumHashMap(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        result[0] = map.get(target - nums[i]);
        result[1] = i;
        break;
      } else {
        map.put(nums[i], i);
      }
    }
    return result;
  }
}
