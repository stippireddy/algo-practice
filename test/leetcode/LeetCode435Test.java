package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode435Test {

  @Test
  public void eraseOverlapIntervals() {
    LeetCode435 l = new LeetCode435();
    assertEquals(l.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}), 1);
    assertEquals(l.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}), 2);
    assertEquals(l.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}), 0);
    assertEquals(l.eraseOverlapIntervals(new int[][]{{1, 3}, {2, 5}, {4, 6}}), 1);
    assertEquals(l.eraseOverlapIntervals(new int[][]{{1, 3}, {2, 5}, {4, 7}, {6, 9}}), 2);
    assertEquals(l.eraseOverlapIntervals(new int[][]{{1, 3}}), 0);
  }
}
