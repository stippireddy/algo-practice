package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode012Test {

  @Test
  public void intToRoman() {
    LeetCode012 l = new LeetCode012();
    assertEquals(l.intToRoman2(1), "I");
    assertEquals(l.intToRoman2(3999), "MMMCMXCIX");
    assertEquals(l.intToRoman2(3949), "MMMCMXLIX");
    assertEquals(l.intToRoman2(621), "DCXXI");
  }
}
