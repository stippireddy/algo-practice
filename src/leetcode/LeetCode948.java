package leetcode;

import java.util.Arrays;

public class LeetCode948 {

  public int bagOfTokensScoreBacktracking(int[] tokens, int power) {
    int[] t = new int[10001];
    for (int token : tokens) {
      t[token]++;
    }
    return helper(t, power);
  }

  private int helper(int[] t, int power) {
    int score = 0;
    for (int i = 0; i < t.length; i++) {
      if (power >= t[i]) {
        t[i]--;
        score = Integer.max(score, 1 + helper(t, power - t[i]));
        t[i]++;
      } else {
        if (score > 0) {
          t[i]--;
          score = Integer.max(score, -1 + helper(t, power + t[i]));
          t[i]++;
        } else {
          break;
        }
      }
    }
    return score;
  }

  public int bagOfTokensScore(int[] tokens, int power) {
    Arrays.sort(tokens);
    int score = 0, maxScore = 0;
    int i = 0, j = tokens.length - 1;
    while (i <= j) {
      if (power >= tokens[i]) {
        score++;
        power -= tokens[i];
        i++;
      } else {
        if (score > 0) {
          score--;
          power += tokens[j];
          j--;
        } else {
          break;
        }
      }
      maxScore = Integer.max(maxScore, score);
    }
    return maxScore;
  }
}
