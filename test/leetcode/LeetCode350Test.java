package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode350Test {

  @Test
  public void intersect() {
    LeetCode350 l = new LeetCode350();
    assertEquals(
        new int[]{1, 2, 3}, l.intersect(new int[]{1, 2, 3, 1, 2, 3}, new int[]{3, 2, 1}));
    assertEquals(new int[]{}, l.intersect(new int[]{}, new int[]{}));
    assertEquals(new int[]{}, l.intersect(new int[]{1}, new int[]{}));
  }
}
