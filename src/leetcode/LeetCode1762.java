package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1762 {

  public int[] findBuildings(int[] heights) {
    List<Integer> result = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for (int i = heights.length - 1; i >= 0; i--) {
      if (heights[i] > max) {
        result.add(i);
        max = heights[i];
      }
    }
    int[] resultArray = new int[result.size()];
    for (int i = 0; i < resultArray.length; i++) {
      resultArray[i] = result.get(result.size() - i - 1);
    }
    return resultArray;
  }
}
