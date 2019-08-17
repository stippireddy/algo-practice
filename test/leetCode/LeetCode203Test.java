package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode203Test {

  @Test
  public void removeElements() {
    LeetCode203 l = new LeetCode203();
    Assert.assertEquals(
            l.removeElements(ListUtils.createList(new int[]{1, 2, 6, 3, 4, 5, 6}), 6),
            ListUtils.createList(new int[]{1, 2, 3, 4, 5}));
    Assert.assertEquals(l.removeElements(ListUtils.createList(new int[]{6, 6}), 6), null);
    Assert.assertEquals(
            l.removeElements(ListUtils.createList(new int[]{6, 1, 6, 6, 6}), 6),
            ListUtils.createList(new int[]{1}));
  }
  
  @Test
  public void removeElementsRecursive() {
    LeetCode203 l = new LeetCode203();
    Assert.assertEquals(
            l.removeElementsRecursive(ListUtils.createList(new int[]{1, 2, 6, 3, 4, 5, 6}), 6),
            ListUtils.createList(new int[]{1, 2, 3, 4, 5}));
    Assert.assertEquals(l.removeElementsRecursive(ListUtils.createList(new int[]{6, 6}), 6), null);
    Assert.assertEquals(
            l.removeElementsRecursive(ListUtils.createList(new int[]{6, 1, 6, 6, 6}), 6),
            ListUtils.createList(new int[]{1}));
  }
}
