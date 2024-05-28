package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            i++;
            while (i < intervals.length && intervals[i][0] <= end) {
                end = Integer.max(end, intervals[i][1]);
                i++;
            }
            result.add(new int[]{start, end});
        }
        return result.toArray(new int[][]{});
    }
}
