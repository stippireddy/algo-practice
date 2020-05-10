package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode406Test {

  @Test
  public void reconstructQueueCleverUseOfList() {
    LeetCode406 l = new LeetCode406();
    assertEquals(
        l.reconstructQueueCleverUseOfList(
            new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}),
        new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}});
    assertEquals(l.reconstructQueueCleverUseOfList(new int[][]{}), new int[][]{});
  }

  @Test
  public void reconstructQueueMyIntuitiveSolution() {
    LeetCode406 l = new LeetCode406();
    assertEquals(
        l.reconstructQueueMyIntuitiveSolution(
            new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}),
        new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}});
    assertEquals(l.reconstructQueueMyIntuitiveSolution(new int[][]{}), new int[][]{});
  }
}
