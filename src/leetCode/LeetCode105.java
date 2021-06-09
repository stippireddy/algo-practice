package leetCode;

import java.util.HashMap;

public class LeetCode105 {

  int index = 0;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
      return null;
    }
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < inorder.length; i++) {
      indexMap.put(inorder[i], i);
    }
    return helper(preorder, 0, inorder.length - 1, indexMap);
  }

  private TreeNode helper(int[] preorder, int left, int right,
      HashMap<Integer, Integer> indexMap) {
    if (index == preorder.length || left > right) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[index]);
    int splitIndex = indexMap.get(preorder[index]);
    index++;
    root.left = helper(preorder, left, splitIndex - 1, indexMap);
    root.right = helper(preorder, splitIndex + 1, right, indexMap);
    return root;
  }
}
