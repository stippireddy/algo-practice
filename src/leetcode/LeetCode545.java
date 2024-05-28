package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode545 {

  public List<Integer> boundaryOfBinaryTree(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    result.add(root.val);
    List<Integer> leftBoundary = new ArrayList<>();
    List<Integer> leaves = new ArrayList<>();
    List<Integer> rightBoundary = new ArrayList<>();
    fillLeftBoundary(root.left, leftBoundary);
    fillLeaves(root.left, leaves);
    fillLeaves(root.right, leaves);
    fillRightBoundary(root.right, rightBoundary);
    result.addAll(leftBoundary);
    result.addAll(leaves);
    for (int i = rightBoundary.size() - 1; i >= 0; i--) {
      result.add(rightBoundary.get(i));
    }
    return result;
  }

  private void fillLeftBoundary(TreeNode root, List<Integer> boundary) {
    if (root == null || isLeaf(root)) {
      return;
    }
    boundary.add(root.val);
    if (root.left != null) {
      fillLeftBoundary(root.left, boundary);
    } else {
      fillLeftBoundary(root.right, boundary);
    }
  }

  private void fillRightBoundary(TreeNode root, List<Integer> boundary) {
    if (root == null || isLeaf(root)) {
      return;
    }
    boundary.add(root.val);
    if (root.right != null) {
      fillRightBoundary(root.right, boundary);
    } else {
      fillRightBoundary(root.left, boundary);
    }
  }

  private void fillLeaves(TreeNode root, List<Integer> leaves) {
    if (root == null) {
      return;
    }
    if (isLeaf(root)) {
      leaves.add(root.val);
    }
    fillLeaves(root.left, leaves);
    fillLeaves(root.right, leaves);
  }

  private boolean isLeaf(TreeNode root) {
    return root.left == null && root.right == null;
  }
}
