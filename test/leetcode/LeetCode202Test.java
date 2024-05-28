package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode202Test {

  @Test
  public void isHappy() {
    LeetCode202 l = new LeetCode202();
    assertTrue(l.isHappy(1));
    assertTrue(l.isHappy(7));
    assertTrue(l.isHappy(10));
    assertTrue(l.isHappy(13));
    assertTrue(l.isHappy(19));
    assertTrue(l.isHappy(23));
    assertTrue(l.isHappy(91));
    assertTrue(l.isHappy(94));
    assertTrue(l.isHappy(97));
    assertFalse(l.isHappy(11));
    assertFalse(l.isHappy(12));
    assertFalse(l.isHappy(14));
    assertFalse(l.isHappy(95));
    assertFalse(l.isHappy(96));
  }
}
