/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/maximum-and-minimum-of-array-elements/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
package geeksForGeeks.practice.basic;
  
import java.util.Scanner;

public class MaximumAndMinimumOfArrayElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(printString(getMaxAndMin(input, k)));
    }
    sc.close();
  }

  private static int[] getMaxAndMin(int[] a, int k) {
    int max;
    int min;
    int i;
    if ((k & 1) != 0) {
      max = a[0];
      min = a[0];
      i = 1;
    } else {
      if (a[0] > a[1]) {
        max = a[0];
        min = a[1];
      } else {
        max = a[1];
        min = a[0];
      }
      i = 2;
    }
    for (; i < a.length; i += 2) {
      if (a[i] > a[i + 1]) {
        max = Integer.max(max, a[i]);
        min = Integer.min(min, a[i + 1]);
      } else {
        max = Integer.max(max, a[i + 1]);
        min = Integer.min(min, a[i]);
      }
    }
    return new int[] {max, min};
  }

  private static String printString(int[] input) {
    StringBuffer sb = new StringBuffer();
    for (int i : input) {
      sb.append(i).append(" ");
    }
    return sb.substring(0, sb.length() - 1);
  }
}
