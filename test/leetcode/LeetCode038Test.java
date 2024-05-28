package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode038Test {

  @Test
  public void countAndSay() {
    LeetCode038 l = new LeetCode038();
    assertEquals(l.countAndSay(1), "1");
    assertEquals(l.countAndSay(2), "11");
    assertEquals(l.countAndSay(3), "21");
    assertEquals(l.countAndSay(4), "1211");
    assertEquals(l.countAndSay(5), "111221");
    assertEquals(l.countAndSay(6), "312211");
    assertEquals(l.countAndSay(7), "13112221");
  }
}
