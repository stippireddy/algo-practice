/**
 * Created by Sarveswara Tippireddy on Aug 2, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-subarray-with-given-sum/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class SubArrayWithGivenSum {
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
      findSubarray(input, k);
    }
    sc.close();
  }

  private static void findSubarray(int[] a, int k) {
    int left = 0, right = 0, sum = 0;
    while (right < a.length) {
      sum += a[right];
      right++;
      while (sum > k && left < right) {
        sum -= a[left];
        left++;
      }
      if (sum == k) {
        System.out.println(left + 1 + " " + right);
        return;
      }
    }
    if (sum != k) {
      System.out.println(-1);
    }
  }
}
