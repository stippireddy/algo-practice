package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode219Test {

  @Test
  public void containsNearbyDuplicate() {
    LeetCode219 l = new LeetCode219();
    assertFalse(l.containsNearbyDuplicate(new int[]{}, 0));
    assertTrue(l.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5, 1}, 5));
    assertFalse(l.containsNearbyDuplicate(new int[]{1, 2, 3, 4, 5}, 6));
  }
}
