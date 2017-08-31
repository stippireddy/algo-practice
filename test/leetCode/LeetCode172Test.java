package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode172Test {

  @Test
  public void trailingZeroes() {
    LeetCode172 l = new LeetCode172();
    assertEquals(l.trailingZeroes(10), 2);
    assertEquals(l.trailingZeroes(9), 1);
    assertEquals(l.trailingZeroes(20), 4);
  }
}
