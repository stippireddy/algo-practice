package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode674Test {

  @Test
  public void findLengthOfLCIS() {
    LeetCode674 l = new LeetCode674();
    assertEquals(l.findLengthOfLCIS(new int[] {1, 3, 5, 4, 7}), 3);
    assertEquals(l.findLengthOfLCIS(new int[] {2, 2, 2, 2, 2}), 1);
    assertEquals(l.findLengthOfLCIS(new int[] {1}), 1);
    assertEquals(l.findLengthOfLCIS(new int[] {}), 0);
    assertEquals(l.findLengthOfLCIS(new int[] {1, 3, 5, 7}), 4);
    assertEquals(l.findLengthOfLCIS(new int[] {7, 5, 4, 3, 1}), 1);
    assertEquals(l.findLengthOfLCIS(new int[] {7, 4, 5, 3, 1}), 2);
  }
}
