/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/friendly-array/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/sum-minimum-absolute-difference-array-element/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FriendlyArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(getFriendliness(input));
    }
    sc.close();
  }

  private static int getFriendliness(int[] a) {
    int friendliness = 0;
    Arrays.sort(a);
    friendliness += a[1] - a[0] + a[a.length - 1] - a[a.length - 2];
    for (int i = 1; i < a.length - 1; i++) {
      friendliness += Integer.min(a[i] - a[i - 1], a[i + 1] - a[i]);
    }
    return friendliness;
  }
}
