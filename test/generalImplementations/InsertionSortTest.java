package generalImplementations;

import static org.testng.Assert.assertEquals;

import leetcode.ListNode;
import leetcode.ListUtils;
import org.testng.annotations.Test;

public class InsertionSortTest {

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
    InsertionSort.sort(a1);
    assertEquals(a1, new int[]{});
    InsertionSort.sort(a2);
    assertEquals(a2, new int[]{1});
    InsertionSort.sort(a3);
    assertEquals(a3, new int[]{1, 1, 1});
    InsertionSort.sort(a4);
    assertEquals(a4, new int[]{1, 2, 3, 4});
    InsertionSort.sort(a5);
    assertEquals(a5, new int[]{1, 2, 3, 4});
    InsertionSort.sort(a6);
    assertEquals(a6, new int[]{1, 1, 2, 2, 3, 3, 5, 6});
    InsertionSort.sort(a7);
    assertEquals(a7, new int[]{1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10});
    InsertionSort.sort(a8);
    assertEquals(a8, new int[]{11, 12, 22, 25, 64});
  }

  @Test
  public void sortList() {
    int[] a1 = {};
    int[] a2 = {1};
    int[] a3 = {1, 1, 1};
    int[] a4 = {1, 2, 3, 4};
    int[] a5 = {4, 3, 2, 1};
    int[] a6 = {1, 3, 2, 1, 3, 2, 5, 6};
    int[] a7 = {6, 6, 7, 8, 6, 9, 3, 2, 1, 1, 4, 6, 5, 10};
    int[] a8 = {64, 25, 12, 22, 11};
    ListNode result = InsertionSort.sort(ListUtils.createList(a1));
    assertEquals(ListUtils.listToArray(result), new int[]{});
    result = InsertionSort.sort(ListUtils.createList(a2));
    assertEquals(ListUtils.listToArray(result), new int[]{1});
    result = InsertionSort.sort(ListUtils.createList(a3));
    assertEquals(ListUtils.listToArray(result), new int[]{1, 1, 1});
    result = InsertionSort.sort(ListUtils.createList(a4));
    assertEquals(ListUtils.listToArray(result), new int[]{1, 2, 3, 4});
    result = InsertionSort.sort(ListUtils.createList(a5));
    assertEquals(ListUtils.listToArray(result), new int[]{1, 2, 3, 4});
    result = InsertionSort.sort(ListUtils.createList(a6));
    assertEquals(ListUtils.listToArray(result), new int[]{1, 1, 2, 2, 3, 3, 5, 6});
    result = InsertionSort.sort(ListUtils.createList(a7));
    assertEquals(
        ListUtils.listToArray(result), new int[]{1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10});
    result = InsertionSort.sort(ListUtils.createList(a8));
    assertEquals(ListUtils.listToArray(result), new int[]{11, 12, 22, 25, 64});
  }
}
