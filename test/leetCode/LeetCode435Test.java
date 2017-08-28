package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode435Test {

  @Test
  public void eraseOverlapIntervals() {
    LeetCode435 l = new LeetCode435();
    assertEquals(l.eraseOverlapIntervals(new Interval[] {new Interval(1, 2), new Interval(2, 3),
        new Interval(3, 4), new Interval(1, 3)}), 1);
    assertEquals(l.eraseOverlapIntervals(
        new Interval[] {new Interval(1, 2), new Interval(1, 2), new Interval(1, 2)}), 2);
    assertEquals(l.eraseOverlapIntervals(new Interval[] {new Interval(1, 2), new Interval(2, 3)}),
        0);
    assertEquals(l.eraseOverlapIntervals(
        new Interval[] {new Interval(1, 3), new Interval(2, 5), new Interval(4, 6)}), 1);
    assertEquals(l.eraseOverlapIntervals(new Interval[] {new Interval(1, 3), new Interval(2, 5),
        new Interval(4, 7), new Interval(6, 9)}), 2);
    assertEquals(l.eraseOverlapIntervals(new Interval[] {new Interval(1, 2)}), 0);
  }
}
