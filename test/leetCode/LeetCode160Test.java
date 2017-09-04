package leetCode;

import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode160Test {

  @Test
  public void getIntersectionNode() {
    LeetCode160 l = new LeetCode160();
    assertTrue(l.getIntersectionNode(ListUtils.createList(new int[] {1, 2, 3, 4, 5, 6}),
        ListUtils.createList(new int[] {9, 10, 5, 6})).val == 5);
    assertNull(l.getIntersectionNode(ListUtils.createList(new int[] {1, 2, 3, 4, 5, 6}), null));
    assertNull(l.getIntersectionNode(ListUtils.createList(new int[] {1, 2, 3, 4, 5, 6}),
        ListUtils.createList(new int[] {7, 8, 9, 10, 11, 12, 13})));
    assertNull(null, null);
  }
}
