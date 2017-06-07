package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import karumanchi.trees.TreeUtils;

public class LeetCode606Test {

  @Test
  public void tree2str() {
    LeetCode606 l = new LeetCode606();
    assertEquals(l.tree2strRecursive(TreeUtils.createTree(new Integer[] {1})), "1");
    assertEquals(l.tree2strRecursive(TreeUtils.createTree(new Integer[] {1, 2, 3, 4})), "1(2(4))(3)");
    assertEquals(
        l.tree2strRecursive(TreeUtils.createTree(new Integer[] {1, 2, 3, null, 4})), "1(2()(4))(3)");
    assertEquals(
        l.tree2strRecursive(TreeUtils.createTree(new Integer[] {1, null, 2, 3, null, null, 4})),
        "1()(2(3()(4)))");
    
  }
}
