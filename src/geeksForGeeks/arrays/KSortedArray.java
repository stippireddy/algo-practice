package geeksForGeeks.arrays;

import java.util.Arrays;

public class KSortedArray {

  public boolean isKSorted(int[] a, int k) {
    boolean kSorted = true;
    int[] b = Arrays.copyOf(a, a.length);
    Arrays.sort(b);
    for (int i = 0; i < a.length; i++) {
      int index = Arrays.binarySearch(b, a[i]);
      if (Math.abs(index - i) > k) {
        kSorted = false;
        break;
      }
    }
    return kSorted;
  }
}
