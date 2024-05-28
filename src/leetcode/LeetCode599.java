package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode599 {

  public String[] findRestaurant(String[] list1, String[] list2) {
    int leastIndexSum = Integer.MAX_VALUE;
    HashMap<String, Integer> map = new HashMap<>(list1.length);
    for (int i = 0; i < list2.length; i++) {
      map.put(list2[i], i);
    }
    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < list1.length; i++) {
      String currString = list1[i];
      if (map.containsKey(currString)) {
        int currIndexSum = i + map.get(currString);
        if (leastIndexSum > currIndexSum) {
          result.clear();
          result.add(currString);
          leastIndexSum = currIndexSum;
        } else if (leastIndexSum == currIndexSum) {
          result.add(currString);
        }
      }
    }
    return result.toArray(new String[result.size()]);
  }
}
