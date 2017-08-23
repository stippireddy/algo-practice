/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This InterviewBit problem can be found @
 * https://www.interviewbit.com/problems/find-duplicate-in-array/
 */
package interviewbit.arrays;

import java.util.HashSet;
import java.util.List;

public class FindDuplicateInArray {
  public int repeatedNumberInLinearTime(final List<Integer> a) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : a) {
      if (!set.add(i)) {
        return i;
      }
    }
    return -1;
  }
  // This solution is prompted as the problem asks specifically
  // to solve in less than linear space.
  public int repeatedNumber(final List<Integer> a) {
    int sqrt = (int) Math.sqrt(a.size() - 1);
    HashSet<Integer> set = new HashSet<>();
    for (int i : a) {
      if (i <= sqrt && !set.add(i)) {
        return i;
      }
    }
    set.clear();
    for (int i : a) {
      if (i > sqrt && !set.add(i)) {
        return i;
      }
    }
    return -1;
  }
}
