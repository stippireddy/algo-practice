package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode122Test {

  @Test
  public void maxProfit() {
    LeetCode122 l = new LeetCode122();
    assertEquals(l.maxProfit(new int[]{5, 6, 2, 4, 8, 9, 5, 1, 5}), 12);
    assertEquals(l.maxProfit(new int[]{5, 6, 2, 4, 8, 5, 9, 1, 5}), 15);
    assertEquals(l.maxProfit(new int[]{5, 2, 6, 4, 8, 5, 9, 1, 5}), 16);
    assertEquals(l.maxProfit(new int[]{5, 4, 2, 1}), 0);
    assertEquals(l.maxProfit(new int[]{}), 0);
    assertEquals(l.maxProfit(new int[]{2, 2, 5}), 3);
  }
}
