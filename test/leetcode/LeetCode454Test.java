package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode454Test {

  @Test
  public void fourSumCount() {
    LeetCode454 l = new LeetCode454();
    assertEquals(l.fourSumCount(new int[]{-1, 1, 1, 1, -1}, new int[]{0, -1, -1, 0, 1},
        new int[]{-1, -1, 1, -1, -1}, new int[]{0, 1, 0, -1, -1}), 132);
    assertEquals(
        l.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}),
        2);
    assertEquals(l.fourSumCount(new int[]{}, new int[]{}, new int[]{}, new int[]{}), 0);
  }
}
