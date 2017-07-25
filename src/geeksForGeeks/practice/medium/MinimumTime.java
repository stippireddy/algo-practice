/**
 * Created by Sarveswara Tippireddy on Jul 25, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/minimum-time/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/minimum-time-write-characters-using-insert-delete-copy-operation/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumTime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[3];
      for (int i = 0; i < 3; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getMCBottomUp(input, k));
    }
    sc.close();
  }

  // Naive Recursive Solution
  public static int getMCNaiveRecursion(int[] input, int k) {
    if (k <= 0) {
      return 0;
    }
    if (k == 1) {
      return input[0];
    }
    if ((k & 1) == 0) {
      return Integer.min(
          getMCNaiveRecursion(input, k - 1) + input[0],
          getMCNaiveRecursion(input, k / 2) + input[2]);
    } else {
      return Integer.min(
          getMCNaiveRecursion(input, k - 1) + input[0],
          getMCNaiveRecursion(input, (k + 1) / 2) + input[2] + input[1]);
    }
  }

  public static int getMCMemoized(int[] input, int k) {
    int[] dp = new int[k + 1];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    dp[1] = input[0];
    return memoizedHelper(input, k, dp);
  }

  private static int memoizedHelper(int[] input, int k, int[] dp) {
    if (k <= 0) {
      return 0;
    }
    if (dp[k] == -1) {
      if ((k & 1) == 0) {
        dp[k] =
            Integer.min(
                memoizedHelper(input, k - 1, dp) + input[0],
                memoizedHelper(input, k / 2, dp) + input[2]);
      } else {
        dp[k] =
            Integer.min(
                memoizedHelper(input, k - 1, dp) + input[0],
                memoizedHelper(input, (k + 1) / 2, dp) + input[2] + input[1]);
      }
    }
    return dp[k];
  }

  public static int getMCBottomUp(int[] input, int k) {
    int[] dp = new int[k + 1];
    dp[0] = 0;
    dp[1] = input[0];
    for (int i = 2; i < k + 1; i++) {
      if ((i & 1) == 0) {
        dp[i] = Integer.min(dp[i - 1] + input[0], dp[i / 2] + input[2]);
      } else {
        dp[i] = Integer.min(dp[i - 1] + input[0], dp[(i + 1) / 2] + input[2] + input[1]);
      }
    }
    return dp[k];
  }
}
