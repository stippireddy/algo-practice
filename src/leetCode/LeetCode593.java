/**
 * Created by Sarveswara Tippireddy on Sep 2, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/valid-square/description/
 * 
 */
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode593 {
  public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
    HashMap<Integer, List<int[]>> sideLengthMap = new HashMap<>();
    addToMap(sideLengthMap, p1, p2);
    addToMap(sideLengthMap, p1, p3);
    addToMap(sideLengthMap, p1, p4);
    addToMap(sideLengthMap, p2, p3);
    addToMap(sideLengthMap, p2, p4);
    addToMap(sideLengthMap, p3, p4);
    if (sideLengthMap.size() > 2 || sideLengthMap.containsKey(0)) {
      return false;
    }
    int min = Integer.MAX_VALUE;
    for (int i : sideLengthMap.keySet()) {
      min = Integer.min(i, min);
    }
    List<int[]> sides = sideLengthMap.get(min);
    if (sides.size() != 8) {
      return false;
    }
    int[] a = sides.get(0);
    int[] b = sides.get(1);
    if (!findTwoPerpendicularLines(sides, 2, a, b)) {
      return false;
    }
    a = sides.get(2);
    b = sides.get(3);
    if (!findTwoPerpendicularLines(sides, 4, a, b)) {
      return false;
    }
    return true;
  }

  private boolean findTwoPerpendicularLines(List<int[]> sides, int k, int[] a, int[] b) {
    int i = 0;
    for (; k < sides.size() && i < 2; k++) {
      if (sides.get(k) == a) {
        int index = k - 1;
        if ((k & 1) == 0) {
          index = k + 1;
        }
        if (!arePerpendicular(a, b, sides.get(index))) {
          return false;
        }
        i++;
      } else if (sides.get(k) == b) {
        int index = k - 1;
        if ((k & 1) == 0) {
          index = k + 1;
        }
        if (!arePerpendicular(b, a, sides.get(index))) {
          return false;
        }
        i++;
      }
    }
    return true;
  }

  private boolean arePerpendicular(int[] a, int[] b, int[] c) {
    return (a[1] - b[1]) * (a[1] - c[1]) == -1 * (a[0] - b[0]) * (a[0] - c[0]);
  }

  private void addToMap(HashMap<Integer, List<int[]>> map, int[] p1, int[] p2) {
    int distanceP1P2 = getDistance(p1, p2);
    if (map.containsKey(distanceP1P2)) {
      List<int[]> list = map.get(distanceP1P2);
      list.add(p1);
      list.add(p2);
    } else {
      List<int[]> list = new ArrayList<>();
      list.add(p1);
      list.add(p2);
      map.put(getDistance(p1, p2), list);
    }
  }

  private int getDistance(int[] p1, int[] p2) {
    int x = p1[0] - p2[0];
    int y = p1[1] - p2[1];
    return x * x + y * y;
  }
}
