/**
 * Created by Sarveswara Tippireddy on Jul 13, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/count-distinct-occurrences-as-a-subsequence/
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Arrays;

public class Intermediate072 {
  public int subsequenceCountTopDown(String input, String pat) {
    int[][] dp = new int[pat.length() + 1][input.length() + 1];
    for (int[] row : dp) {
      Arrays.fill(row, -1);
    }
    for (int i = 0; i < dp[0].length; i++) {
      dp[0][i] = 1;
    }
    for (int i = 1; i < dp.length; i++) {
      dp[i][0] = 0;
    }
    return countHelper(pat, input, dp, pat.length(), input.length());
  }

  private int countHelper(String pat, String input, int[][] dp, int i, int j) {
    if (dp[i][j] == -1) {
      if (pat.charAt(i - 1) == input.charAt(j - 1)) {
        int maxIncludingCurrentChar =
            dp[i - 1][j - 1] == -1 ? countHelper(pat, input, dp, i - 1, j - 1) : dp[i - 1][j - 1];
        int maxExcludingCurrentChar =
            dp[i][j - 1] == -1 ? countHelper(pat, input, dp, i, j - 1) : dp[i][j - 1];
        dp[i][j] = maxIncludingCurrentChar + maxExcludingCurrentChar;
      } else {
        dp[i][j] = dp[i][j - 1] == -1 ? countHelper(pat, input, dp, i, j - 1) : dp[i][j - 1];
      }
    }
    return dp[i][j];
  }

  public int subsequenceCountBottomUp(String input, String pat) {
    int[][] dp = new int[pat.length() + 1][input.length() + 1];
    for (int i = 0; i < dp[0].length; i++) {
      dp[0][i] = 1;
    }
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (pat.charAt(i - 1) == input.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
        } else {
          dp[i][j] = dp[i][j - 1];
        }
      }
    }
    return dp[pat.length()][input.length()];
  }
}
