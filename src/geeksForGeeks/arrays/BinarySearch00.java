/**
 * Created by Sarveswara Tippireddy on Jun 30, 2017
 *
 * <p>This GeeksForGeeks problem can be found @ http://www.geeksforgeeks.org/binary-search/
 */
package geeksForGeeks.arrays;

public class BinarySearch00 {

  public int recursive(int[] a, int key) {
    return recursiveHelper(a, 0, a.length - 1, key);
  }

  private int recursiveHelper(int a[], int left, int right, int k) {
    if (left > right) {
      return -1;
    }
    int mid = left + (right - left) / 2;
    if (a[mid] < k) {
      return recursiveHelper(a, mid + 1, right, k);
    } else if (a[mid] > k) {
      return recursiveHelper(a, left, mid - 1, k);
    } else {
      return mid;
    }
  }

  public int iterative(int[] a, int k) {
    int left = 0, right = a.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a[mid] > k) {
        right = mid - 1;
      } else if (a[mid] < k) {
        left = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
