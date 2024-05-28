package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode057 {

  public static void main(String[] args) {
    LeetCode057 l = new LeetCode057();
    l.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}
    }, new int[]{4, 8});
  }

  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    int i = 0;
    boolean intervalMerged = false;
    while (i < intervals.length || !intervalMerged) {
      if (i == intervals.length) {
        result.add(new int[]{newInterval[0], newInterval[1]});
        intervalMerged = true;
        continue;
      }
      if (intervalMerged) {
        result.add(new int[]{intervals[i][0], intervals[i][1]});
        i++;
        continue;
      }
      if (intervals[i][0] > newInterval[1]) {
        result.add(new int[]{newInterval[0], newInterval[1]});
        intervalMerged = true;
      } else if (intervals[i][1] < newInterval[0]) {
        result.add(new int[]{intervals[i][0], intervals[i][1]});
        i++;
      } else {
        int start = Integer.min(intervals[i][0], newInterval[0]);
        int end = Integer.max(intervals[i][1], newInterval[1]);
        while (i < intervals.length && end >= intervals[i][0]) {
          end = Integer.max(intervals[i][1], end);
          i++;
        }
        result.add(new int[]{start, end});
        intervalMerged = true;
      }
    }
    return result.toArray(new int[result.size()][]);
  }
}
