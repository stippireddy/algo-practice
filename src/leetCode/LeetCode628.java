package leetCode;

import java.util.Arrays;

public class LeetCode628 {
  public static int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int l = nums.length;
    return nums[l - 1] * Integer.max(nums[l - 2] * nums[l - 3], nums[0] * nums[1]);
  }
}
