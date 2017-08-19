package leetCode;

/**
 * Created by Sarveswara Tippireddy on Jul 24, 2017
 *
 * <p>This is a LeetCode problem. The problem statement can be found @
 * https://leetcode.com/problems/binary-search-tree-iterator/description/
 *
 */
import java.util.ArrayDeque;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public class LeetCode173 {
  ArrayDeque<TreeNode> stack;
  boolean hasNext;

  public LeetCode173(TreeNode root) {
    stack = new ArrayDeque<>();
    while (root != null) {
      stack.push(root);
      root = root.left;
    }
    if (stack.size() > 0) {
      hasNext = true;
    } else {
      hasNext = false;
    }
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return hasNext;
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode currMin = stack.pop();
    if (currMin.right != null) {
      TreeNode t = currMin.right;
      while (t != null) {
        stack.push(t);
        t = t.left;
      }
    }
    if (stack.size() > 0) {
      hasNext = true;
    } else {
      hasNext = false;
    }
    return currMin.val;
  }
}
