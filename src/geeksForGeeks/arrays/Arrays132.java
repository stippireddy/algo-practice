package geeksForGeeks.arrays;

import java.util.Arrays;

/**
 * @author Sarveswara Tippireddy
 * <p>This GeeksforGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
 */
public class Arrays132 {

  public boolean findPythogoreanTriplets(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] * a[i];
    }
    Arrays.sort(a);
    for (int i = a.length - 1; i > 1; i--) {
      if (helper(a, i - 1, a[i])) {
        return true;
      }
    }
    return false;
  }

  private boolean helper(int[] a, int k, int x) {
    int i = 0, j = k;
    while (i < j) {
      if (a[i] + a[j] > x) {
        j--;
      } else if (a[i] + a[j] < x) {
        i++;
      } else {
        return true;
      }
    }
    return false;
  }
}
