package leetCode;

import java.util.ArrayList;
import java.util.List;

import karumanchi.trees.TreeNode;

public class LeetCode98 {
  
  /**
   * @param root
   * @return boolean variable that specifies if the given Tree is a valid BST
   *     <p>This is a naive method traverses the tree to get the InOrder result. Then using the
   *     property that each element should be greater than the previous element, it returns the
   *     appropriate value.
   */
  public boolean isValidBST(TreeNode root) {
    List<Integer> result = inOrderTraversal(root);
    for (int i = 0; i < result.size() - 1; i++) {
      if (result.get(i) >= result.get(i + 1)) {
        return false;
      }
    }
    return true;
  }

  private List<Integer> inOrderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inOrderTraversalHelper(root, result);
    return result;
  }

  private void inOrderTraversalHelper(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    inOrderTraversalHelper(root.left, result);
    result.add(root.val);
    inOrderTraversalHelper(root.right, result);
  }
}
