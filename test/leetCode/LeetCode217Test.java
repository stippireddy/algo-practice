package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LeetCode217Test {

  @Test
  public void containsDuplicateUsingHashing() {
    LeetCode217 l = new LeetCode217();
    assertFalse(l.containsDuplicateUsingHashing(new int[]{}));
    assertTrue(l.containsDuplicateUsingHashing(new int[]{1, 2, 1}));
    assertFalse(l.containsDuplicateUsingHashing(new int[]{1, 2, 3}));
  }

  @Test
  public void containsDuplicateUsingSort() {
    LeetCode217 l = new LeetCode217();
    assertFalse(l.containsDuplicateUsingSort(new int[]{}));
    assertTrue(l.containsDuplicateUsingSort(new int[]{1, 2, 1}));
    assertFalse(l.containsDuplicateUsingSort(new int[]{1, 2, 3}));
  }
}
