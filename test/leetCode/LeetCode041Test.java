package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode041Test {

  @Test
  public void firstMissingPositive() {
    LeetCode041 l = new LeetCode041();
    assertEquals(l.firstMissingPositive(new int[]{}), 1);
    assertEquals(l.firstMissingPositive(new int[]{3, 4, -1, 1}), 2);
    assertEquals(l.firstMissingPositive(new int[]{1, 2, 0}), 3);
    assertEquals(l.firstMissingPositive(new int[]{2, 1, 3}), 4);
    assertEquals(l.firstMissingPositive(new int[]{10, 11, 120}), 1);
    assertEquals(l.firstMissingPositive(new int[]{1, 1}), 2);
  }
}
