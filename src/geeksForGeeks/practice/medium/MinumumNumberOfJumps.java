/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/minimum-number-of-jumps/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
 * http://www.geeksforgeeks.org/minimum-number-jumps-reach-endset-2on-solution/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class MinumumNumberOfJumps {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(calculate(input));
    }
    sc.close();
  }

  public static int calculate(int[] input) {
    if (input[0] == 0) {
      return -1;
    }
    int[] dp = new int[input.length];
    Arrays.fill(dp, -1);
    dp[0] = 0;
    for (int i = 1; i < input.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (input[j] >= i - j) {
          if (dp[i] == -1) {
            dp[i] = dp[j] + 1;
          } else {
            dp[i] = Integer.min(dp[i], dp[j] + 1);
          }
        }
      }
    }
    return dp[input.length - 1];
  }
}
