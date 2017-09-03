package leetCode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode112Test {

  @Test
  public void hasPathSumRecursive() {
    LeetCode112 l = new LeetCode112();
    assertFalse(l.hasPathSumRecursive(null, 1));
    assertTrue(l.hasPathSumRecursive(TreeUtils.createTree(new Integer[] {1}), 1));
    assertTrue(l.hasPathSumRecursive(TreeUtils.createTree(new Integer[] {1, 2, 3, 4}), 7));
    assertTrue(l.hasPathSumRecursive(
        TreeUtils.createTree(new Integer[] {1, -2, -3, 1, 3, -2, null, -1}), 2));
    assertFalse(l.hasPathSumRecursive(
        TreeUtils.createTree(new Integer[] {1, 2, null, 3, null, 4, null, 5}), 6));
    assertFalse(l.hasPathSumRecursive(TreeUtils.createTree(new Integer[] {1, 2}), 1));
  }

  @Test
  public void hasPathSumIterative() {
    LeetCode112 l = new LeetCode112();
    assertFalse(l.hasPathSumIterative(null, 1));
    assertTrue(l.hasPathSumIterative(TreeUtils.createTree(new Integer[] {1}), 1));
    assertTrue(l.hasPathSumIterative(TreeUtils.createTree(new Integer[] {1, 2, 3, 4}), 7));
    assertTrue(l.hasPathSumIterative(
        TreeUtils.createTree(new Integer[] {1, -2, -3, 1, 3, -2, null, -1}), 2));
    assertTrue(l.hasPathSumIterative(
        TreeUtils.createTree(new Integer[] {1, -2, -3, 1, 3, -2, null, -1}), -4));
    assertFalse(l.hasPathSumIterative(
        TreeUtils.createTree(new Integer[] {1, 2, null, 3, null, 4, null, 5}), 6));
    assertFalse(l.hasPathSumIterative(TreeUtils.createTree(new Integer[] {1, 2}), 1));
  }
}
