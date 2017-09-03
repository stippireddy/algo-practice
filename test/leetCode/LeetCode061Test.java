package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode061Test {

  @Test
  public void rotateRight() {
    LeetCode061 l = new LeetCode061();
    assertEquals(
        ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {1, 2}), 2)),
        new int[] {1, 2});
    assertEquals(
        ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {1, 2, 3, 4, 5}), 2)),
        new int[] {4, 5, 1, 2, 3});
    assertEquals(ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {}), 0)),
        new int[] {});
    assertEquals(ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {1}), 5)),
        new int[] {1});
    assertEquals(ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {1}), 6)),
        new int[] {1});
    assertEquals(
        ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {1, 2, 3, 4}), 0)),
        new int[] {1, 2, 3, 4});
    assertEquals(
        ListUtils.listToArray(l.rotateRight(ListUtils.createList(new int[] {1, 2, 3, 4}), 6)),
        new int[] {3, 4, 1, 2});
  }
}
