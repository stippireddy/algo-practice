package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LeetCode056Test {

  @Test
  public void merge() {
    LeetCode056 l = new LeetCode056();
    assertEquals(
        l.merge(Arrays.asList(new Interval(1, 3), new Interval(2, 6), new Interval(8, 10),
            new Interval(15, 18))),
        Arrays.asList(new Interval(1, 6), new Interval(8, 10), new Interval(15, 18)));
    assertEquals(l.merge(Arrays.asList(new Interval(1, 8), new Interval(2, 6), new Interval(8, 10),
        new Interval(15, 18))), Arrays.asList(new Interval(1, 10), new Interval(15, 18)));
  }
}
