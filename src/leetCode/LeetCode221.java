package leetCode;

import java.util.Arrays;

public class LeetCode221 {

  public int maximalSquare(char[][] matrix) {
    int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
    int[][] left = new int[matrix.length + 1][matrix[0].length + 1];
    int[][] top = new int[matrix.length + 1][matrix[0].length + 1];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == '1') {
          left[i + 1][j + 1] = 1 + left[i + 1][j];
        }
      }
    }
    for (int j = 0; j < matrix[0].length; j++) {
      for (int i = 0; i < matrix.length; i++) {
        if (matrix[i][j] == '1') {
          top[i + 1][j + 1] = 1 + top[i][j + 1];
        }
      }
    }
    int maxSquare = 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == '1') {
          dp[i + 1][j + 1] = Integer
              .min(Integer.min(left[i + 1][j + 1], top[i + 1][j + 1]), dp[i][j] + 1);
          maxSquare = Integer.max(maxSquare, dp[i + 1][j + 1]);
        }
      }
    }
    System.out.println(Arrays.deepToString(dp));
    return maxSquare;
  }
}
