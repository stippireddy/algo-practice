/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/find-number-of-times-a-string-occurs-as-a-subsequence/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/find-number-times-string-occurs-given-string/
 */
package geeksForGeeks.practice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumberOfTimesTSubstringOfS {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      // Reading length data, but not using it.
      sc.nextInt();
      sc.nextInt();
      System.out.println(calculate(sc.next(), sc.next()));
    }
    sc.close();
  }

  public static int calculate(String s, String t) {
    int[][] dp = new int[t.length() + 1][s.length() + 1];
    Arrays.fill(dp[0], 1);
    for (int i = 1; i < t.length() + 1; i++) {
      for (int j = 1; j < s.length() + 1; j++) {
        if (t.charAt(i - 1) == s.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
        } else {
          dp[i][j] = dp[i][j - 1];
        }
      }
    }
    return dp[t.length()][s.length()];
  }
}
