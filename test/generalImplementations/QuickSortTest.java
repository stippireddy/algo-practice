package generalImplementations;

import org.junit.Assert;
import org.testng.annotations.Test;

public class QuickSortTest {

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
    QuickSort.sort(a1);
    Assert.assertArrayEquals(a1, new int[] {});
    QuickSort.sort(a2);
    Assert.assertArrayEquals(a2, new int[] {1});
    QuickSort.sort(a3);
    Assert.assertArrayEquals(a3, new int[] {1, 1, 1});
    QuickSort.sort(a4);
    Assert.assertArrayEquals(a4, new int[] {1, 2, 3, 4});
    QuickSort.sort(a5);
    Assert.assertArrayEquals(a5, new int[] {1, 2, 3, 4});
    QuickSort.sort(a6);
    Assert.assertArrayEquals(a6, new int[] {1, 1, 2, 2, 3, 3, 5, 6});
    QuickSort.sort(a7);
    Assert.assertArrayEquals(a7, new int[] {1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10});
    QuickSort.sort(a8);
    Assert.assertArrayEquals(a8, new int[] {11, 12, 22, 25, 64});
  }
}
