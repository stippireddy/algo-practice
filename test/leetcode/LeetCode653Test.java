package leetcode;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import karumanchi.trees.TreeUtils;
import org.testng.annotations.Test;

public class LeetCode653Test {

  @Test
  public void findTargetRecursiveDFS() {
    LeetCode653 l = new LeetCode653();
    assertTrue(
        l.findTargetRecursiveDFS(TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 9));
    assertTrue(l.findTargetRecursiveDFS(TreeUtils.createTree(new Integer[]{5, 0}), 5));
    assertFalse(l.findTargetRecursiveDFS(TreeUtils.createTree(new Integer[]{5}), 5));
    assertFalse(
        l.findTargetRecursiveDFS(TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 20));
  }

  @Test
  public void findTargetIterativeDFSPreOrder() {
    LeetCode653 l = new LeetCode653();
    assertTrue(l.findTargetIterativeDFSPreOrder(
        TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 9));
    assertTrue(l.findTargetIterativeDFSPreOrder(TreeUtils.createTree(new Integer[]{5, 0}), 5));
    assertFalse(l.findTargetIterativeDFSPreOrder(TreeUtils.createTree(new Integer[]{5}), 5));
    assertFalse(l.findTargetIterativeDFSPreOrder(
        TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 20));
  }

  @Test
  public void findTargetIterativeDFSInOrder() {
    LeetCode653 l = new LeetCode653();
    assertTrue(l.findTargetIterativeDFSInOrder(
        TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 9));
    assertTrue(l.findTargetIterativeDFSInOrder(TreeUtils.createTree(new Integer[]{5, 0}), 5));
    assertFalse(l.findTargetIterativeDFSInOrder(TreeUtils.createTree(new Integer[]{5}), 5));
    assertFalse(l.findTargetIterativeDFSInOrder(
        TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 20));
  }

  @Test
  public void findTargetIterativeDFSPostOrder() {
    LeetCode653 l = new LeetCode653();
    assertTrue(l.findTargetIterativeDFSPostOrder(
        TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 9));
    assertTrue(l.findTargetIterativeDFSPostOrder(TreeUtils.createTree(new Integer[]{5, 0}), 5));
    assertFalse(l.findTargetIterativeDFSPostOrder(TreeUtils.createTree(new Integer[]{5}), 5));
    assertFalse(l.findTargetIterativeDFSPostOrder(
        TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 20));
  }

  @Test
  public void findTargetIterativeBFS() {
    LeetCode653 l = new LeetCode653();
    assertTrue(
        l.findTargetIterativeBFS(TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 9));
    assertTrue(l.findTargetIterativeBFS(TreeUtils.createTree(new Integer[]{5, 0}), 5));
    assertFalse(l.findTargetIterativeBFS(TreeUtils.createTree(new Integer[]{5}), 5));
    assertFalse(
        l.findTargetIterativeBFS(TreeUtils.createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}), 20));
  }
}
