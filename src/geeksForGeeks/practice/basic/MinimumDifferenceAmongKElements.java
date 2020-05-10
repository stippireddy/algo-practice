/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/minimum-difference-among-k/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/k-numbers-difference-maximum-minimum-k-number-minimized/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferenceAmongKElements {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sizeOfInput = sc.nextInt();
    while (sizeOfInput-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getMinDiff(input, k));
    }
    sc.close();
  }

  private static int getMinDiff(int[] a, int k) {
    Arrays.sort(a);
    int min = Integer.MAX_VALUE;
    for (int i = k - 1; i < a.length; i++) {
      min = Integer.min(min, a[i] - a[i - k + 1]);
    }
    return min;
  }
}
