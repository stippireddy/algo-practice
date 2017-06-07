package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode199Test {

  @Test
  public void rightSideViewBFSRecursion() {
    LeetCode199 l = new LeetCode199();
    testRightSideViewBFSRecursionHelper(
        l, new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}, new Integer[] {1, 3, 7, 8});
    testRightSideViewBFSRecursionHelper(
        l,
        new Integer[] {
          1, 2, 3, 4, 5, 6, null, 8, 9, 10, null, null, null, 11, 12, null, 13, null, null, 14
        },
        new Integer[] {1, 3, 6, 10, 13, 14});
    testRightSideViewBFSRecursionHelper(l, new Integer[] {}, new Integer[] {});
    testRightSideViewBFSRecursionHelper(l, new Integer[] {1}, new Integer[] {1});
    testRightSideViewBFSRecursionHelper(
        l, new Integer[] {1, 2, null, null, 4}, new Integer[] {1, 2, 4});
  }

  @Test
  public void rightSideViewEfficientBFSRecursion() {
    LeetCode199 l = new LeetCode199();
    testRightSideViewEfficientBFSRecursionHelper(
        l, new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}, new Integer[] {1, 3, 7, 8});
    testRightSideViewEfficientBFSRecursionHelper(
        l,
        new Integer[] {
          1, 2, 3, 4, 5, 6, null, 8, 9, 10, null, null, null, 11, 12, null, 13, null, null, 14
        },
        new Integer[] {1, 3, 6, 10, 13, 14});
    testRightSideViewEfficientBFSRecursionHelper(l, new Integer[] {}, new Integer[] {});
    testRightSideViewEfficientBFSRecursionHelper(l, new Integer[] {1}, new Integer[] {1});
    testRightSideViewEfficientBFSRecursionHelper(
        l, new Integer[] {1, 2, null, null, 4}, new Integer[] {1, 2, 4});
  }

  private void testRightSideViewBFSRecursionHelper(
      LeetCode199 l, Integer[] input, Integer[] expected) {
    Assert.assertEquals(
        l.rightSideViewBFSRecursion(TreeUtils.createTree(input)),
        new ArrayList<>(Arrays.asList(expected)));
  }

  private void testRightSideViewEfficientBFSRecursionHelper(
      LeetCode199 l, Integer[] input, Integer[] expected) {
    Assert.assertEquals(
        l.rightSideViewEfficientBFSRecursion(TreeUtils.createTree(input)),
        new ArrayList<>(Arrays.asList(expected)));
  }
}
