package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode083Test {

  @Test
  public void deleteDuplicates() {
    LeetCode083 l = new LeetCode083();
    assertEquals(
        ListUtils.listToArray(l.deleteDuplicates(ListUtils.createList(new int[]{}))),
        new int[]{});
    assertEquals(
        ListUtils.listToArray(l.deleteDuplicates(ListUtils.createList(new int[]{1}))),
        new int[]{1});
    assertEquals(
        ListUtils.listToArray(l.deleteDuplicates(ListUtils.createList(new int[]{1, 2}))),
        new int[]{1, 2});
    assertEquals(
        ListUtils.listToArray(
            l.deleteDuplicates(
                ListUtils.createList(new int[]{1, 2, 3, 3, 4, 4, 5, 6, 7, 7, 7, 8}))),
        new int[]{1, 2, 3, 4, 5, 6, 7, 8});
  }
}
