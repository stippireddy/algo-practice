package leetCode;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode637Test {

  @Test
  public void averageOfLevels() {
    LeetCode637 l = new LeetCode637();
    testHelper(l, new Integer[] {3, 9, 20, 15, 7}, new Double[] {3.0, 14.5, 11.0});
    testHelper(l, new Integer[] {3}, new Double[] {3.0});
    testHelper(l, new Integer[] {}, new Double[] {});
  }

  private void testHelper(LeetCode637 l, Integer[] input, Double[] output) {
    List<Double> expected = l.averageOfLevels(TreeUtils.createTree(input));
    List<Double> actual = Arrays.asList(output);
    assertEquals(expected, actual);
  }
}
