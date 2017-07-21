/**
 * Created by Sarveswara Tippireddy on Jul 1, 2017
 *
 * <p>This GeeksForGeeks problem can be found @
 * http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
package geeksForGeeks.arrays;

public class BinarySearch03 {
  public int findElementInRotatedArray(int[] a, int key) {
    int left = 0, right = a.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (a[mid] == key) {
        return mid;
      }
      if (a[left] <= a[mid]) {
        if (key >= a[left] && key < a[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (key > a[mid] && key <= a[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    if (a[left] == key) return left;
    else return -1;
  }
}
