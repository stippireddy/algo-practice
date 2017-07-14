/**
 * Created by Sarveswara Tippireddy on Jul 12, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ http://www.geeksforgeeks.org/?p=19155
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Scanner;

public class Intermediate006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      System.out.println(getMaxLengthPalinSubsequenceTopDown(sc.next()));
    }
    sc.close();
  }

  public static int getMaxLengthPalinSubsequenceBottomUp(String s) {
    int[][] lps = new int[s.length() + 1][s.length() + 1];
    for (int i = 1; i < s.length() + 1; i++) {
      lps[i][i] = 1;
    }
    int max = 1;
    for (int w = 1; w < s.length() + 1; w++) {
      for (int i = 1; i < s.length() + 1; i++) {
        int j = w + i;
        if (j < s.length() + 1) {
          if (s.charAt(i - 1) == s.charAt(j - 1)) {
            lps[i][j] = 2 + lps[i + 1][j - 1];
          } else {
            lps[i][j] = Integer.max(lps[i + 1][j], lps[i][j - 1]);
          }
          max = Integer.max(max, lps[i][j]);
        }
      }
    }
    return max;
  }

  private static int getMaxLengthPalinSubsequenceTopDown(String s) {
    int[][] dp = new int[s.length()][s.length()];
    for (int i = 0; i < s.length(); i++) {
      dp[i][i] = 1;
    }
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j < s.length(); j++) {
        dp[i][j] = -1;
      }
    }
    return recursionHelper(s, dp, 0, s.length() - 1);
  }

  private static int recursionHelper(String s, int[][] dp, int i, int j) {
    if (i == j) {
      return dp[i][j];
    }
    if (s.charAt(i) == s.charAt(j)) {
      dp[i][j] =
          dp[i + 1][j - 1] == -1 ? recursionHelper(s, dp, i + 1, j - 1) + 2 : dp[i + 1][j - 1] + 2;
    } else {
      int maxExcludingJ = dp[i][j - 1] == -1 ? recursionHelper(s, dp, i, j - 1) : dp[i][j - 1];
      int maxExcludingI = dp[i + 1][j] == -1 ? recursionHelper(s, dp, i + 1, j) : dp[i + 1][j];
      dp[i][j] = Integer.max(maxExcludingJ, maxExcludingI);
    }
    return dp[i][j];
  }
}
