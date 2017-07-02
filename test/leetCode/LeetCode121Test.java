package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode121Test {

  @Test
  public void maxProfit() {
    LeetCode121 l = new LeetCode121();
    assertEquals(5, l.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    assertEquals(0, l.maxProfit(new int[] {7, 6, 4, 3, 1}));
    //Testing for the invalid case where no transaction is possible
    //since the stock can't be bought and sold on the same day.
    assertEquals(0, l.maxProfit(new int[] {7}));
    assertEquals(0, l.maxProfit(new int[] {}));
    assertEquals(1, l.maxProfit(new int[] {7, 8}));
  }
}
