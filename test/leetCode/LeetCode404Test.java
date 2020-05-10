package leetCode;

import static org.testng.Assert.assertEquals;

import karumanchi.trees.TreeUtils;
import org.testng.annotations.Test;

public class LeetCode404Test {

  @Test
  public void sumOfLeftLeavesRecursive() {
    LeetCode404 l = new LeetCode404();
    assertEquals(
        l.sumOfLeftLeavesRecursive(
            TreeUtils.createTree(new Integer[]{3, 9, 20, null, null, 15, 7})),
        24);
    assertEquals(l.sumOfLeftLeavesRecursive(TreeUtils.createTree(new Integer[]{3})), 0);
    assertEquals(l.sumOfLeftLeavesRecursive(TreeUtils.createTree(new Integer[]{3, null, 2})), 0);
    assertEquals(l.sumOfLeftLeavesRecursive(TreeUtils.createTree(new Integer[]{})), 0);
    assertEquals(
        l.sumOfLeftLeavesRecursive(
            TreeUtils.createTree(
                new Integer[]{
                    5, 6, 7, 8, 9, null, 13, null, null, 10, 11, 14, 15, null, null, 12
                })),
        44);
  }

  @Test
  public void sumOfLeftLeavesIterative() {
    LeetCode404 l = new LeetCode404();
    assertEquals(
        l.sumOfLeftLeavesIterative(
            TreeUtils.createTree(new Integer[]{3, 9, 20, null, null, 15, 7})),
        24);
    assertEquals(l.sumOfLeftLeavesIterative(TreeUtils.createTree(new Integer[]{3})), 0);
    assertEquals(l.sumOfLeftLeavesIterative(TreeUtils.createTree(new Integer[]{3, null, 2})), 0);
    assertEquals(l.sumOfLeftLeavesIterative(TreeUtils.createTree(new Integer[]{})), 0);
    assertEquals(
        l.sumOfLeftLeavesIterative(
            TreeUtils.createTree(
                new Integer[]{
                    5, 6, 7, 8, 9, null, 13, null, null, 10, 11, 14, 15, null, null, 12
                })),
        44);
  }
}
