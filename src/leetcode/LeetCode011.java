package leetcode;

public class LeetCode011 {

  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int maxArea = 0;
    while (left < right) {
      if (height[left] < height[right]) {
        maxArea = Integer.max(maxArea, (right - left) * height[left]);
        left++;
      } else {
        maxArea = Integer.max(maxArea, (right - left) * height[right]);
        right++;
      }
    }
    return maxArea;
  }
}
