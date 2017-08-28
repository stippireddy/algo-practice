package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode019Test {

  @Test
  public void removeNthFromEndTwoPasses() {
    LeetCode019 l = new LeetCode019();
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndTwoPasses(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 2)),
        new int[] {1, 2, 3, 5});
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndTwoPasses(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 5)),
        new int[] {2, 3, 4, 5});
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndTwoPasses(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 5)),
        new int[] {2, 3, 4, 5});
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndTwoPasses(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 6)),
        new int[] {2, 3, 4, 5});
    assertEquals(
        ListUtils.listToArray(l.removeNthFromEndTwoPasses(ListUtils.createList(new int[] {1}), 1)),
        new int[] {});
  }

  @Test
  public void removeNthFromEndSinglePass() {
    LeetCode019 l = new LeetCode019();
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndSinglePass(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 2)),
        new int[] {1, 2, 3, 5});
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndSinglePass(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 5)),
        new int[] {2, 3, 4, 5});
    assertEquals(
        ListUtils.listToArray(
            l.removeNthFromEndSinglePass(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 5)),
        new int[] {2, 3, 4, 5});
    assertEquals(
        ListUtils.listToArray(l.removeNthFromEndSinglePass(ListUtils.createList(new int[] {1}), 1)),
        new int[] {});
  }
}
