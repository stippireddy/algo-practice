/**
 * Created by Sarveswara Tippireddy on Aug 28, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/merge-intervals/description/
 */
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode056 {

  public List<Interval> merge(List<Interval> intervals) {
    if (intervals.size() < 2) {
      return intervals;
    }
    intervals.sort((a, b) -> (Integer.compare(a.start, b.start)));
    int currentStart = intervals.get(0).start;
    int currentEnd = intervals.get(0).end;
    List<Interval> result = new ArrayList<>();
    for (int i = 1; i < intervals.size(); i++) {
      if (intervals.get(i).start > currentEnd) {
        result.add(new Interval(currentStart, currentEnd));
        currentStart = intervals.get(i).start;
        currentEnd = intervals.get(i).end;
      } else {
        currentEnd = Integer.max(currentEnd, intervals.get(i).end);
      }
    }
    result.add(new Interval(currentStart, currentEnd));
    return result;
  }
}
