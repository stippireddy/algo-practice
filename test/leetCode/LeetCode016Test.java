package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode016Test {

  @Test
  public void threeSumClosest() {
    LeetCode016 l = new LeetCode016();
    assertEquals(l.threeSumClosest(new int[] {0, 0, 0}, 1), 0);
    assertEquals(l.threeSumClosest(new int[] {-1, 0, 1, 2, -1}, 1), 1);
    assertEquals(l.threeSumClosest(new int[] {-1, 0, 1, 2, -1}, 0), 0);
  }
}
