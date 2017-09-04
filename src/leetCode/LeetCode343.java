/**
 * Created by Sarveswara Tippireddy on Sep 1, 2017
 *
 * <p>
 * This LeetCode problem can be found @ https://leetcode.com/problems/integer-break/description/
 * 
 */
package leetCode;

public class LeetCode343 {
  public int integerBreakMyFirstIntuition(int n) {
    if (n == 2) {
      return 1;
    }
    if (n == 3) {
      return 2;
    }
    int max = 1;
    for (int i = 2; i <= (n / 2) + 1; i++) {
      int quotient = n / i;
      int remainder = n % i;
      if (remainder == 0) {
        max = Integer.max((int) Math.pow(i, quotient), max);
      } else {
        int pow = (int) Math.pow(i, quotient - 1);
        pow = Integer.max(pow * (i + remainder), pow * i * remainder);
        max = Integer.max(pow, max);
      }
    }
    return max;
  }

  public int integerBreak(int n) {
    if (n == 2) {
      return 1;
    }
    if (n == 3) {
      return 2;
    }
    int product = 1;
    while (n > 4) {
      product *= 3;
      n -= 3;
    }
    product *= n;
    return product;
  }

  public int integerBreakDP(int n) {
    int[] dp = new int[n + 1];
    dp[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      for (int j = 1; j < i; j++) {
        dp[i] = Integer.max(dp[i], Math.max(dp[j], j) * Math.max(dp[i - j], (i - j)));
      }
    }
    return dp[n];
  }
}
