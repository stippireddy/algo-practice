/**
 * Created by Sarveswara Tippireddy on Aug 2, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/subarray-range-with-given-sum/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-subarray-with-given-sum-in-array-of-integers/
 */
package geeksForGeeks.practice.easy;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubarraysWithAGivenSum {
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
      findSubarrayEfficiently(input, k);
      findSubarrayBruteForce(input, k);
    }
    sc.close();
  }

  private static void findSubarrayEfficiently(int[] a, int k) {
    int sum = 0;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
      if (sum == k) {
        count++;
      }
      count += map.getOrDefault(sum - k, 0);
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    System.out.println(count);
  }

  private static void findSubarrayBruteForce(int[] a, int k) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      int sum = 0;
      for (int j = i; j < a.length; j++) {
        sum += a[j];
        if (sum == k) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
