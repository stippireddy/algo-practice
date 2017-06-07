package leetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode98Test {

  @Test
  public void isValidBST() {
    LeetCode98 l = new LeetCode98();
    Assert.assertTrue(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2, 7, 1, 3})));
    Assert.assertFalse(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2, 6, 1, 3, 4})));
    Assert.assertTrue(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2, 6, 1, 3})));
    Assert.assertTrue(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2})));
    Assert.assertTrue(l.isValidBST(TreeUtils.createTree(new Integer[] {5})));
    Assert.assertFalse(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2, 4, 1, 3})));
    Assert.assertFalse(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2, 4})));
    Assert.assertFalse(l.isValidBST(TreeUtils.createTree(new Integer[] {5, 2, 7, 1, 3, 5})));
  }
}
