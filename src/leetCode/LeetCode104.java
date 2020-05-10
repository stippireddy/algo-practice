package leetCode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import karumanchi.trees.TreeNode;

public class LeetCode104 {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
  }

  public int maxDepthIterativeDFS(TreeNode root) {
    if (root == null) {
      return 0;
    }
    ArrayDeque<TreeNode> treeStack = new ArrayDeque<>();
    ArrayDeque<Integer> depthStack = new ArrayDeque<>();
    treeStack.push(root);
    depthStack.push(1);
    int max = 0;
    while (!treeStack.isEmpty()) {
      TreeNode tempNode = treeStack.pop();
      int tempDepth = depthStack.pop();
      max = Integer.max(max, tempDepth);
      if (tempNode.left != null) {
        treeStack.push(tempNode.left);
        depthStack.push(tempDepth + 1);
      }
      if (tempNode.right != null) {
        treeStack.push(tempNode.right);
        depthStack.push(tempDepth + 1);
      }
    }
    return max;
  }

  public int maxDepthIterativeBFS(TreeNode root) {
    if (root == null) {
      return 0;
    }
    LinkedList<TreeNode> queue = new LinkedList<>();
    int levelCount = 0;
    queue.add(root);
    queue.add(null);
    levelCount++;
    while (true) {
      root = queue.remove();
      if (root == null) {
        if (queue.isEmpty()) {
          break;
        }
        queue.add(null);
        levelCount++;
      } else {
        if (root.left != null) {
          queue.add(root.left);
        }
        if (root.right != null) {
          queue.add(root.right);
        }
      }
    }
    return levelCount;
  }
}
