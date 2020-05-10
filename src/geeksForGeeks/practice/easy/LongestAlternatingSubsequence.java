/**
 * Created by Sarveswara Tippireddy on Jul 23, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/longest-alternating-subsequence/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/longest-alternating-subsequence/ http://www.geeksforgeeks.org/longest-zig-zag-subsequence/
 */
package geeksForGeeks.practice.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LongestAlternatingSubsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getLZS(input));
    }
    sc.close();
  }

  public static int getLZS(int[] a) {
    int[][] lzs = new int[2][a.length];
    Arrays.fill(lzs[0], 1);
    Arrays.fill(lzs[1], 1);
    int res = 0;
    for (int i = 1; i < lzs[0].length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (a[i] > a[j] && lzs[1][j] + 1 > lzs[0][i]) {
          lzs[0][i] = lzs[1][j] + 1;
        }
        if (a[i] < a[j] && lzs[0][j] + 1 > lzs[1][i]) {
          lzs[1][i] = lzs[0][j] + 1;
        }
        res = Integer.max(lzs[0][i], lzs[1][i]);
      }
    }
    return res;
  }
}
