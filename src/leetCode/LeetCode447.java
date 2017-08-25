/**
 * Created by Sarveswara Tippireddy on Aug 25, 2017
 *
 * <p>
 * This LeetCode problem can be found @
 * https://leetcode.com/problems/number-of-boomerangs/description/
 */
package leetCode;

import java.util.HashMap;

public class LeetCode447 {
  public int numberOfBoomerangs(int[][] points) {
    int count = 0;
    for (int i = 0; i < points.length; i++) {
      HashMap<Integer, Integer> countMap = new HashMap<>();
      for (int j = 0; j < points.length; j++) {
        if (i != j) {
          int distance = calculateDistance(points[i][0], points[j][0], points[i][1], points[j][1]);
          if (countMap.containsKey(distance)) {
            int numberOfPointsWithSameDistance = countMap.get(distance);
            count += numberOfPointsWithSameDistance;
            countMap.put(distance, numberOfPointsWithSameDistance + 1);
          } else {
            countMap.put(distance, 1);
          }
        }
      }
    }
    return 2 * count;
  }

  private int calculateDistance(int x1, int x2, int y1, int y2) {
    return (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }
}
