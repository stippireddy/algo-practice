package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode551Test {

  @Test
  public void checkRecord() {
    LeetCode551 l = new LeetCode551();
    assertTrue(l.checkRecord("PPALLP"));
    assertFalse(l.checkRecord("PPALLL"));
  }
}
