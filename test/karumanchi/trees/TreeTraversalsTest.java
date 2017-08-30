package karumanchi.trees;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TreeTraversalsTest {
  @Test
  public void testTraversals1() {
    TreeNode root = TreeUtils.createTree(new Integer[] {null});
    Assert.assertEquals(TreeTraversals1.preOrder(root), Arrays.asList(new Integer[] {}));
    Assert.assertEquals(TreeTraversals1.inOrder(root), Arrays.asList(new Integer[] {}));
    // Assert.assertEquals(TreeTraversals1.postOrder(root), Arrays.asList(new Integer[] {}));
  }

  @Test
  public void testTraversals2() {
    Integer[] input = {1};
    Integer[] preOrderExpected = {1};
    Integer[] inOrderExpected = {1};
    Integer[] postOrderExpected = {1};
    traversalTestHelper(input, preOrderExpected, inOrderExpected, postOrderExpected);
  }

  @Test
  public void testTraversals3() {
    Integer[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    Integer[] preOrderExpected = {1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15};
    Integer[] inOrderExpected = {8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};
    Integer[] postOrderExpected = {8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1};
    traversalTestHelper(input, preOrderExpected, inOrderExpected, postOrderExpected);
  }

  @Test
  public void testTraversals4() {
    Integer[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, null, null, 10, 11, null, null};
    Integer[] preOrderExpected = {1, 2, 4, 8, 9, 5, 3, 6, 10, 11, 7};
    Integer[] inOrderExpected = {8, 4, 9, 2, 5, 1, 10, 6, 11, 3, 7};
    Integer[] postOrderExpected = {8, 9, 4, 5, 2, 10, 11, 6, 7, 3, 1};
    traversalTestHelper(input, preOrderExpected, inOrderExpected, postOrderExpected);
  }

  @Test
  public void testTraversals5() {
    Integer[] input = {25, 15, 50, 10, 22, 35, 70, 4, 12, 18, 24, 31, 44, 66, 90};
    Integer[] preOrderExpected = {25, 15, 10, 4, 12, 22, 18, 24, 50, 35, 31, 44, 70, 66, 90};
    Integer[] inOrderExpected = {4, 10, 12, 15, 18, 22, 24, 25, 31, 35, 44, 50, 66, 70, 90};
    Integer[] postOrderExpected = {4, 12, 10, 18, 24, 22, 15, 31, 44, 35, 66, 90, 70, 50, 25};
    traversalTestHelper(input, preOrderExpected, inOrderExpected, postOrderExpected);
  }

  private void traversalTestHelper(Integer[] input, Integer[] preOrderExpected,
      Integer[] inOrderExpected, Integer[] postOrderExpected) {
    TreeNode root = TreeUtils.createTree(input);

    List<Integer> result = TreeTraversals1.preOrder(root);
    Assert.assertEquals(preOrderExpected, result.toArray(new Integer[result.size()]));
    result = TreeTraversals1.preOrderRecursive(root);
    Assert.assertEquals(preOrderExpected, result.toArray(new Integer[result.size()]));

    result = TreeTraversals1.inOrder(root);
    Assert.assertEquals(inOrderExpected, result.toArray(new Integer[result.size()]));
    result = TreeTraversals1.inOrderRecursive(root);
    Assert.assertEquals(inOrderExpected, result.toArray(new Integer[result.size()]));

    // result = TreeTraversals1.postOrder(root);
    // Assert.assertEquals(postOrderExpected, result.toArray(new Integer[result.size()]));
    // result = TreeTraversals1.postOrderRecursive(root);
    // Assert.assertEquals(postOrderExpected, result.toArray(new Integer[result.size()]));
  }
}
