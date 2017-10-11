/**
 * Created by Sarveswara Tippireddy on Jul 25, 2017
 *
 * <p>
 * This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/smallest-positive-missing-number/0
 *
 * <p>
 * The related solution editorial can be found @
 * http://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class SmallestPositiveMissingNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(smallestPositiveMissingNumber(input));
    }
    sc.close();
  }

  private static int smallestPositiveMissingNumber(int[] a) {
    for (int i = 0; i < a.length; i++) {
      while (a[i] > 0 && a[i] <= a.length && a[a[i] - 1] != a[i]) {
        swap(a, i, a[i] - 1);
      }
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] != i + 1) {
        return i + 1;
      }
    }
    return a.length + 1;
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[j];
    a[j] = a[i];
    a[i] = temp;
  }

}
