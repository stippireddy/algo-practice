package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode593Test {

  @Test
  public void validSquare() {
    LeetCode593 l = new LeetCode593();
    assertTrue(
        l.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}));
    assertFalse(
        l.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 0}));
  }
}
