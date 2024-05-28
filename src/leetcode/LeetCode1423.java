package leetcode;

public class LeetCode1423 {

  public int maxScoreDivideAndConquerWithMemoization(int[] cardPoints, int k) {
    int[][] dp = new int[cardPoints.length][cardPoints.length];
    for (int i = 0; i < cardPoints.length; i++) {
      for (int j = 0; j < cardPoints.length - i; j++) {
        dp[i][j] = -1;
      }
    }
    return helper(cardPoints, k, 0, 0, cardPoints.length - 1, dp);
  }

  private int helper(int[] cardPoints, int k, int score, int left, int right, int[][] dp) {
    if (left > right) {
      return score;
    }
    if (dp[left][right] != -1) {
      return dp[left][right];
    }
    if (k == 0) {
      dp[left][right] = score;
      return score;
    }
    dp[left][right] = Integer
        .max(helper(cardPoints, k - 1, score + cardPoints[left], left + 1, right, dp),
            helper(cardPoints, k - 1, score + cardPoints[right], left, right - 1, dp));
    return dp[left][right];
  }

  public int maxScore(int[] cardPoints, int k) {
    int selected = 0;
    for (int i = 0; i < k; i++) {
      selected += cardPoints[cardPoints.length - i - 1];
    }
    int maxScore = selected;
    for (int i = k; i < cardPoints.length; i++) {
      selected = selected + cardPoints[i] - cardPoints[i - k];
      maxScore = Integer.max(maxScore, selected);
    }
    return maxScore;
  }

  public int maxScoreDivideAndConquer(int[] cardPoints, int k) {
    return helper(cardPoints, k, 0, 0, cardPoints.length - 1);
  }

  private int helper(int[] cardPoints, int k, int score, int left, int right) {
    if (k == 0 || left > right) {
      return score;
    }
    return Integer
        .max(helper(cardPoints, k - 1, score + cardPoints[left], left + 1, right),
            helper(cardPoints, k - 1, score + cardPoints[right], left, right - 1));
  }
}