package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode171Test {

  @Test
  public void titleToNumber() {
    LeetCode171 l = new LeetCode171();
    assertEquals(l.titleToNumber("A"), 1);
    assertEquals(l.titleToNumber("B"), 2);
    assertEquals(l.titleToNumber("Z"), 26);
    assertEquals(l.titleToNumber("AA"), 27);
    assertEquals(l.titleToNumber("AB"), 28);
    assertEquals(l.titleToNumber("AZ"), 52);
    assertEquals(l.titleToNumber("BA"), 53);
    assertEquals(l.titleToNumber("AAA"), 703);
    assertEquals(l.titleToNumber("AAAA"), 18279);
  }
}
