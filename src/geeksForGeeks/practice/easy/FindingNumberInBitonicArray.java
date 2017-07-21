/**
 * Created by Sarveswara Tippireddy on Jul 11, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://practice.geeksforgeeks.org/problems/finding-number/0
 *
 * <p>The solution editorials can be found @
 * http://www.geeksforgeeks.org/find-the-maximum-element-in-an-array-which-is-first-increasing-and-then-decreasing/
 * http://www.geeksforgeeks.org/find-bitonic-point-given-bitonic-sequence/
 * http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
package geeksForGeeks.practice.easy;

import java.util.Scanner;

public class FindingNumberInBitonicArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int k = sc.nextInt();
      int[] input = new int[k];
      int key = sc.nextInt();
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      int res = find(input, key);
      if (res != -1) {
        System.out.println(res);
      } else {
        System.out.println("OOPS! NOT FOUND");
      }
    }
    sc.close();
  }

  public static int find(int[] a, int x) {
    int i = findBitonicPoint(a);
    int res = binarySearch(a, 0, i, x);
    if (res == -1) {
      res = reverseBinarySearch(a, i + 1, a.length - 1, x);
    }
    return res;
  }

  private static int reverseBinarySearch(int[] a, int i, int j, int x) {
    if (i <= j) {
      int mid = i + (j - i) / 2;
      if (a[mid] == x) {
        return mid;
      } else if (a[mid] < x) {
        return reverseBinarySearch(a, i, mid - 1, x);
      } else {
        return reverseBinarySearch(a, mid + 1, j, x);
      }
    }
    return -1;
  }

  private static int binarySearch(int[] a, int i, int j, int x) {
    if (i <= j) {
      int mid = i + (j - i) / 2;
      if (a[mid] == x) {
        return mid;
      } else if (a[mid] < x) {
        return binarySearch(a, mid + 1, j, x);
      } else {
        return binarySearch(a, i, mid - 1, x);
      }
    }
    return -1;
  }

  private static int findBitonicPoint(int[] a) {
    int low = 0, high = a.length - 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (a[high] < a[mid]) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
}
