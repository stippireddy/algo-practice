package leetcode;

import karumanchi.trees.TreeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode563Test {

  @Test
  public void findTilt() {
    LeetCode563 l = new LeetCode563();
    Assert.assertEquals(0, l.findTilt(null));
    Assert.assertEquals(0, l.findTilt(TreeUtils.createTree(new Integer[]{1})));
    Assert.assertEquals(1, l.findTilt(TreeUtils.createTree(new Integer[]{1, 2, 3})));
    Assert.assertEquals(
        l.findTilt(
            TreeUtils.createTree(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})),
        35);
    Assert.assertEquals(
        l.findTilt(
            TreeUtils.createTree(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null})),
        47);
    Assert.assertEquals(
        486,
        l.findTilt(
            TreeUtils.createTree(
                new Integer[]{25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90})));
  }
}
