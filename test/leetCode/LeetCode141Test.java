package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode141Test {

  @Test
  public void hasCycle() {
    LeetCode141 l = new LeetCode141();
    assertFalse(l.hasCycle(ListUtils.createList(new int[] {1, 2, 3, 4, 5, 6})));
    assertFalse(l.hasCycle(ListUtils.createList(new int[] {1})));
    assertFalse(l.hasCycle(ListUtils.createList(new int[] {})));
    ListNode testList = ListUtils.createList(new int[] {1, 2, 3, 4, 5, 6});
    ListNode tail = testList;
    while (tail.next != null) {
      tail = tail.next;
    }
    tail.next = testList;
    assertTrue(l.hasCycle(testList));
  }
}
