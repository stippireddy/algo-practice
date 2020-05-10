/**
 * Created by Sarveswara Tippireddy on Jul 27, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
 *
 * <p>The solution editorial can be found @
 * http://www.geeksforgeeks.org/find-triplets-array-whose-sum-equal-zero/
 */
package geeksForGeeks.practice.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FindTripletsWithZeroSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findTriplets(input, k) ? 1 : 0);
    }
    sc.close();
  }

  public static boolean findTriplets(int a[], int n) {
    Arrays.sort(a);
    for (int i = 0; i < n; i++) {
      int k = -a[i];
      int left = i + 1, right = n - 1;
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
