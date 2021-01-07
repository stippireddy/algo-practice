package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode560 {

  public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int runningSum = 0;
    int count = 0;
    for (int num : nums) {
      runningSum += num;
      if (runningSum == k) {
        count++;
      }
      count = count + map.getOrDefault(runningSum - k, 0);
      map.put(runningSum, map.getOrDefault(runningSum, 0) + 1);
    }
    return count;
  }
}
