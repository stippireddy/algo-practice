package geeksForGeeks.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWithSameDistinctElementsAsOriginal {

  public int getNumber(int[] a) {
    int count = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i : a) {
      set.add(i);
    }
    int distinctNumbers = set.size();
    int i = 0, j = 0, range = a.length - distinctNumbers;
    HashMap<Integer, Integer> map = new HashMap<>();
    while (i <= range) {
      while (j < a.length && distinctNumbers > 0) {
        int key = a[j];
        Integer val = map.get(key);
        if (val != null) {
          val++;
          map.put(key, val);
          if (val == 1) {
            distinctNumbers--;
          }
        } else {
          map.put(key, 1);
          distinctNumbers--;
        }
        j++;
      }
      if (distinctNumbers == 0) {
        count += (a.length - j + 1);
        int val = map.get(a[i]);
        if (val == 1) {
          distinctNumbers++;
        }
        map.put(a[i], val - 1);
      }
      i++;
    }
    return count;
  }
}
