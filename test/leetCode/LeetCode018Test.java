package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class LeetCode018Test {

  @Test
  public void fourSum() {
    LeetCode018 l = new LeetCode018();
    assertEquals(l.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0), Arrays.asList(
        Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2), Arrays.asList(-1, 0, 0, 1)));
    assertEquals(l.fourSum(new int[]{1, 0, -1, 0, -2, 2, -2}, 0), Arrays.asList(
        Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2), Arrays.asList(-1, 0, 0, 1)));
    assertEquals(l.fourSum(new int[]{-1, 0, 1, 2, -1, -4}, -1),
        Arrays.asList(Arrays.asList(-4, 0, 1, 2), Arrays.asList(-1, -1, 0, 1)));
    assertEquals(l.fourSum(new int[]{}, 0), new ArrayList<>());
  }
}
