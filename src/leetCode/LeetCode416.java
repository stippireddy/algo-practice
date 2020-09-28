package leetCode;

import java.util.Arrays;

public class LeetCode416 {

  public static void main(String[] args) {
    LeetCode416 l = new LeetCode416();
    System.out.println(l.canPartition(
        new int[]{23, 13, 11, 7, 6, 5, 5}));
  }

  public boolean canPartition(int[] nums) {
    if (nums == null) {
      return false;
    }
    int sum = Arrays.stream(nums).sum();
    if ((sum & 1) != 0) {
      return false;
    }
    Boolean[][] dp = new Boolean[sum / 2 + 1][nums.length + 1];
    for (Boolean[] row : dp) {
      Arrays.fill(row, null);
    }
    Arrays.fill(dp[0], true);
    for (int i = 1; i < dp.length; i++) {
      dp[i][0] = false;
    }
    return helper(nums, sum / 2, 0, dp);
  }

  private boolean helper(int[] nums, int sum, int index, Boolean[][] dp) {
    if (sum < 0 || index >= nums.length) {
      return false;
    }
    if (dp[sum][index + 1] == null) {
      dp[sum][index + 1] =
          helper(nums, sum - nums[index], index + 1, dp) || helper(nums, sum, index + 1, dp);
    }
    return dp[sum][index + 1];
  }
}
