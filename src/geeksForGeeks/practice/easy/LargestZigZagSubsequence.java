/**
 * Created by Sarveswara Tippireddy on Jul 24, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/largest-zigzag-sequence/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/largest-sum-zig-zag-sequence-in-a-matrix/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class LargestZigZagSubsequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[][] input = new int[k][k];
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < k; j++) {
          input[i][j] = sc.nextInt();
        }
      }
      System.out.println(getLZS(input, k));
    }
    sc.close();
  }

  public static int getLZS(int[][] a, int n) {
    int[][] lzs = new int[n][n];
    for (int j = 0; j < n; j++) {
      lzs[0][j] = a[0][j];
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n; j++) {
        lzs[i][j] = a[i][j];
        for (int k = 0; k < n; k++) {
          if (k != j) {
            lzs[i][j] = Integer.max(lzs[i][j], a[i][j] + lzs[i - 1][k]);
          }
        }
      }
    }
    int res = lzs[n - 1][0];
    for (int j = 1; j < n; j++) {
      res = Integer.max(res, lzs[n - 1][j]);
    }
    return res;
  }
}
