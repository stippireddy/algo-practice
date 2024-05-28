package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode759 {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> list = new ArrayList<>();
        schedule.forEach(list::addAll);
        list.sort(Comparator.comparingInt(i -> i.start));
        List<Interval> result = new ArrayList<>();
        Interval prev = result.get(0);
        for (int i = 1; i < list.size(); i++) {
            Interval current = result.get(i);
            if (prev.end < current.start) {
                result.add(new Interval(prev.end, current.start));
            }
            if (prev.end < current.end) {
                prev = current;
            }
        }
        return result;
    }
}
