/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/quick-left-rotation/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/increasing-subsequence-of-length-three-with-maximum-product/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class QuickLeftRotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(rotateQuickly(input, n, k));
    }
    sc.close();
  }

  private static String rotateQuickly(int[] input, int n, int k) {
    int[] temp = new int[n * 2];
    for (int i = 0; i < n; i++) {
      temp[i] = input[i];
      temp[i + n] = input[i];
    }
    StringBuffer result = new StringBuffer();
    for (int i = k % n; i < (k % n) + n; i++) {
      result.append(temp[i]).append(" ");
    }
    return result.substring(0, result.length() - 1);
  }
}
