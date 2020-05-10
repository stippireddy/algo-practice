/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/check-for-majority-element-in-a-sorted-array/
 */
package geeksForGeeks.arrays;

public class Arrays021 {

  public boolean isXTheMajorityElement(int[] a, int x) {
    if (a[a.length / 2] != x) {
      return false;
    }
    int firstIndex = getFirstIndex(a, x);
    if (a[firstIndex + a.length / 2] == x) {
      return true;
    }
    return false;
  }

  private int getFirstIndex(int[] a, int x) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == x && (mid == 0 || a[mid - 1] < a[mid])) {
        return mid;
      } else if (a[mid] < x) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
