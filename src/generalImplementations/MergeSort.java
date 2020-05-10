/**
 * Created by Sarveswara Tippireddy on Jul 3, 2017
 */
package generalImplementations;

public class MergeSort {

  public static void sort(int[] a) {
    if (a.length < 2) {
      return;
    }
    mergeSortHelper(a, 0, a.length - 1);
  }

  private static void mergeSortHelper(int[] a, int i, int j) {
    if (i >= j) {
      return;
    }
    int mid = i + (j - i) / 2;
    mergeSortHelper(a, i, mid);
    mergeSortHelper(a, mid + 1, j);
    merge(a, i, mid, j);
  }

  private static void merge(int[] a, int i, int mid, int j) {
    int[] b = new int[j - i + 1];
    int leftMinIndex = i;
    int rightMinIndex = mid + 1;
    int k = 0;
    while (leftMinIndex <= mid && rightMinIndex <= j) {
      if (a[leftMinIndex] < a[rightMinIndex]) {
        b[k] = a[leftMinIndex];
        leftMinIndex++;
      } else {
        b[k] = a[rightMinIndex];
        rightMinIndex++;
      }
      k++;
    }
    while (k < b.length && leftMinIndex <= mid) {
      b[k] = a[leftMinIndex];
      leftMinIndex++;
      k++;
    }
    while (k < b.length && rightMinIndex <= j) {
      b[k] = a[rightMinIndex];
      rightMinIndex++;
      k++;
    }
    for (int l = 0; l < b.length; l++) {
      a[l + i] = b[l];
    }
  }

  // TODO revisit this in the future
  // Idea is to use a window that doubles each time and merges
  public static void iterativeSort(int[] a) {
    int w = 1;
    for (; w <= a.length / 2; w *= 2) {
      int i = 0;
      for (; i + 2 * w < a.length; i += 2 * w) {
        merge(a, i, i + w - 1, i + 2 * w - 1);
      }
      merge(a, i, i + w - 1, a.length - 1);
    }
    // TODO Understand why both the above and below statements are
    // necessary
    merge(a, 0, w - 1, a.length - 1);
  }
}
