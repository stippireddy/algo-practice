/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ link
 */
package interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {

  public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    if (intervals.size() < 2) {
      return intervals;
    }
    Collections.sort(intervals, new IntervalComparator());
    ArrayList<Interval> result = new ArrayList<>();
    int currentStart = intervals.get(0).start;
    int currentEnd = intervals.get(0).end;
    for (int i = 1; i < intervals.size(); i++) {
      if (intervals.get(i).start <= currentEnd) {
        currentEnd = Integer.max(currentEnd, intervals.get(i).end);
      } else {
        result.add(new Interval(currentStart, currentEnd));
        currentStart = intervals.get(i).start;
        currentEnd = intervals.get(i).end;
      }
    }
    result.add(new Interval(currentStart, currentEnd));
    return result;
  }

  private class IntervalComparator implements Comparator<Interval> {

    @Override
    public int compare(Interval o1, Interval o2) {
      return o1.start - o2.start;
    }
  }
}

class Interval {

  int start;
  int end;

  Interval(int s, int e) {
    start = s;
    end = e;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != Interval.class) {
      return false;
    }
    Interval other = (Interval) obj;
    return other.start == this.start && other.end == this.end;
  }
}
