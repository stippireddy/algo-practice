package generalImplementations;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HeapSortTest {

  @Test
  public void sort() {
    int[] a1 = {};
    int[] a2 = {1};
    int[] a3 = {1, 1, 1};
    int[] a4 = {1, 2, 3, 4};
    int[] a5 = {4, 3, 2, 1};
    int[] a6 = {1, 3, 2, 1, 3, 2, 5, 6};
    int[] a7 = {6, 6, 7, 8, 6, 9, 3, 2, 1, 1, 4, 6, 5, 10};
    int[] a8 = {64, 25, 12, 22, 11};
    HeapSort.sort(a1);
    Assert.assertArrayEquals(a1, new int[]{});
    HeapSort.sort(a2);
    Assert.assertArrayEquals(a2, new int[]{1});
    HeapSort.sort(a3);
    Assert.assertArrayEquals(a3, new int[]{1, 1, 1});
    HeapSort.sort(a4);
    Assert.assertArrayEquals(a4, new int[]{1, 2, 3, 4});
    HeapSort.sort(a5);
    Assert.assertArrayEquals(a5, new int[]{1, 2, 3, 4});
    HeapSort.sort(a6);
    Assert.assertArrayEquals(a6, new int[]{1, 1, 2, 2, 3, 3, 5, 6});
    HeapSort.sort(a7);
    Assert.assertArrayEquals(a7, new int[]{1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10});
    HeapSort.sort(a8);
    Assert.assertArrayEquals(a8, new int[]{11, 12, 22, 25, 64});
  }

  @Test
  public void reverseSort() {
    int[] a1 = {};
    int[] a2 = {1};
    int[] a3 = {1, 1, 1};
    int[] a4 = {1, 2, 3, 4};
    int[] a5 = {4, 3, 2, 1};
    int[] a6 = {1, 3, 2, 1, 3, 2, 5, 6};
    int[] a7 = {6, 6, 7, 8, 6, 9, 3, 2, 1, 1, 4, 6, 5, 10};
    int[] a8 = {64, 25, 12, 22, 11};
    HeapSort.reverseSort(a1);
    Assert.assertArrayEquals(a1, new int[]{});
    HeapSort.reverseSort(a2);
    Assert.assertArrayEquals(a2, new int[]{1});
    HeapSort.reverseSort(a3);
    Assert.assertArrayEquals(a3, new int[]{1, 1, 1});
    HeapSort.reverseSort(a4);
    Assert.assertArrayEquals(a4, new int[]{4, 3, 2, 1});
    HeapSort.reverseSort(a5);
    Assert.assertArrayEquals(a5, new int[]{4, 3, 2, 1});
    HeapSort.reverseSort(a6);
    Assert.assertArrayEquals(a6, new int[]{6, 5, 3, 3, 2, 2, 1, 1});
    HeapSort.reverseSort(a7);
    Assert.assertArrayEquals(a7, new int[]{10, 9, 8, 7, 6, 6, 6, 6, 5, 4, 3, 2, 1, 1});
    HeapSort.reverseSort(a8);
    Assert.assertArrayEquals(a8, new int[]{64, 25, 22, 12, 11});
  }
}
