package leetCode;

import java.util.ArrayDeque;

public class LeetCode1008 {

  int index = 0;

  public TreeNode bstFromPreorder(int[] preorder) {
    if (preorder == null || preorder.length == 0) {
      return null;
    }
    return helper(preorder, Integer.MAX_VALUE);
  }

  private TreeNode helper(int[] preorder, int bound) {
    if (index == preorder.length || preorder[index] > bound) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[index]);
    index++;
    root.left = helper(preorder, root.val);
    root.right = helper(preorder, bound);
    return root;
  }

  public TreeNode bstFromPreorderIterativeOn(int[] preorder) {
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    TreeNode root = new TreeNode(preorder[0]);
    stack.push(root);
    for (int i = 1; i < preorder.length; i++) {
      TreeNode node = new TreeNode(i);
      if (!stack.isEmpty() && stack.peek().val > node.val) {
        stack.peek().left = node;
        stack.push(node);
      } else {
        TreeNode parent = null;
        while (!stack.isEmpty() && stack.peek().val < node.val) {
          parent = stack.pop();
        }
        if (parent != null) {
          parent.right = node;
        }
        stack.push(node);
      }
    }
    return root;
  }

  public TreeNode bstFromPreorderOn2(int[] preorder) {
    if (preorder == null || preorder.length == 0) {
      return null;
    }
    return helper(preorder, 0, preorder.length - 1);
  }

  private TreeNode helper(int[] preorder, int left, int right) {
    if (left > right) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[left]);
    int split = right;
    for (int i = left + 1; i <= right; i++) {
      if (preorder[i] > preorder[left]) {
        split = i - 1;
        break;
      }
    }
    root.left = helper(preorder, left + 1, split);
    root.right = helper(preorder, split + 1, right);
    return root;
  }
}
