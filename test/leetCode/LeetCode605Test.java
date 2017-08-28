package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode605Test {

  @Test
  public void canPlaceFlowers() {
    LeetCode605 l = new LeetCode605();
    assertTrue(l.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
    assertTrue(l.canPlaceFlowers(new int[] {0}, 1));
    assertFalse(l.canPlaceFlowers(new int[] {1, 1, 0, 0, 1}, 1));
    assertFalse(l.canPlaceFlowers(new int[] {}, 1));
  }
}
