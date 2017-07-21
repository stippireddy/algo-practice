/**
 * Created by Sarveswara Tippireddy on Jul 20, 2017
 *
 * <p>This is a GeeksForGeeks problem. The problem statement can be found @
 * http://practice.geeksforgeeks.org/problems/index-of-first-1-in-a-sorted-array-of-0s-and-1s/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/find-index-first-1-sorted-array-0s-1s/
 */
package geeksForGeeks.practice.basic;

import java.util.Scanner;

public class IndexOfFirstOneInSortedArrayOfOnesAndTwos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      for (int i = 0; i < k; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findIndexOfFirstOne(input));
    }
    sc.close();
  }

  public static int findIndexOfFirstOne(int[] input) {
    int left = 0, right = input.length - 1;
    while (left <= right) {
      if (input[left] == 1) {
        return left;
      }
      int mid = left + (right - left) / 2;
      if (input[mid] == 1) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}
