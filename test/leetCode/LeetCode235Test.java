package leetCode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import karumanchi.trees.TreeNode;
import karumanchi.trees.TreeUtils;

public class LeetCode235Test {

  @Test
  public void lowestCommonAncestor() {
    LeetCode235 l = new LeetCode235();
    assertEquals(
        l.lowestCommonAncestorRecursive(TreeUtils.createTree(new Integer[] {5, 3, 6, 2, 4, null, null, 1}),
            new TreeNode(1), new TreeNode(4)).val,
        new TreeNode(3).val);
  }

  @Test
  public void lowestCommonAncestorIterative() {
    LeetCode235 l = new LeetCode235();
    assertEquals(l.lowestCommonAncestorIterative(
        TreeUtils.createTree(new Integer[] {5, 3, 6, 2, 4, null, null, 1}), new TreeNode(1),
        new TreeNode(4)).val, new TreeNode(3).val);
  }
}
