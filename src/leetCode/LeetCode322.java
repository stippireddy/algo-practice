package leetCode;

import java.util.Arrays;

public class LeetCode322 {

  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    Arrays.sort(coins);
    for (int i = 0; i < dp.length; i++) {
      if (dp[i] != -1) {
        for (int coin : coins) {
          if (i + coin <= amount) {
            if (dp[i + coin] == -1) {
              dp[i + coin] = dp[i + 1];
            }
          }
        }
      }
    }
    return dp[amount];
  }
}
