package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import karumanchi.trees.TreeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeetCode144Test {

  @Test
  public void preorderTraversal() {
    LeetCode144 l = new LeetCode144();
    Assert.assertEquals(
        l.preorderTraversal(TreeUtils.createTree(new Integer[]{})), new ArrayList<Integer>());
    Assert.assertEquals(
        l.preorderTraversal(TreeUtils.createTree(new Integer[]{1})),
        new ArrayList<Integer>(Arrays.asList(1)));
    Assert.assertEquals(
        l.preorderTraversal(
            TreeUtils.createTree(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})),
        new ArrayList<Integer>(Arrays.asList(1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15)));
    Assert.assertEquals(
        l.preorderTraversal(
            TreeUtils.createTree(
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null})),
        new ArrayList<Integer>(Arrays.asList(1, 2, 4, 8, 9, 5, 3, 6, 10, 11, 7)));
    Assert.assertEquals(
        l.preorderTraversal(
            TreeUtils.createTree(
                new Integer[]{25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90})),
        new ArrayList<Integer>(
            Arrays.asList(25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90)));
  }
}
