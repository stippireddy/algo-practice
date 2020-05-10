/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
 */
package geeksForGeeks.arrays;

public class Arrays098 {

  public int findMinimumInRotatedArray(int[] a) {
    int start = 0, end = a.length - 1;
    while (start < end) {
      if (a[start] < a[end]) {
        return start;
      }
      int mid = start + (end - start) / 2;
      if (a[mid] >= a[start]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }

  public int findMaximumInRotatedArray(int[] a) {
    int start = 0, end = a.length - 1;
    while (start < end) {
      if (a[start] < a[end]) {
        return end;
      }
      int mid = start + (end - start) / 2;
      if (a[mid] > a[start]) {
        start = mid;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }
}
