package leetCode;

import java.util.HashMap;

public class LeetCode287 {
  
  public int findDuplicateUsingHashMap(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i : nums){
      int count = map.getOrDefault(i, 0);
      if (count == 1) {
        return i;
      } else {
        map.put(i, count + 1);
      }
    }
    return -1;
  }
  
  public int findDuplicateBruteForce(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return nums[i];
        }
      }
    }
    return -1;
  }
  
  public int findDuplicateEfficient(int[] nums) {}
}
