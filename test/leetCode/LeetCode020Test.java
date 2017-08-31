package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode020Test {

  @Test
  public void isValid() {
    LeetCode020 l = new LeetCode020();
    assertTrue(l.isValid("(){}[{()}]"));
    assertTrue(l.isValid(""));
    assertFalse(l.isValid("(){}{()}]"));
  }
}
