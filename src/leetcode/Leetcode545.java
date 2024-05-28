package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
The boundary of a binary tree is the concatenation of the root, the left boundary, the leaves ordered from left-to-right, and the reverse order of the right boundary.

The left boundary is the set of nodes defined by the following:

The root node's left child is in the left boundary. If the root does not have a left child, then the left boundary is empty.
If a node in the left boundary and has a left child, then the left child is in the left boundary.
If a node is in the left boundary, has no left child, but has a right child, then the right child is in the left boundary.
The leftmost leaf is not in the left boundary.
The right boundary is similar to the left boundary, except it is the right side of the root's right subtree. Again, the leaf is not part of the right boundary, and the right boundary is empty if the root does not have a right child.

The leaves are nodes that do not have any children. For this problem, the root is not a leaf.


 */
public class Leetcode545 {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        result.addAll(leftBoundary(root));
        result.addAll(leaves(root));
        List<Integer> rightBoundary = rightBoundary(root);
        for (int i = rightBoundary.size() - 1; i > 0; i--) {
            result.add(rightBoundary.get(i));
        }
        return result;
    }

    private List<Integer> rightBoundary(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightBoundary(root.right, result);
        return result;
    }

    private void rightBoundary(TreeNode root, List<Integer> result) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        result.add(root.val);
        if (root.right == null) {
            rightBoundary(root.left, result);
        } else {
            rightBoundary(root.right, result);
        }
    }

    private List<Integer> leaves(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        leavesHelper(root, result);
        return result;
    }

    private void leavesHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return;
        }
        leavesHelper(root.left, result);
        leavesHelper(root.right, result);
    }

    private List<Integer> leftBoundary(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        leftBoundary(root.left, result);
        return result;
    }

    private void leftBoundary(TreeNode root, List<Integer> result) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        result.add(root.val);
        if (root.left == null) {
            leftBoundary(root.right, result);
        } else {
            leftBoundary(root.left, result);
        }
    }
}
