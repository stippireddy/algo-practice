package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Arrays003 {

  public boolean findPairWithSumUsingSorting(int[] a, int x) {
    Arrays.sort(a);
    int i = 0, j = a.length - 1;
    while (i < j) {
      int sum = a[i] + a[j];
      if (sum > x) {
        j--;
      } else if (sum < x) {
        i++;
      } else {
        return true;
      }
    }
    return false;
  }

  public boolean findPairWithSumUsingHashMap(int[] a, int x) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : a) {
      if (set.contains(x - i)) {
        return true;
      }
      set.add(i);
    }
    return false;
  }
}
