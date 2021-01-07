package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode523 {

  public boolean checkSubarraySum3(int[] nums, int k) {
    if (nums.length < 2) {
      return false;
    }
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 0 && nums[i + 1] == 0) {
        return true;
      }
    }
    if (k <= 0) {
      return false;
    }
    int runningSum = nums[0];
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(nums[0] % k, 0);
    for (int i = 1; i < nums.length; i++) {
      runningSum = (runningSum + nums[i]) % k;
      if (runningSum == 0) {
        return true;
      }
      if (map.containsKey(runningSum) && i - map.get(runningSum) > 1) {
        return true;
      }
    }
    return false;
  }

  public boolean checkSubarraySum2(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    int[] prefixSum = new int[nums.length + 1];
    prefixSum[1] = nums[0];
    for (int i = 0; i < nums.length; i++) {
      prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
    for (int i = 1; i < nums.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        int currentSum = prefixSum[i + 1] - prefixSum[j];
        if (currentSum == k || (k != 0 && currentSum % k == 0)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean checkSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>() {{
      put(0, -1);
    }};
    int runningSum = 0;
    for (int i = 0; i < nums.length; i++) {
      runningSum = runningSum + nums[i];
      if (k != 0) {
        runningSum = runningSum % k;
      }
      if (map.containsKey(runningSum)) {
        if (i - map.get(runningSum) > 1) {
          return true;
        }
      } else {
        map.put(runningSum, i);
      }
    }
    return false;
  }
}
