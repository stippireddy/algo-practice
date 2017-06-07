package leetCode;

import java.util.HashMap;

public class LeetCode137 {
  public int singleNumberUsingHashMap(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int val : map.keySet()) {
      if (map.get(val) == 1) {
        return val;
      }
    }
    return -1;
  }

  public int singleNumber(int[] nums) {
    //TODO
  }
}
