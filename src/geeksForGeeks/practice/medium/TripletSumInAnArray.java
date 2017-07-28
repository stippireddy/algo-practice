/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/triplet-sum-in-array/0
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 */
package geeksForGeeks.practice.medium;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumInAnArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int sum = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findTriplets(input, sum) ? 1 : 0);
    }
    sc.close();
  }

  public static boolean findTriplets(int a[], int sum) {
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++) {
      int k = sum - a[i];
      int left = i + 1, right = a.length - 1;
      while (left < right) {
        if (a[left] + a[right] < k) {
          left++;
        } else if (a[left] + a[right] > k) {
          right--;
        } else {
          return true;
        }
      }
    }
    return false;
  }
}
