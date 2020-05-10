package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import org.testng.annotations.Test;

public class LeetCode228Test {

  @Test
  public void summaryRanges() {
    LeetCode228 l = new LeetCode228();
    // assertEquals(l.summaryRanges(new int[] {}), Arrays.asList());
    // assertEquals(l.summaryRanges(new int[] {1}), Arrays.asList("1"));
    assertEquals(l.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}), Arrays.asList("0->2", "4->5", "7"));
    assertEquals(l.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}),
        Arrays.asList("0", "2->4", "6", "8->9"));
    assertEquals(l.summaryRanges(new int[]{0, 2, 4, 6, 8, 10}),
        Arrays.asList("0", "2", "4", "6", "8", "10"));
    assertEquals(l.summaryRanges(new int[]{-5, -4, -1}), Arrays.asList("-5->-4", "-1"));
    assertEquals(l.summaryRanges(new int[]{-5, -4, -1, 2, 10}),
        Arrays.asList("-5->-4", "-1", "2", "10"));
  }
}
