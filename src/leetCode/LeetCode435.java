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
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int end = intervals[0][1];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (end > intervals[i][0]) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }
}
