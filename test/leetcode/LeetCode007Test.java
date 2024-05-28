package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode007Test {

  @Test
  public void reverse() {
    LeetCode007 l = new LeetCode007();
    assertEquals(l.reverse(123), 321);
    assertEquals(l.reverse(-123), -321);
    assertEquals(l.reverse(Integer.MAX_VALUE), 0);
    assertEquals(l.reverse(Integer.MIN_VALUE), 0);
    assertEquals(l.reverse(1534236469), 0);
  }

  @Test
  public void reverse2() {
    LeetCode007 l = new LeetCode007();
    assertEquals(l.reverse2(123), 321);
    assertEquals(l.reverse2(-123), -321);
    assertEquals(l.reverse2(Integer.MAX_VALUE), 0);
    assertEquals(l.reverse2(Integer.MIN_VALUE), 0);
    assertEquals(l.reverse2(1534236469), 0);
  }
}
