package leetCode;

import java.util.Arrays;

public class LeetCode764 {

  public int orderOfLargestPlusSign(int n, int[][] mines) {
    int[][] matrix = new int[n][n];
    for (int[] row : matrix) {
      Arrays.fill(row, 1);
    }
    for (int[] mine : mines) {
      matrix[mine[0]][mine[1]] = 0;
    }
    int[][] dp = new int[n][n];
    for (int i = 1; i < n - 1; i++) {
      int left = 0;
      for (int j = 1; j < n - 1; j++) {
        if (matrix[i][j - 1] == 1) {
          left++;
        } else {
          left = 0;
        }
        dp[i][j] = left;
      }
    }
    for (int i = 1; i < n - 1; i++) {
      int right = 0;
      for (int j = n - 2; j > 0; j--) {
        if (matrix[i][j + 1] == 1) {
          right++;
        } else {
          right = 0;
        }
        dp[i][j] = Integer.min(right, dp[i][j]);
      }
    }
    for (int j = 1; j < n - 1; j++) {
      int top = 0;
      for (int i = 1; i < n - 1; i++) {
        if (matrix[i - 1][j] == 1) {
          top++;
        } else {
          top = 0;
        }
        dp[i][j] = Integer.min(top, dp[i][j]);
      }
    }
    for (int j = 1; j < n - 1; j++) {
      int bottom = 0;
      for (int i = n - 2; i > 0; i--) {
        if (matrix[i + 1][j] == 1) {
          bottom++;
        } else {
          bottom = 0;
        }
        dp[i][j] = Integer.min(bottom, dp[i][j]);
      }
    }
    int result = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 1) {
          result = Integer.max(result, dp[i][j] + 1);
        }
      }
    }
    return result;
  }
}
