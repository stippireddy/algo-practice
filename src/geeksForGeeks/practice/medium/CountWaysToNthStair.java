/**
 * Created by Sarveswara Tippireddy on Jul 24, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair/0
 *
 * <p>The solution editorial can be found @ http://www.geeksforgeeks.org/count-ways-reach-nth-stair/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class CountWaysToNthStair {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      System.out.println(getStepCountTopDown(k));
    }
    sc.close();
  }
  
  public static int getStepCountTopDown(int n) {
    int[] dp = new int[n];
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    dp[0] = 1;
    dp[1] = 2;
    return dpHelper(dp, n-1);
  }

  private static int dpHelper(int[] dp, int n) {
    if (dp[n] != 0) {
      return dp[n];
    }
    dp[n] = (dpHelper(dp, n - 1) % 1000000007 + dpHelper(dp, n - 2) % 1000000007) % 1000000007;
    return dp[n];
  }

  public static int getStepCountBottomUp(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    int stepCount = 0;
    int singleStepCount = 1;
    int doubleStepCount = 2;
    for (int i = 3; i <= n; i++) {
      stepCount = (singleStepCount % 1000000007 + doubleStepCount % 1000000007) % 1000000007;
      singleStepCount = doubleStepCount;
      doubleStepCount = stepCount;
    }
    return stepCount;
  }
}
