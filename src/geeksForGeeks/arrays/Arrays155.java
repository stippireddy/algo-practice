package geeksForGeeks.arrays;

import java.util.HashMap;

public class Arrays155 {

  public int findPairCountWithSumUsingHashMap(int[] a, int x) {
    int count = 0;
    HashMap<Integer, Integer> set = new HashMap<>();
    for (int i : a) {
      Integer val = set.get(x - i);
      if (val != null) {
        count += val;
      }
      set.put(i, set.getOrDefault(i, 0) + 1);
    }
    return count;
  }
}
