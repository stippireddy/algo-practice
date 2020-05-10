/**
 * Created by Sarveswara Tippireddy on Jul 4, 2017
 */
package generalImplementations;

public class HeapSort {

  public static void sort(int[] a) {
    createMaxHeap(a);
    int heapSize = a.length;
    while (heapSize > 0) {
      int temp = a[0];
      a[0] = a[heapSize - 1];
      a[heapSize - 1] = temp;
      heapSize--;
      maxHeapify(a, 0, heapSize);
    }
  }

  private static void maxHeapify(int[] a, int i, int heapSize) {
    if (i < heapSize) {
      int largest = a[i];
      int nextHeapifyIndex = -1;
      if (((2 * i) + 1) < heapSize && a[(2 * i) + 1] > largest) {
        largest = a[2 * i + 1];
        nextHeapifyIndex = 2 * i + 1;
      }
      if (((2 * i) + 2) < heapSize && a[(2 * i) + 2] > largest) {
        largest = a[2 * i + 2];
        nextHeapifyIndex = 2 * i + 2;
      }
      if (largest != a[i]) {
        a[nextHeapifyIndex] = a[i];
        a[i] = largest;
        maxHeapify(a, nextHeapifyIndex, heapSize);
      } else {
        return;
      }
    }
  }

  private static void createMaxHeap(int[] a) {
    for (int i = (a.length / 2) - 1; i >= 0; i--) {
      maxHeapify(a, i, a.length);
    }
  }

  public static void reverseSort(int[] a) {
    createMinHeap(a);
    int heapSize = a.length;
    while (heapSize > 0) {
      int temp = a[heapSize - 1];
      a[heapSize - 1] = a[0];
      a[0] = temp;
      heapSize--;
      minHeapify(a, 0, heapSize);
    }
  }

  private static void createMinHeap(int[] a) {
    int i = (a.length / 2) - 1;
    while (i >= 0) {
      minHeapify(a, i, a.length);
      i--;
    }
  }

  private static void minHeapify(int[] a, int i, int heapLength) {
    if (i < heapLength) {
      int smallest = a[i];
      int nextMinHeapifyIndex = -1;
      if (((2 * i) + 1) < heapLength && a[(2 * i) + 1] < smallest) {
        smallest = a[(2 * i) + 1];
        nextMinHeapifyIndex = (2 * i) + 1;
      }
      if (((2 * i) + 2) < heapLength && a[(2 * i) + 2] < smallest) {
        smallest = a[(2 * i) + 2];
        nextMinHeapifyIndex = (2 * i) + 2;
      }
      if (smallest != a[i]) {
        a[nextMinHeapifyIndex] = a[i];
        a[i] = smallest;
        minHeapify(a, nextMinHeapifyIndex, heapLength);
      } else {
        return;
      }
    }
  }
}
