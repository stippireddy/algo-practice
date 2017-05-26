package karumanchi.trees;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TreeTraversalsTest {
    @Test
    public void testPreOrderTraversal() {
        TreeNode head = createTestSet1();
        Assert.assertTrue(
                "1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15".equals(TreeTraversals.preOrderRecursive(head)));
        Assert.assertTrue(
                "1, 2, 4, 8, 9, 5, 10, 11, 3, 6, 12, 13, 7, 14, 15".equals(TreeTraversals.preOrderIterative(head)));
    }

    private TreeNode createTestSet1() {
        TreeNode t15 = new TreeNode(15, null, null);
        TreeNode t14 = new TreeNode(14, null, null);
        TreeNode t13 = new TreeNode(13, null, null);
        TreeNode t12 = new TreeNode(12, null, null);
        TreeNode t11 = new TreeNode(11, null, null);
        TreeNode t10 = new TreeNode(10, null, null);
        TreeNode t9 = new TreeNode(9, null, null);
        TreeNode t8 = new TreeNode(8, null, null);
        TreeNode t7 = new TreeNode(7, t14, t15);
        TreeNode t6 = new TreeNode(6, t12, t13);
        TreeNode t5 = new TreeNode(5, t10, t11);
        TreeNode t4 = new TreeNode(4, t8, t9);
        TreeNode t3 = new TreeNode(3, t6, t7);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t1 = new TreeNode(1, t2, t3);
        return t1;
    }
}
