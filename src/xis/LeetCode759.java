package xis;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class LeetCode759 {

  static class Interval {

    public int start;
    public int end;

    public Interval() {
    }

    public Interval(int _start, int _end) {
      start = _start;
      end = _end;
    }
  }

  public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
    if (schedule == null || schedule.isEmpty()) {
      return new ArrayList<>();
    }
    PriorityQueue<int[]> pq = new PriorityQueue<>(
        Comparator.comparingInt(a -> schedule.get(a[0]).get(a[1]).start));
    for (int i = 0; i < schedule.size(); i++) {
      pq.add(new int[]{i, 0});
    }
    if (pq.isEmpty()) {
      return new ArrayList<>();
    }
    List<Interval> result = new ArrayList<>();
    int prevEnd = schedule.get(pq.peek()[0]).get(pq.peek()[1]).end;
    while (!pq.isEmpty()) {
      int[] curr = pq.poll();
      int currStart = schedule.get(curr[0]).get(curr[1]).start;
      int currEnd = schedule.get(curr[0]).get(curr[1]).end;
      if (prevEnd < currStart) {
        result.add(new Interval(prevEnd, currStart));
      }
      prevEnd = Integer.max(prevEnd, currEnd);
      if (curr[1] + 1 < schedule.get(curr[0]).size()) {
        pq.add(new int[]{curr[0], curr[1] + 1});
      }
    }
    return result;
  }
}
