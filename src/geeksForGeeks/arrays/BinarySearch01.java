/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-first-last-occurrences-element-sorted-array/
 */
package geeksForGeeks.arrays;

import java.util.Scanner;

public class BinarySearch01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      int key = sc.nextInt();
      int[] r = findFirstAndLastIndices(input, key);
      if (r[0] == -1) {
        System.out.println(r[0]);
      } else {
        System.out.println(r[0] + " " + r[1]);
      }
    }
    sc.close();
  }

  public static int[] findFirstAndLastIndices(int[] a, int key) {
    int left = 0, right = a.length - 1;
    int rightIndex = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if ((mid == a.length - 1 || a[mid + 1] > a[mid]) && a[mid] == key) {
        rightIndex = mid;
        break;
      } else if (a[mid] > key) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    left = 0;
    right = a.length - 1;
    int leftIndex = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if ((mid == 0 || a[mid - 1] < a[mid]) && a[mid] == key) {
        leftIndex = mid;
        break;
      } else if (a[mid] < key) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return new int[]{leftIndex, rightIndex};
  }
}
