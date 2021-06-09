package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1382 {

  public TreeNode balanceBST(TreeNode root) {
    List<Integer> sorted = new ArrayList<>();
    inOrder(root, sorted);
    return createBalancedTree(sorted, 0, sorted.size() - 1);
  }

  private TreeNode createBalancedTree(List<Integer> sorted, int left, int right) {
    int mid = left + (right - left) / 2;
    TreeNode root = new TreeNode();
    return root;
  }

  private void inOrder(TreeNode root, List<Integer> sorted) {
    if (root == null) {
      return;
    }
    inOrder(root.left, sorted);
    sorted.add(root.val);
    inOrder(root.right, sorted);
  }
}
