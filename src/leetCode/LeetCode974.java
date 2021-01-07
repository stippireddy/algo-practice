package leetCode;

import java.util.HashMap;

public class LeetCode974 {

  public int subarraysDivByK(int[] a, int k) {
    HashMap<Integer, Integer> remainderMap = new HashMap<>();
    remainderMap.put(0, 1);
    int count = 0;
    int runningSum = 0;
    for (int i : a) {
      runningSum = (runningSum + i) % k;
      if (runningSum < 0) {
        runningSum += k;
      }
      count += remainderMap.getOrDefault(runningSum, 0);
      remainderMap.put(runningSum, remainderMap.getOrDefault(runningSum, 0) + 1);
    }
    return count;
  }
}
