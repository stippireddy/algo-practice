/*
  Created by Sarveswara Tippireddy on Jul 27, 2017

  <p>This is a GeeksForGeeks problem. The problem statement can be found @
  http://practice.geeksforgeeks.org/problems/shortest-uncommon-subsequence/0

  <p>The solution editorial can be found @
  http://www.geeksforgeeks.org/shortest-uncommon-subsequence/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class ShortestUncommonSubsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases-- > 0) {
      int k = sc.nextInt();
      int l = sc.nextInt();
      String s = sc.next();
      String t = sc.next();
      System.out.println(getSUCS(s, k, t, l));
    }
    sc.close();
  }

  private static int getSUCS(String s, int k, String t, int l) {
    if (k == 0) {
      return 0;
    }
    if (l == 0) {
      return k;
    }
    if (s.charAt(k - 1) != t.charAt(l - 1)) {
      return 1 + getSUCS(s, k - 1, t, l - 1);
    }
    return Integer.min(getSUCS(s, k - 1, t, l), getSUCS(s, k, t, l - 1));
  }
}
