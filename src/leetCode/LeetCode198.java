package leetCode;

import java.util.Arrays;

public class LeetCode198 {

  // public int rob(int[] nums) {
  //   int i = 0;
  //   int sum = 0;
  //   boolean skip = false;
  //   while (i + 1 < nums.length) {
  //     if (!skip) {
  //       if (nums[i] > nums[i + 1]) {
  //         sum += nums[i];
  //         skip = false;
  //       } else {
  //         sum += nums[i + 1];
  //         skip = true;
  //       }
  //     }
  //     i++;
  //   }
  //   if (i < nums.length && !skip) {
  //     sum += nums[i];
  //   }
  //   return sum;
  // }

  public int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int[] dp = new int[nums.length + 2];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    dp[1] = 0;
    return helper(nums, nums.length - 1, dp);
  }

  private int helper(int[] nums, int index, int[] dp) {
    if (dp[index + 2] != -1) {
      return dp[index + 2];
    }
    dp[index + 2] = Integer
        .max(nums[index] + helper(nums, index - 2, dp), helper(nums, index - 1, dp));
    return dp[index + 2];
  }
}
