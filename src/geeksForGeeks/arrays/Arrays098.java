/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
 */
package geeksForGeeks.arrays;

public class Arrays098 {
  public int findMinimumInRotatedArray(int[] a) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      if (a[left] < a[right]) {
        return left;
      }
      int mid = left + (right - left) / 2;
      if (left == right) {
        return left;
      }
      if (mid > left && a[mid - 1] > a[mid]) {
        return mid;
      }
      if (mid < right && a[mid + 1] < a[mid]) {
        return mid + 1;
      }
      if (a[mid] > a[right]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public int findMaximumInRotatedArray(int[] a) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      if (a[left] < a[right]) {
        return right;
      }
      if (left == right) {
        return left;
      }
      int mid = left + (right - left) / 2;
      if (mid < right && a[mid + 1] < a[mid]) {
        return mid;
      }
      if (mid > left && a[mid - 1] > a[mid]) {
        return mid - 1;
      }
      if (a[mid] > a[right]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
