package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode104Test {

  @Test
  public void maxDepth() {
    LeetCode104 l = new LeetCode104();
    Assert.assertEquals(l.maxDepth(TreeUtils.createTree(new Integer[] {})), 0);
    Assert.assertEquals(l.maxDepth(TreeUtils.createTree(new Integer[] {1})), 1);
    Assert.assertEquals(l.maxDepth(TreeUtils.createTree(new Integer[] {1, 2, null})), 2);
    Assert.assertEquals(
        l.maxDepth(TreeUtils.createTree(new Integer[] {1, 2, null, null, 3, 4})), 4);
    Assert.assertEquals(
        l.maxDepth(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})),
        4);
    Assert.assertEquals(
        l.maxDepth(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null})),
        4);
  }

  @Test
  public void maxDepthIterativeBFS() {
    LeetCode104 l = new LeetCode104();
    Assert.assertEquals(l.maxDepthIterativeBFS(TreeUtils.createTree(new Integer[] {})), 0);
    Assert.assertEquals(l.maxDepthIterativeBFS(TreeUtils.createTree(new Integer[] {1})), 1);
    Assert.assertEquals(
        l.maxDepthIterativeBFS(TreeUtils.createTree(new Integer[] {1, 2, null})), 2);
    Assert.assertEquals(
        l.maxDepthIterativeBFS(TreeUtils.createTree(new Integer[] {1, 2, null, null, 3, 4})), 4);
    Assert.assertEquals(
        l.maxDepthIterativeBFS(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})),
        4);
    Assert.assertEquals(
        l.maxDepthIterativeBFS(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null})),
        4);
  }
  @Test
  public void maxDepthIterativeDFS() {
    LeetCode104 l = new LeetCode104();
    Assert.assertEquals(l.maxDepthIterativeDFS(TreeUtils.createTree(new Integer[] {})), 0);
    Assert.assertEquals(l.maxDepthIterativeDFS(TreeUtils.createTree(new Integer[] {1})), 1);
    Assert.assertEquals(
        l.maxDepthIterativeDFS(TreeUtils.createTree(new Integer[] {1, 2, null})), 2);
    Assert.assertEquals(
        l.maxDepthIterativeDFS(TreeUtils.createTree(new Integer[] {1, 2, null, null, 3, 4})), 4);
    Assert.assertEquals(
        l.maxDepthIterativeDFS(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})),
        4);
    Assert.assertEquals(
        l.maxDepthIterativeDFS(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null})),
        4);
  }
  
}
