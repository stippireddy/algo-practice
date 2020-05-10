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

  public int singleNumberSummingUpIndividualBits(int[] nums) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
      int temp = 0;
      for (int j = 0; j < nums.length; j++) {
        temp += (nums[j] & 1);
        nums[j] = nums[j] >> 1;
      }
      temp %= 3;
      result |= (temp << i);
    }
    return result;
  }

  public int singleNumberUsingMask(int[] nums) {
    // TODO Complete this
    return -1;
  }
}
