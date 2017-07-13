/**
 * Created by Sarveswara Tippireddy on Jul 13, 2017
 *
 * <p>This HackerRank problem can be found @ https://www.hackerrank.com/challenges/common-child
 */
package hackerrank.strings;

import java.util.Scanner;

public class CommonChild {

  static int commonChild(String a, String b) {
    int[][] dp = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
        } else {
          dp[i][j] = Integer.max(dp[i][j - 1], dp[i - 1][j]);
        }
      }
    }
    return dp[a.length()][b.length()];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    int result = commonChild(s1, s2);
    System.out.println(result);
    in.close();
  }
}
