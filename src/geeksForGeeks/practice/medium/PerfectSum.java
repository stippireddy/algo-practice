/**
 * Created by Sarveswara Tippireddy on Jul 25, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/perfect-sum-problem/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/perfect-sum-problem-print-subsets-given-sum/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      int sum = sc.nextInt();
      System.out.println(getNumberOfSubsets(sum, input));
    }
    sc.close();
  }

  // 0-1 Knapsack Problem
  public static int getNumberOfSubsets(int sum, int[] input) {
    int[][] dp = new int[sum + 1][input.length + 1];
    Arrays.fill(dp[0], 1);
    for (int i = 1; i < sum + 1; i++) {
      for (int j = 1; j < input.length + 1; j++) {
        int a = (i - input[j - 1]) >= 0 ? dp[i - input[j - 1]][j - 1] : 0;
        int b = dp[i][j - 1];
        dp[i][j] = a + b;
      }
    }
    return dp[sum][input.length];
  }
}
