/**
 * Created by Sarveswara Tippireddy on Jul 13, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/jumbled-strings/0
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Scanner;

public class JumbledStrings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int length = sc.nextInt();
      String input = sc.next();
      System.out.println(getSubseqCount(input));
    }
    sc.close();
  }

  private static int getSubseqCount(String input) {
    String pattern = "GEEKS";
    int[][] dp = new int[pattern.length() + 1][input.length() + 1];
    for (int i = 0; i < dp[0].length; i++) {
      dp[0][i] = 1;
    }
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (pattern.charAt(i - 1) == input.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
        } else {
          dp[i][j] = dp[i][j - 1];
        }
      }
    }
    return dp[pattern.length()][input.length()];
  }
}
