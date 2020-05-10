/**
 * Created by Sarveswara Tippireddy on Jul 25, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/count-ways-to-nth-stairorder-does-not-matter/0
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class CountWaysToNthStairOrderImmaterial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      System.out.println(getStepCountTopDown(k));
    }
    sc.close();
  }

  // This solution is inspired from the Coin Change problem
  public static int getStepCountTopDown(int n) {
    int[][] dp = new int[n + 1][3];
    Arrays.fill(dp[0], 1);
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        int a = (i - j) >= 0 ? dp[i - j][j] : 0;
        int b = dp[i][j - 1];
        dp[i][j] = a + b;
      }
    }
    return dp[n][2];
  }
}
