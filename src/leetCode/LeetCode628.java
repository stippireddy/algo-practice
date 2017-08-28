package leetCode;

import java.util.Arrays;

public class LeetCode628 {
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return Integer.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
  }
}
