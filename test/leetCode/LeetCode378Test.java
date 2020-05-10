package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode378Test {

  @Test
  public void kthSmallest() {
    LeetCode378 l = new LeetCode378();
    assertEquals(13, l.kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
    assertEquals(15, l.kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 9));
    assertEquals(1, l.kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 1));
    assertEquals(1, l.kthSmallest(new int[][]{{1}}, 1));
  }
}
