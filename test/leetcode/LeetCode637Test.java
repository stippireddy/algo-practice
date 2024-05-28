package leetcode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import karumanchi.trees.TreeUtils;
import org.testng.annotations.Test;

public class LeetCode637Test {

  @Test
  public void averageOfLevelsUsingBFS() {
    LeetCode637 l = new LeetCode637();
    testHelperBFS(l, new Integer[]{3, 9, 20, 15, 7}, new Double[]{3.0, 14.5, 11.0});
    testHelperBFS(l, new Integer[]{3}, new Double[]{3.0});
    testHelperBFS(l, new Integer[]{}, new Double[]{});
  }

  private void testHelperBFS(LeetCode637 l, Integer[] input, Double[] output) {
    List<Double> expected = l.averageOfLevelsUsingBFS(TreeUtils.createTree(input));
    List<Double> actual = Arrays.asList(output);
    assertEquals(expected, actual);
  }

  @Test
  public void averageOfLevelsUsingDFS() {
    LeetCode637 l = new LeetCode637();
    testHelperDFS(l, new Integer[]{3, 9, 20, 15, 7}, new Double[]{3.0, 14.5, 11.0});
    testHelperDFS(l, new Integer[]{3}, new Double[]{3.0});
    testHelperDFS(l, new Integer[]{}, new Double[]{});
  }

  private void testHelperDFS(LeetCode637 l, Integer[] input, Double[] output) {
    List<Double> expected = l.averageOfLevelsUsingDFS(TreeUtils.createTree(input));
    List<Double> actual = Arrays.asList(output);
    assertEquals(expected, actual);
  }
}
