package geeksForGeeks;

import java.util.Arrays;

/*
 * This problem can be found @
 * http://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers/
 *
 * Given an array of positive and negative numbers, arrange them such that all
 * negative integers appear before all the positive integers in the array
 * without using any additional data structure like hash table, arrays, etc.
 * The input order should be maintained.
 *
 * input = { 1, -1, 3, 2, -7, -5, 11, 6 }
 * output = {-1, -7, -5, 1, 3, 2, 11, 6}
 *
 * input = {12, 11, -13, -5, 6, -7, 5, -3, -6}
 * output = {-13, -5, -7, -3, -6, 12, 11, 6, 5}
 *
 */

public class RearrangePositiveNegative {

  /*
   * The following method provides the naive solution that uses O(n) space,
   * but solves the problem in O(n) time too!
   */

  public static void main(String[] args) {
    int[] input = {1, -1, 3, 2, -7, -5, 11, 6};
    RearrangePositiveNegative driver = new RearrangePositiveNegative();
    System.out.println(Arrays.toString(input));
    driver.rearrangeWithConstSpaceMergeSort(input, 0, input.length - 1);
    System.out.println(Arrays.toString(input));
    driver.rearrangeWithModifiedMergeSort(input, 0, input.length - 1);
    System.out.println(Arrays.toString(input));

    input = new int[]{12, 11, -13, -5, 6, -7, 5, -3, -6};
    System.out.println(Arrays.toString(input));
    driver.rearrangeWithConstSpaceMergeSort(input, 0, input.length - 1);
    System.out.println(Arrays.toString(input));
    driver.rearrangeWithModifiedMergeSort(input, 0, input.length - 1);
    System.out.println(Arrays.toString(input));
  }

  /*
   * The following method uses a modified version of insertion sort to solve
   * the problem in O(1) space. But, the worst case running time is O(n^2).
   */

  public void extraSpace(int[] a) {
    int[] temp = new int[a.length];
    int p = 0;
    for (int i : a) {
      if (i > 0) {
        temp[p++] = i;
      }
    }
    for (int i : a) {
      if (i < 0) {
        temp[p++] = i;
      }
    }
    for (int i = 0; i < temp.length; i++) {
      a[i] = temp[i];
    }
  }

  /*
   * The following method uses a modified version of merge sort to solve the
   * problem in O(n) space. But, the worst case running time is O(nlgn).
   */

  public void constSpaceWithInsertionSort(int[] a) {
    int lastNeg = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] < 0) {
        for (int j = i; j > lastNeg; j--) {
          swap(a, j, j - 1);
        }
        lastNeg++;
      }
    }
  }

  public void rearrangeWithModifiedMergeSort(int[] a, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      rearrangeWithModifiedMergeSort(a, low, mid);
      rearrangeWithModifiedMergeSort(a, mid + 1, high);
      modifiedMerge(a, low, mid, high);
    }
  }

  private void modifiedMerge(int[] a, int p, int q, int r) {
    int[] left = new int[q - p + 1];
    int[] right = new int[r - q];
    System.arraycopy(a, p, left, 0, left.length);
    System.arraycopy(a, q + 1, right, 0, right.length);
    int i = 0, j = 0, k = p;
    while (i < left.length && j < right.length) {
      if (left[i] < 0) {
        a[k++] = left[i++];
      } else if (right[j] < 0) {
        a[k++] = right[j++];
      } else {
        a[k++] = left[i++];
      }
    }
    while (i < left.length) {
      a[k++] = left[i++];
    }
    while (j < right.length) {
      a[k++] = right[j++];
    }
  }

  /*
   * The following method uses a modified version of merge sort to solve the
   * problem in O(1) space. The worst case running time is O(nlgn).
   */

  private void swap(int[] input, int i, int j) {
    int temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }

  public void rearrangeWithConstSpaceMergeSort(int[] a, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      rearrangeWithConstSpaceMergeSort(a, low, mid);
      rearrangeWithConstSpaceMergeSort(a, mid + 1, high);
      optimizedMerge(a, low, mid, high);
    }
  }

  private void optimizedMerge(int[] a, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    while (i <= mid && a[i] < 0) {
      i++;
    }
    while (j <= high && a[j] < 0) {
      j++;
    }
    reverse(a, i, mid);
    reverse(a, mid + 1, j - 1);
    reverse(a, i, j - 1);
  }

  private void reverse(int[] a, int low, int high) {
    int i = low, j = high;
    while (i < j) {
      swap(a, i++, j--);
    }

  }
}
