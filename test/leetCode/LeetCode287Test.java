package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode287Test {

  @Test
  public void findDuplicateUsingHashMap() {
    LeetCode287 l = new LeetCode287();
    assertEquals(l.findDuplicateUsingHashMap(new int[] {1, 1}), 1);
  }
}
