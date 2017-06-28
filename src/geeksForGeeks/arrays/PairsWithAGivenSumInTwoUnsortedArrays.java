package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.HashMap;
/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/given-two-unsorted-arrays-find-pairs-whose-sum-x/
 */
public class PairsWithAGivenSumInTwoUnsortedArrays {
  public String usingHashing(int[] a, int[] b, int x) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : b) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    StringBuffer sb = new StringBuffer();
    Arrays.sort(a);
    boolean isPairExists = false;
    for (int i : a) {
      if (map.containsKey(x - i)) {
        int n = map.get(x - i);
        while (n-- > 0) {
          sb.append(i).append(" ").append(x - i).append(", ");
        }
        isPairExists = true;
        map.remove(x - i);
      }
    }
    if (isPairExists) {
      return sb.substring(0, sb.length() - 2);
    }
    return "-1";
  }
}
