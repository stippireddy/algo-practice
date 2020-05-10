package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode143Test {

  @Test
  public void reorderList() {
    LeetCode143 l = new LeetCode143();
    ListNode input = ListUtils.createList(new int[]{1, 2, 3, 4, 5, 6});
    l.reorderList(input);
    assertEquals(ListUtils.listToArray(input), new int[]{1, 6, 2, 5, 3, 4});
    input = ListUtils.createList(new int[]{1, 2, 3, 4, 5});
    l.reorderList(input);
    assertEquals(ListUtils.listToArray(input), new int[]{1, 5, 2, 4, 3});
    input = ListUtils.createList(new int[]{1});
    l.reorderList(input);
    assertEquals(ListUtils.listToArray(input), new int[]{1});
    input = ListUtils.createList(new int[]{1, 2});
    l.reorderList(input);
    assertEquals(ListUtils.listToArray(input), new int[]{1, 2});
    input = ListUtils.createList(new int[]{});
    l.reorderList(input);
    assertEquals(ListUtils.listToArray(input), new int[]{});
  }
}
