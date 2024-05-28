package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class LeetCode189Test {

  @Test
  public void rotate() {
    LeetCode189 l = new LeetCode189();
    int[] input = new int[]{-1};
    l.rotate(input, 2);
    assertEquals(input, new int[]{-1});
    input = new int[]{-1, -2};
    l.rotate(input, 3);
    assertEquals(input, new int[]{-2, -1});
    input = new int[]{1, 2, 3, 4, 5, 6, 7};
    l.rotate(input, 3);
    assertEquals(input, new int[]{5, 6, 7, 1, 2, 3, 4});
    input = new int[]{1, 2, 3, 4, 5, 6, 7};
    l.rotate(input, 0);
    assertEquals(input, new int[]{1, 2, 3, 4, 5, 6, 7});
  }
}
