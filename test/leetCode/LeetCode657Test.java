package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode657Test {

  @Test
  public void judgeCircle() {
    LeetCode657 l = new LeetCode657();
    assertTrue(l.judgeCircle("UD"));
    assertTrue(l.judgeCircle("UDDDUULLLRRR"));
    assertFalse(l.judgeCircle("LL"));
    assertFalse(l.judgeCircle("L"));
    assertFalse(l.judgeCircle("R"));
    assertFalse(l.judgeCircle("U"));
    assertFalse(l.judgeCircle("D"));
    assertFalse(l.judgeCircle("UL"));
    assertFalse(l.judgeCircle("DR"));
    assertFalse(l.judgeCircle("UDU"));
  }
}
