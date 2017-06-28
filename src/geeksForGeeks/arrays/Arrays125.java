package geeksForGeeks.arrays;

import java.util.HashSet;

public class Arrays125 {

  public boolean containsDuplicateWithinKDistace(int[] a, int k) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < a.length; i++) {
      if (!set.add(a[i])) {
        return true;
      }
      if (i >= k) {
        set.remove(a[i - k]);
      }
    }
    return false;
  }
}
