package leetCode;

public class LeetCode410 {

  public int splitArray(int[] nums, int m) {
    int left = Integer.MIN_VALUE;
    int right = 0;
    for (int i : nums) {
      left = Integer.max(i, left);
      right += i;
    }
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isValidNumberOfSplits(nums, mid, m)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  private boolean isValidNumberOfSplits(int[] nums, int mid, int m) {
    int runningSum = 0;
    int splits = 1;
    for (int i : nums) {
      if (runningSum + i <= mid) {
        runningSum += i;
      } else {
        splits++;
        runningSum = i;
      }
    }
    return splits <= m;
  }
}
