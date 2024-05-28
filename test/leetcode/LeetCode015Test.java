package leetcode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import org.testng.annotations.Test;

public class LeetCode015Test {

  @Test
  public void threeSum() {
    LeetCode015 l = new LeetCode015();
    assertEquals(l.threeSum(new int[]{-1, 0, 1, 2, -1, -4}),
        Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)));
    assertEquals(l.threeSum(new int[]{0, 0, 0}), Arrays.asList(Arrays.asList(0, 0, 0)));
  }
}
