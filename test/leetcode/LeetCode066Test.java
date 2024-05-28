package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode066Test {

  @Test
  public void plusOne() {
    LeetCode066 l = new LeetCode066();
    assertEquals(l.plusOne(new int[]{1, 2, 3}), new int[]{1, 2, 4});
    assertEquals(l.plusOne(new int[]{9, 9, 9}), new int[]{1, 0, 0, 0});
    assertEquals(l.plusOne(new int[]{0}), new int[]{1});
    assertEquals(l.plusOne(new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 7}),
        new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 8});
  }

  @Test
  public void plusOneEfficient() {
    LeetCode066 l = new LeetCode066();
    assertEquals(l.plusOneEfficient(new int[]{1, 2, 3}), new int[]{1, 2, 4});
    assertEquals(l.plusOneEfficient(new int[]{9, 9, 9}), new int[]{1, 0, 0, 0});
    assertEquals(l.plusOneEfficient(new int[]{0}), new int[]{1});
    assertEquals(l.plusOneEfficient(new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 7}),
        new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 8});
  }
}
