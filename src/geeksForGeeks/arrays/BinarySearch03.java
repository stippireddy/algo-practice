/**
 * Created by Sarveswara Tippireddy on Jul 1, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
package geeksForGeeks.arrays;

import java.util.Scanner;

public class BinarySearch03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n-- > 0) {
      int[] input = new int[sc.nextInt()];
      for (int i = 0; i < input.length; i++) {
        input[i] = sc.nextInt();
      }
      System.out.println(findElementInRotatedArray(input, sc.nextInt()));
    }
    sc.close();
  }

  public static int findElementInRotatedArray(int[] a, int key) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == key) {
        return mid;
      }
      if (a[left] < a[mid]) {
        if (a[left] <= key && key <= a[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (a[mid] <= key && key <= a[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}
