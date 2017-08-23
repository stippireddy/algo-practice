package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode137Test {
  @Test
  public void test() {
    int[] input = new int[] {1};
    LeetCode137 l = new LeetCode137();
    assertEquals(1, l.singleNumberSummingUpIndividualBits(input));
    input = new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 4, 4, 5};
    assertEquals(5, l.singleNumberSummingUpIndividualBits(input));
    input = new int[] {1, 2, 3, 2, 3, 2, 3, 4, 4, 4, 5, 5, 5};
    assertEquals(1, l.singleNumberSummingUpIndividualBits(input));
  }
}
