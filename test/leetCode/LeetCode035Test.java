package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode035Test {

  @Test
  public void searchInsert() {
    LeetCode035 l = new LeetCode035();
    assertEquals(l.searchInsert(new int[] {1, 3, 5, 6}, 5), 2);
    assertEquals(l.searchInsert(new int[] {1, 3, 5, 6}, 2), 1);
    assertEquals(l.searchInsert(new int[] {1, 3, 5, 6}, 7), 4);
    assertEquals(l.searchInsert(new int[] {1, 3, 5, 6}, 0), 0);
    assertEquals(l.searchInsert(new int[] {}, 0), 0);
  }
}
