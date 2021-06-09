package leetCode;

import java.util.Arrays;

public class LeetCode512 {

  public int change(int amount, int[] coins) {
    int[][] dp = new int[amount + 1][coins.length + 1];
    Arrays.fill(dp[0], 1);
    for (int a = 1; a <= amount; a++) {
      for (int i = 1; i <= coins.length; i++) {
        dp[a][i] = dp[a][i - 1];
        if (a >= coins[i - 1]) {
          dp[a][i] += dp[a - coins[i - 1]][i];
        }
      }
    }
    return dp[amount][coins.length];
  }
}
