/**
 * Created by Sarveswara Tippireddy on Jul 13, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Scanner;

public class Basics03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      System.out.println(getMaxLengthSubsequenceBottomUp(sc.next(), sc.next()));
    }
    sc.close();
  }

  public static int getMaxLengthSubsequenceBottomUp(String a, String b) {
    int[][] dp = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
        } else {
          dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[a.length()][b.length()];
  }

  public static int getMaxLengthSubsequenceTopDown(String a, String b) {
    int[][] dp = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        dp[i][j] = -1;
      }
    }
    int temp = helper(a, b, dp, a.length(), b.length());
    return temp;
  }

  private static int helper(String a, String b, int[][] dp, int i, int j) {
    if (dp[i][j] != -1) {
      return dp[i][j];
    }
    if (a.charAt(i - 1) == b.charAt(j - 1)) {
      dp[i][j] = 1 + (dp[i - 1][j - 1] == -1 ? helper(a, b, dp, i - 1, j - 1) : dp[i - 1][j - 1]);
    } else {
      int maxIncludingI = dp[i][j - 1] == -1 ? helper(a, b, dp, i, j - 1) : dp[i][j - 1];
      int maxIncludingJ = dp[i - 1][j] == -1 ? helper(a, b, dp, i - 1, j) : dp[i - 1][j];
      dp[i][j] = Integer.max(maxIncludingI, maxIncludingJ);
    }
    return dp[i][j];
  }
}
