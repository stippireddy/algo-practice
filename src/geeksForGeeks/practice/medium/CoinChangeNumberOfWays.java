/**
 * Created by Sarveswara Tippireddy on Jul 24, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/coin-change/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeNumberOfWays {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int k = sc.nextInt();
      int[] values = new int[k];
      for (int i = 0; i < values.length; i++) {
        values[i] = sc.nextInt();
      }
      int sum = sc.nextInt();
      System.out.println(getChangeBottomUp(sum, values));
    }
    sc.close();
  }

  public static int getChangeBottomUp(int sum, int[] values) {
    int[][] dp = new int[sum + 1][values.length + 1];
    Arrays.fill(dp[0], 1);
    for (int i = 1; i < sum + 1; i++) {
      for (int j = 1; j < values.length + 1; j++) {
        dp[i][j] = ((i - values[j - 1] < 0) ? 0 : dp[i - values[j - 1]][j]) + dp[i][j - 1];
      }
    }
    return dp[sum][values.length];
  }

  public static int getChangeTopDown(int sum, int[] values) {
    int[][] dp = new int[sum + 1][values.length + 1];
    Arrays.fill(dp[0], 1);
    for (int i = 1; i < sum + 1; i++) {
      Arrays.fill(dp[i], 1, values.length + 1, -1);
    }
    return getChangeHelper(sum, values, values.length, dp);
  }

  private static int getChangeHelper(int sum, int[] values, int n, int[][] dp) {
    if (sum < 0 || n < 0) {
      return 0;
    }
    if (dp[sum][n] != -1) {
      return dp[sum][n];
    }
    dp[sum][n] =
        getChangeHelper(sum, values, n - 1, dp)
            + getChangeHelper(sum - values[n - 1], values, n, dp);
    return dp[sum][n];
  }
}
