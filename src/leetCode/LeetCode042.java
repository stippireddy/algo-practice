package leetCode;

public class LeetCode042 {

  public int trap(int[] height) {
    if (height == null || height.length < 3) {
      return 0;
    }
    int[] right = new int[height.length];
    for (int i = height.length - 2; i >= 0; i--) {
      right[i] = Integer.max(right[i + 1], height[i + 1]);
    }
    int[] left = new int[height.length];
    for (int i = 1; i < height.length; i++) {
      left[i] = Integer.max(left[i - 1], height[i - 1]);
    }
    int trappedWater = 0;
    for (int i = 1; i < height.length - 1; i++) {
      int h = Integer.max(left[i], right[i]);
      if (h > height[i]) {
        trappedWater += (h - height[i]);
      }
    }
    return trappedWater;
  }
}
