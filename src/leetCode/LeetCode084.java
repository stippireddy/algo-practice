package leetCode;

public class LeetCode084 {

  public int largestRectangleArea(int[] heights) {
    int right = heights.length - 1;
    int maxArea = 0;
    for (int i = 0; i < heights.length; i++) {
      for (int j = 0; j < heights.length; j++) {
        int minHeight = 0;
        for (int k = i; k <= j; k++) {
          minHeight = Integer.min(minHeight, heights[k]);
        }
        maxArea = Integer.max(maxArea, (j - i + 1) * minHeight);
      }
    }
    return maxArea;
  }
}
