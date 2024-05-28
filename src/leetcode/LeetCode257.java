package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import karumanchi.trees.TreeNode;

public class LeetCode257 {

  private ArrayList<String> result = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return null;
    }
    ArrayList<String> res = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    helper(root, sb, res);
    return res;
  }

  private void helper(TreeNode node, StringBuffer sb, ArrayList<String> res) {
    sb.append(node.val);
    if (node.left == null && node.right == null) {
      res.add(sb.toString());
    }
    sb.append("->");
    StringBuffer left = new StringBuffer(sb);
    if (node.left != null) {
      helper(node.left, left, res);
    }
    StringBuffer right = new StringBuffer(sb);
    if (node.right != null) {
      helper(node.right, right, res);
    }
  }

  public List<String> binaryTreePathsGeeks(TreeNode root) {
    if (root == null) {
      return result;
    }
    ArrayList<TreeNode> helperList = new ArrayList<>();
    int pathLength = 0;
    helperGeeks(root, helperList, pathLength);
    return result;
  }

  private void helperGeeks(TreeNode node, ArrayList<TreeNode> helperList, int pathLength) {
    helperList.add(node);
    pathLength++;
    if (node.left == null && node.right == null) {
      StringBuffer sb = new StringBuffer();
      int i = 0;
      while (i < pathLength - 1) {
        sb.append(helperList.get(i++)).append("->");
      }
      sb.append(helperList.get(pathLength - 1));
      result.add(sb.toString());
    }
    if (node.left != null) {
      helperGeeks(node.left, helperList, pathLength);
    }
    if (node.right != null) {
      helperGeeks(node.right, helperList, pathLength);
    }
  }

  public List<String> binaryTreePathsIterative(TreeNode root) {
    ArrayList<String> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    stack.push(root);
    StringBuffer sb = new StringBuffer();
    sb.append(root.val);
    while (!stack.isEmpty()) {
      int length = sb.length();
      TreeNode temp = stack.pop();
      if (temp.right != null) {
        stack.push(temp.right);
      }
      if (temp.left != null) {
        stack.push(temp.left);
      }
      if (temp.right == null && temp.left == null) {
        result.add(sb.toString());
      } else {
        sb.setLength(length);
      }
    }
    return result;
  }
}
