/**
 * Created by Sarveswara Tippireddy on Jul 12, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-a-pair-swapping-which-makes-sum-of-two-arrays-same/
 */
package geeksForGeeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsToMakeArraySumEqual {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] a = new int[sc.nextInt()];
      int[] b = new int[sc.nextInt()];
      int sumA = 0;
      int sumB = 0;
      for (int i = 0; i < a.length; i++) {
        int temp = sc.nextInt();
        a[i] = temp;
        sumA += temp;
      }
      for (int i = 0; i < b.length; i++) {
        int temp = sc.nextInt();
        b[i] = temp;
        sumB += temp;
      }
      System.out.println(pairExists(a, b, sumA, sumB));
    }
    sc.close();
  }

  private static int pairExists(int[] a, int[] b, int sumA, int sumB) {
    if (sumA > sumB) {
      return helper(a, b, sumA, sumB);
    } else {
      return helper(b, a, sumB, sumA);
    }
  }

  private static int helper(int[] a, int[] b, int sumA, int sumB) {
    int diff = 0;
    if ((sumA - sumB) % 2 != 0) {
      return -1;
    } else {
      diff = (sumA - sumB) / 2;
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int i = 0, j = 0;
    while (i < a.length && j < b.length) {
      if (a[i] - b[j] == diff) {
        return 1;
      } else if (a[i] - b[j] > diff) {
        j++;
      } else {
        i++;
      }
    }
    return -1;
  }
}
