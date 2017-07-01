/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Scanner;

public class MaxSumStolenFromHouses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getMaxSum(input));
    }
    sc.close();
  }

  public static int getMaxSum(int[] a) {
    if (a.length < 2) {
      return a[0];
    }
    int[] dp = new int[a.length];
    dp[0] = a[0];
    dp[1] = Integer.max(a[0], a[1]);
    int maxVal = dp[1];
    for (int i = 2; i < a.length; i++) {
      dp[i] = Integer.max(dp[i - 2] + a[i], dp[i - 1]);
      maxVal = Integer.max(maxVal, dp[i]);
    }
    return maxVal;
  }
}
