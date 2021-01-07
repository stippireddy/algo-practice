package leetCode;

import java.util.Arrays;

public class LeetCode1283 {

  public int smallestDivisor(int[] nums, int threshold) {
    int min = 1;
    int max = Arrays.stream(nums).max().getAsInt();
    while (min < max) {
      int mid = min + (max - min) / 2;
      if (isLessThanOrEqualToThreshold(nums, mid, threshold)) {
        max = mid;
      } else {
        min = mid + 1;
      }
    }
    return min;
  }

  private boolean isLessThanOrEqualToThreshold(int[] nums, int div, int threshold) {
    int sum = 0;
    for (int num : nums) {
      sum += num / div;
      if (num % div > 0) {
        sum++;
      }
    }
    return sum <= threshold;
  }
}
