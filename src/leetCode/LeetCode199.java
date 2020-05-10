package leetCode;

import java.util.ArrayList;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode199 {

  public List<Integer> rightSideViewBFSRecursion(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    List<List<TreeNode>> levelOrder = leverOrderTraversal(root);
    for (List<TreeNode> subList : levelOrder) {
      result.add(subList.get(subList.size() - 1).val);
    }
    return result;
  }

  private List<List<TreeNode>> leverOrderTraversal(TreeNode root) {
    List<List<TreeNode>> result = new ArrayList<>();
    helper(root, result, 0);
    return result;
  }

  private void helper(TreeNode node, List<List<TreeNode>> result, int level) {
    if (result.size() < level + 1) {
      result.add(new ArrayList<TreeNode>());
    }
    result.get(level).add(node);
    if (node.left != null) {
      helper(node.left, result, level + 1);
    }
    if (node.right != null) {
      helper(node.right, result, level + 1);
    }
  }

  public List<Integer> rightSideViewEfficientBFSRecursion(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    rightSideViewEfficientBFSRecursion(root, 0, result);
    return result;
  }

  private void rightSideViewEfficientBFSRecursion(
      TreeNode root, int level, ArrayList<Integer> result) {
    if (root == null) {
      return;
    }
    if (level == result.size()) {
      result.add(root.val);
    }
    rightSideViewEfficientBFSRecursion(root.right, level + 1, result);
    rightSideViewEfficientBFSRecursion(root.left, level + 1, result);
  }
}
