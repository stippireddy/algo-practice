package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode326Test {

  @Test
  public void isPowerOfThree() {
    LeetCode326 l = new LeetCode326();
    assertTrue(l.isPowerOfThree(1));
    assertTrue(l.isPowerOfThree(3));
    assertTrue(l.isPowerOfThree(9));
    assertTrue(l.isPowerOfThree(27));
    assertTrue(l.isPowerOfThree(81));
    assertTrue(l.isPowerOfThree(243));
    assertFalse(l.isPowerOfThree(2));
    assertFalse(l.isPowerOfThree(8));
    assertFalse(l.isPowerOfThree(25));
    assertFalse(l.isPowerOfThree(84));
    assertFalse(l.isPowerOfThree(241));
    assertFalse(l.isPowerOfThree(0));
    assertFalse(l.isPowerOfThree(-9));
  }
}
