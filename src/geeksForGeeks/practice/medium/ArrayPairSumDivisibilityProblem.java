/**
 * Created by Sarveswara Tippireddy on Jul 30, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/
 */
package geeksForGeeks.practice.medium;

import java.util.Scanner;

public class ArrayPairSumDivisibilityProblem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int[] input = new int[n];
      for (int i = 0; i < n; i++) {
        input[i] = sc.nextInt();
      }
      int k = sc.nextInt();
      System.out.println(isDivisible(input, k) ? "True" : "False");
    }
    sc.close();
  }

  private static boolean isDivisible(int[] a, int k) {
    int[] hashMap = new int[k];
    for (int i = 0; i < a.length; i++) {
      if (hashMap[(k - (a[i] % k)) % k] > 0) {
        hashMap[(k - (a[i] % k)) % k]--;
      } else {
        hashMap[a[i] % k]++;
      }
    }
    for (int i = 0; i < k; i++) {
      if (hashMap[i] > 0) {
        return false;
      }
    }
    return true;
  }
}
