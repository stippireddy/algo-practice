package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode452 {

  public int findMinArrowShots(int[][] points) {
    if (points == null || points.length < 2) {
      return 1;
    }
    Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
    int endTime = points[0][1];
    int numberOfArrows = 1;
    for (int i = 1; i < points.length; i++) {
      if (endTime >= points[i][0]) {
        endTime = Integer.min(endTime, points[i][1]);
      } else {
        numberOfArrows++;
        endTime = points[i][1];
      }
    }
    return numberOfArrows;
  }
}
