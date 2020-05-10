package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import karumanchi.trees.TreeUtils;
import org.testng.annotations.Test;

public class LeetCode113Test {

  @Test
  public void pathSum() {
    LeetCode113 l = new LeetCode113();
    assertEquals(l.pathSumIterative(
        TreeUtils.createTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1}), 22),
        Arrays.asList(Arrays.asList(5, 4, 11, 2), Arrays.asList(5, 8, 4, 5)));
  }
}
