package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode013Test {

  @Test
  public void romanToInt() {
    LeetCode013 l = new LeetCode013();
    assertEquals(l.romanToInt("MMMCMXCIX"), 3999);
    assertEquals(l.romanToInt("MMMCMXLIX"), 3949);
    assertEquals(l.romanToInt("DCXXI"), 621);
  }
}
