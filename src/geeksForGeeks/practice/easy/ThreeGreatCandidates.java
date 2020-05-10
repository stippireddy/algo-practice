/**
 * Created by Sarveswara Tippireddy on Jul 30, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/three-great-candidates/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/increasing-subsequence-of-length-three-with-maximum-product/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class ThreeGreatCandidates {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(rotateQuickly(input));
    }
    sc.close();
  }

  private static int rotateQuickly(int[] a) {
    int[] maxLeft = new int[a.length];
    int[] maxRight = new int[a.length];
    maxLeft[0] = -1;
    maxLeft[1] = a[0];
    for (int i = 2; i < a.length; i++) {
      if (a[i - 1] < a[i]) {
        maxLeft[i] = Integer.max(a[i - 1], a[i - 2]);
      } else {

      }
    }
    return 0;
  }
}
