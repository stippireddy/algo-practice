/**
 * Created by Sarveswara Tippireddy on Aug 26, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/4sum-ii/description/
 */
package leetCode;

import java.util.HashMap;

public class LeetCode454 {

  public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        map.put(a[i] + b[j], map.getOrDefault(a[i] + b[j], 0) + 1);
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        count += map.getOrDefault(0 - (c[i] + d[j]), 0);
      }
    }
    return count;
  }
}
