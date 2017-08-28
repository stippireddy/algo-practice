package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode495Test {

  @Test
  public void findPoisonedDuration() {
    LeetCode495 l = new LeetCode495();
    assertEquals(l.findPoisonedDuration(new int[] {89, 231, 368, 841}, 1000), 1752);
    assertEquals(l.findPoisonedDuration(new int[] {}, 10000), 0);
    assertEquals(l.findPoisonedDuration(new int[] {1}, 2), 2);
    assertEquals(l.findPoisonedDuration(new int[] {1, 4}, 2), 4);
    assertEquals(l.findPoisonedDuration(new int[] {1, 2}, 2), 3);
    assertEquals(l.findPoisonedDuration(new int[] {1, 2, 3}, 2), 4);
  }
}
