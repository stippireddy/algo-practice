/**
 * Created by Sarveswara Tippireddy on Jul 24, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/0-1-knapsack-problem/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class IntegerKnapsack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int k = sc.nextInt();
      int weight = sc.nextInt();
      int[] values = new int[k];
      int[] weights = new int[k];
      for (int i = 0; i < values.length; i++) {
        values[i] = sc.nextInt();
      }
      for (int i = 0; i < weights.length; i++) {
        weights[i] = sc.nextInt();
      }
      System.out.println(getMaxWeightTopDown(weight, values, weights));
    }
    sc.close();
  }

  public static int getMaxWeightTopDown(int weight, int[] values, int[] weights) {
    int[][] kp = new int[weight + 1][weights.length + 1];
    for (int i = 1; i < weight + 1; i++) {
      for (int j = 1; j < weights.length + 1; j++) {
        kp[i][j] = -1;
      }
    }
    return dpHelper(weight, values, weights, kp, weights.length);
  }

  private static int dpHelper(int weight, int[] values, int[] weights, int[][] dp, int n) {
    if (dp[weight][n] != -1) {
      return dp[weight][n];
    }
    if(weights[n-1]<=weight){
      dp[weight][n] =
          Integer.max(
              dpHelper(weight - weights[n - 1], values, weights, dp, n - 1) + values[n - 1],
              dpHelper(weight, values, weights, dp, n - 1));
    }else{
      dp[weight][n] = dpHelper(weight, values, weights, dp, n-1);
    }
    return dp[weight][n];
  }

  public static int getMaxWeightBottomUp(int weight, int[] values, int[] weights) {
    int[][] kp = new int[weight + 1][weights.length + 1];
    for (int i = 1; i < weight + 1; i++) {
      for (int j = 1; j < weights.length + 1; j++) {
        kp[i][j] =
            Integer.max(
                kp[i][j - 1],
                weights[j - 1] <= i ? kp[i - weights[j - 1]][j - 1] + values[j - 1] : 0);
      }
    }
    return kp[weight][weights.length];
  }
}
