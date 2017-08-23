/** Created by Sarveswara Tippireddy on Jul 4, 2017 */
package generalImplementations;

public class QuickSort {
  public static void sort(int[] a) {
    if (a.length < 2) {
      return;
    }
    sortHelper(a, 0, a.length - 1);
  }

  private static void sortHelper(int[] a, int left, int right) {
    if (left < right) {
      int partitionIndex = partition(a, left, right);
      sortHelper(a, left, partitionIndex - 1);
      sortHelper(a, partitionIndex, right);
    }
  }

  private static int partition(int[] a, int left, int right) {
    int l = left;
    int r = right - 1;
    int x = a[right];
    while (l <= r) {
      if (a[l] > x) {
        int temp = a[r];
        a[r] = a[l];
        a[l] = temp;
        r--;
      } else {
        l++;
      }
    }
    a[right] = a[l];
    a[l] = x;
    return l;
  }
}
