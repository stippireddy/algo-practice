package leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sarveswara Tippireddy on 5/18/2017.
 */
public class LeetCode575 {

  public int distributeCandies(int[] candies) {
    Set<Integer> set = new HashSet<>();
    for (int i : candies) {
      set.add(i);
    }
    return Math.min(set.size(), candies.length / 2);
  }
}
