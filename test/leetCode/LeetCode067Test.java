package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode067Test {

  @Test
  public void addBinary() {
    LeetCode067 l = new LeetCode067();
    assertEquals(l.addBinary("0", "0"), "0");
    assertEquals(l.addBinary("1", "1"), "10");
    assertEquals(l.addBinary("11", "1"), "100");
  }
}
