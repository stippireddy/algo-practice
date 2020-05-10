/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
 */
package geeksForGeeks.arrays;

import java.util.Scanner;

public class BinarySearch02 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      int key = sc.nextInt();
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findCount(input, key));
    }
    sc.close();
  }

  public static int findCount(int[] a, int key) {
    int leftIndex = -1, rightIndex = -1;
    int left = 0, right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == key && (mid == 0 || a[mid - 1] < a[mid])) {
        leftIndex = mid;
        break;
      } else if (a[mid] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    left = 0;
    right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == key && (mid == a.length - 1 || a[mid + 1] > a[mid])) {
        rightIndex = mid;
        break;
      } else if (a[mid] > key) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    if (leftIndex == -1 || rightIndex == -1) {
      return -1;
    } else {
      return rightIndex - leftIndex + 1;
    }
  }
}
