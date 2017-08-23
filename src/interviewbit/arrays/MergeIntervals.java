/**
 * Created by Sarveswara Tippireddy on Jul 2, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;

public class MergeIntervals {
  public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    ArrayList<Interval> result = new ArrayList<>();
    if (intervals.size() < 1) {
      result.add(newInterval);
      return result;
    }
    int i = 0;
    for (; i < intervals.size(); i++) {
      int currentStart = intervals.get(i).start;
      int currentEnd = intervals.get(i).end;
      if (newInterval.end < currentStart) {
        result.add(new Interval(newInterval.start, newInterval.end));
        newInterval.start = -1;
        break;
      } else if (newInterval.start > currentEnd) {
        result.add(intervals.get(i));
      } else if (newInterval.start < currentEnd) {
        currentStart = Integer.min(currentStart, newInterval.start);
        while (++i < intervals.size() && newInterval.end > intervals.get(i).start) {}
        currentEnd =
            (newInterval.end < intervals.get(i - 1).end)
                ? intervals.get(i - 1).end
                : newInterval.end;
        result.add(new Interval(currentStart, currentEnd));
        newInterval.start = -1;
        break;
      }
    }
    while (i < intervals.size()) {
      result.add(intervals.get(i++));
    }
    if (newInterval.start != -1) {
      result.add(newInterval);
    }
    return result;
  }

  private class Interval {
    int start;
    int end;

    Interval(int s, int e) {
      start = s;
      end = e;
    }
  }
}
