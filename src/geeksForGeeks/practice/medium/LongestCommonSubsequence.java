/**
 * Created by Sarveswara Tippireddy on Jul 22, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/longest-common-subsequence/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 * http://www.geeksforgeeks.org/space-optimized-solution-lcs/ http://www.geeksforgeeks.org/printing-longest-common-subsequence/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class LongestCommonSubsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int l = sc.nextInt();
      String a = sc.next();
      String b = sc.next();
      System.out.println(getLCS(a, b));
    }
    sc.close();
  }

  public static int findLCSLength(String a, String b) {
    int[][] lcs = createDPTableForLCS(a, b);
    return lcs[a.length()][b.length()];
  }

  public static String getLCS(String a, String b) {
    int[][] lcs = createDPTableForLCS(a, b);
    int i = a.length(), j = b.length();
    StringBuffer sb = new StringBuffer();
    while (i > 0 && j > 0) {
      if (a.charAt(i - 1) == b.charAt(j - 1)) {
        sb.append(a.charAt(i - 1));
        i--;
        j--;
      } else {
        if (lcs[i - 1][j] > lcs[i][j - 1]) {
          i--;
        } else {
          j--;
        }
      }
    }
    return sb.reverse().toString();
  }

  private static int[][] createDPTableForLCS(String a, String b) {
    int[][] lcs = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i < a.length() + 1; i++) {
      for (int j = 1; j < b.length() + 1; j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          lcs[i][j] = 1 + lcs[i - 1][j - 1];
        } else {
          lcs[i][j] = Integer.max(lcs[i - 1][j], lcs[i][j - 1]);
        }
      }
    }
    return lcs;
  }

  public static int findLCSLengthSpaceOptimized(String a, String b) {
    int[][] lcs = new int[2][b.length() + 1];
    for (int i = 1; i < a.length() + 1; i++) {
      for (int j = 1; j < b.length() + 1; j++) {
        int prevRowIndex = (i & 1) == 0 ? 1 : 0;
        int currRowIndex = (i & 1) == 0 ? 0 : 1;
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          lcs[currRowIndex][j] = 1 + lcs[prevRowIndex][j - 1];
        } else {
          lcs[currRowIndex][j] = Integer.max(lcs[prevRowIndex][j], lcs[currRowIndex][j - 1]);
        }
      }
    }
    return lcs[((a.length() - 1) & 1) == 0 ? 1 : 0][b.length()];
  }
}
