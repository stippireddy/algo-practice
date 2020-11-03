package leetCode;

public class LeetCode1143 {

  public int longestCommonSubsequence(String text1, String text2) {
    int[][] dp = new int[text1.length() + 1][text2.length() + 1];
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        dp[i][j] = -1;
      }
    }
    return helper(text1, text2, dp, text1.length(), text2.length());
  }

  private int helper(String text1, String text2, int[][] dp, int i, int j) {
    if (dp[i][j] != -1) {
      return dp[i][j];
    }
    if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
      dp[i][j] = 1 + helper(text1, text2, dp, i - 1, j - 1);
    } else {
      dp[i][j] = Integer
          .max(helper(text1, text2, dp, i, j - 1), helper(text1, text2, dp, i - 1, j));
    }
    return dp[i][j];
  }
}
