package geeksForGeeks.arrays;

import java.util.HashSet;

/**
 * @author Sarveswara Tippireddy
 *     <p>This GeeksforGeeks problem can be found @
 *     http://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
 */
public class Arrays105 {
  public boolean zeroSumSubArrayExists(int[] input) {
    HashSet<Integer> set = new HashSet<>();
    int sum = 0;
    // Carefully observe this statement added for a corner case.
    set.add(sum);
    for (int i : input) {
      sum += i;
      if (!set.add(sum)) {
        return true;
      }
    }
    return false;
  }
}
