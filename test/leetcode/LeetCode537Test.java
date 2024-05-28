package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode537Test {

  @Test
  public void complexNumberMultiply() {
    LeetCode537 l = new LeetCode537();
    assertEquals(l.complexNumberMultiply("1+1i", "1+1i"), "0+2i");
  }
}
