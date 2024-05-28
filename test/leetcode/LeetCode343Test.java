package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode343Test {

  @Test
  public void integerBreak() {
    LeetCode343 l = new LeetCode343();
    assertEquals(l.integerBreak(2), 1);
    assertEquals(l.integerBreak(3), 2);
    assertEquals(l.integerBreak(5), 6);
    assertEquals(l.integerBreak(10), 36);
    assertEquals(l.integerBreak(8), 18);
    assertEquals(l.integerBreak(58), 1549681956);
  }

  @Test
  public void integerBreakDP() {
    LeetCode343 l = new LeetCode343();
    assertEquals(l.integerBreakDP(2), 1);
    assertEquals(l.integerBreakDP(3), 2);
    assertEquals(l.integerBreakDP(5), 6);
    assertEquals(l.integerBreakDP(10), 36);
    assertEquals(l.integerBreakDP(8), 18);
    assertEquals(l.integerBreakDP(58), 1549681956);
  }

  @Test
  public void integerBreakMyFirstIntuition() {
    LeetCode343 l = new LeetCode343();
    assertEquals(l.integerBreakMyFirstIntuition(2), 1);
    assertEquals(l.integerBreakMyFirstIntuition(3), 2);
    assertEquals(l.integerBreakMyFirstIntuition(5), 6);
    assertEquals(l.integerBreakMyFirstIntuition(10), 36);
    assertEquals(l.integerBreakMyFirstIntuition(8), 18);
    assertEquals(l.integerBreakMyFirstIntuition(58), 1549681956);
  }
}
