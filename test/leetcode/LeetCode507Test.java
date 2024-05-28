package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode507Test {

  @Test
  public void checkPerfectNumber() {
    LeetCode507 l = new LeetCode507();
    assertTrue(l.checkPerfectNumber(28));
    assertFalse(l.checkPerfectNumber(-28));
    assertFalse(l.checkPerfectNumber(1));
    assertFalse(l.checkPerfectNumber(-1));
  }
}
