/**
 * Created by Sarveswara Tippireddy on Aug 25, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/non-overlapping-intervals/description/
 */
package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode435 {

  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
    int prevEnd = intervals[0][1];
    int count = 0;
    for (int i = 1; i < intervals.length; i++) {
      if (prevEnd > intervals[i][0]) {
        prevEnd = Integer.min(prevEnd, intervals[i][1]);
        count++;
      } else {
        prevEnd = intervals[i][1];
      }
    }
    return count;
  }
}
