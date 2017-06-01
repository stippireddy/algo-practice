package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode160Test {

  @Test
  public void getIntersectionNode() {
    LeetCode160 l = new LeetCode160();
    Assert.assertEquals(
        l.getIntersectionNode(
                ListNode.createList(new int[] {1, 2, 3, 4, 5, 6}),
                ListNode.createList(new int[] {9, 10, 5, 6}))
            .val,
        5);
    Assert.assertNull(
        l.getIntersectionNode(ListNode.createList(new int[] {1, 2, 3, 4, 5, 6}), null));
    Assert.assertNull(
        l.getIntersectionNode(
            ListNode.createList(new int[] {1, 2, 3, 4, 5, 6}),
            ListNode.createList(new int[] {7, 8, 9, 10, 11, 12, 13})));
    Assert.assertNull(null, null);
  }
}
