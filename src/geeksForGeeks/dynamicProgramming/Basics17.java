/**
 * Created by Sarveswara Tippireddy on Jul 13, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/longest-common-substring/
 */
package geeksForGeeks.dynamicProgramming;

import java.util.Scanner;

public class Basics17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int i = sc.nextInt();
      int j = sc.nextInt();
      String a = sc.next();
      String b = sc.next();
      System.out.println(findLongestCommonSubStringLength(a, b));
      System.out.println(findLongestCommonSubString(a, b));
    }
    sc.close();
  }

  private static int findLongestCommonSubStringLength(String a, String b) {
    int maxLength = 0;
    int[][] lcs = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          lcs[i][j] = 1 + lcs[i - 1][j - 1];
          maxLength = Integer.max(maxLength, lcs[i][j]);
        } else {
          lcs[i][j] = 0;
        }
      }
    }
    return maxLength;
  }

  private static String findLongestCommonSubString(String a, String b) {
    int maxLength = 0;
    int[] maxIndices = new int[2];
    int[][] lcs = new int[a.length() + 1][b.length() + 1];
    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          lcs[i][j] = 1 + lcs[i - 1][j - 1];
          if (maxLength < lcs[i][j]) {
            maxLength = lcs[i][j];
            maxIndices[0] = i;
            maxIndices[1] = j;
          }
        } else {
          lcs[i][j] = 0;
        }
      }
    }
    StringBuffer sb = new StringBuffer();
    if (maxLength > 0) {
      int i = maxIndices[0];
      while (maxLength > 0) {
        sb.append(a.charAt(i - 1));
        i--;
        maxLength--;
      }
      sb.reverse();
    }
    return sb.toString();
  }
}
