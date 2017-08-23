package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode094Test {

  @Test
  public void inorderTraversal() {
    LeetCode094 l = new LeetCode094();
    Assert.assertEquals(
        l.inorderTraversal(TreeUtils.createTree(new Integer[] {})), new ArrayList<Integer>());
    Assert.assertEquals(
        l.inorderTraversal(TreeUtils.createTree(new Integer[] {1})),
        new ArrayList<Integer>(Arrays.asList(1)));
    Assert.assertEquals(
        l.inorderTraversal(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})),
        new ArrayList<Integer>(Arrays.asList(8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15)));
    Assert.assertEquals(
        l.inorderTraversal(
            TreeUtils.createTree(
                new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null})),
        new ArrayList<Integer>(Arrays.asList(8, 4, 9, 2, 5, 1, 10, 6, 11, 3, 7)));
    Assert.assertEquals(
        l.inorderTraversal(
            TreeUtils.createTree(
                new Integer[] {25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90})),
        new ArrayList<Integer>(
            Arrays.asList(4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90)));
  }
}
