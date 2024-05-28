package leetcode;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class LeetCode092Test {

  @Test
  public void reverseBetween() {
    LeetCode092 l = new LeetCode092();
    assertEquals(
        ListUtils
            .listToArray(l.reverseBetween(ListUtils.createList(new int[]{1, 2, 3, 4, 5}), 2, 4)),
        new int[]{1, 4, 3, 2, 5});
    assertEquals(
        ListUtils
            .listToArray(l.reverseBetween(ListUtils.createList(new int[]{1, 2, 3, 4, 5}), 1, 4)),
        new int[]{4, 3, 2, 1, 5});
    assertEquals(
        ListUtils
            .listToArray(l.reverseBetween(ListUtils.createList(new int[]{1, 2, 3, 4, 5}), 3, 5)),
        new int[]{1, 2, 5, 4, 3});
    assertEquals(
        ListUtils
            .listToArray(l.reverseBetween(ListUtils.createList(new int[]{1, 2, 3, 4, 5}), 4, 4)),
        new int[]{1, 2, 3, 4, 5});
    assertEquals(ListUtils.listToArray(l.reverseBetween(ListUtils.createList(new int[]{1}), 1, 1)),
        new int[]{1});
    assertNull(l.reverseBetween(null, 0, 0));
  }
}