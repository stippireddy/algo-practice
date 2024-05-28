package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1481 {

  public int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    ArrayList<Integer> values = new ArrayList<>(map.values());
    Collections.sort(values);
    int i = 0;
    while (i < values.size() && values.get(i) <= k) {
      k -= values.get(i);
      i++;
    }
    return values.size() - i;
  }
}
